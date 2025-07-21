package defpackage;

import java.util.Arrays;
import java.util.Map;

/* loaded from: classes2.dex */
public final class dy6 {
    private final String a;
    private final String b;
    private final String c;
    private final Map d;
    private final byte[] e;
    private final String f;

    public dy6(String str, String str2, String str3, Map map, byte[] bArr, String str4) {
        zq3.h(str, "id");
        zq3.h(str2, "description");
        zq3.h(str3, "url");
        zq3.h(map, "headers");
        zq3.h(bArr, "body");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = bArr;
        this.f = str4;
    }

    public final byte[] a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final String c() {
        return this.b;
    }

    public final Map d() {
        return this.d;
    }

    public final String e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dy6)) {
            return false;
        }
        dy6 dy6Var = (dy6) obj;
        return zq3.c(this.a, dy6Var.a) && zq3.c(this.b, dy6Var.b) && zq3.c(this.c, dy6Var.c) && zq3.c(this.d, dy6Var.d) && zq3.c(this.e, dy6Var.e) && zq3.c(this.f, dy6Var.f);
    }

    public final String f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = ((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + Arrays.hashCode(this.e)) * 31;
        String str = this.f;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "Request(id=" + this.a + ", description=" + this.b + ", url=" + this.c + ", headers=" + this.d + ", body=" + Arrays.toString(this.e) + ", contentType=" + this.f + ")";
    }
}
