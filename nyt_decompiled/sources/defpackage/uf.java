package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import defpackage.v48;
import defpackage.x48;

/* loaded from: classes.dex */
public abstract class uf {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Paint.Style.values().length];
            try {
                iArr[Paint.Style.STROKE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
            int[] iArr2 = new int[Paint.Cap.values().length];
            try {
                iArr2[Paint.Cap.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[Paint.Cap.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Paint.Cap.SQUARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            b = iArr2;
            int[] iArr3 = new int[Paint.Join.values().length];
            try {
                iArr3[Paint.Join.MITER.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[Paint.Join.BEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[Paint.Join.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            c = iArr3;
        }
    }

    public static final ao5 a() {
        return new tf();
    }

    public static final ao5 b(Paint paint) {
        return new tf(paint);
    }

    public static final float c(Paint paint) {
        return paint.getAlpha() / 255.0f;
    }

    public static final long d(Paint paint) {
        return wn0.b(paint.getColor());
    }

    public static final int e(Paint paint) {
        return !paint.isFilterBitmap() ? jh2.a.b() : jh2.a.a();
    }

    public static final int f(Paint paint) {
        Paint.Cap strokeCap = paint.getStrokeCap();
        int i = strokeCap == null ? -1 : a.b[strokeCap.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? v48.a.a() : v48.a.c() : v48.a.b() : v48.a.a();
    }

    public static final int g(Paint paint) {
        Paint.Join strokeJoin = paint.getStrokeJoin();
        int i = strokeJoin == null ? -1 : a.c[strokeJoin.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? x48.a.b() : x48.a.c() : x48.a.a() : x48.a.b();
    }

    public static final float h(Paint paint) {
        return paint.getStrokeMiter();
    }

    public static final float i(Paint paint) {
        return paint.getStrokeWidth();
    }

    public static final Paint j() {
        return new Paint(7);
    }

    public static final void k(Paint paint, float f) {
        paint.setAlpha((int) Math.rint(f * 255.0f));
    }

    public static final void l(Paint paint, int i) {
        ml9.a.a(paint, i);
    }

    public static final void m(Paint paint, long j) {
        paint.setColor(wn0.k(j));
    }

    public static final void n(Paint paint, qn0 qn0Var) {
        paint.setColorFilter(qn0Var != null ? ae.b(qn0Var) : null);
    }

    public static final void o(Paint paint, int i) {
        paint.setFilterBitmap(!jh2.d(i, jh2.a.b()));
    }

    public static final void p(Paint paint, mp5 mp5Var) {
        lh4.a(mp5Var);
        paint.setPathEffect(null);
    }

    public static final void q(Paint paint, Shader shader) {
        paint.setShader(shader);
    }

    public static final void r(Paint paint, int i) {
        v48.a aVar = v48.a;
        paint.setStrokeCap(v48.e(i, aVar.c()) ? Paint.Cap.SQUARE : v48.e(i, aVar.b()) ? Paint.Cap.ROUND : v48.e(i, aVar.a()) ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public static final void s(Paint paint, int i) {
        x48.a aVar = x48.a;
        paint.setStrokeJoin(x48.e(i, aVar.b()) ? Paint.Join.MITER : x48.e(i, aVar.a()) ? Paint.Join.BEVEL : x48.e(i, aVar.c()) ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public static final void t(Paint paint, float f) {
        paint.setStrokeMiter(f);
    }

    public static final void u(Paint paint, float f) {
        paint.setStrokeWidth(f);
    }

    public static final void v(Paint paint, int i) {
        paint.setStyle(eo5.d(i, eo5.a.b()) ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
