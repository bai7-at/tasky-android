package com.google.android.tv.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
final class zzd extends C$AutoValue_IconClickFallbackImage {
    public static final Parcelable.Creator<zzd> CREATOR = new c();

    zzd(int i, int i2, String str, String str2, String str3) {
        super(i, i2, str, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(f());
        parcel.writeInt(d());
        parcel.writeString(b());
        parcel.writeString(c());
        parcel.writeString(e());
    }
}
