package defpackage;

import android.util.SparseArray;

/* loaded from: classes3.dex */
final class g9a implements r8a {
    private final g8e a = new g8e(new byte[4], 4);
    final /* synthetic */ i9a b;

    public g9a(i9a i9aVar) {
        this.b = i9aVar;
    }

    @Override // defpackage.r8a
    public final void a(pfe pfeVar, sv9 sv9Var, m9a m9aVar) {
    }

    @Override // defpackage.r8a
    public final void b(b9e b9eVar) {
        SparseArray sparseArray;
        SparseArray sparseArray2;
        SparseArray sparseArray3;
        int i;
        if (b9eVar.B() == 0 && (b9eVar.B() & 128) != 0) {
            b9eVar.l(6);
            int q = b9eVar.q() / 4;
            for (int i2 = 0; i2 < q; i2++) {
                b9eVar.f(this.a, 4);
                g8e g8eVar = this.a;
                int d = g8eVar.d(16);
                g8eVar.m(3);
                if (d == 0) {
                    this.a.m(13);
                } else {
                    int d2 = this.a.d(13);
                    sparseArray2 = this.b.f;
                    if (sparseArray2.get(d2) == null) {
                        i9a i9aVar = this.b;
                        sparseArray3 = i9aVar.f;
                        sparseArray3.put(d2, new s8a(new h9a(i9aVar, d2)));
                        i9a i9aVar2 = this.b;
                        i = i9aVar2.l;
                        i9aVar2.l = i + 1;
                    }
                }
            }
            sparseArray = this.b.f;
            sparseArray.remove(0);
        }
    }
}
