package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g54 {
    public static final int e = 0;
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    public g54(String str, String str2, String str3, String str4) {
        zq3.h(str, "textToMatch");
        zq3.h(str2, "url");
        zq3.h(str3, "tag");
        zq3.h(str4, "title");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g54)) {
            return false;
        }
        g54 g54Var = (g54) obj;
        return zq3.c(this.a, g54Var.a) && zq3.c(this.b, g54Var.b) && zq3.c(this.c, g54Var.c) && zq3.c(this.d, g54Var.d);
    }

    public int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        return "LinkToken(textToMatch=" + this.a + ", url=" + this.b + ", tag=" + this.c + ", title=" + this.d + ")";
    }

    public /* synthetic */ g54(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
