package day4.DAOExample;

public class Employee {
    private int id;
    private String name;
    private String occupation;
    Scanner scanner = new Scanner();

    public Employee() {

        this.id = scanner.getId();
        this.name = scanner.name();
        this.occupation = scanner.occupation();

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }

    public String getOccupation() {

        return occupation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
}
