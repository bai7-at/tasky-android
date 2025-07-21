package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class ane extends jme {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final yme e;
    private final xme f;

    /* synthetic */ ane(int i, int i2, int i3, int i4, yme ymeVar, xme xmeVar, zme zmeVar) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = ymeVar;
        this.f = xmeVar;
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.e != yme.d;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }

    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ane)) {
            return false;
        }
        ane aneVar = (ane) obj;
        return aneVar.a == this.a && aneVar.b == this.b && aneVar.c == this.c && aneVar.d == this.d && aneVar.e == this.e && aneVar.f == this.f;
    }

    public final xme f() {
        return this.f;
    }

    public final yme g() {
        return this.e;
    }

    public final int hashCode() {
        return Objects.hash(ane.class, Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f);
    }

    public final String toString() {
        xme xmeVar = this.f;
        return "AesCtrHmacAead Parameters (variant: " + String.valueOf(this.e) + ", hashType: " + String.valueOf(xmeVar) + ", " + this.c + "-byte IV, and " + this.d + "-byte tags, and " + this.a + "-byte AES key, and " + this.b + "-byte HMAC key)";
    }
}
