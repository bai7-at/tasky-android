package kotlinx.serialization.internal;

import defpackage.he0;
import defpackage.jj0;
import defpackage.nj0;
import defpackage.q26;
import defpackage.zq3;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class c extends q26 implements KSerializer {
    public static final c c = new c();

    private c() {
        super(he0.x(nj0.a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public int e(char[] cArr) {
        zq3.h(cArr, "<this>");
        return cArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public char[] r() {
        return new char[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.in0, defpackage.b1
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void h(kotlinx.serialization.encoding.c cVar, int i, jj0 jj0Var, boolean z) {
        zq3.h(cVar, "decoder");
        zq3.h(jj0Var, "builder");
        jj0Var.e(cVar.B(getDescriptor(), i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.b1
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public jj0 k(char[] cArr) {
        zq3.h(cArr, "<this>");
        return new jj0(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.q26
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public void u(kotlinx.serialization.encoding.d dVar, char[] cArr, int i) {
        zq3.h(dVar, "encoder");
        zq3.h(cArr, "content");
        for (int i2 = 0; i2 < i; i2++) {
            dVar.m(getDescriptor(), i2, cArr[i2]);
        }
    }
}
