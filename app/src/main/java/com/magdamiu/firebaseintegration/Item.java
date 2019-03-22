package com.magdamiu.firebaseintegration;

public class Item {

    private String mName;
    private boolean mDone;

    public Item(String name, boolean done) {
        mName = name;
        mDone = done;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public boolean isDone() {
        return mDone;
    }

    public void setDone(boolean done) {
        mDone = done;
    }
}
