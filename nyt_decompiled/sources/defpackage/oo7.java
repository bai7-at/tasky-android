package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* loaded from: classes3.dex */
public class oo7 {
    public static final h01 m = new hv6(0.5f);
    k01 a;
    k01 b;
    k01 c;
    k01 d;
    h01 e;
    h01 f;
    h01 g;
    h01 h;
    dy1 i;
    dy1 j;
    dy1 k;
    dy1 l;

    public interface c {
        h01 a(h01 h01Var);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    private static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new x0(i3));
    }

    private static b d(Context context, int i, int i2, h01 h01Var) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(nn6.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(nn6.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(nn6.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(nn6.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(nn6.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(nn6.ShapeAppearance_cornerFamilyBottomLeft, i3);
            h01 m2 = m(obtainStyledAttributes, nn6.ShapeAppearance_cornerSize, h01Var);
            h01 m3 = m(obtainStyledAttributes, nn6.ShapeAppearance_cornerSizeTopLeft, m2);
            h01 m4 = m(obtainStyledAttributes, nn6.ShapeAppearance_cornerSizeTopRight, m2);
            h01 m5 = m(obtainStyledAttributes, nn6.ShapeAppearance_cornerSizeBottomRight, m2);
            return new b().z(i4, m3).D(i5, m4).u(i6, m5).q(i7, m(obtainStyledAttributes, nn6.ShapeAppearance_cornerSizeBottomLeft, m2));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new x0(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, h01 h01Var) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nn6.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(nn6.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(nn6.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, h01Var);
    }

    private static h01 m(TypedArray typedArray, int i, h01 h01Var) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return h01Var;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new x0(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new hv6(peekValue.getFraction(1.0f, 1.0f)) : h01Var;
    }

    public dy1 h() {
        return this.k;
    }

    public k01 i() {
        return this.d;
    }

    public h01 j() {
        return this.h;
    }

    public k01 k() {
        return this.c;
    }

    public h01 l() {
        return this.g;
    }

    public dy1 n() {
        return this.l;
    }

    public dy1 o() {
        return this.j;
    }

    public dy1 p() {
        return this.i;
    }

    public k01 q() {
        return this.a;
    }

    public h01 r() {
        return this.e;
    }

    public k01 s() {
        return this.b;
    }

    public h01 t() {
        return this.f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(dy1.class) && this.j.getClass().equals(dy1.class) && this.i.getClass().equals(dy1.class) && this.k.getClass().equals(dy1.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.b instanceof f37) && (this.a instanceof f37) && (this.c instanceof f37) && (this.d instanceof f37));
    }

    public b v() {
        return new b(this);
    }

    public oo7 w(float f) {
        return v().o(f).m();
    }

    public oo7 x(h01 h01Var) {
        return v().p(h01Var).m();
    }

    public oo7 y(c cVar) {
        return v().C(cVar.a(r())).G(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private oo7(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static final class b {
        private k01 a;
        private k01 b;
        private k01 c;
        private k01 d;
        private h01 e;
        private h01 f;
        private h01 g;
        private h01 h;
        private dy1 i;
        private dy1 j;
        private dy1 k;
        private dy1 l;

        public b() {
            this.a = vf4.b();
            this.b = vf4.b();
            this.c = vf4.b();
            this.d = vf4.b();
            this.e = new x0(0.0f);
            this.f = new x0(0.0f);
            this.g = new x0(0.0f);
            this.h = new x0(0.0f);
            this.i = vf4.c();
            this.j = vf4.c();
            this.k = vf4.c();
            this.l = vf4.c();
        }

        private static float n(k01 k01Var) {
            if (k01Var instanceof f37) {
                return ((f37) k01Var).a;
            }
            if (k01Var instanceof n51) {
                return ((n51) k01Var).a;
            }
            return -1.0f;
        }

        public b A(k01 k01Var) {
            this.a = k01Var;
            float n = n(k01Var);
            if (n != -1.0f) {
                B(n);
            }
            return this;
        }

        public b B(float f) {
            this.e = new x0(f);
            return this;
        }

        public b C(h01 h01Var) {
            this.e = h01Var;
            return this;
        }

        public b D(int i, h01 h01Var) {
            return E(vf4.a(i)).G(h01Var);
        }

        public b E(k01 k01Var) {
            this.b = k01Var;
            float n = n(k01Var);
            if (n != -1.0f) {
                F(n);
            }
            return this;
        }

        public b F(float f) {
            this.f = new x0(f);
            return this;
        }

        public b G(h01 h01Var) {
            this.f = h01Var;
            return this;
        }

        public oo7 m() {
            return new oo7(this);
        }

        public b o(float f) {
            return B(f).F(f).w(f).s(f);
        }

        public b p(h01 h01Var) {
            return C(h01Var).G(h01Var).x(h01Var).t(h01Var);
        }

        public b q(int i, h01 h01Var) {
            return r(vf4.a(i)).t(h01Var);
        }

        public b r(k01 k01Var) {
            this.d = k01Var;
            float n = n(k01Var);
            if (n != -1.0f) {
                s(n);
            }
            return this;
        }

        public b s(float f) {
            this.h = new x0(f);
            return this;
        }

        public b t(h01 h01Var) {
            this.h = h01Var;
            return this;
        }

        public b u(int i, h01 h01Var) {
            return v(vf4.a(i)).x(h01Var);
        }

        public b v(k01 k01Var) {
            this.c = k01Var;
            float n = n(k01Var);
            if (n != -1.0f) {
                w(n);
            }
            return this;
        }

        public b w(float f) {
            this.g = new x0(f);
            return this;
        }

        public b x(h01 h01Var) {
            this.g = h01Var;
            return this;
        }

        public b y(dy1 dy1Var) {
            this.i = dy1Var;
            return this;
        }

        public b z(int i, h01 h01Var) {
            return A(vf4.a(i)).C(h01Var);
        }

        public b(oo7 oo7Var) {
            this.a = vf4.b();
            this.b = vf4.b();
            this.c = vf4.b();
            this.d = vf4.b();
            this.e = new x0(0.0f);
            this.f = new x0(0.0f);
            this.g = new x0(0.0f);
            this.h = new x0(0.0f);
            this.i = vf4.c();
            this.j = vf4.c();
            this.k = vf4.c();
            this.l = vf4.c();
            this.a = oo7Var.a;
            this.b = oo7Var.b;
            this.c = oo7Var.c;
            this.d = oo7Var.d;
            this.e = oo7Var.e;
            this.f = oo7Var.f;
            this.g = oo7Var.g;
            this.h = oo7Var.h;
            this.i = oo7Var.i;
            this.j = oo7Var.j;
            this.k = oo7Var.k;
            this.l = oo7Var.l;
        }
    }

    public oo7() {
        this.a = vf4.b();
        this.b = vf4.b();
        this.c = vf4.b();
        this.d = vf4.b();
        this.e = new x0(0.0f);
        this.f = new x0(0.0f);
        this.g = new x0(0.0f);
        this.h = new x0(0.0f);
        this.i = vf4.c();
        this.j = vf4.c();
        this.k = vf4.c();
        this.l = vf4.c();
    }
}
