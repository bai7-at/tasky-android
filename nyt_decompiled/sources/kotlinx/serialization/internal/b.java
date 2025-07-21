package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.mf0;
import defpackage.q26;
import defpackage.ze0;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class b extends q26 implements KSerializer {
    public static final b c = new b();

    private b() {
        super(he0.w(mf0.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(byte[] bArr) {
        zq3.h(bArr, "<this>");
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public byte[] r() {
        return new byte[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, ze0 ze0Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(ze0Var, "builder");
        ze0Var.e(cVar.C(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ze0 k(byte[] bArr) {
        zq3.h(bArr, "<this>");
        return new ze0(bArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, byte[] bArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.o(getDescriptor(), i2, bArr[i2]);
        }
    }
}
