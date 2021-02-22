package com.toni.programming.data;


public abstract class LifeBeing implements IAction, IRender {

    protected Status status;
    protected String typeOfToy;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTypeOfToy() {
        return typeOfToy;
    }

    public void setTypeOfToy(String typeOfToy) {
        this.typeOfToy = typeOfToy;
    }
}
