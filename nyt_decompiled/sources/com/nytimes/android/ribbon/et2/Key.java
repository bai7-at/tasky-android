package com.nytimes.android.ribbon.et2;

import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class Key implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Key> CREATOR = new a();
    private final String key;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Key createFromParcel(Parcel parcel) {
            zq3.h(parcel, "parcel");
            return new Key(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Key[] newArray(int i) {
            return new Key[i];
        }
    }

    public Key(String str) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        this.key = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        zq3.h(parcel, "out");
        parcel.writeString(this.key);
    }
}
