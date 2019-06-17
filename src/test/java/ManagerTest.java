import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dave", 7, 25.3, "DVLA");
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", manager.getName());
    }

    @Test
    public void canGetnINumber(){
        assertEquals(7, manager.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25.3, manager.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("DVLA", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(0.1);
        assertEquals(27.83, manager.getSalary(), 0.01);
    }

    @Test
    public void canGetAPayBonus(){
        assertEquals(0.253, manager.payBonus(), 0.01);
    }




}
