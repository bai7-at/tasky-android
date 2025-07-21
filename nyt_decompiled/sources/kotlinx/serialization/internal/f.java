package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.nm3;
import defpackage.om3;
import defpackage.q26;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class f extends q26 implements KSerializer {
    public static final f c = new f();

    private f() {
        super(he0.A(om3.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(int[] iArr) {
        zq3.h(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int[] r() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, nm3 nm3Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(nm3Var, "builder");
        nm3Var.e(cVar.j(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public nm3 k(int[] iArr) {
        zq3.h(iArr, "<this>");
        return new nm3(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, int[] iArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(iArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.w(getDescriptor(), i2, iArr[i2]);
        }
    }
}
