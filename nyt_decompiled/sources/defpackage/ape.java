package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class ape extends jme {
    private final int a;
    private final yoe b;

    /* synthetic */ ape(int i, yoe yoeVar, zoe zoeVar) {
        this.a = i;
        this.b = yoeVar;
    }

    @Override // defpackage.ple
    public final boolean a() {
        return this.b != yoe.d;
    }

    public final int b() {
        return this.a;
    }

    public final yoe c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ape)) {
            return false;
        }
        ape apeVar = (ape) obj;
        return apeVar.a == this.a && apeVar.b == this.b;
    }

    public final int hashCode() {
        return Objects.hash(ape.class, Integer.valueOf(this.a), this.b);
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.b) + ", " + this.a + "-byte key)";
    }
}
