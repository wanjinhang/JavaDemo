package com.example.test.set;

/**
 * The type My date.
 *
 * @author wansui
 * @version 1.0
 * @date 2023 /9/24 21:50
 */
public class MyDate {
    /**
     * The Year.
     */
    private int year;
    /**
     * The Month.
     */
    private int month;
    /**
     * The Day.
     */
    private int day;

    /**
     * Instantiates a new My date.
     *
     * @param year  the year
     * @param month the month
     * @param day   the day
     */
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Instantiates a new My date.
     */
    public MyDate() {
    }

    /**
     * Gets year.
     *
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * Sets year.
     *
     * @param year the year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Gets month.
     *
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * Sets month.
     *
     * @param month the month
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Gets day.
     *
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets day.
     *
     * @param day the day
     */
    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
}
