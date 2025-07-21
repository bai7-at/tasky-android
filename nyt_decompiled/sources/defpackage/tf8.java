package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class tf8 {
    private final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final boolean e;
    private final String f;

    public tf8(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        zq3.h(str, "tag");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.f;
    }

    public final String d() {
        return this.b;
    }

    public final boolean e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf8)) {
            return false;
        }
        tf8 tf8Var = (tf8) obj;
        return zq3.c(this.a, tf8Var.a) && zq3.c(this.b, tf8Var.b) && zq3.c(this.c, tf8Var.c) && this.d == tf8Var.d && this.e == tf8Var.e && zq3.c(this.f, tf8Var.f);
    }

    public final boolean f() {
        return this.e;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (((((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.d)) * 31) + Boolean.hashCode(this.e)) * 31;
        String str3 = this.f;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "Tag(tag=" + this.a + ", title=" + this.b + ", tagDescription=" + this.c + ", isDefault=" + this.d + ", isPushkinTag=" + this.e + ", tagGroupTitle=" + this.f + ")";
    }

    public /* synthetic */ tf8(String str, String str2, String str3, boolean z, boolean z2, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) == 0 ? z2 : false, (i & 32) == 0 ? str4 : null);
    }
}
