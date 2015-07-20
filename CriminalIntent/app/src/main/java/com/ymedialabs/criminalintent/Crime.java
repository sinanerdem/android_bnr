package com.ymedialabs.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by sinan.erdem on 7/17/15.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime (){
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    @Override
    public String toString(){
        return mTitle;
    }

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }
}
