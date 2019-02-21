package com.dsc.gl_homotics.Model;

import java.util.List;

public class Action {
    private String description;
    private String instruction;
    private String name_action;
    private List<ActionHistory> mActionHistories;

    public Action() {
    }

    public Action(String description, String instruction, String name_action, List<ActionHistory> mActionHistories) {
        this.description = description;
        this.instruction = instruction;
        this.name_action = name_action;
        this.mActionHistories = mActionHistories;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setName_action(String name_action) {
        this.name_action = name_action;
    }

    public void setmActionHistories(List<ActionHistory> mActionHistories) {
        this.mActionHistories = mActionHistories;
    }

    public String getDescription() {
        return description;
    }

    public String getInstruction() {
        return instruction;
    }

    public String getName_action() {
        return name_action;
    }

    public List<ActionHistory> getmActionHistories() {
        return mActionHistories;
    }
}
