package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.hv8;
import defpackage.iv8;
import defpackage.jv8;
import defpackage.q26;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class i extends q26 implements KSerializer {
    public static final i c = new i();

    private i() {
        super(he0.E(hv8.b));
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ int e(Object obj) {
        return v(((iv8) obj).z());
    }

    @Override // defpackage.b1
    public /* bridge */ /* synthetic */ Object k(Object obj) {
        return y(((iv8) obj).z());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ Object r() {
        return iv8.a(w());
    }

    @Override // defpackage.q26
    public /* bridge */ /* synthetic */ void u(kotlinx.serialization.encoding.d dVar, Object obj, int i) {
        z(dVar, ((iv8) obj).z(), i);
    }

    protected int v(byte[] bArr) {
        zq3.h(bArr, "$this$collectionSize");
        return iv8.t(bArr);
    }

    protected byte[] w() {
        return iv8.c(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, jv8 jv8Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(jv8Var, "builder");
        jv8Var.e(hv8.b(cVar.r(getDescriptor(), i).H()));
    }

    protected jv8 y(byte[] bArr) {
        zq3.h(bArr, "$this$toBuilder");
        return new jv8(bArr, null);
    }

    protected void z(kotlinx.serialization.encoding.d dVar, byte[] bArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(bArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.e(getDescriptor(), i2).g(iv8.p(bArr, i2));
        }
    }
}
