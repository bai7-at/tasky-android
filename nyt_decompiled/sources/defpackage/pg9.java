package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import defpackage.ch9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class pg9 {
    private e a;

    public static abstract class b {
        WindowInsets a;
        private final int b;

        public b(int i) {
            this.b = i;
        }

        public final int b() {
            return this.b;
        }

        public void c(pg9 pg9Var) {
        }

        public void d(pg9 pg9Var) {
        }

        public abstract ch9 e(ch9 ch9Var, List list);

        public a f(pg9 pg9Var, a aVar) {
            return aVar;
        }
    }

    private static class c extends e {
        private static final Interpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
        private static final Interpolator f = new ka2();
        private static final Interpolator g = new DecelerateInterpolator();

        private static class a implements View.OnApplyWindowInsetsListener {
            final b a;
            private ch9 b;

            /* renamed from: pg9$c$a$a, reason: collision with other inner class name */
            class C0513a implements ValueAnimator.AnimatorUpdateListener {
                final /* synthetic */ pg9 a;
                final /* synthetic */ ch9 b;
                final /* synthetic */ ch9 c;
                final /* synthetic */ int d;
                final /* synthetic */ View e;

                C0513a(pg9 pg9Var, ch9 ch9Var, ch9 ch9Var2, int i, View view) {
                    this.a = pg9Var;
                    this.b = ch9Var;
                    this.c = ch9Var2;
                    this.d = i;
                    this.e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.e(valueAnimator.getAnimatedFraction());
                    c.k(this.e, c.o(this.b, this.c, this.a.b(), this.d), Collections.singletonList(this.a));
                }
            }

            class b extends AnimatorListenerAdapter {
                final /* synthetic */ pg9 a;
                final /* synthetic */ View b;

                b(pg9 pg9Var, View view) {
                    this.a = pg9Var;
                    this.b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    this.a.e(1.0f);
                    c.i(this.b, this.a);
                }
            }

            /* renamed from: pg9$c$a$c, reason: collision with other inner class name */
            class RunnableC0514c implements Runnable {
                final /* synthetic */ View a;
                final /* synthetic */ pg9 b;
                final /* synthetic */ a c;
                final /* synthetic */ ValueAnimator d;

                RunnableC0514c(View view, pg9 pg9Var, a aVar, ValueAnimator valueAnimator) {
                    this.a = view;
                    this.b = pg9Var;
                    this.c = aVar;
                    this.d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public void run() {
                    c.l(this.a, this.b, this.c);
                    this.d.start();
                }
            }

            a(View view, b bVar) {
                this.a = bVar;
                ch9 E = k99.E(view);
                this.b = E != null ? new ch9.b(E).a() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                int e;
                if (!view.isLaidOut()) {
                    this.b = ch9.w(windowInsets, view);
                    return c.m(view, windowInsets);
                }
                ch9 w = ch9.w(windowInsets, view);
                if (this.b == null) {
                    this.b = k99.E(view);
                }
                if (this.b == null) {
                    this.b = w;
                    return c.m(view, windowInsets);
                }
                b n = c.n(view);
                if ((n == null || !Objects.equals(n.a, windowInsets)) && (e = c.e(w, this.b)) != 0) {
                    ch9 ch9Var = this.b;
                    pg9 pg9Var = new pg9(e, c.g(e, w, ch9Var), 160L);
                    pg9Var.e(0.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(pg9Var.a());
                    a f = c.f(w, ch9Var, e);
                    c.j(view, pg9Var, windowInsets, false);
                    duration.addUpdateListener(new C0513a(pg9Var, w, ch9Var, e, view));
                    duration.addListener(new b(pg9Var, view));
                    ih5.a(view, new RunnableC0514c(view, pg9Var, f, duration));
                    this.b = w;
                    return c.m(view, windowInsets);
                }
                return c.m(view, windowInsets);
            }
        }

        c(int i, Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        static int e(ch9 ch9Var, ch9 ch9Var2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!ch9Var.f(i2).equals(ch9Var2.f(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        static a f(ch9 ch9Var, ch9 ch9Var2, int i) {
            jl3 f2 = ch9Var.f(i);
            jl3 f3 = ch9Var2.f(i);
            return new a(jl3.b(Math.min(f2.a, f3.a), Math.min(f2.b, f3.b), Math.min(f2.c, f3.c), Math.min(f2.d, f3.d)), jl3.b(Math.max(f2.a, f3.a), Math.max(f2.b, f3.b), Math.max(f2.c, f3.c), Math.max(f2.d, f3.d)));
        }

        static Interpolator g(int i, ch9 ch9Var, ch9 ch9Var2) {
            return (i & 8) != 0 ? ch9Var.f(ch9.l.c()).d > ch9Var2.f(ch9.l.c()).d ? e : f : g;
        }

        private static View.OnApplyWindowInsetsListener h(View view, b bVar) {
            return new a(view, bVar);
        }

        static void i(View view, pg9 pg9Var) {
            b n = n(view);
            if (n != null) {
                n.c(pg9Var);
                if (n.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    i(viewGroup.getChildAt(i), pg9Var);
                }
            }
        }

        static void j(View view, pg9 pg9Var, WindowInsets windowInsets, boolean z) {
            b n = n(view);
            if (n != null) {
                n.a = windowInsets;
                if (!z) {
                    n.d(pg9Var);
                    z = n.b() == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    j(viewGroup.getChildAt(i), pg9Var, windowInsets, z);
                }
            }
        }

        static void k(View view, ch9 ch9Var, List list) {
            b n = n(view);
            if (n != null) {
                ch9Var = n.e(ch9Var, list);
                if (n.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    k(viewGroup.getChildAt(i), ch9Var, list);
                }
            }
        }

        static void l(View view, pg9 pg9Var, a aVar) {
            b n = n(view);
            if (n != null) {
                n.f(pg9Var, aVar);
                if (n.b() == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    l(viewGroup.getChildAt(i), pg9Var, aVar);
                }
            }
        }

        static WindowInsets m(View view, WindowInsets windowInsets) {
            return view.getTag(eh6.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static b n(View view) {
            Object tag = view.getTag(eh6.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).a;
            }
            return null;
        }

        static ch9 o(ch9 ch9Var, ch9 ch9Var2, float f2, int i) {
            ch9.b bVar = new ch9.b(ch9Var);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    bVar.b(i2, ch9Var.f(i2));
                } else {
                    jl3 f3 = ch9Var.f(i2);
                    jl3 f4 = ch9Var2.f(i2);
                    float f5 = 1.0f - f2;
                    bVar.b(i2, ch9.n(f3, (int) (((f3.a - f4.a) * f5) + 0.5d), (int) (((f3.b - f4.b) * f5) + 0.5d), (int) (((f3.c - f4.c) * f5) + 0.5d), (int) (((f3.d - f4.d) * f5) + 0.5d)));
                }
            }
            return bVar.a();
        }

        static void p(View view, b bVar) {
            Object tag = view.getTag(eh6.tag_on_apply_window_listener);
            if (bVar == null) {
                view.setTag(eh6.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            View.OnApplyWindowInsetsListener h = h(view, bVar);
            view.setTag(eh6.tag_window_insets_animation_callback, h);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(h);
            }
        }
    }

    private static class e {
        private final int a;
        private float b;
        private final Interpolator c;
        private final long d;

        e(int i, Interpolator interpolator, long j) {
            this.a = i;
            this.c = interpolator;
            this.d = j;
        }

        public long a() {
            return this.d;
        }

        public float b() {
            Interpolator interpolator = this.c;
            return interpolator != null ? interpolator.getInterpolation(this.b) : this.b;
        }

        public int c() {
            return this.a;
        }

        public void d(float f) {
            this.b = f;
        }
    }

    public pg9(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(i, interpolator, j);
        } else {
            this.a = new c(i, interpolator, j);
        }
    }

    static void d(View view, b bVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.h(view, bVar);
        } else {
            c.p(view, bVar);
        }
    }

    static pg9 f(WindowInsetsAnimation windowInsetsAnimation) {
        return new pg9(windowInsetsAnimation);
    }

    public long a() {
        return this.a.a();
    }

    public float b() {
        return this.a.b();
    }

    public int c() {
        return this.a.c();
    }

    public void e(float f) {
        this.a.d(f);
    }

    private static class d extends e {
        private final WindowInsetsAnimation e;

        private static class a extends WindowInsetsAnimation$Callback {
            private final b a;
            private List b;
            private ArrayList c;
            private final HashMap d;

            a(b bVar) {
                super(bVar.b());
                this.d = new HashMap();
                this.a = bVar;
            }

            private pg9 a(WindowInsetsAnimation windowInsetsAnimation) {
                pg9 pg9Var = (pg9) this.d.get(windowInsetsAnimation);
                if (pg9Var != null) {
                    return pg9Var;
                }
                pg9 f = pg9.f(windowInsetsAnimation);
                this.d.put(windowInsetsAnimation, f);
                return f;
            }

            public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.c(a(windowInsetsAnimation));
                this.d.remove(windowInsetsAnimation);
            }

            public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                this.a.d(a(windowInsetsAnimation));
            }

            public WindowInsets onProgress(WindowInsets windowInsets, List list) {
                float fraction;
                ArrayList arrayList = this.c;
                if (arrayList == null) {
                    ArrayList arrayList2 = new ArrayList(list.size());
                    this.c = arrayList2;
                    this.b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    WindowInsetsAnimation a = ah9.a(list.get(size));
                    pg9 a2 = a(a);
                    fraction = a.getFraction();
                    a2.e(fraction);
                    this.c.add(a2);
                }
                return this.a.e(ch9.v(windowInsets), this.b).u();
            }

            public WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                return this.a.f(a(windowInsetsAnimation), a.d(bounds)).c();
            }
        }

        d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.e = windowInsetsAnimation;
        }

        public static WindowInsetsAnimation.Bounds e(a aVar) {
            xg9.a();
            return wg9.a(aVar.a().e(), aVar.b().e());
        }

        public static jl3 f(WindowInsetsAnimation.Bounds bounds) {
            Insets upperBound;
            upperBound = bounds.getUpperBound();
            return jl3.d(upperBound);
        }

        public static jl3 g(WindowInsetsAnimation.Bounds bounds) {
            Insets lowerBound;
            lowerBound = bounds.getLowerBound();
            return jl3.d(lowerBound);
        }

        public static void h(View view, b bVar) {
            view.setWindowInsetsAnimationCallback(bVar != null ? new a(bVar) : null);
        }

        @Override // pg9.e
        public long a() {
            long durationMillis;
            durationMillis = this.e.getDurationMillis();
            return durationMillis;
        }

        @Override // pg9.e
        public float b() {
            float interpolatedFraction;
            interpolatedFraction = this.e.getInterpolatedFraction();
            return interpolatedFraction;
        }

        @Override // pg9.e
        public int c() {
            int typeMask;
            typeMask = this.e.getTypeMask();
            return typeMask;
        }

        @Override // pg9.e
        public void d(float f) {
            this.e.setFraction(f);
        }

        d(int i, Interpolator interpolator, long j) {
            this(vg9.a(i, interpolator, j));
        }
    }

    public static final class a {
        private final jl3 a;
        private final jl3 b;

        public a(jl3 jl3Var, jl3 jl3Var2) {
            this.a = jl3Var;
            this.b = jl3Var2;
        }

        public static a d(WindowInsetsAnimation.Bounds bounds) {
            return new a(bounds);
        }

        public jl3 a() {
            return this.a;
        }

        public jl3 b() {
            return this.b;
        }

        public WindowInsetsAnimation.Bounds c() {
            return d.e(this);
        }

        public String toString() {
            return "Bounds{lower=" + this.a + " upper=" + this.b + "}";
        }

        private a(WindowInsetsAnimation.Bounds bounds) {
            this.a = d.g(bounds);
            this.b = d.f(bounds);
        }
    }

    private pg9(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new d(windowInsetsAnimation);
        }
    }
}
