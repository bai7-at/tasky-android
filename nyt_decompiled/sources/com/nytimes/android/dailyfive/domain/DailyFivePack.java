package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.collections.i;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFivePack extends c {
    private final String a;
    private final boolean b;
    private final String c;
    private final String d;
    private final List e;
    private final List f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DailyFivePack(String str, boolean z, String str2, String str3, List list, List list2) {
        super(null);
        zq3.h(str, "kicker");
        zq3.h(str2, "packChannelURI");
        zq3.h(str3, "promoText");
        zq3.h(list, "channels");
        zq3.h(list2, "assets");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = list;
        this.f = list2;
    }

    public final List a() {
        return this.f;
    }

    public final DailyFiveChannel b() {
        return (DailyFiveChannel) i.k0(c());
    }

    public List c() {
        return this.e;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFivePack)) {
            return false;
        }
        DailyFivePack dailyFivePack = (DailyFivePack) obj;
        return zq3.c(this.a, dailyFivePack.a) && this.b == dailyFivePack.b && zq3.c(this.c, dailyFivePack.c) && zq3.c(this.d, dailyFivePack.d) && zq3.c(this.e, dailyFivePack.e) && zq3.c(this.f, dailyFivePack.f);
    }

    public String f() {
        return this.d;
    }

    public boolean g() {
        return this.b;
    }

    public int hashCode() {
        return (((((((((this.a.hashCode() * 31) + Boolean.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public String toString() {
        return "DailyFivePack(kicker=" + this.a + ", isEditorial=" + this.b + ", packChannelURI=" + this.c + ", promoText=" + this.d + ", channels=" + this.e + ", assets=" + this.f + ")";
    }
}
