package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.pv8;
import defpackage.q26;
import defpackage.qv8;
import defpackage.rv8;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class k extends q26 implements KSerializer {
    public static final k c = new k();

    private k() {
        super(he0.G(pv8.b));
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((qv8) obj).z());
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((qv8) obj).z());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ Object r() {
        return qv8.a(w());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ void u(kotlinx.serialization.encoding.d dVar, Object obj, int i) {
        z(dVar, ((qv8) obj).z(), i);
    }

    protected int v(long[] jArr) {
        zq3.h(jArr, "$this$collectionSize");
        return qv8.t(jArr);
    }

    protected long[] w() {
        return qv8.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, rv8 rv8Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(rv8Var, "builder");
        rv8Var.e(pv8.b(cVar.r(getDescriptor(), i).m()));
    }

    protected rv8 y(long[] jArr) {
        zq3.h(jArr, "$this$toBuilder");
        return new rv8(jArr, null);
    }

    protected void z(kotlinx.serialization.encoding.d dVar, long[] jArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.e(getDescriptor(), i2).k(qv8.p(jArr, i2));
        }
    }
}
