package defpackage;

/* loaded from: classes3.dex */
public final class wpf {
    public static final wpf d = new qpf().d();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    /* synthetic */ wpf(qpf qpfVar, tpf tpfVar) {
        boolean z;
        boolean z2;
        boolean z3;
        z = qpfVar.a;
        this.a = z;
        z2 = qpfVar.b;
        this.b = z2;
        z3 = qpfVar.c;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && wpf.class == obj.getClass()) {
            wpf wpfVar = (wpf) obj;
            if (this.a == wpfVar.a && this.b == wpfVar.b && this.c == wpfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.a;
        boolean z2 = this.b;
        return ((z ? 1 : 0) << 2) + (z2 ? 1 : 0) + (z2 ? 1 : 0) + (this.c ? 1 : 0);
    }
}
