abstract class Person implements Payable, Comparable<Payable> {
    private static int idgen = 1;
    private int id;
    private String name;
    private String surname;

    public Person() {

    }

    public Person(String name, String surname) {
        id=idgen++;
        setName(name);
        setSurname(surname);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPosition() {
        return "Student";
    }

    @Override
    public double getPaymentAmount() {
        return 0.0;
    }

    @Override
    public abstract int compareTo(Payable other);

    @Override
    public String toString() {
        return id + ". " + name + " " + surname;
    }

}





