package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class tne extends jme {
    private final int a;
    private final int b;
    private final int c = 16;
    private final rne d;

    /* synthetic */ tne(int i, int i2, int i3, rne rneVar, sne sneVar) {
        this.a = i;
        this.b = i2;
        this.d = rneVar;
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.d != rne.d;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.a;
    }

    public final rne d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tne)) {
            return false;
        }
        tne tneVar = (tne) obj;
        return tneVar.a == this.a && tneVar.b == this.b && tneVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(tne.class, Integer.valueOf(this.a), Integer.valueOf(this.b), 16, this.d);
    }

    public final String toString() {
        return "AesEax Parameters (variant: " + String.valueOf(this.d) + ", " + this.b + "-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
