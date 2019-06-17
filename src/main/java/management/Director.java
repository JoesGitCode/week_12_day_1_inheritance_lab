package management;

public class Director extends Manager{

    private int budget;

    public Director(String name, int nINumber, double salary, String deptName, int budget){
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }


    public int getBudget() {
        return budget;
    }

    public double payBonus(){
        return super.salary * 0.02;
    }


}
