package com.visionarycrofting.entity;

public enum StatusCommande {
    EN_COURS("en-cours"),
    EFFECTUER("effectuer");
    private String name;
    StatusCommande(String name) {
        this.name = name;
    }
}
