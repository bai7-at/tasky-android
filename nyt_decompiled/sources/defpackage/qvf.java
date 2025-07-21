package defpackage;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class qvf {
    private final ubf a;
    private final int b;
    private final hcf c;

    /* synthetic */ qvf(ubf ubfVar, int i, hcf hcfVar, ovf ovfVar) {
        this.a = ubfVar;
        this.b = i;
        this.c = hcfVar;
    }

    public final int a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qvf)) {
            return false;
        }
        qvf qvfVar = (qvf) obj;
        return this.a == qvfVar.a && this.b == qvfVar.b && this.c.equals(qvfVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Integer.valueOf(this.b), Integer.valueOf(this.c.hashCode())});
    }

    public final String toString() {
        return String.format("(status=%s, keyId=%s, parameters='%s')", this.a, Integer.valueOf(this.b), this.c);
    }
}
