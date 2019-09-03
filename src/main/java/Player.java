import java.util.*;

class Player implements RockPaperScissorsPlayer {

    private static final String VITRAJ = "Vitraj Bachchan";
    private static final String BIN = "Bin Jinhao";
    private static final String MAX = "Max Janssen"; // logic
    private static final String SVEN = "Sven Johanson"; //SS P RR => SSS P RR
    private static final String JONATHAN = "Jonathan Hughes"; // logic

    private static int counter = 1;

    private String opponent;
    private String myPreviousHand;
    private Random random;

    public Player() {
        random = new Random();
    }

    public String getName() {
        return "ME";
    }

    public void setNewMatch(String opponentName) {
        this.opponent = opponentName;
        counter = 0;
        System.out.println("NEW MATCH WITH: " + opponentName);
    }

    public String getShape() {
        if(opponent.equals(VITRAJ)){
            return "R";
        }
        if(opponent.equals(BIN)){
            counter++;
            if(counter > 6) {
                counter = 1;
            }
            return beatBIN();
        }
        if(opponent.equals(MAX)){
            return beatMAX();
        }
        if(opponent.equals(SVEN)){
            counter++;
            return beatSVEN(counter <= 5 ? true : false);
        }
        if(opponent.equals(JONATHAN)){
            return beatJONATHAN(this.myPreviousHand);
        }

        switch (random.nextInt(3)) {
            case 1:
                System.out.println("Paper");
                return "P";
            case 2:
                System.out.println("Rock");
                return "R";
            default:
                System.out.println("Scissor");
                return "S";
        }

    }

    private String beatJONATHAN(String myPreviousHand){
        if(myPreviousHand == null){
            this.myPreviousHand = "P";
            return "P";
        } else {
            switch(myPreviousHand){
                case "P":
                    this.myPreviousHand = "S";
                    return "S";
                case "S":
                    this.myPreviousHand = "R";
                    return "R";
                default:
                    this.myPreviousHand = "P";
                    return "P";
            }
        }

    }

    private String beatSVEN(boolean isFirstSequence){
        if(isFirstSequence){
            switch(counter){
                case 1:
                case 2:
                    return "R";
                case 3:
                    return "S";
                default: return "P";
            }
        } else {
            //SS P RR => SSS P RR
            if(counter > 6){
                counter = 1;
            }
            switch(counter){
                case 1:
                case 2:
                case 3:
                    return "R";
                case 4:
                    return "S";
                default: return "P";
            }
        }
    }

    private String beatBIN() {
        //SRS PRP
        switch (counter) {
            case 1:
            case 3:
                return "R";
            case 2:
            case 5:
                return "P";
        }
        return "S";
    }

    private String beatMAX(){
        return "P";
    }

    public void setOpponentShape(String shape) {
        System.out.println(this.opponent + ": " + shape);

    }

}