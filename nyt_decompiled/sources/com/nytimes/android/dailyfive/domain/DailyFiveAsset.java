package com.nytimes.android.dailyfive.domain;

import defpackage.et3;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class DailyFiveAsset {
    private final String a;
    private final b b;
    private final List c;

    public DailyFiveAsset(String str, b bVar, List list) {
        zq3.h(bVar, "node");
        this.a = str;
        this.b = bVar;
        this.c = list;
    }

    public final String a() {
        return this.a;
    }

    public final b b() {
        return this.b;
    }

    public final List c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DailyFiveAsset)) {
            return false;
        }
        DailyFiveAsset dailyFiveAsset = (DailyFiveAsset) obj;
        return zq3.c(this.a, dailyFiveAsset.a) && zq3.c(this.b, dailyFiveAsset.b) && zq3.c(this.c, dailyFiveAsset.c);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31;
        List list = this.c;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "DailyFiveAsset(channelUri=" + this.a + ", node=" + this.b + ", trackingParams=" + this.c + ")";
    }

    public /* synthetic */ DailyFiveAsset(String str, b bVar, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bVar, (i & 4) != 0 ? null : list);
    }
}
