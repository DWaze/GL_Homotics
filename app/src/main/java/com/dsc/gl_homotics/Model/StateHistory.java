package com.dsc.gl_homotics.Model;

public class StateHistory {
    private String state;
    private String stateDescription;
    private long stateDate;

    public StateHistory() {
    }

    public StateHistory(String state, String stateDescription, long stateDate) {
        this.state = state;
        this.stateDescription = stateDescription;
        this.stateDate = stateDate;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setStateDescription(String stateDescription) {
        this.stateDescription = stateDescription;
    }

    public void setStateDate(long stateDate) {
        this.stateDate = stateDate;
    }

    public String getState() {
        return state;
    }

    public String getStateDescription() {
        return stateDescription;
    }

    public long getStateDate() {
        return stateDate;
    }
}
