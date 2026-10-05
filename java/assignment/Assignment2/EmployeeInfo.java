package Easy_Assignment;


public class EmployeeInfo {
//	6. Write a program by creating an 'Employee' class
//	having the following methods and print the final salary.
//	1 - 'getInfo()' which takes the salary, number of hours of work per day of employee as parameter
//	2 - 'addSal()' which adds $10 to salary of the employee if it is less than $500.
//	3 - 'addWork()' which adds $5 to salary of employee if the number of hours of work per day is more than 6 hours.

    double salary;
    int hours;

    void getInfo(double salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    void addSal() {
        if(this.salary < 500) {
            this.salary += 10;
        }
    }

    void addWork() {
        if(this.hours > 6) {
            this.salary += 5;
        }
    }

    double getSalary() {
        return salary;
    }




}