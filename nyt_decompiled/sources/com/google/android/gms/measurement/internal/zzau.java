package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

@SafeParcelable.Class(creator = "EventParamsCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes3.dex */
public final class zzau extends AbstractSafeParcelable implements Iterable<String> {
    public static final Parcelable.Creator<zzau> CREATOR = new s();

    @SafeParcelable.Field(getter = "z", id = 2)
    private final Bundle zza;

    zzau(Bundle bundle) {
        this.zza = bundle;
    }

    public final Bundle G0() {
        return new Bundle(this.zza);
    }

    final Double H0(String str) {
        return Double.valueOf(this.zza.getDouble("value"));
    }

    final Long K0(String str) {
        return Long.valueOf(this.zza.getLong("value"));
    }

    final Object X0(String str) {
        return this.zza.get(str);
    }

    @Override // java.lang.Iterable
    public final Iterator<String> iterator() {
        return new r(this);
    }

    public final String toString() {
        return this.zza.toString();
    }

    final String u1(String str) {
        return this.zza.getString(str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, G0(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final int zza() {
        return this.zza.size();
    }
}
