public class People {

    private int age;
    private String name;
    private String lastName;
    private String city;
    private String job;

    private final static String GREET = "hello";

    //// ESENCJA
    public static PeopleBuilder builder() {
        return new PeopleBuilder();
    }
/// GLOWNY KONSTRUKTOR
    private People(int age, String name, String lastName, String city, String job) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.job = job;
        this.city = city;
    }

    public String greet() {
        return GREET + " my name is " + name;

    }

    public String getCity() {
        return city;
    }

    public String getJob() {
        return job;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public static class PeopleBuilder {
        private int age;
        private String name;
        private String lastName;
        private String city;
        private String job;

        private PeopleBuilder() {
        }

        public PeopleBuilder age(int age) {
            this.age = age;
            return this;
        }

        public PeopleBuilder name(String name) {
            this.name = name;
            return this;
        }

        public PeopleBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PeopleBuilder city(String city
        ) {
            this.city = city;
            return this;
        }

        public PeopleBuilder job(String job) {
            this.job = job;
            return this;
        }

        public People build() {
            return new People(age, name, lastName, city, job);
        }
    }

}

