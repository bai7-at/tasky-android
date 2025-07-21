package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class kl0 {
    public static final int e = 8;
    private final CharSequence a;
    private final String b;
    private final String c;
    private final ss2 d;

    public kl0(CharSequence charSequence, String str, String str2, ss2 ss2Var) {
        zq3.h(charSequence, "text");
        this.a = charSequence;
        this.b = str;
        this.c = str2;
        this.d = ss2Var;
    }

    public final ss2 a() {
        return this.d;
    }

    public final String b() {
        return this.c;
    }

    public final CharSequence c() {
        return this.a;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl0)) {
            return false;
        }
        kl0 kl0Var = (kl0) obj;
        return zq3.c(this.a, kl0Var.a) && zq3.c(this.b, kl0Var.b) && zq3.c(this.c, kl0Var.c) && zq3.c(this.d, kl0Var.d);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ss2 ss2Var = this.d;
        return hashCode3 + (ss2Var != null ? ss2Var.hashCode() : 0);
    }

    public String toString() {
        CharSequence charSequence = this.a;
        return "ClickableText(text=" + ((Object) charSequence) + ", url=" + this.b + ", tag=" + this.c + ", onClick=" + this.d + ")";
    }

    public /* synthetic */ kl0(CharSequence charSequence, String str, String str2, ss2 ss2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(charSequence, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : ss2Var);
    }
}
