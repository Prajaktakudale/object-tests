package Person;


class PersonWorngImpementation extends Person {

    public PersonWorngImpementation(String name, int age) {
        super(name, age);
    }

    @Override
    public int hashCode() {
        return (int) (Math.random() * 100);
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }
}

