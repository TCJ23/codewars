import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class DoorFactory {

    private StateFactory stateFactory;

    public DoorFactory() {
        Strategy statusStrategy = new StatusStrategy();
        Strategy positionStrategy = new PositionStrategy();
        Strategy statusCheckStrategy = new StatusCheckStrategy();
        statusStrategy.addNext(positionStrategy);
        positionStrategy.addNext(statusCheckStrategy);
        stateFactory = new DefaultStateFactory(statusStrategy);
    }

    public String start(String events) {
        StringBuilder out = new StringBuilder(events.length());
        State state = new State(0, Status.CLOSED);
        for (char command : events.toCharArray()) {
            state = stateFactory.getState(command, state.getPosition(), state.getStatus());
            out.append(state.getPosition());
        }
        return out.toString();
    }

    public static String run(String events) {
        return new DoorFactory().start(events);
    }
}

class State {
    private final int position;
    private final Status status;

    public State(int position, Status status) {
        this.position = position;
        this.status = status;
    }

    public int getPosition() {
        return position;
    }

    public Status getStatus() {
        return status;
    }
}


enum Status {
    CLOSED, OPENED, CLOSING, OPENING, PAUSED_O, PAUSED_C
}

interface StateFactory {
    State getState(char command, int position, Status status);
}

class DefaultStateFactory implements StateFactory {
    private Strategy firstStrategy;

    DefaultStateFactory(Strategy firstStrategy) {
        this.firstStrategy = firstStrategy;
    }

    @Override
    public State getState(char command, int position, Status status) {
        return firstStrategy.deriveState(command, position, status);
    }
}

class StatusStrategy extends Strategy {
    private static final Map<Status, Status> pStatuses;
    private static final Map<Status, Status> oStatuses;
    private static final Map<Character, Function<Status, Status>> statusStrategies;

    static {
        Map<Status, Status> ps = new HashMap<>();
        ps.put(Status.CLOSED, Status.OPENING);
        ps.put(Status.OPENED, Status.CLOSING);
        ps.put(Status.OPENING, Status.PAUSED_O);
        ps.put(Status.CLOSING, Status.PAUSED_C);
        ps.put(Status.PAUSED_C, Status.CLOSING);
        ps.put(Status.PAUSED_O, Status.OPENING);
        pStatuses = Collections.unmodifiableMap(ps);

        Map<Status, Status> os = new HashMap<>();
        os.put(Status.OPENING, Status.CLOSING);
        os.put(Status.CLOSING, Status.OPENING);
        oStatuses = Collections.unmodifiableMap(os);

        Map<Character, Function<Status, Status>> ss = new HashMap<>();
        ss.put('P', status -> pStatuses.getOrDefault(status, status));
        ss.put('O', status -> oStatuses.getOrDefault(status, status));
        ss.put('.', status -> status);
        statusStrategies = Collections.unmodifiableMap(ss);
    }

    @Override
    protected Status changeStatus(char command, int position, Status status) {
        return statusStrategies.get(command).apply(status);
    }
}



class PositionStrategy extends Strategy {
    private static final Map<Status, Function<Integer, Integer>> positionStrategies;

    static {
        Map<Status, Function<Integer, Integer>> p = new HashMap<>();
        p.put(Status.CLOSING, pos -> pos - 1);
        p.put(Status.OPENING, pos -> pos + 1);
        positionStrategies = Collections.unmodifiableMap(p);
    }

    @Override
    protected int changePosition(char command, int position, Status status) {
        return positionStrategies.getOrDefault(status, pos -> pos).apply(position);
    }
}

class StatusCheckStrategy extends Strategy {
    @Override
    protected Status changeStatus(char command, int position, Status status) {
        if (status == Status.OPENING && position == 5) {
            status = Status.OPENED;
        }
        else if (status == Status.CLOSING && position == 0) {
            status = Status.CLOSED;
        }
        return status;
    }
}

abstract class Strategy {
    private Strategy next;

    State deriveState(char command, int position, Status status) {
        position = changePosition(command, position, status);
        status = changeStatus(command, position, status);
        if (next != null) {
            return next.deriveState(command, position, status);
        }
        return new State(position, status);
    }

    protected Status changeStatus(char command, int position, Status status) {
        return status;
    }

    protected int changePosition(char command, int position, Status status) {
        return position;
    }

    public void addNext(Strategy strategy) {
        this.next = strategy;
    }
}