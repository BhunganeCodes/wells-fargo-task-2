package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long portfolioId;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;

    protected Portfolio() {}

    public Long getPortfolioId() {
        return portfolioId;
    }

    public Long getClientId(){
        return clientId;
    }
}
