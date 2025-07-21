package kotlinx.serialization.internal;

import defpackage.aw8;
import defpackage.bw8;
import defpackage.cw8;
import defpackage.he0;
import defpackage.q26;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class l extends q26 implements KSerializer {
    public static final l c = new l();

    private l() {
        super(he0.H(aw8.b));
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((bw8) obj).z());
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((bw8) obj).z());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ Object r() {
        return bw8.a(w());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ void u(kotlinx.serialization.encoding.d dVar, Object obj, int i) {
        z(dVar, ((bw8) obj).z(), i);
    }

    protected int v(short[] sArr) {
        zq3.h(sArr, "$this$collectionSize");
        return bw8.t(sArr);
    }

    protected short[] w() {
        return bw8.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, cw8 cw8Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(cw8Var, "builder");
        cw8Var.e(aw8.b(cVar.r(getDescriptor(), i).s()));
    }

    protected cw8 y(short[] sArr) {
        zq3.h(sArr, "$this$toBuilder");
        return new cw8(sArr, null);
    }

    protected void z(kotlinx.serialization.encoding.d dVar, short[] sArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.e(getDescriptor(), i2).p(bw8.p(sArr, i2));
        }
    }
}
