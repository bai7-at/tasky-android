package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class vw1 extends rs7 {
    private final ww1 o;

    public vw1(List list) {
        super("DvbDecoder");
        yo5 yo5Var = new yo5((byte[]) list.get(0));
        this.o = new ww1(yo5Var.N(), yo5Var.N());
    }

    @Override // defpackage.rs7
    protected ub8 z(byte[] bArr, int i, boolean z) {
        if (z) {
            this.o.r();
        }
        return new xw1(this.o.b(bArr, i));
    }
}
