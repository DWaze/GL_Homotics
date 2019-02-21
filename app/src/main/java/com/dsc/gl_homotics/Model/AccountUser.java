package com.dsc.gl_homotics.Model;

public class AccountUser {

    private String email;
    private boolean enabled;
    private String firstAccess;
    private String lastAccess;
    private String password;
    private String token;
    private String tokenIssueDate;
    private String type;

    public AccountUser() {
    }

    public AccountUser(String email, boolean enabled, String firstAccess, String lastAccess, String password, String token, String tokenIssueDate, String type) {
        this.email = email;
        this.enabled = enabled;
        this.firstAccess = firstAccess;
        this.lastAccess = lastAccess;
        this.password = password;
        this.token = token;
        this.tokenIssueDate = tokenIssueDate;
        this.type = type;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public void setFirstAccess(String firstAccess) {
        this.firstAccess = firstAccess;
    }

    public void setLastAccess(String lastAccess) {
        this.lastAccess = lastAccess;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setTokenIssueDate(String tokenIssueDate) {
        this.tokenIssueDate = tokenIssueDate;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public String getFirstAccess() {
        return firstAccess;
    }

    public String getLastAccess() {
        return lastAccess;
    }

    public String getPassword() {
        return password;
    }

    public String getToken() {
        return token;
    }

    public String getTokenIssueDate() {
        return tokenIssueDate;
    }

    public String getType() {
        return type;
    }
}
