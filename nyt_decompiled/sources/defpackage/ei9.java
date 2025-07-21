package defpackage;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ei9 {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Map g;

    public ei9(String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        zq3.h(str2, "uri");
        zq3.h(str3, "headline");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = map;
    }

    public final Map a() {
        return this.g;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.e;
    }

    public final String d() {
        return this.f;
    }

    public final String e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ei9)) {
            return false;
        }
        ei9 ei9Var = (ei9) obj;
        return zq3.c(this.a, ei9Var.a) && zq3.c(this.b, ei9Var.b) && zq3.c(this.c, ei9Var.c) && zq3.c(this.d, ei9Var.d) && zq3.c(this.e, ei9Var.e) && zq3.c(this.f, ei9Var.f) && zq3.c(this.g, ei9Var.g);
    }

    public final String f() {
        return this.b;
    }

    public final String g() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int hashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map map = this.g;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    public String toString() {
        return "WirecutterLockupData(url=" + this.a + ", uri=" + this.b + ", headline=" + this.c + ", summary=" + this.d + ", media=" + this.e + ", photoCredit=" + this.f + ", algos=" + this.g + ")";
    }

    public /* synthetic */ ei9(String str, String str2, String str3, String str4, String str5, String str6, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, (i & 64) != 0 ? null : map);
    }
}
