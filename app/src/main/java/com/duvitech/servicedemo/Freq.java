package com.duvitech.servicedemo;

/**
 * Created by gvige on 3/26/2018.
 */

import android.os.Parcel;
import android.os.Parcelable;

public class Freq implements Parcelable{
    public int mFreq;
    public int mSymbol;
    public int mQam;

    public Freq()
    {
        mFreq = 0;
        mSymbol = 0;
        mQam = 0;
    }

    public Freq(Parcel pl)
    {
        mFreq = pl.readInt();
        mSymbol = pl.readInt();
        mQam = pl.readInt();
    }

    public Freq(int freq, int symbol, int qam)
    {
        mFreq = freq;
        mSymbol = symbol;
        mQam = qam;
    }

    void setFreq( int freq, int symbol, int qam)
    {
        mFreq = freq;
        mSymbol = symbol;
        mQam = qam;
    }

    @Override
    public int describeContents() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        // TODO Auto-generated method stub
        dest.writeInt(this.mFreq);
        dest.writeInt(this.mSymbol);
        dest.writeInt(this.mQam);
    }

    public static final Parcelable.Creator<Freq> CREATOR = new Parcelable.Creator<Freq>(){

        @Override
        public Freq createFromParcel(Parcel arg0) {
            // TODO Auto-generated method stub
            return new Freq(arg0);
        }

        @Override
        public Freq[] newArray(int arg0) {
            // TODO Auto-generated method stub
            return new Freq[arg0];
        }

    };
}
