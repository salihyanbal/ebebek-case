public class main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ebebek", 15000, 45, 1990);
        String employeeInfos =
                        employee.toString() +
                        "\ntax = " + employee.tax() +
                        "\nbonus = " + employee.bonus() +
                        "\nsalary raise = " + employee.raiseSalary() +
                        "\nsalary with bonuses and taxes = " + (employee.getSalary() - employee.tax() + employee.bonus());
        employee.setSalary(employee.getSalary() + employee.raiseSalary());
        employeeInfos += "\ntotal salary (after raise) = " + (employee.getSalary() - employee.tax() + employee.bonus());
        System.out.println(employeeInfos);
    }
}
