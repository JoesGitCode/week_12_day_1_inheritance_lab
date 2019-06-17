public abstract class Employee {

    private String name;
    private int nINumber;
    private double salary;

    public Employee(String name, int nINumber, double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseAmount){
        this.salary += this.salary * raiseAmount;
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
