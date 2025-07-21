package com.nytimes.android.growthui.landingpage.models.remoteconfig;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class BadgeDetailsData {
    private final String a;
    private final boolean b;

    public BadgeDetailsData(String str, boolean z) {
        zq3.h(str, "text");
        this.a = str;
        this.b = z;
    }

    public final String a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BadgeDetailsData)) {
            return false;
        }
        BadgeDetailsData badgeDetailsData = (BadgeDetailsData) obj;
        return zq3.c(this.a, badgeDetailsData.a) && this.b == badgeDetailsData.b;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "BadgeDetailsData(text=" + this.a + ", isVisible=" + this.b + ")";
    }

    public /* synthetic */ BadgeDetailsData(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }
}
