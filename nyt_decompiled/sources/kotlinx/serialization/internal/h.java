package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.q26;
import defpackage.wq7;
import defpackage.xq7;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class h extends q26 implements KSerializer {
    public static final h c = new h();

    private h() {
        super(he0.C(xq7.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(short[] sArr) {
        zq3.h(sArr, "<this>");
        return sArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public short[] r() {
        return new short[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, wq7 wq7Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(wq7Var, "builder");
        wq7Var.e(cVar.F(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public wq7 k(short[] sArr) {
        zq3.h(sArr, "<this>");
        return new wq7(sArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, short[] sArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(sArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.D(getDescriptor(), i2, sArr[i2]);
        }
    }
}
