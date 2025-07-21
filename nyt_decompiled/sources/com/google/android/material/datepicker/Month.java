package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes3.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();
    final int daysInMonth;
    final int daysInWeek;
    private final Calendar firstOfMonth;
    private String longName;
    final int month;
    final long timeInMillis;
    final int year;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar c = l.c(calendar);
        this.firstOfMonth = c;
        this.month = c.get(2);
        this.year = c.get(1);
        this.daysInWeek = c.getMaximum(7);
        this.daysInMonth = c.getActualMaximum(5);
        this.timeInMillis = c.getTimeInMillis();
    }

    static Month b(int i, int i2) {
        Calendar i3 = l.i();
        i3.set(1, i);
        i3.set(2, i2);
        return new Month(i3);
    }

    static Month c(long j) {
        Calendar i = l.i();
        i.setTimeInMillis(j);
        return new Month(i);
    }

    static Month d() {
        return new Month(l.g());
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Month month) {
        return this.firstOfMonth.compareTo(month.firstOfMonth);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    int e(int i) {
        int i2 = this.firstOfMonth.get(7);
        if (i <= 0) {
            i = this.firstOfMonth.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.daysInWeek : i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.month == month.month && this.year == month.year;
    }

    long f(int i) {
        Calendar c = l.c(this.firstOfMonth);
        c.set(5, i);
        return c.getTimeInMillis();
    }

    int g(long j) {
        Calendar c = l.c(this.firstOfMonth);
        c.setTimeInMillis(j);
        return c.get(5);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.month), Integer.valueOf(this.year)});
    }

    String i() {
        if (this.longName == null) {
            this.longName = c.f(this.firstOfMonth.getTimeInMillis());
        }
        return this.longName;
    }

    long k() {
        return this.firstOfMonth.getTimeInMillis();
    }

    Month l(int i) {
        Calendar c = l.c(this.firstOfMonth);
        c.add(2, i);
        return new Month(c);
    }

    int n(Month month) {
        if (this.firstOfMonth instanceof GregorianCalendar) {
            return ((month.year - this.year) * 12) + (month.month - this.month);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.year);
        parcel.writeInt(this.month);
    }
}
