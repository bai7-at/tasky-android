package com.nytimes.xwords.hybrid.utils;

import defpackage.zq3;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public interface ArchivePath extends Serializable {
    public static final a O = a.a;

    private static final class YearMonthDay implements ArchivePath {
        public static final a a = new a(null);
        private static final DateTimeFormatter b = DateTimeFormatter.ofPattern("/yyyy-MM-dd");
        private final LocalDate date;
        private final int day;
        private final int month;
        private final int year;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public YearMonthDay(int i, int i2, int i3) {
            this.year = i;
            this.month = i2;
            this.day = i3;
            this.date = LocalDate.of(i, i2, i3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof YearMonthDay)) {
                return false;
            }
            YearMonthDay yearMonthDay = (YearMonthDay) obj;
            return this.year == yearMonthDay.year && this.month == yearMonthDay.month && this.day == yearMonthDay.day;
        }

        @Override // com.nytimes.xwords.hybrid.utils.ArchivePath
        public String getPath() {
            String format = this.date.format(b);
            zq3.g(format, "format(...)");
            return format;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.year) * 31) + Integer.hashCode(this.month)) * 31) + Integer.hashCode(this.day);
        }

        public String toString() {
            return "YearMonthDay(year=" + this.year + ", month=" + this.month + ", day=" + this.day + ")";
        }
    }

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ArchivePath a(int i, int i2, int i3) {
            return new YearMonthDay(i, i2, i3);
        }
    }

    String getPath();
}
