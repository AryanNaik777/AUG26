package Easy_Assignment;


public class Student {
//	1. Create a class named 'Student' with String variable 'name' ,
//	integer variable 'roll_no'., String variable ‘phone_no’ and String variable
//	‘address’
//	a.  Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
//	b. Assign and print the roll number, phone number and address of two students having names "Sam" and "John"
//	respectively by creating two objects of class 'Student'.

    String name;
    int roll_no;
    String phone_no;
    String address;

    Student(String name, int roll_no, String phone_no, String address){
        this.roll_no = roll_no;
        this.name = name;
        this.phone_no = phone_no;
        this.address = address;
    }

    String getName() {
        return name;
    }
    int getRollNo() {
        return roll_no;
    }
    String getphoneNo() {
        return phone_no;
    }
    String getAddress() {
        return address;
    }


}
