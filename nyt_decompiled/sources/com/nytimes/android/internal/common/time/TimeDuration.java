package com.nytimes.android.internal.common.time;

import defpackage.et3;
import defpackage.zq3;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class TimeDuration implements Comparable<TimeDuration> {
    public static final a Companion = new a(null);
    private static final TimeDuration c = new TimeDuration(0, TimeUnit.MILLISECONDS);
    private final long a;
    private final TimeUnit b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public TimeDuration(long j, TimeUnit timeUnit) {
        zq3.h(timeUnit, "unit");
        this.a = j;
        this.b = timeUnit;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(TimeDuration timeDuration) {
        zq3.h(timeDuration, "other");
        int compare = Integer.compare(this.b.ordinal(), timeDuration.b.ordinal());
        return compare != -1 ? compare != 1 ? Long.compare(this.a, timeDuration.a) : Long.compare(d(timeDuration.b), timeDuration.a) : Long.compare(this.a, timeDuration.d(this.b));
    }

    public final TimeUnit b() {
        return this.b;
    }

    public final long c() {
        return this.a;
    }

    public final long d(TimeUnit timeUnit) {
        zq3.h(timeUnit, "asWhat");
        return timeUnit.convert(this.a, this.b);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TimeDuration) && compareTo((TimeDuration) obj) == 0;
    }

    public int hashCode() {
        return (int) this.b.toMillis(this.a);
    }

    public String toString() {
        long j = this.a;
        String name = this.b.name();
        Locale locale = Locale.getDefault();
        zq3.g(locale, "getDefault(...)");
        String lowerCase = name.toLowerCase(locale);
        zq3.g(lowerCase, "toLowerCase(...)");
        return j + " " + lowerCase;
    }
}
