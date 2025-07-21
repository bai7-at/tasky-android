package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class ove extends twe {
    private final int a;
    private final int b;
    private final mve c;

    /* synthetic */ ove(int i, int i2, mve mveVar, nve nveVar) {
        this.a = i;
        this.b = i2;
        this.c = mveVar;
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.c != mve.e;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final int d() {
        mve mveVar = this.c;
        if (mveVar == mve.e) {
            return this.b;
        }
        if (mveVar == mve.b || mveVar == mve.c || mveVar == mve.d) {
            return this.b + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final mve e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ove)) {
            return false;
        }
        ove oveVar = (ove) obj;
        return oveVar.a == this.a && oveVar.d() == d() && oveVar.c == this.c;
    }

    public final int hashCode() {
        return Objects.hash(ove.class, Integer.valueOf(this.a), Integer.valueOf(this.b), this.c);
    }

    public final String toString() {
        return "AES-CMAC Parameters (variant: " + String.valueOf(this.c) + ", " + this.b + "-byte tags, and " + this.a + "-byte key)";
    }
}
