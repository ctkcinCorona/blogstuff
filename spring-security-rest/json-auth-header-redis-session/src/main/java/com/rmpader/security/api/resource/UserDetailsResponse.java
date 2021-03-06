package com.rmpader.security.api.resource;

import com.rmpader.security.data.model.UserProfile;

/**
 * @author RMPader
 */
public class UserDetailsResponse {

    private String username;
    private UserProfile details;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDetails(UserProfile details) {
        this.details = details;
    }

    public UserProfile getDetails() {
        return details;
    }
}
