package defpackage;

import android.annotation.SuppressLint;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public class ch9 {
    public static final ch9 b;
    private final k a;

    static class a {
        private static Field a;
        private static Field b;
        private static Field c;
        private static boolean d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                c = declaredField3;
                declaredField3.setAccessible(true);
                d = true;
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static ch9 a(View view) {
            if (d && view.isAttachedToWindow()) {
                try {
                    Object obj = a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) b.get(obj);
                        Rect rect2 = (Rect) c.get(obj);
                        if (rect != null && rect2 != null) {
                            ch9 a2 = new b().c(jl3.c(rect)).d(jl3.c(rect2)).a();
                            a2.t(a2);
                            a2.d(view.getRootView());
                            return a2;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    private static class d extends c {
        d() {
        }

        @Override // ch9.e
        void c(int i, jl3 jl3Var) {
            this.c.setInsets(m.a(i), jl3Var.e());
        }

        d(ch9 ch9Var) {
            super(ch9Var);
        }
    }

    private static class e {
        private final ch9 a;
        jl3[] b;

        e() {
            this(new ch9((ch9) null));
        }

        protected final void a() {
            jl3[] jl3VarArr = this.b;
            if (jl3VarArr != null) {
                jl3 jl3Var = jl3VarArr[l.d(1)];
                jl3 jl3Var2 = this.b[l.d(2)];
                if (jl3Var2 == null) {
                    jl3Var2 = this.a.f(2);
                }
                if (jl3Var == null) {
                    jl3Var = this.a.f(1);
                }
                g(jl3.a(jl3Var, jl3Var2));
                jl3 jl3Var3 = this.b[l.d(16)];
                if (jl3Var3 != null) {
                    f(jl3Var3);
                }
                jl3 jl3Var4 = this.b[l.d(32)];
                if (jl3Var4 != null) {
                    d(jl3Var4);
                }
                jl3 jl3Var5 = this.b[l.d(64)];
                if (jl3Var5 != null) {
                    h(jl3Var5);
                }
            }
        }

        abstract ch9 b();

        void c(int i, jl3 jl3Var) {
            if (this.b == null) {
                this.b = new jl3[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.b[l.d(i2)] = jl3Var;
                }
            }
        }

        abstract void d(jl3 jl3Var);

        abstract void e(jl3 jl3Var);

        abstract void f(jl3 jl3Var);

        abstract void g(jl3 jl3Var);

        abstract void h(jl3 jl3Var);

        e(ch9 ch9Var) {
            this.a = ch9Var;
        }
    }

    private static class h extends g {
        h(ch9 ch9Var, WindowInsets windowInsets) {
            super(ch9Var, windowInsets);
        }

        @Override // ch9.k
        ch9 a() {
            return ch9.v(this.c.consumeDisplayCutout());
        }

        @Override // ch9.f, ch9.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.c, hVar.c) && Objects.equals(this.g, hVar.g);
        }

        @Override // ch9.k
        hs1 f() {
            return hs1.f(this.c.getDisplayCutout());
        }

        @Override // ch9.k
        public int hashCode() {
            return this.c.hashCode();
        }

        h(ch9 ch9Var, h hVar) {
            super(ch9Var, hVar);
        }
    }

    private static class j extends i {
        static final ch9 q;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            q = ch9.v(windowInsets);
        }

        j(ch9 ch9Var, WindowInsets windowInsets) {
            super(ch9Var, windowInsets);
        }

        @Override // ch9.f, ch9.k
        final void d(View view) {
        }

        @Override // ch9.f, ch9.k
        public jl3 g(int i) {
            Insets insets;
            insets = this.c.getInsets(m.a(i));
            return jl3.d(insets);
        }

        @Override // ch9.f, ch9.k
        public jl3 h(int i) {
            Insets insetsIgnoringVisibility;
            insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(m.a(i));
            return jl3.d(insetsIgnoringVisibility);
        }

        @Override // ch9.f, ch9.k
        public boolean q(int i) {
            boolean isVisible;
            isVisible = this.c.isVisible(m.a(i));
            return isVisible;
        }

        j(ch9 ch9Var, j jVar) {
            super(ch9Var, jVar);
        }
    }

    private static class k {
        static final ch9 b = new b().a().a().b().c();
        final ch9 a;

        k(ch9 ch9Var) {
            this.a = ch9Var;
        }

        ch9 a() {
            return this.a;
        }

        ch9 b() {
            return this.a;
        }

        ch9 c() {
            return this.a;
        }

        void d(View view) {
        }

        void e(ch9 ch9Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return p() == kVar.p() && o() == kVar.o() && ic5.a(l(), kVar.l()) && ic5.a(j(), kVar.j()) && ic5.a(f(), kVar.f());
        }

        hs1 f() {
            return null;
        }

        jl3 g(int i) {
            return jl3.e;
        }

        jl3 h(int i) {
            if ((i & 8) == 0) {
                return jl3.e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return ic5.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        jl3 i() {
            return l();
        }

        jl3 j() {
            return jl3.e;
        }

        jl3 k() {
            return l();
        }

        jl3 l() {
            return jl3.e;
        }

        jl3 m() {
            return l();
        }

        ch9 n(int i, int i2, int i3, int i4) {
            return b;
        }

        boolean o() {
            return false;
        }

        boolean p() {
            return false;
        }

        boolean q(int i) {
            return true;
        }

        public void r(jl3[] jl3VarArr) {
        }

        void s(jl3 jl3Var) {
        }

        void t(ch9 ch9Var) {
        }
    }

    public static final class l {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        static int d(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    private static final class m {
        static int a(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            b = j.q;
        } else {
            b = k.b;
        }
    }

    private ch9(WindowInsets windowInsets) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new j(this, windowInsets);
        } else {
            this.a = new i(this, windowInsets);
        }
    }

    static jl3 n(jl3 jl3Var, int i2, int i3, int i4, int i5) {
        int max = Math.max(0, jl3Var.a - i2);
        int max2 = Math.max(0, jl3Var.b - i3);
        int max3 = Math.max(0, jl3Var.c - i4);
        int max4 = Math.max(0, jl3Var.d - i5);
        return (max == i2 && max2 == i3 && max3 == i4 && max4 == i5) ? jl3Var : jl3.b(max, max2, max3, max4);
    }

    public static ch9 v(WindowInsets windowInsets) {
        return w(windowInsets, null);
    }

    public static ch9 w(WindowInsets windowInsets, View view) {
        ch9 ch9Var = new ch9((WindowInsets) h16.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            ch9Var.t(k99.E(view));
            ch9Var.d(view.getRootView());
        }
        return ch9Var;
    }

    public ch9 a() {
        return this.a.a();
    }

    public ch9 b() {
        return this.a.b();
    }

    public ch9 c() {
        return this.a.c();
    }

    void d(View view) {
        this.a.d(view);
    }

    public hs1 e() {
        return this.a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ch9) {
            return ic5.a(this.a, ((ch9) obj).a);
        }
        return false;
    }

    public jl3 f(int i2) {
        return this.a.g(i2);
    }

    public jl3 g(int i2) {
        return this.a.h(i2);
    }

    public jl3 h() {
        return this.a.j();
    }

    public int hashCode() {
        k kVar = this.a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }

    public int i() {
        return this.a.l().d;
    }

    public int j() {
        return this.a.l().a;
    }

    public int k() {
        return this.a.l().c;
    }

    public int l() {
        return this.a.l().b;
    }

    public ch9 m(int i2, int i3, int i4, int i5) {
        return this.a.n(i2, i3, i4, i5);
    }

    public boolean o() {
        return this.a.o();
    }

    public boolean p(int i2) {
        return this.a.q(i2);
    }

    public ch9 q(int i2, int i3, int i4, int i5) {
        return new b(this).d(jl3.b(i2, i3, i4, i5)).a();
    }

    void r(jl3[] jl3VarArr) {
        this.a.r(jl3VarArr);
    }

    void s(jl3 jl3Var) {
        this.a.s(jl3Var);
    }

    void t(ch9 ch9Var) {
        this.a.t(ch9Var);
    }

    public WindowInsets u() {
        k kVar = this.a;
        if (kVar instanceof f) {
            return ((f) kVar).c;
        }
        return null;
    }

    private static class c extends e {
        final WindowInsets.Builder c;

        c() {
            this.c = new WindowInsets.Builder();
        }

        @Override // ch9.e
        ch9 b() {
            a();
            ch9 v = ch9.v(this.c.build());
            v.r(this.b);
            return v;
        }

        @Override // ch9.e
        void d(jl3 jl3Var) {
            this.c.setMandatorySystemGestureInsets(jl3Var.e());
        }

        @Override // ch9.e
        void e(jl3 jl3Var) {
            this.c.setStableInsets(jl3Var.e());
        }

        @Override // ch9.e
        void f(jl3 jl3Var) {
            this.c.setSystemGestureInsets(jl3Var.e());
        }

        @Override // ch9.e
        void g(jl3 jl3Var) {
            this.c.setSystemWindowInsets(jl3Var.e());
        }

        @Override // ch9.e
        void h(jl3 jl3Var) {
            this.c.setTappableElementInsets(jl3Var.e());
        }

        c(ch9 ch9Var) {
            super(ch9Var);
            WindowInsets.Builder builder;
            WindowInsets u = ch9Var.u();
            if (u != null) {
                builder = new WindowInsets.Builder(u);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.c = builder;
        }
    }

    private static class g extends f {
        private jl3 m;

        g(ch9 ch9Var, WindowInsets windowInsets) {
            super(ch9Var, windowInsets);
            this.m = null;
        }

        @Override // ch9.k
        ch9 b() {
            return ch9.v(this.c.consumeStableInsets());
        }

        @Override // ch9.k
        ch9 c() {
            return ch9.v(this.c.consumeSystemWindowInsets());
        }

        @Override // ch9.k
        final jl3 j() {
            if (this.m == null) {
                this.m = jl3.b(this.c.getStableInsetLeft(), this.c.getStableInsetTop(), this.c.getStableInsetRight(), this.c.getStableInsetBottom());
            }
            return this.m;
        }

        @Override // ch9.k
        boolean o() {
            return this.c.isConsumed();
        }

        g(ch9 ch9Var, g gVar) {
            super(ch9Var, gVar);
            this.m = null;
            this.m = gVar.m;
        }
    }

    private static class f extends k {
        private static boolean h;
        private static Method i;
        private static Class j;
        private static Field k;
        private static Field l;
        final WindowInsets c;
        private jl3[] d;
        private jl3 e;
        private ch9 f;
        jl3 g;

        f(ch9 ch9Var, WindowInsets windowInsets) {
            super(ch9Var);
            this.e = null;
            this.c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        private jl3 u(int i2, boolean z) {
            jl3 jl3Var = jl3.e;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    jl3Var = jl3.a(jl3Var, v(i3, z));
                }
            }
            return jl3Var;
        }

        private jl3 w() {
            ch9 ch9Var = this.f;
            return ch9Var != null ? ch9Var.h() : jl3.e;
        }

        private jl3 x(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!h) {
                z();
            }
            Method method = i;
            if (method != null && j != null && k != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) k.get(l.get(invoke));
                    if (rect != null) {
                        return jl3.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        private static void z() {
            try {
                i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                j = cls;
                k = cls.getDeclaredField("mVisibleInsets");
                l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                k.setAccessible(true);
                l.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            h = true;
        }

        @Override // ch9.k
        void d(View view) {
            jl3 x = x(view);
            if (x == null) {
                x = jl3.e;
            }
            s(x);
        }

        @Override // ch9.k
        void e(ch9 ch9Var) {
            ch9Var.t(this.f);
            ch9Var.s(this.g);
        }

        @Override // ch9.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.g, ((f) obj).g);
            }
            return false;
        }

        @Override // ch9.k
        public jl3 g(int i2) {
            return u(i2, false);
        }

        @Override // ch9.k
        public jl3 h(int i2) {
            return u(i2, true);
        }

        @Override // ch9.k
        final jl3 l() {
            if (this.e == null) {
                this.e = jl3.b(this.c.getSystemWindowInsetLeft(), this.c.getSystemWindowInsetTop(), this.c.getSystemWindowInsetRight(), this.c.getSystemWindowInsetBottom());
            }
            return this.e;
        }

        @Override // ch9.k
        ch9 n(int i2, int i3, int i4, int i5) {
            b bVar = new b(ch9.v(this.c));
            bVar.d(ch9.n(l(), i2, i3, i4, i5));
            bVar.c(ch9.n(j(), i2, i3, i4, i5));
            return bVar.a();
        }

        @Override // ch9.k
        boolean p() {
            return this.c.isRound();
        }

        @Override // ch9.k
        @SuppressLint({"WrongConstant"})
        boolean q(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0 && !y(i3)) {
                    return false;
                }
            }
            return true;
        }

        @Override // ch9.k
        public void r(jl3[] jl3VarArr) {
            this.d = jl3VarArr;
        }

        @Override // ch9.k
        void s(jl3 jl3Var) {
            this.g = jl3Var;
        }

        @Override // ch9.k
        void t(ch9 ch9Var) {
            this.f = ch9Var;
        }

        protected jl3 v(int i2, boolean z) {
            jl3 h2;
            int i3;
            if (i2 == 1) {
                return z ? jl3.b(0, Math.max(w().b, l().b), 0, 0) : jl3.b(0, l().b, 0, 0);
            }
            if (i2 == 2) {
                if (z) {
                    jl3 w = w();
                    jl3 j2 = j();
                    return jl3.b(Math.max(w.a, j2.a), 0, Math.max(w.c, j2.c), Math.max(w.d, j2.d));
                }
                jl3 l2 = l();
                ch9 ch9Var = this.f;
                h2 = ch9Var != null ? ch9Var.h() : null;
                int i4 = l2.d;
                if (h2 != null) {
                    i4 = Math.min(i4, h2.d);
                }
                return jl3.b(l2.a, 0, l2.c, i4);
            }
            if (i2 != 8) {
                if (i2 == 16) {
                    return k();
                }
                if (i2 == 32) {
                    return i();
                }
                if (i2 == 64) {
                    return m();
                }
                if (i2 != 128) {
                    return jl3.e;
                }
                ch9 ch9Var2 = this.f;
                hs1 e = ch9Var2 != null ? ch9Var2.e() : f();
                return e != null ? jl3.b(e.b(), e.d(), e.c(), e.a()) : jl3.e;
            }
            jl3[] jl3VarArr = this.d;
            h2 = jl3VarArr != null ? jl3VarArr[l.d(8)] : null;
            if (h2 != null) {
                return h2;
            }
            jl3 l3 = l();
            jl3 w2 = w();
            int i5 = l3.d;
            if (i5 > w2.d) {
                return jl3.b(0, 0, 0, i5);
            }
            jl3 jl3Var = this.g;
            return (jl3Var == null || jl3Var.equals(jl3.e) || (i3 = this.g.d) <= w2.d) ? jl3.e : jl3.b(0, 0, 0, i3);
        }

        protected boolean y(int i2) {
            if (i2 != 1 && i2 != 2) {
                if (i2 == 4) {
                    return false;
                }
                if (i2 != 8 && i2 != 128) {
                    return true;
                }
            }
            return !v(i2, false).equals(jl3.e);
        }

        f(ch9 ch9Var, f fVar) {
            this(ch9Var, new WindowInsets(fVar.c));
        }
    }

    public static final class b {
        private final e a;

        public b() {
            if (Build.VERSION.SDK_INT >= 30) {
                this.a = new d();
            } else {
                this.a = new c();
            }
        }

        public ch9 a() {
            return this.a.b();
        }

        public b b(int i, jl3 jl3Var) {
            this.a.c(i, jl3Var);
            return this;
        }

        public b c(jl3 jl3Var) {
            this.a.e(jl3Var);
            return this;
        }

        public b d(jl3 jl3Var) {
            this.a.g(jl3Var);
            return this;
        }

        public b(ch9 ch9Var) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.a = new d(ch9Var);
            } else {
                this.a = new c(ch9Var);
            }
        }
    }

    private static class i extends h {
        private jl3 n;
        private jl3 o;
        private jl3 p;

        i(ch9 ch9Var, WindowInsets windowInsets) {
            super(ch9Var, windowInsets);
            this.n = null;
            this.o = null;
            this.p = null;
        }

        @Override // ch9.k
        jl3 i() {
            if (this.o == null) {
                this.o = jl3.d(this.c.getMandatorySystemGestureInsets());
            }
            return this.o;
        }

        @Override // ch9.k
        jl3 k() {
            if (this.n == null) {
                this.n = jl3.d(this.c.getSystemGestureInsets());
            }
            return this.n;
        }

        @Override // ch9.k
        jl3 m() {
            if (this.p == null) {
                this.p = jl3.d(this.c.getTappableElementInsets());
            }
            return this.p;
        }

        @Override // ch9.f, ch9.k
        ch9 n(int i, int i2, int i3, int i4) {
            return ch9.v(this.c.inset(i, i2, i3, i4));
        }

        i(ch9 ch9Var, i iVar) {
            super(ch9Var, iVar);
            this.n = null;
            this.o = null;
            this.p = null;
        }
    }

    public ch9(ch9 ch9Var) {
        if (ch9Var != null) {
            k kVar = ch9Var.a;
            if (Build.VERSION.SDK_INT >= 30 && (kVar instanceof j)) {
                this.a = new j(this, (j) kVar);
            } else if (kVar instanceof i) {
                this.a = new i(this, (i) kVar);
            } else if (kVar instanceof h) {
                this.a = new h(this, (h) kVar);
            } else if (kVar instanceof g) {
                this.a = new g(this, (g) kVar);
            } else if (kVar instanceof f) {
                this.a = new f(this, (f) kVar);
            } else {
                this.a = new k(this);
            }
            kVar.e(this);
            return;
        }
        this.a = new k(this);
    }
}
