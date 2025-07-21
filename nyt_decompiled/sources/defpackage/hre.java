package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class hre extends jme {
    private final gre a;

    private hre(gre greVar) {
        this.a = greVar;
    }

    public static hre c(gre greVar) {
        return new hre(greVar);
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.a != gre.d;
    }

    public final gre b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hre) && ((hre) obj).a == this.a;
    }

    public final int hashCode() {
        return Objects.hash(hre.class, this.a);
    }

    public final String toString() {
        return "XChaCha20Poly1305 Parameters (variant: " + this.a.toString() + ")";
    }
}
