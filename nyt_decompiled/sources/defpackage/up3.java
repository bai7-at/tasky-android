package defpackage;

import type.InterestType;

/* loaded from: classes3.dex */
public final class up3 implements rp2 {
    private final String a;
    private final int b;
    private final InterestType c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Boolean h;
    private final Boolean i;

    public up3(String str, int i, InterestType interestType, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2) {
        zq3.h(str, "__typename");
        zq3.h(interestType, "interestType");
        zq3.h(str2, "interestSubType");
        this.a = str;
        this.b = i;
        this.c = interestType;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = bool;
        this.i = bool2;
    }

    public final String a() {
        return this.f;
    }

    public final int b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final InterestType d() {
        return this.c;
    }

    public final String e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof up3)) {
            return false;
        }
        up3 up3Var = (up3) obj;
        return zq3.c(this.a, up3Var.a) && this.b == up3Var.b && this.c == up3Var.c && zq3.c(this.d, up3Var.d) && zq3.c(this.e, up3Var.e) && zq3.c(this.f, up3Var.f) && zq3.c(this.g, up3Var.g) && zq3.c(this.h, up3Var.h) && zq3.c(this.i, up3Var.i);
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.a;
    }

    public final Boolean h() {
        return this.i;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.g;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.h;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.i;
        return hashCode5 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final Boolean i() {
        return this.h;
    }

    public String toString() {
        return "InterestPreview(__typename=" + this.a + ", interestId=" + this.b + ", interestType=" + this.c + ", interestSubType=" + this.d + ", name=" + this.e + ", description=" + this.f + ", promoImageURL=" + this.g + ", isOpinion=" + this.h + ", isEditorsPick=" + this.i + ")";
    }
}
