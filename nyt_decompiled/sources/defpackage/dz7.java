package defpackage;

import android.graphics.PointF;
import defpackage.p50;
import java.util.Collections;

/* loaded from: classes.dex */
public class dz7 extends p50 {
    private final PointF i;
    private final PointF j;
    private final p50 k;
    private final p50 l;
    protected cd4 m;
    protected cd4 n;

    public dz7(p50 p50Var, p50 p50Var2) {
        super(Collections.emptyList());
        this.i = new PointF();
        this.j = new PointF();
        this.k = p50Var;
        this.l = p50Var2;
        n(f());
    }

    @Override // defpackage.p50
    public void n(float f) {
        this.k.n(f);
        this.l.n(f);
        this.i.set(((Float) this.k.h()).floatValue(), ((Float) this.l.h()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((p50.b) this.a.get(i)).a();
        }
    }

    @Override // defpackage.p50
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public PointF h() {
        return i(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.p50
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public PointF i(rw3 rw3Var, float f) {
        Float f2;
        rw3 b;
        rw3 b2;
        Float f3 = null;
        if (this.m == null || (b2 = this.k.b()) == null) {
            f2 = null;
        } else {
            float d = this.k.d();
            Float f4 = b2.h;
            cd4 cd4Var = this.m;
            float f5 = b2.g;
            f2 = (Float) cd4Var.b(f5, f4 == null ? f5 : f4.floatValue(), (Float) b2.b, (Float) b2.c, f, f, d);
        }
        if (this.n != null && (b = this.l.b()) != null) {
            float d2 = this.l.d();
            Float f6 = b.h;
            cd4 cd4Var2 = this.n;
            float f7 = b.g;
            f3 = (Float) cd4Var2.b(f7, f6 == null ? f7 : f6.floatValue(), (Float) b.b, (Float) b.c, f, f, d2);
        }
        if (f2 == null) {
            this.j.set(this.i.x, 0.0f);
        } else {
            this.j.set(f2.floatValue(), 0.0f);
        }
        if (f3 == null) {
            PointF pointF = this.j;
            pointF.set(pointF.x, this.i.y);
        } else {
            PointF pointF2 = this.j;
            pointF2.set(pointF2.x, f3.floatValue());
        }
        return this.j;
    }

    public void s(cd4 cd4Var) {
        cd4 cd4Var2 = this.m;
        if (cd4Var2 != null) {
            cd4Var2.c(null);
        }
        this.m = cd4Var;
        if (cd4Var != null) {
            cd4Var.c(this);
        }
    }

    public void t(cd4 cd4Var) {
        cd4 cd4Var2 = this.n;
        if (cd4Var2 != null) {
            cd4Var2.c(null);
        }
        this.n = cd4Var;
        if (cd4Var != null) {
            cd4Var.c(this);
        }
    }
}
