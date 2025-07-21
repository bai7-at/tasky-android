package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveCompletion extends a {
    private final String a;

    public DailyFiveCompletion(String str) {
        super(null);
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DailyFiveCompletion) && zq3.c(this.a, ((DailyFiveCompletion) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "DailyFiveCompletion(headline=" + this.a + ")";
    }
}
