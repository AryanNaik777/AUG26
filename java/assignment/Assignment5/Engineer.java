package Employee_Assignment;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Engineer extends Employee {
    float overtime;

    public Engineer(String name, String address, int age, String gender, float basicSalary, float overtime) {
        super(name, address, age, gender, basicSalary);
        this.overtime = overtime;
    }

    public float getOvertime() {
        return this.overtime;
    }
}