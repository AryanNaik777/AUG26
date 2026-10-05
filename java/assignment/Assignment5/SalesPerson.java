package Employee_Assignment;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//



public class SalesPerson extends Employee {
    float commission;

    public SalesPerson(String name, String address, int age, String gender, float basicSalary, float commission) {
        super(name, address, age, gender, basicSalary);
        this.commission = commission;
    }

    public float getCommission() {
        return this.commission;
    }
}
