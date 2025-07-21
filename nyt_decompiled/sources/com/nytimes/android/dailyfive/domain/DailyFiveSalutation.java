package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveSalutation extends a {
    private final String a;
    private final String b;

    public DailyFiveSalutation(String str, String str2) {
        super(null);
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFiveSalutation)) {
            return false;
        }
        DailyFiveSalutation dailyFiveSalutation = (DailyFiveSalutation) obj;
        return zq3.c(this.a, dailyFiveSalutation.a) && zq3.c(this.b, dailyFiveSalutation.b);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "DailyFiveSalutation(headline=" + this.a + ", summary=" + this.b + ")";
    }
}
