package Employee_Assignment;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class Manager extends Employee {
    float hra;

    public Manager(String name, String address, int age, String gender, float basicSalary, float hra) {
        super(name, address, age, gender, basicSalary);
        this.hra = hra;
    }

    public float getHra() {
        return this.hra;
    }
}