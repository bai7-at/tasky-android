package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class bqe extends jme {
    private final String a;

    private bqe(String str) {
        this.a = str;
    }

    public static bqe b(String str) {
        return new bqe(str);
    }

    @Override // defpackage.ple
    public final boolean a() {
        return false;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bqe) {
            return ((bqe) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(bqe.class, this.a);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.a + ")";
    }
}
