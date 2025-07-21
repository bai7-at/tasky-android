package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class srf {
    private final Class a;
    private final n7g b;

    /* synthetic */ srf(Class cls, n7g n7gVar, qrf qrfVar) {
        this.a = cls;
        this.b = n7gVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof srf)) {
            return false;
        }
        srf srfVar = (srf) obj;
        return srfVar.a.equals(this.a) && srfVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.a.getSimpleName() + ", object identifier: " + String.valueOf(this.b);
    }
}
