package day4.DAOExample;


import java.util.List;

public class Scanner {
    private int id;
    private String name;
    private String occupation;
    private String whatname = "Podaj imię: ";
    private String whatoccupation = "Podaj zawód: ";
    private String whatId = "Podaj ID: ";

    public Scanner() {
        scan();

    }

    public void scan() {
        getName();
        getOccupation();
    }

    public String name() {
        return this.name;
    }

    public String occupation() {
        return this.occupation;
    }

    private void print(String txt) {
        System.out.print(txt);
    }

    public int getId() {
        askId();
        scanId1();
        return id;
    }

    private String getName() {
        askname();
        scannname();
        return name;
    }

    private String getOccupation() {
        askoccupation();
        scannoccupation();
        return occupation;
    }

    private void askId() {
        print(whatId);
    }

    private void askname() {
        print(whatname);
    }

    private void askoccupation() {
        print(whatoccupation);
    }

    private void scannoccupation() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        occupation = scanner.nextLine();

    }

    private void scannname() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        name = scanner.nextLine();
    }

    private void scanId1() {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        id = scanner.nextInt();
    }
}
