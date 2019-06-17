package staff;

public abstract class Employee {

    private String name;
    private int nINumber;
    public double salary;

    public Employee(String name, int nINumber, double salary){
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        if(name != null){
            this.name = name;
        }
    }

    public int getnINumber() {
        return nINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raiseAmount){
        if (raiseAmount > 0){
            this.salary += this.salary * raiseAmount;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
