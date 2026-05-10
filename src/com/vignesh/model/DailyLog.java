package com.vignesh.model;

public class DailyLog {
    private String date;
    private float studyHours;
    private float expenses;
    private float screenTime;

    public DailyLog(String date, float studyHours, float expenses, float screenTime) {
        this.date = date;
        this.studyHours = studyHours;
        this.expenses = expenses;
        this.screenTime = screenTime;
    }

    public String getDate() { return date; }
    public float getStudyHours() { return studyHours; }
    public float getExpenses() { return expenses; }
    public float getScreenTime() { return screenTime; }
}
