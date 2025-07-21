package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveArticle extends c {
    private final String a;
    private final boolean b;
    private final String c;
    private final String d;
    private final List e;
    private final DailyFiveAsset f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFiveArticle(String str, boolean z, String str2, String str3, List list, DailyFiveAsset dailyFiveAsset) {
        super(null);
        zq3.h(str, "kicker");
        zq3.h(str2, "packChannelURI");
        zq3.h(str3, "promoText");
        zq3.h(list, "channels");
        zq3.h(dailyFiveAsset, "asset");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = dailyFiveAsset;
    }

    public final DailyFiveAsset a() {
        return this.f;
    }

    public List b() {
        return this.e;
    }

    public String c() {
        return this.a;
    }

    public String d() {
        return this.c;
    }

    public String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFiveArticle)) {
            return false;
        }
        DailyFiveArticle dailyFiveArticle = (DailyFiveArticle) obj;
        return zq3.c(this.a, dailyFiveArticle.a) && this.b == dailyFiveArticle.b && zq3.c(this.c, dailyFiveArticle.c) && zq3.c(this.d, dailyFiveArticle.d) && zq3.c(this.e, dailyFiveArticle.e) && zq3.c(this.f, dailyFiveArticle.f);
    }

    public boolean f() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "DailyFiveArticle(kicker=" + this.a + ", isEditorial=" + this.b + ", packChannelURI=" + this.c + ", promoText=" + this.d + ", channels=" + this.e + ", asset=" + this.f + ")";
    }
}
