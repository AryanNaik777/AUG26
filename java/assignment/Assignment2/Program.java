package Easy_Assignment;


public class Program {

    public static void main(String[] args) {
        //Question 1:
        Student s1 = new Student("John", 2, "+188899999988", "NY");
        Student s2 = new Student("Sam", 1, "+1777745454548", "JP");

        System.out.println(s1.getName() + " " + s1.getAddress() + " " + s1.getRollNo() + " " + s1.getphoneNo());
        System.out.println(s2.getName() + " " + s2.getAddress() + " " + s2.getRollNo() + " " + s2.getphoneNo());

        System.out.println();
        //Question 2:
        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println("Perimeter of triangle: " + t1.getPerimeter());
        System.out.println("Area of triangle: " + t1.getArea());

        System.out.println();
        //Question 3:
        Rectangle r1 = new Rectangle(4, 5);
        Rectangle r2 = new Rectangle(5, 8);
        System.out.println("Area of Rectangle: " + r1.getArea());
        System.out.println("Area of Rectangle 2: " + r2.getArea());

        System.out.println();
        //Question 4:
        Complex c = new Complex(4, 5);
        Complex c2 = new Complex(9, 4);
        c.sum(c2);
        c.difference(c2);
        c.product(c2);

        System.out.println();
        //Question 5:
        Employee e1 = new Employee("Robert", 1994, 50000, "64C-WallsStreat");
        Employee e2 = new Employee("Sam", 2000, 20000, "68D-WallsStreat");
        Employee e3 = new Employee("Robert", 1999, 70000, "26B-WallsStreat");

        System.out.println("Name\tYear of Joining\tAddress");
        System.out.println(e1.name+"\t"+e1.year+"\t\t"+e1.address);
        System.out.println(e2.name+"\t"+e2.year+"\t\t"+e2.address);
        System.out.println(e3.name+"\t"+e3.year+"\t\t"+e3.address);

        System.out.println();
        //Question 6:
        EmployeeInfo eInfo = new EmployeeInfo();
        EmployeeInfo eInfo2 = new EmployeeInfo();
        eInfo.getInfo(52000, 16);
        eInfo.addSal();
        eInfo.addWork();
        System.out.println("Total Final Salary: " + eInfo.getSalary());

        eInfo2.getInfo(15, 5);
        eInfo2.addSal();
        eInfo2.addWork();
        System.out.println("Total Final Salary: " + eInfo2.getSalary());

    }

}