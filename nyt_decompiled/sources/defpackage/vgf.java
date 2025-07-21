package defpackage;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class vgf {
    private final p0a a;
    private final SparseArray b;

    public vgf(p0a p0aVar, SparseArray sparseArray) {
        this.a = p0aVar;
        SparseArray sparseArray2 = new SparseArray(p0aVar.b());
        for (int i = 0; i < p0aVar.b(); i++) {
            int a = p0aVar.a(i);
            tgf tgfVar = (tgf) sparseArray.get(a);
            tgfVar.getClass();
            sparseArray2.append(a, tgfVar);
        }
        this.b = sparseArray2;
    }

    public final int a(int i) {
        return this.a.a(i);
    }

    public final int b() {
        return this.a.b();
    }

    public final tgf c(int i) {
        tgf tgfVar = (tgf) this.b.get(i);
        tgfVar.getClass();
        return tgfVar;
    }

    public final boolean d(int i) {
        return this.a.c(i);
    }
}
