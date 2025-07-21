package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.q26;
import defpackage.wa4;
import defpackage.xa4;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class g extends q26 implements KSerializer {
    public static final g c = new g();

    private g() {
        super(he0.B(xa4.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(long[] jArr) {
        zq3.h(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public long[] r() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, wa4 wa4Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(wa4Var, "builder");
        wa4Var.e(cVar.f(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public wa4 k(long[] jArr) {
        zq3.h(jArr, "<this>");
        return new wa4(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, long[] jArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(jArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.F(getDescriptor(), i2, jArr[i2]);
        }
    }
}
