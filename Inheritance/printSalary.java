class Employee {
    String name;
    int age;
    int[] phnNo = new int[10];
    String address;
    float Salary;

    Employee(String name, int age, int[] phnNo, String address, float Salary) {
        this.name = name;
        this.age = age;
        this.phnNo = phnNo;
        this.address = address;
        this.Salary = Salary;
    }

    void printSalary(int Salary) {
        this.Salary = Salary;
        System.out.println("The Salary of Employee is " + Salary);
    }
}

class Officer extends Employee {
    String spec;

    Officer(String name, int age, int[] phnNo, String address, float Salary, String spec) {
        super(name, age, phnNo, address, Salary);
        this.spec = spec;
    }

    void display() {
        System.out.print("name is:" + name + "\nage is :" + age + "\ncontact number is :");
        for (int i = 0; i < phnNo.length; i++) {
            System.out.print(phnNo[i]);
        }
        System.out.print("\nSalary is:" + Salary + "\nSpecialization is :" + spec + "\n");
    }
}

class Manager extends Employee {
    String dept;

    Manager(String name, int age, int[] phnNo, String address, float Salary, String dept) {
        super(name, age, phnNo, address, Salary);
        this.dept = dept;
    }

    void display() {
        System.out.print("name is:" + name + "\nage is :" + age + "\ncontact number is :");
        for (int i = 0; i < phnNo.length; i++) {
            System.out.print(phnNo[i]);
        }
        System.out.print("\nSalary is:" + Salary + "\nDepartment is :" + dept + "\n");
    }
}

public class printSalary {
    public static void main(String[] args) {
        int[] phnNo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        Officer of = new Officer("Siya", 20, phnNo, "Saghjikl", 23658, "CS");
        Manager m = new Manager("Sarah", 19, phnNo, "Ooolampara", 1235, "Cu");
        of.display();
        m.display();
    }
}
