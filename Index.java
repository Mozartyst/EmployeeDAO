package day4.DAOExample;

import java.util.List;


public class Index {
    private String what = "Co chcesz zrobic?\nDodać - wciśnij: ( + )\nUsunąć - wciśnij: ( - )\n" +
            "Edytować - wciśnij: ( & )\nWylistować - wciśnij: ( # )\nWylistować po ID - wciśnij: ( $ )\n" +
            "Wyjście - wciśnij: ( Q )";
    EmployeeDAO emp = new EmployeeDAO();

    public Index() {
        index();
    }

    private void index() {
        print(what);
        print1(": ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String what = scanner.nextLine();
        if (what.equals("+")) {
            emp.addEmployee(new Employee());
            index();

        } else if (what.equals("-")) {
            emp.removeEmployee(new Employee());
            index();

        } else if (what.equals("&")) {
            emp.editEmployee(new Employee());
            index();

        } else if (what.equals("#")) {
            writeList(emp);
            index();


        } else if (what.equals("$")) {
            System.out.println(emp.getEmployeeById(new Scanner()));
            index();


        } else if (what.equals("Q")) {
            System.exit(0);


        } else {
            print("Błędny znak");
            index();
        }
    }

    private void print(String txt) {
        System.out.println(txt);
    }

    private void print1(String txt) {
        System.out.print(txt);
    }

    private static void writeList(EmployeeDAO emp) {
        List<Employee> list = emp.getAllEmployees();
        for (Employee em : list) {
            System.out.println(em);
        }
        System.out.println("************************************************");
    }


}

