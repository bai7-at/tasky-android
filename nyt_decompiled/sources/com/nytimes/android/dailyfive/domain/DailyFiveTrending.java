package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveTrending extends a {
    private final List a;
    private final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFiveTrending(List list, List list2) {
        super(null);
        zq3.h(list, "channels");
        zq3.h(list2, "assets");
        this.a = list;
        this.b = list2;
    }

    public final List a() {
        return this.b;
    }

    public final List b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFiveTrending)) {
            return false;
        }
        DailyFiveTrending dailyFiveTrending = (DailyFiveTrending) obj;
        return zq3.c(this.a, dailyFiveTrending.a) && zq3.c(this.b, dailyFiveTrending.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DailyFiveTrending(channels=" + this.a + ", assets=" + this.b + ")";
    }
}
