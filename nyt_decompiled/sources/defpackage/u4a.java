package defpackage;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class u4a implements sv9 {
    private final sv9 a;
    private final r4a b;
    private final SparseArray c = new SparseArray();

    public u4a(sv9 sv9Var, r4a r4aVar) {
        this.a = sv9Var;
        this.b = r4aVar;
    }

    @Override // defpackage.sv9
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.sv9
    public final void m(gx9 gx9Var) {
        this.a.m(gx9Var);
    }

    @Override // defpackage.sv9
    public final tx9 zzw(int i, int i2) {
        if (i2 != 3) {
            return this.a.zzw(i, i2);
        }
        w4a w4aVar = (w4a) this.c.get(i);
        if (w4aVar != null) {
            return w4aVar;
        }
        w4a w4aVar2 = new w4a(this.a.zzw(i, 3), this.b);
        this.c.put(i, w4aVar2);
        return w4aVar2;
    }
}
