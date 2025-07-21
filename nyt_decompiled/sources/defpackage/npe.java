package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class npe extends jme {
    private final mpe a;

    private npe(mpe mpeVar) {
        this.a = mpeVar;
    }

    public static npe c(mpe mpeVar) {
        return new npe(mpeVar);
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.a != mpe.d;
    }

    public final mpe b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof npe) && ((npe) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(npe.class, this.a);
    }

    public final String toString() {
        return "ChaCha20Poly1305 Parameters (variant: " + this.a.toString() + ")";
    }
}
