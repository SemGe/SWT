package Birthday;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * BirthdayCalc calculation class
 */
public class BirthdayCalc
{
    private LocalDateTime birthday;

    /**
     * @param day day of birth
     * @param month month of birth
     * @param year year of birth
     */
    public BirthdayCalc(int day, int month, int year)
    {
        birthday = LocalDateTime.of(year, month, day, 0, 0);
    }

    /**
     * compute the current age of the person
     * @return current age
     */
    public long getAge()
    {
        return ChronoUnit.YEARS.between(birthday, LocalDateTime.now());
    }

    /**
     * compute days left until next birthday
     * @return days left
     */
    public long getDaysUntilNextBirthday()
    {
        long diff = ChronoUnit.DAYS.between(birthday.withYear(LocalDateTime.now().getYear()), LocalDateTime.now());
        if (diff > 0)
            return 365 - diff;
        else
            return -diff + 1;
    }

    /**
     * (re)set birthday of person
     * @param birthday birthdate of person
     */
    public void setBirthday(LocalDateTime birthday)
    {
        this.birthday = birthday;
    }

    /**
     * compute birthday of Einstein
     * @return Einstein's birthday
     */
    public LocalDateTime getEinsteinBirthday()
    {
        // retrieving from online birthday API ...
        return LocalDateTime.of(1879, 3, 14, 0, 0);
    }

}