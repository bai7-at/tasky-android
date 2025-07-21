package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class pxe {
    public static final pxe b = new nxe().a();
    private final Map a;

    public final Map a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof pxe) {
            return this.a.equals(((pxe) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
