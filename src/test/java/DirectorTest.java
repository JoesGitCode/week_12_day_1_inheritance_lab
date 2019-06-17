import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Dave", 7, 25.3, "DVLA", 75);
    }

    @Test
    public void canGetName(){
        assertEquals("Dave", director.getName());
    }

    @Test
    public void canGetnINumber(){
        assertEquals(7, director.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25.3, director.getSalary(), 0.1);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("DVLA", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary(0.1);
        assertEquals(27.83, director.getSalary(), 0.01);
    }

    @Test
    public void canGetAPayBonus(){
        assertEquals(0.506, director.payBonus(), 0.01);
    }


    @Test
    public void getBudget() {
        assertEquals(75, director.getBudget());
    }

}
