package Birthday;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class BirthdayCalcTest
{

    @Test
    public void getAge()
    {
        BirthdayCalc bc = new BirthdayCalc(5, 11, 2000);
        assertEquals(20, bc.getAge());
    }

    @Test
    public void getDaysUntilNextBirthday()
    {
        BirthdayCalc bc = new BirthdayCalc(5, 11, 2000);
        assertEquals(124, bc.getDaysUntilNextBirthday());       // needs to be updated everyday
    }

    @Test()
    public void invalidFormat()
    {
        // invalid month
        assertThrows(DateTimeException.class, () -> {
            BirthdayCalc bc = new BirthdayCalc(5, 13, 2000);
        });
    }

    @Test
    public void mockTest()
    {
        BirthdayCalc bc = new BirthdayCalc(1, 1, 2000);
        bc.setBirthday(mockedEinsteinBirthday());
        assertEquals(142, bc.getAge());
    }

    LocalDateTime mockedEinsteinBirthday()
    {
        return LocalDateTime.of(1879, 3, 14, 0, 0);
    }
}