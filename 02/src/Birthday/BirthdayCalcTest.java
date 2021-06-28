package Birthday;

import java.time.DateTimeException;
import java.time.LocalDateTime;

import static org.junit.Assert.*;

public class BirthdayCalcTest
{

    @org.junit.Test
    public void getAge()
    {
        BirthdayCalc bc = new BirthdayCalc(5, 11, 2000);
        assertEquals(20, bc.getAge());
    }

    @org.junit.Test
    public void getDaysUntilNextBirthday()
    {
        BirthdayCalc bc = new BirthdayCalc(5, 11, 2000);
        assertEquals(130, bc.getDaysUntilNextBirthday());
    }

    @org.junit.Test(expected = DateTimeException.class)
    public void invalidFormat()
    {
        // invalid month
        BirthdayCalc bc = new BirthdayCalc(5, 13, 2000);
    }

}