package com.vignesh.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.vignesh.db.DBConnection;
import com.vignesh.model.DailyLog;

public class DailyLogDAO {

    public List<DailyLog> getAllLogs() {
        List<DailyLog> logs = new ArrayList<>();

        try {
            Connection conn = DBConnection.getConnection();
            String sql = "SELECT * FROM daily_logs";

            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                DailyLog log = new DailyLog(
                    rs.getString("date"),
                    rs.getFloat("study_hours"),
                    rs.getFloat("expenses"),
                    rs.getFloat("screen_time")
                );
                logs.add(log);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return logs;
    }
}