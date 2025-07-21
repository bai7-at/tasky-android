package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class z4g extends pbc {
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private final SparseArray y;
    private final SparseBooleanArray z;

    public z4g() {
        this.y = new SparseArray();
        this.z = new SparseBooleanArray();
        x();
    }

    private final void x() {
        this.r = true;
        this.s = true;
        this.t = true;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = true;
    }

    @Override // defpackage.pbc
    public final /* synthetic */ pbc f(int i, int i2, boolean z) {
        super.f(i, i2, true);
        return this;
    }

    public final z4g p(int i, boolean z) {
        if (this.z.get(i) != z) {
            if (z) {
                this.z.put(i, true);
            } else {
                this.z.delete(i);
            }
        }
        return this;
    }

    public z4g(Context context) {
        super.e(context);
        Point J = khe.J(context);
        f(J.x, J.y, true);
        this.y = new SparseArray();
        this.z = new SparseBooleanArray();
        x();
    }

    /* synthetic */ z4g(d5g d5gVar, x4g x4gVar) {
        super(d5gVar);
        SparseArray sparseArray;
        SparseBooleanArray sparseBooleanArray;
        this.r = d5gVar.k0;
        this.s = d5gVar.m0;
        this.t = d5gVar.o0;
        this.u = d5gVar.t0;
        this.v = d5gVar.u0;
        this.w = d5gVar.v0;
        this.x = d5gVar.x0;
        sparseArray = d5gVar.y0;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.y = sparseArray2;
        sparseBooleanArray = d5gVar.z0;
        this.z = sparseBooleanArray.clone();
    }
}
