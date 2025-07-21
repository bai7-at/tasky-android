package androidx.compose.foundation.layout;

import android.view.View;
import android.view.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import defpackage.ch9;
import defpackage.hs1;
import defpackage.jl3;
import defpackage.k99;
import defpackage.kg6;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.u39;
import defpackage.uh9;
import defpackage.zg;
import defpackage.zq3;
import java.util.WeakHashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class WindowInsetsHolder {
    private static boolean A;
    public static final Companion x = new Companion(null);
    public static final int y = 8;
    private static final WeakHashMap z = new WeakHashMap();
    private final zg a;
    private final zg b;
    private final zg c;
    private final zg d;
    private final zg e;
    private final zg f;
    private final zg g;
    private final zg h;
    private final zg i;
    private final u39 j;
    private final o k;
    private final o l;
    private final o m;
    private final u39 n;
    private final u39 o;
    private final u39 p;
    private final u39 q;
    private final u39 r;
    private final u39 s;
    private final u39 t;
    private final boolean u;
    private int v;
    private final h w;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final WindowInsetsHolder d(View view) {
            WindowInsetsHolder windowInsetsHolder;
            synchronized (WindowInsetsHolder.z) {
                try {
                    WeakHashMap weakHashMap = WindowInsetsHolder.z;
                    Object obj = weakHashMap.get(view);
                    Object obj2 = obj;
                    if (obj == null) {
                        WindowInsetsHolder windowInsetsHolder2 = new WindowInsetsHolder(null, view, false ? 1 : 0);
                        weakHashMap.put(view, windowInsetsHolder2);
                        obj2 = windowInsetsHolder2;
                    }
                    windowInsetsHolder = (WindowInsetsHolder) obj2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return windowInsetsHolder;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final zg e(ch9 ch9Var, int i, String str) {
            zg zgVar = new zg(i, str);
            if (ch9Var != null) {
                zgVar.h(ch9Var, i);
            }
            return zgVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final u39 f(ch9 ch9Var, int i, String str) {
            jl3 jl3Var;
            if (ch9Var == null || (jl3Var = ch9Var.g(i)) == null) {
                jl3Var = jl3.e;
            }
            return p.a(jl3Var, str);
        }

        public final WindowInsetsHolder c(Composer composer, int i) {
            composer.z(-1366542614);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1366542614, i, -1, "androidx.compose.foundation.layout.WindowInsetsHolder.Companion.current (WindowInsets.android.kt:626)");
            }
            final View view = (View) composer.m(AndroidCompositionLocals_androidKt.k());
            final WindowInsetsHolder d = d(view);
            py1.a(d, new ss2() { // from class: androidx.compose.foundation.layout.WindowInsetsHolder$Companion$current$1

                public static final class a implements ms1 {
                    final /* synthetic */ WindowInsetsHolder a;
                    final /* synthetic */ View b;

                    public a(WindowInsetsHolder windowInsetsHolder, View view) {
                        this.a = windowInsetsHolder;
                        this.b = view;
                    }

                    @Override // defpackage.ms1
                    public void dispose() {
                        this.a.b(this.b);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ms1 invoke(ns1 ns1Var) {
                    WindowInsetsHolder.this.g(view);
                    return new a(WindowInsetsHolder.this, view);
                }
            }, composer, 8);
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
            composer.R();
            return d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WindowInsetsHolder(ch9 ch9Var, View view, DefaultConstructorMarker defaultConstructorMarker) {
        this(ch9Var, view);
    }

    public static /* synthetic */ void i(WindowInsetsHolder windowInsetsHolder, ch9 ch9Var, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        windowInsetsHolder.h(ch9Var, i);
    }

    public final void b(View view) {
        int i = this.v - 1;
        this.v = i;
        if (i == 0) {
            k99.A0(view, null);
            k99.F0(view, null);
            view.removeOnAttachStateChangeListener(this.w);
        }
    }

    public final boolean c() {
        return this.u;
    }

    public final zg d() {
        return this.c;
    }

    public final zg e() {
        return this.f;
    }

    public final zg f() {
        return this.g;
    }

    public final void g(View view) {
        if (this.v == 0) {
            k99.A0(view, this.w);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(this.w);
            k99.F0(view, this.w);
        }
        this.v++;
    }

    public final void h(ch9 ch9Var, int i) {
        if (A) {
            WindowInsets u = ch9Var.u();
            zq3.e(u);
            ch9Var = ch9.v(u);
        }
        this.a.h(ch9Var, i);
        this.c.h(ch9Var, i);
        this.b.h(ch9Var, i);
        this.e.h(ch9Var, i);
        this.f.h(ch9Var, i);
        this.g.h(ch9Var, i);
        this.h.h(ch9Var, i);
        this.i.h(ch9Var, i);
        this.d.h(ch9Var, i);
        if (i == 0) {
            this.n.f(p.d(ch9Var.g(ch9.l.a())));
            this.o.f(p.d(ch9Var.g(ch9.l.f())));
            this.p.f(p.d(ch9Var.g(ch9.l.g())));
            this.q.f(p.d(ch9Var.g(ch9.l.h())));
            this.r.f(p.d(ch9Var.g(ch9.l.j())));
            hs1 e = ch9Var.e();
            if (e != null) {
                this.j.f(p.d(e.e()));
            }
        }
        androidx.compose.runtime.snapshots.e.e.k();
    }

    public final void j(ch9 ch9Var) {
        this.t.f(p.d(ch9Var.f(ch9.l.c())));
    }

    public final void k(ch9 ch9Var) {
        this.s.f(p.d(ch9Var.f(ch9.l.c())));
    }

    private WindowInsetsHolder(ch9 ch9Var, View view) {
        hs1 e;
        jl3 e2;
        Companion companion = x;
        this.a = companion.e(ch9Var, ch9.l.a(), "captionBar");
        zg e3 = companion.e(ch9Var, ch9.l.b(), "displayCutout");
        this.b = e3;
        zg e4 = companion.e(ch9Var, ch9.l.c(), "ime");
        this.c = e4;
        zg e5 = companion.e(ch9Var, ch9.l.e(), "mandatorySystemGestures");
        this.d = e5;
        this.e = companion.e(ch9Var, ch9.l.f(), "navigationBars");
        this.f = companion.e(ch9Var, ch9.l.g(), "statusBars");
        zg e6 = companion.e(ch9Var, ch9.l.h(), "systemBars");
        this.g = e6;
        zg e7 = companion.e(ch9Var, ch9.l.i(), "systemGestures");
        this.h = e7;
        zg e8 = companion.e(ch9Var, ch9.l.j(), "tappableElement");
        this.i = e8;
        u39 a = p.a((ch9Var == null || (e = ch9Var.e()) == null || (e2 = e.e()) == null) ? jl3.e : e2, "waterfall");
        this.j = a;
        o g = uh9.g(uh9.g(e6, e4), e3);
        this.k = g;
        o g2 = uh9.g(uh9.g(uh9.g(e8, e5), e7), a);
        this.l = g2;
        this.m = uh9.g(g, g2);
        this.n = companion.f(ch9Var, ch9.l.a(), "captionBarIgnoringVisibility");
        this.o = companion.f(ch9Var, ch9.l.f(), "navigationBarsIgnoringVisibility");
        this.p = companion.f(ch9Var, ch9.l.g(), "statusBarsIgnoringVisibility");
        this.q = companion.f(ch9Var, ch9.l.h(), "systemBarsIgnoringVisibility");
        this.r = companion.f(ch9Var, ch9.l.j(), "tappableElementIgnoringVisibility");
        this.s = companion.f(ch9Var, ch9.l.c(), "imeAnimationTarget");
        this.t = companion.f(ch9Var, ch9.l.c(), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(kg6.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.u = bool != null ? bool.booleanValue() : true;
        this.w = new h(this);
    }
}
