package com.everysport.api.domain.api;

public class ApiNamedEntity extends ApiIdEntity {
    private String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}