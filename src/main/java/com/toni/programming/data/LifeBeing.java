package com.toni.programming.data;

public abstract class LifeBeing implements IAction, IRender {

    private Status status;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
