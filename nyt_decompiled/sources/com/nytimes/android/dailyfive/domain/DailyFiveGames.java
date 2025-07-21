package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveGames extends a {
    private final String a;
    private final List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFiveGames(String str, List list) {
        super(null);
        zq3.h(str, "kicker");
        zq3.h(list, "assets");
        this.a = str;
        this.b = list;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFiveGames)) {
            return false;
        }
        DailyFiveGames dailyFiveGames = (DailyFiveGames) obj;
        return zq3.c(this.a, dailyFiveGames.a) && zq3.c(this.b, dailyFiveGames.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "DailyFiveGames(kicker=" + this.a + ", assets=" + this.b + ")";
    }
}
