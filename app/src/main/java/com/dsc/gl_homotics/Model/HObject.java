package com.dsc.gl_homotics.Model;

import java.util.List;

public class HObject {

    private String name;
    private String reference;
    private String size;
    private String state;
    private String objectType;
    private int objectWeight;
    private List<Action> actions;
    private List<StateHistory> stateHistories;

    public HObject() {
    }

    public HObject(String name, String reference, String size, String state, String objectType, int objectWeight, List<Action> actions, List<StateHistory> stateHistories) {
        this.name = name;
        this.reference = reference;
        this.size = size;
        this.state = state;
        this.objectType = objectType;
        this.objectWeight = objectWeight;
        this.actions = actions;
        this.stateHistories = stateHistories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public void setObjectWeight(int objectWeight) {
        this.objectWeight = objectWeight;
    }

    public void setActions(List<Action> actions) {
        this.actions = actions;
    }

    public void setStateHistories(List<StateHistory> stateHistories) {
        this.stateHistories = stateHistories;
    }

    public String getName() {
        return name;
    }

    public String getReference() {
        return reference;
    }

    public String getSize() {
        return size;
    }

    public String getState() {
        return state;
    }

    public String getObjectType() {
        return objectType;
    }

    public int getObjectWeight() {
        return objectWeight;
    }

    public List<Action> getActions() {
        return actions;
    }

    public List<StateHistory> getStateHistories() {
        return stateHistories;
    }
}
