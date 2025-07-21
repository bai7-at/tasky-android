package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class owe extends twe {
    private final int a;
    private final int b;
    private final mwe c;
    private final lwe d;

    /* synthetic */ owe(int i, int i2, mwe mweVar, lwe lweVar, nwe nweVar) {
        this.a = i;
        this.b = i2;
        this.c = mweVar;
        this.d = lweVar;
    }

    public static kwe e() {
        return new kwe(null);
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.c != mwe.e;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        mwe mweVar = this.c;
        if (mweVar == mwe.e) {
            return this.b;
        }
        if (mweVar == mwe.b || mweVar == mwe.c || mweVar == mwe.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof owe)) {
            return false;
        }
        owe oweVar = (owe) obj;
        return oweVar.a == this.a && oweVar.d() == d() && oweVar.c == this.c && oweVar.d == this.d;
    }

    public final lwe f() {
        return this.d;
    }

    public final mwe g() {
        return this.c;
    }

    public final int hashCode() {
        return Objects.hash(owe.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        lwe lweVar = this.d;
        return "HMAC Parameters (variant: " + String.valueOf(this.c) + ", hashType: " + String.valueOf(lweVar) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
