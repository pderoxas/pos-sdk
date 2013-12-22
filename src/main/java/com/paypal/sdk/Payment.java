package com.paypal.sdk;

import java.util.UUID;

/**
 * Created by pderoxas on 12/22/13.
 */
public class Payment {
    private UUID id;
    private String description;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
