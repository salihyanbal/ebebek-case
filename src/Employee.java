
public class Employee {


    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        return this.salary < 1000 ? 0 : this.salary * 0.03;
    }

    public int bonus(){
        return this.workHours > 40 ? (this.workHours-40) * 30 : 0;
    }

    public double raiseSalary(){
        int workingTime = 2021 - this.hireYear;

        if(workingTime < 10){
            return (this.salary + bonus() - tax()) * 0.05;
        }
        if(workingTime < 20){
            return (this.salary + bonus() - tax()) * 0.10;
        }
        return (this.salary + bonus() - tax()) * 0.15;
    }

    @Override
    public String toString() {
        return  "\nname = " + name +
                "\nsalary = " + salary +
                "\nwork hours = " + workHours +
                "\nhire year = " + hireYear;
    }

    public String getName() {
        return name;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public int getWorkHours() {
        return workHours;
    }

    public Employee setWorkHours(int workHours) {
        this.workHours = workHours;
        return this;
    }

    public int getHireYear() {
        return hireYear;
    }

    public Employee setHireYear(int hireYear) {
        this.hireYear = hireYear;
        return this;
    }
}
