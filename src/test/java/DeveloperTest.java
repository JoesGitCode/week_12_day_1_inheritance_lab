import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", 2, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void canGetnINumber(){
        assertEquals(2, developer.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(3, developer.getSalary(), 0.1);
    }

    @Test
    public void cannotRaiseSalaryByANegativeAmount(){
        developer.raiseSalary(-10);
        assertNotEquals(-30, developer.getSalary());
        assertEquals(3, developer.getSalary(), 0.01);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary(0.1);
        assertEquals(3.3, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetAPayBonus(){
        assertEquals(0.03, developer.payBonus(), 0.001);
    }


}
