package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.q26;
import defpackage.ta0;
import defpackage.ua0;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class a extends q26 implements KSerializer {
    public static final a c = new a();

    private a() {
        super(he0.v(ua0.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(boolean[] zArr) {
        zq3.h(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public boolean[] r() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, ta0 ta0Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(ta0Var, "builder");
        ta0Var.e(cVar.D(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public ta0 k(boolean[] zArr) {
        zq3.h(zArr, "<this>");
        return new ta0(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, boolean[] zArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(zArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.x(getDescriptor(), i2, zArr[i2]);
        }
    }
}
