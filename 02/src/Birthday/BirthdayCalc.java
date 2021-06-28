package Birthday;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class BirthdayCalc
{
    private LocalDateTime birthday;

    public BirthdayCalc(int day, int month, int year)
    {
        birthday = LocalDateTime.of(year, month, day, 0, 0);
    }

    public long getAge()
    {
        return ChronoUnit.YEARS.between(birthday, LocalDateTime.now());
    }

    public long getDaysUntilNextBirthday()
    {
        long diff = ChronoUnit.DAYS.between(birthday.withYear(LocalDateTime.now().getYear()), LocalDateTime.now());
        if (diff > 0)
            return 365 - diff;
        else
            return -diff + 1;
    }

    public void setBirthday(LocalDateTime birthday)
    {
        this.birthday = birthday;
    }

    public LocalDateTime getEinsteinBirthday()
    {
        // retrieving from online birthday API ...
        return LocalDateTime.of(1879, 3, 14, 0, 0);
    }

}