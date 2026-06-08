package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;

    @GeneratedValue()
    private long clientId;

    protected Portfolio() {}

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId(){
        return clientId;
    }
}
