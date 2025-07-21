package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.q26;
import defpackage.vk2;
import defpackage.wk2;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class e extends q26 implements KSerializer {
    public static final e c = new e();

    private e() {
        super(he0.z(wk2.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(float[] fArr) {
        zq3.h(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public float[] r() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, vk2 vk2Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(vk2Var, "builder");
        vk2Var.e(cVar.u(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public vk2 k(float[] fArr) {
        zq3.h(fArr, "<this>");
        return new vk2(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, float[] fArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(fArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.r(getDescriptor(), i2, fArr[i2]);
        }
    }
}
