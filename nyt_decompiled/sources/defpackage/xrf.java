package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
final class xrf {
    private final Class a;
    private final Class b;

    /* synthetic */ xrf(Class cls, Class cls2, vrf vrfVar) {
        this.a = cls;
        this.b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xrf)) {
            return false;
        }
        xrf xrfVar = (xrf) obj;
        return xrfVar.a.equals(this.a) && xrfVar.b.equals(this.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.a.getSimpleName() + " with serialization type: " + this.b.getSimpleName();
    }
}
