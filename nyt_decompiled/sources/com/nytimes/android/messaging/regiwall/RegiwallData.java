package com.nytimes.android.messaging.regiwall;

import defpackage.et3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class RegiwallData {
    private final boolean a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public RegiwallData(boolean z, String str, String str2, String str3, String str4) {
        zq3.h(str, "title");
        zq3.h(str2, "description");
        zq3.h(str3, "primaryButtonText");
        zq3.h(str4, "secondaryButtonText");
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RegiwallData)) {
            return false;
        }
        RegiwallData regiwallData = (RegiwallData) obj;
        return this.a == regiwallData.a && zq3.c(this.b, regiwallData.b) && zq3.c(this.c, regiwallData.c) && zq3.c(this.d, regiwallData.d) && zq3.c(this.e, regiwallData.e);
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public String toString() {
        return "RegiwallData(isActive=" + this.a + ", title=" + this.b + ", description=" + this.c + ", primaryButtonText=" + this.d + ", secondaryButtonText=" + this.e + ")";
    }

    public /* synthetic */ RegiwallData(boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? "Create an account and unlock more stories each month" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "Create a free account" : str3, (i & 16) != 0 ? "Have an account? Log in." : str4);
    }
}
