package OOP;

public enum WeekDay {
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(){
    return this != SATURDAY && this != SUNDAY;
    }
    public boolean isHoliday(){
        return !isWeekDay(); //opposite of isWeekday
    }

}
