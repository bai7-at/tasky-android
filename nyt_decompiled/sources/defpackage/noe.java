package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class noe extends jme {
    private final int a;
    private final int b = 12;
    private final int c = 16;
    private final loe d;

    /* synthetic */ noe(int i, int i2, int i3, loe loeVar, moe moeVar) {
        this.a = i;
        this.d = loeVar;
    }

    public static koe c() {
        return new koe(null);
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.d != loe.d;
    }

    public final int b() {
        return this.a;
    }

    public final loe d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof noe)) {
            return false;
        }
        noe noeVar = (noe) obj;
        return noeVar.a == this.a && noeVar.d == this.d;
    }

    public final int hashCode() {
        return Objects.hash(noe.class, Integer.valueOf(this.a), 12, 16, this.d);
    }

    public final String toString() {
        return "AesGcm Parameters (variant: " + String.valueOf(this.d) + ", 12-byte IV, 16-byte tag, and " + this.a + "-byte key)";
    }
}
