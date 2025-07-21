package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.mt1;
import defpackage.pt1;
import defpackage.q26;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class d extends q26 implements KSerializer {
    public static final d c = new d();

    private d() {
        super(he0.y(pt1.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(double[] dArr) {
        zq3.h(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public double[] r() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, mt1 mt1Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(mt1Var, "builder");
        mt1Var.e(cVar.G(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public mt1 k(double[] dArr) {
        zq3.h(dArr, "<this>");
        return new mt1(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, double[] dArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(dArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.E(getDescriptor(), i2, dArr[i2]);
        }
    }
}
