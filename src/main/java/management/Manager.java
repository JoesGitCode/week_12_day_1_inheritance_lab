package management;

import staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int nINumber, double salary, String deptName){
        super(name, nINumber, salary);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return deptName;
    }
}
