package com.google.android.exoplayer2.container;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.sb4;

/* loaded from: classes2.dex */
public final class CreationTime implements Metadata.Entry {
    public static final Parcelable.Creator<CreationTime> CREATOR = new a();
    public final long timestampMs;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CreationTime createFromParcel(Parcel parcel) {
            return new CreationTime(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CreationTime[] newArray(int i) {
            return new CreationTime[i];
        }
    }

    /* synthetic */ CreationTime(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CreationTime) && this.timestampMs == ((CreationTime) obj).timestampMs;
    }

    public int hashCode() {
        return sb4.b(this.timestampMs);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Creation time: ");
        long j = this.timestampMs;
        sb.append(j == -2082844800000L ? "unset" : Long.valueOf(j));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timestampMs);
    }

    public CreationTime(long j) {
        this.timestampMs = j;
    }

    private CreationTime(Parcel parcel) {
        this.timestampMs = parcel.readLong();
    }
}
