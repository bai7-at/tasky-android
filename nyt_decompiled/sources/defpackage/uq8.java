package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.airbnb.lottie.model.layer.a;
import defpackage.p50;
import java.util.Collections;

/* loaded from: classes.dex */
public class uq8 {
    private final Matrix a = new Matrix();
    private final Matrix b;
    private final Matrix c;
    private final Matrix d;
    private final float[] e;
    private p50 f;
    private p50 g;
    private p50 h;
    private p50 i;
    private p50 j;
    private zk2 k;
    private zk2 l;
    private p50 m;
    private p50 n;
    private final boolean o;

    public uq8(qh qhVar) {
        this.f = qhVar.c() == null ? null : qhVar.c().a();
        this.g = qhVar.f() == null ? null : qhVar.f().a();
        this.h = qhVar.h() == null ? null : qhVar.h().a();
        this.i = qhVar.g() == null ? null : qhVar.g().a();
        this.k = qhVar.i() == null ? null : (zk2) qhVar.i().a();
        this.o = qhVar.l();
        if (this.k != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        this.l = qhVar.j() == null ? null : (zk2) qhVar.j().a();
        if (qhVar.e() != null) {
            this.j = qhVar.e().a();
        }
        if (qhVar.k() != null) {
            this.m = qhVar.k().a();
        } else {
            this.m = null;
        }
        if (qhVar.d() != null) {
            this.n = qhVar.d().a();
        } else {
            this.n = null;
        }
    }

    private void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public void a(a aVar) {
        aVar.i(this.j);
        aVar.i(this.m);
        aVar.i(this.n);
        aVar.i(this.f);
        aVar.i(this.g);
        aVar.i(this.h);
        aVar.i(this.i);
        aVar.i(this.k);
        aVar.i(this.l);
    }

    public void b(p50.b bVar) {
        p50 p50Var = this.j;
        if (p50Var != null) {
            p50Var.a(bVar);
        }
        p50 p50Var2 = this.m;
        if (p50Var2 != null) {
            p50Var2.a(bVar);
        }
        p50 p50Var3 = this.n;
        if (p50Var3 != null) {
            p50Var3.a(bVar);
        }
        p50 p50Var4 = this.f;
        if (p50Var4 != null) {
            p50Var4.a(bVar);
        }
        p50 p50Var5 = this.g;
        if (p50Var5 != null) {
            p50Var5.a(bVar);
        }
        p50 p50Var6 = this.h;
        if (p50Var6 != null) {
            p50Var6.a(bVar);
        }
        p50 p50Var7 = this.i;
        if (p50Var7 != null) {
            p50Var7.a(bVar);
        }
        zk2 zk2Var = this.k;
        if (zk2Var != null) {
            zk2Var.a(bVar);
        }
        zk2 zk2Var2 = this.l;
        if (zk2Var2 != null) {
            zk2Var2.a(bVar);
        }
    }

    public boolean c(Object obj, cd4 cd4Var) {
        if (obj == wc4.f) {
            p50 p50Var = this.f;
            if (p50Var == null) {
                this.f = new r39(cd4Var, new PointF());
                return true;
            }
            p50Var.o(cd4Var);
            return true;
        }
        if (obj == wc4.g) {
            p50 p50Var2 = this.g;
            if (p50Var2 == null) {
                this.g = new r39(cd4Var, new PointF());
                return true;
            }
            p50Var2.o(cd4Var);
            return true;
        }
        if (obj == wc4.h) {
            p50 p50Var3 = this.g;
            if (p50Var3 instanceof dz7) {
                ((dz7) p50Var3).s(cd4Var);
                return true;
            }
        }
        if (obj == wc4.i) {
            p50 p50Var4 = this.g;
            if (p50Var4 instanceof dz7) {
                ((dz7) p50Var4).t(cd4Var);
                return true;
            }
        }
        if (obj == wc4.o) {
            p50 p50Var5 = this.h;
            if (p50Var5 == null) {
                this.h = new r39(cd4Var, new qa7());
                return true;
            }
            p50Var5.o(cd4Var);
            return true;
        }
        if (obj == wc4.p) {
            p50 p50Var6 = this.i;
            if (p50Var6 == null) {
                this.i = new r39(cd4Var, Float.valueOf(0.0f));
                return true;
            }
            p50Var6.o(cd4Var);
            return true;
        }
        if (obj == wc4.c) {
            p50 p50Var7 = this.j;
            if (p50Var7 == null) {
                this.j = new r39(cd4Var, 100);
                return true;
            }
            p50Var7.o(cd4Var);
            return true;
        }
        if (obj == wc4.C) {
            p50 p50Var8 = this.m;
            if (p50Var8 == null) {
                this.m = new r39(cd4Var, Float.valueOf(100.0f));
                return true;
            }
            p50Var8.o(cd4Var);
            return true;
        }
        if (obj == wc4.D) {
            p50 p50Var9 = this.n;
            if (p50Var9 == null) {
                this.n = new r39(cd4Var, Float.valueOf(100.0f));
                return true;
            }
            p50Var9.o(cd4Var);
            return true;
        }
        if (obj == wc4.q) {
            if (this.k == null) {
                this.k = new zk2(Collections.singletonList(new rw3(Float.valueOf(0.0f))));
            }
            this.k.o(cd4Var);
            return true;
        }
        if (obj != wc4.r) {
            return false;
        }
        if (this.l == null) {
            this.l = new zk2(Collections.singletonList(new rw3(Float.valueOf(0.0f))));
        }
        this.l.o(cd4Var);
        return true;
    }

    public p50 e() {
        return this.n;
    }

    public Matrix f() {
        PointF pointF;
        qa7 qa7Var;
        PointF pointF2;
        this.a.reset();
        p50 p50Var = this.g;
        if (p50Var != null && (pointF2 = (PointF) p50Var.h()) != null) {
            float f = pointF2.x;
            if (f != 0.0f || pointF2.y != 0.0f) {
                this.a.preTranslate(f, pointF2.y);
            }
        }
        if (!this.o) {
            p50 p50Var2 = this.i;
            if (p50Var2 != null) {
                float floatValue = p50Var2 instanceof r39 ? ((Float) p50Var2.h()).floatValue() : ((zk2) p50Var2).q();
                if (floatValue != 0.0f) {
                    this.a.preRotate(floatValue);
                }
            }
        } else if (p50Var != null) {
            float f2 = p50Var.f();
            PointF pointF3 = (PointF) p50Var.h();
            float f3 = pointF3.x;
            float f4 = pointF3.y;
            p50Var.n(1.0E-4f + f2);
            PointF pointF4 = (PointF) p50Var.h();
            p50Var.n(f2);
            this.a.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
        }
        if (this.k != null) {
            float cos = this.l == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.q()) + 90.0f));
            float sin = this.l == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.q()) + 90.0f));
            float tan = (float) Math.tan(Math.toRadians(r0.q()));
            d();
            float[] fArr = this.e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f5 = -sin;
            fArr[3] = f5;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.b.setValues(fArr);
            d();
            float[] fArr2 = this.e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.c.setValues(fArr2);
            d();
            float[] fArr3 = this.e;
            fArr3[0] = cos;
            fArr3[1] = f5;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.d.setValues(fArr3);
            this.c.preConcat(this.b);
            this.d.preConcat(this.c);
            this.a.preConcat(this.d);
        }
        p50 p50Var3 = this.h;
        if (p50Var3 != null && (qa7Var = (qa7) p50Var3.h()) != null && (qa7Var.b() != 1.0f || qa7Var.c() != 1.0f)) {
            this.a.preScale(qa7Var.b(), qa7Var.c());
        }
        p50 p50Var4 = this.f;
        if (p50Var4 != null && (pointF = (PointF) p50Var4.h()) != null) {
            float f6 = pointF.x;
            if (f6 != 0.0f || pointF.y != 0.0f) {
                this.a.preTranslate(-f6, -pointF.y);
            }
        }
        return this.a;
    }

    public Matrix g(float f) {
        p50 p50Var = this.g;
        PointF pointF = p50Var == null ? null : (PointF) p50Var.h();
        p50 p50Var2 = this.h;
        qa7 qa7Var = p50Var2 == null ? null : (qa7) p50Var2.h();
        this.a.reset();
        if (pointF != null) {
            this.a.preTranslate(pointF.x * f, pointF.y * f);
        }
        if (qa7Var != null) {
            double d = f;
            this.a.preScale((float) Math.pow(qa7Var.b(), d), (float) Math.pow(qa7Var.c(), d));
        }
        p50 p50Var3 = this.i;
        if (p50Var3 != null) {
            float floatValue = ((Float) p50Var3.h()).floatValue();
            p50 p50Var4 = this.f;
            PointF pointF2 = p50Var4 != null ? (PointF) p50Var4.h() : null;
            this.a.preRotate(floatValue * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
        }
        return this.a;
    }

    public p50 h() {
        return this.j;
    }

    public p50 i() {
        return this.m;
    }

    public void j(float f) {
        p50 p50Var = this.j;
        if (p50Var != null) {
            p50Var.n(f);
        }
        p50 p50Var2 = this.m;
        if (p50Var2 != null) {
            p50Var2.n(f);
        }
        p50 p50Var3 = this.n;
        if (p50Var3 != null) {
            p50Var3.n(f);
        }
        p50 p50Var4 = this.f;
        if (p50Var4 != null) {
            p50Var4.n(f);
        }
        p50 p50Var5 = this.g;
        if (p50Var5 != null) {
            p50Var5.n(f);
        }
        p50 p50Var6 = this.h;
        if (p50Var6 != null) {
            p50Var6.n(f);
        }
        p50 p50Var7 = this.i;
        if (p50Var7 != null) {
            p50Var7.n(f);
        }
        zk2 zk2Var = this.k;
        if (zk2Var != null) {
            zk2Var.n(f);
        }
        zk2 zk2Var2 = this.l;
        if (zk2Var2 != null) {
            zk2Var2.n(f);
        }
    }
}
