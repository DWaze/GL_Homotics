package com.dsc.gl_homotics.Model;

public class ActionHistory {
    private Long date_action;
    private Long time_action;
    private String description;

    public ActionHistory() {
    }

    public ActionHistory(Long date_action, Long time_action, String description) {
        this.date_action = date_action;
        this.time_action = time_action;
        this.description = description;
    }

    public void setDate_action(Long date_action) {
        this.date_action = date_action;
    }

    public void setTime_action(Long time_action) {
        this.time_action = time_action;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDate_action() {
        return date_action;
    }

    public Long getTime_action() {
        return time_action;
    }

    public String getDescription() {
        return description;
    }
}
