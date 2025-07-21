package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class vxe {
    private final dle a;
    private final int b;
    private final String c;
    private final String d;

    /* synthetic */ vxe(dle dleVar, int i, String str, String str2, uxe uxeVar) {
        this.a = dleVar;
        this.b = i;
        this.c = str;
        this.d = str2;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof vxe)) {
            return false;
        }
        vxe vxeVar = (vxe) obj;
        return this.a == vxeVar.a && this.b == vxeVar.b && this.c.equals(vxeVar.c) && this.d.equals(vxeVar.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d);
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, keyType='%s', keyPrefix='%s')", this.a, Integer.valueOf(this.b), this.c, this.d);
    }
}
