package com.silion.serializableandparcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by silion on 2015/10/14.
 */
public class ParcelableObject implements Parcelable {
    private String str;
    private int i;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.str);
        dest.writeInt(this.i);
    }

    public ParcelableObject() {
    }

    protected ParcelableObject(Parcel in) {
        this.str = in.readString();
        this.i = in.readInt();
    }

    public static final Creator<ParcelableObject> CREATOR = new Creator<ParcelableObject>() {
        public ParcelableObject createFromParcel(Parcel source) {
            return new ParcelableObject(source);
        }

        public ParcelableObject[] newArray(int size) {
            return new ParcelableObject[size];
        }
    };
}
