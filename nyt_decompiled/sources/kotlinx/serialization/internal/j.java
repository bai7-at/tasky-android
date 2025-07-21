package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.lv8;
import defpackage.mv8;
import defpackage.nv8;
import defpackage.q26;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class j extends q26 implements KSerializer {
    public static final j c = new j();

    private j() {
        super(he0.F(lv8.b));
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((mv8) obj).z());
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((mv8) obj).z());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ Object r() {
        return mv8.a(w());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ void u(kotlinx.serialization.encoding.d dVar, Object obj, int i) {
        z(dVar, ((mv8) obj).z(), i);
    }

    protected int v(int[] iArr) {
        zq3.h(iArr, "$this$collectionSize");
        return mv8.t(iArr);
    }

    protected int[] w() {
        return mv8.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, nv8 nv8Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(nv8Var, "builder");
        nv8Var.e(lv8.b(cVar.r(getDescriptor(), i).i()));
    }

    protected nv8 y(int[] iArr) {
        zq3.h(iArr, "$this$toBuilder");
        return new nv8(iArr, null);
    }

    protected void z(kotlinx.serialization.encoding.d dVar, int[] iArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.e(getDescriptor(), i2).C(mv8.p(iArr, i2));
        }
    }
}
