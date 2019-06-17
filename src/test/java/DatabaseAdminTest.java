import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {


    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", 2, 3);
    }

    @Test
    public void canGetName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void canGetnINumber(){
        assertEquals(2, databaseAdmin.getnINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(3, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary(0.1);
        assertEquals(3.3, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetAPayBonus(){
        assertEquals(0.03, databaseAdmin.payBonus(), 0.001);
    }
}
