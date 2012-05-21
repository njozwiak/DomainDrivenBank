package com.xebia.domain.ValueObject;

import java.util.Date;

public class Operation {

    private Date date;
    private String libelle;
    private Double debit;
    private Double credit;

    public Operation(Date date, String libelle, Double debit, Double credit) {
        this.date = date;
        this.libelle = libelle;
        this.debit = debit;
        this.credit = credit;
    }

    public Date getDate() {
        return date;
    }

    public String getLibelle() {
        return libelle;
    }

    public Double getDebit() {
        return debit;
    }

    public Double getCredit() {
        return credit;
    }
}
