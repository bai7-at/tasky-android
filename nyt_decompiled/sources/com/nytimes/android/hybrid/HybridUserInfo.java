package com.nytimes.android.hybrid;

import defpackage.et3;
import defpackage.zq3;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes4.dex */
public final class HybridUserInfo {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Set e;

    public HybridUserInfo(String str, String str2, String str3, String str4, Set set) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = set;
    }

    public final String a() {
        return this.d;
    }

    public final Set b() {
        return this.e;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HybridUserInfo)) {
            return false;
        }
        HybridUserInfo hybridUserInfo = (HybridUserInfo) obj;
        return zq3.c(this.a, hybridUserInfo.a) && zq3.c(this.b, hybridUserInfo.b) && zq3.c(this.c, hybridUserInfo.c) && zq3.c(this.d, hybridUserInfo.d) && zq3.c(this.e, hybridUserInfo.e);
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Set set = this.e;
        return hashCode4 + (set != null ? set.hashCode() : 0);
    }

    public String toString() {
        return "HybridUserInfo(nytsCookie=" + this.a + ", regiId=" + this.b + ", pushToken=" + this.c + ", agentId=" + this.d + ", entitlements=" + this.e + ")";
    }

    public /* synthetic */ HybridUserInfo(String str, String str2, String str3, String str4, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : set);
    }
}
