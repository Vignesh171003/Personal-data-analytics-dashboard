package com.vignesh.main;
import com.vignesh.dao.DailyLogDAO;
import com.vignesh.model.DailyLog;
import java.util.List;


public class MainApp {
    public static void main(String[] args) {

        DailyLogDAO dao = new DailyLogDAO();

        List<DailyLog> logs = dao.getAllLogs();

        for (DailyLog log : logs) {
            System.out.println(
                log.getDate() + " | " +
                log.getStudyHours() + " hrs | " +
                log.getExpenses() + " Rs | " +
                log.getScreenTime() + " hrs"
            );
        }
    }
}