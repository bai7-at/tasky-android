package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.NetworkCapabilities;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.j1;
import com.google.android.gms.internal.ads.k1;
import com.google.android.gms.internal.ads.n0;
import com.google.android.gms.internal.ads.n1;
import com.google.android.gms.internal.ads.u0;
import com.google.android.gms.internal.ads.zzavz;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public abstract class efa extends dfa {
    protected static final Object N = new Object();
    private static final String Q = "efa";
    static boolean S;
    private static long X;
    private static jfa Y;
    private static sga Z;
    private static kga e0;
    protected boolean B;
    protected final String H;
    qga L;
    private final Map M;

    protected efa(Context context, String str, boolean z) {
        super(context);
        this.B = false;
        this.M = new HashMap();
        this.H = str;
        this.B = z;
    }

    protected static jga m(Context context, boolean z) {
        if (dfa.y == null) {
            synchronized (N) {
                try {
                    if (dfa.y == null) {
                        jga g = jga.g(context, "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", z);
                        if (g.r()) {
                            try {
                                if (((Boolean) pla.c().a(mpa.b3)).booleanValue()) {
                                    g.t("ki2ip3Sp4zD5u1iHxdI5CQP+nQytWboRZ8YxUMq1u4GDs7rHoXiw6vz07EKttNE7", "f+0D9BT8zkFXnX9yG742KHeQy11nhCJFb6PFndn+zMk=", new Class[0]);
                                }
                            } catch (IllegalStateException unused) {
                            }
                            g.t("8UEA9TmdE+sqV3zcsNgnFI5Sf8uIsQHU61W37Ddl8zaNqY23x/FpuoK+mm9MWruA", "qlbJd0rViXaFpU2SvrkcezPlE/VtgXulMFWFUXmIBBg=", Context.class);
                            g.t("F0+pSvx9GtXcjR12oFzzp5apK08MRky74IYez805WxvZBZTjFs672zxMax8w5kp9", "69psxaRqrIVZzPpt4pN0wGmA/kc6O8gjOJlblyEzW1E=", Context.class);
                            g.t("0gWjYXznHW/Eye6gdpKNKYjX/XLpx1vdgxUIuTN4hh6FwE+EupqjErYFsUwwKenZ", "tk45mDotIpTZidmNYxxiIBsjVftw/e0h3Unlwpf2Me4=", Context.class);
                            g.t("nK4MIXXv/sY+coqtAjalB6f9NiJ1zVnlRnfsJ++LIaOoNJXY+cpXhUK9rjjc0N2G", "gziBDgIPHk3UnbqAN9Ta9zRxJ8KBrTfiKBXyCZDQ588=", Context.class);
                            g.t("somG6HzRa3YZJrwwnfL6K8d6jP9Npv493BtTLjfx2vaqxDUDPiPCNzpi42Jpggs8", "t0k+Q4WGODPCHlTh1fiMgaVG6LJXWEyq2lqorD4gMCo=", Context.class);
                            Class cls = Boolean.TYPE;
                            g.t("hvOzu3pRF2dcNdvDy8db1rttL97bOQyvLLd+NabZhD5sRaprNsAQL2vdtDd+eY16", "XE2927Ta6gTWmjrPmk4in7GLLwsXJnqTbhVN3N+/b3M=", Context.class, cls);
                            g.t("CYcH4LBpiH+KaEScKuk48/IbmIORuaeHTHx2iwUA0vRWrbIkTWIgIbVYJ8eozDwX", "AtCF0F/Ugi3KOt6zYtgfLSsd+8KzXVTsnhwfj9NoYBY=", Context.class);
                            g.t("IcH9chIM8pdQBP/eeaIVQOxIkEFtHwPKwBzAXjYRdyw5KOKrZsfN3FYxHItVH2IL", "WQCGmUFTrgSOZ83nswxrNh39wVE6t1Ouq3E0zMLvIMA=", Context.class);
                            g.t("6diiPm6leEU3dn6Yh3093iP+CyZAN47Ila9hmZbBOygAlbw7IfYBD8oUvevGhzQp", "zuOSwgzLq/YXiyJNPWGjICL0KrcqY8eXUxyiBgiihdg=", MotionEvent.class, DisplayMetrics.class);
                            g.t("0BurIdBwA1Yjcso9P1TmQgVgvpSOR3INLha4uP5JdYXgWQEacWBPKA8E9hy+9dAe", "TOlHmdp8XsKJiprHSu957VTnJJL2Dj58ytcwt3QLHDQ=", MotionEvent.class, DisplayMetrics.class);
                            g.t("hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", new Class[0]);
                            g.t("nKZwK8oioxkTwDfG9V2sR2xNb9GbO72JaQ9OaUpmWGl7ZX+EiCwiESnhzEGly7cm", "WIPKXsZv2l0NBmLvWdV3TkucPJ5dkfbRYYrTASAxFfQ=", new Class[0]);
                            g.t("d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", new Class[0]);
                            g.t("L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", new Class[0]);
                            g.t("J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", new Class[0]);
                            g.t("U5Ngb8pPuPEbyAEAeNCt0wgGFK4YAtkNGCrOQKfD/ONzQcV8GTtSZ6EoO3NY8V1s", "GZJYAQ87uqT/39Vw1xO4VkKaUA+BZKFiVkKasBC0VSw=", new Class[0]);
                            g.t("CbnHJiUmcb7bV3nHtVfkQJESWUzuF9spYS2HkpVPEQ4sOQCQUFomcsL6vpMTm+JY", "m4BHDSYRnsEEIrYlgM0yy1C5NfyYnIIeJvwgjuCY5HY=", Context.class, cls, String.class);
                            g.t("kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=", StackTraceElement[].class);
                            g.t("a1Na7bntM+sktGxZBhUnqailj8ITQ7piLQZ5OyqVU2HU4R0rOCZ63N/fUHG081A+", "eISRjanjhAfdgJ9+lE3tGViJFRMvsuX1oVbmo+9k2XU=", View.class, DisplayMetrics.class, cls, cls);
                            g.t("JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", Context.class, cls);
                            g.t("sA157cQy3kuoY6/Q8khf6XMDmxSzcYyzmkuwKzX0O8QIfXTfkmyj/S2OF9jehLNc", "FdxRYG9/HOndmgVdj1eVgDulreHUGSjsWl31nKn2TzY=", View.class, Activity.class, cls);
                            g.t("2ZUgS25mCfmBpvNAAnoop42ZvK9H4E17vIqHMHWBgDSruAgpJ0/PRWhyN3sqcUbC", "ZqqofhkB4+yK9ARzF+IbcECpWBtuTXlqWFDkC/AVdcM=", Long.TYPE);
                            g.t("Q2oRzQFBrNQ6PISKRcfuekSxxMHiBiKCGVgSnsIVkCh9YR7J4L17zMBZU0VVyUEU", "eEgPK4FD9N/fpMPwsM6h+Wvbqi3j4L5DBTwMY2KteC4=", new Class[0]);
                            try {
                                if (((Boolean) pla.c().a(mpa.g3)).booleanValue()) {
                                    g.t("PyZj3I+LGZvAhJ9n3OQrlENydgM2JwW0T6dRxf3as8iTDiIpqvAE/3692CSblz+3", "8lD2ezwwsI93agi51tjtw1sdZVRU2vHPSc7HynOlFDE=", Context.class);
                                }
                            } catch (IllegalStateException unused2) {
                            }
                            g.t("IWYMNwupvIr4nCzhi63Y96rPhOxZK2U2oV0yQU5ISOuxDdywn/U6CBTwu78HOm4H", "Q0EftCh9LNoL/97bVNRGH4YGKN2mjVuI8Ruidx0q8xs=", Context.class);
                            try {
                                if (((Boolean) pla.c().a(mpa.i3)).booleanValue()) {
                                    Class cls2 = Long.TYPE;
                                    g.t("ChMYhePBDqkXl5DeRTg9cgSXXNPVEcIqgEVciYHEVlkZyx/HkVQXSnen8aw33G2s", "tJ+SvALjKnpAv9FF8u56pKKRS55/vzUDe+m9ct97Lx4=", NetworkCapabilities.class, cls2, cls2);
                                }
                            } catch (IllegalStateException unused3) {
                            }
                            try {
                                if (((Boolean) pla.c().a(mpa.z2)).booleanValue()) {
                                    g.t("ouo6/s5NPxZlxezvpiuAYZ73R/AsqpZljIGTfLgJpzrsB+84nXU0ZzhmetmfkBrN", "5BsC37pqFx3Fp5Qtv0y+RSU8LVttAMXjX8aFccLrzxg=", List.class);
                                }
                            } catch (IllegalStateException unused4) {
                            }
                            try {
                                if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
                                    Class cls3 = Long.TYPE;
                                    g.t("Srq4/7DDafVhhxKPQvFzGwPCcbAxjsRhBUoTZMyZ8i1elMwCHCPiECib9I+dpg+U", "+ExOXtPxYV6dYowx9W8QaGOBr19dRESYWAuzCGJGeu8=", cls3, cls3, cls3, cls3);
                                }
                            } catch (IllegalStateException unused5) {
                            }
                            try {
                                if (((Boolean) pla.c().a(mpa.w2)).booleanValue()) {
                                    g.t("DNq6U+mZz2ZReiKgjo/VDFnaMNaZiKgTjVzJ4/NswvXzkfhe/AgU2N86qSmmEbDf", "ZzhYXgKMhken/ic2sDR8A53WLOTMzsBN7DfnMjKoyhk=", long[].class, Context.class, View.class);
                                }
                            } catch (IllegalStateException unused6) {
                            }
                        }
                        dfa.y = g;
                    }
                } finally {
                }
            }
        }
        return dfa.y;
    }

    static lga n(jga jgaVar, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method j = jgaVar.j("6diiPm6leEU3dn6Yh3093iP+CyZAN47Ila9hmZbBOygAlbw7IfYBD8oUvevGhzQp", "zuOSwgzLq/YXiyJNPWGjICL0KrcqY8eXUxyiBgiihdg=");
        if (j == null || motionEvent == null) {
            throw new zzavz();
        }
        try {
            return new lga((String) j.invoke(null, motionEvent, displayMetrics));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzavz(e);
        }
    }

    protected static synchronized void q(Context context, boolean z) {
        synchronized (efa.class) {
            try {
                if (S) {
                    return;
                }
                X = System.currentTimeMillis() / 1000;
                dfa.y = m(context, z);
                if (((Boolean) pla.c().a(mpa.i3)).booleanValue()) {
                    Y = jfa.c(context);
                }
                ExecutorService k = dfa.y.k();
                if (((Boolean) pla.c().a(mpa.j3)).booleanValue() && k != null) {
                    Z = sga.d(context, k);
                }
                if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
                    e0 = new kga();
                }
                S = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    protected static final void r(List list) {
        ExecutorService k;
        if (dfa.y == null || (k = dfa.y.k()) == null || list.isEmpty()) {
            return;
        }
        try {
            k.invokeAll(list, ((Long) pla.c().a(mpa.s2)).longValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            String str = Q;
            StringWriter stringWriter = new StringWriter();
            e.printStackTrace(new PrintWriter(stringWriter));
            Log.d(str, String.format("class methods got exception: %s", stringWriter.toString()));
        }
    }

    private final synchronized void s(jga jgaVar, u0 u0Var) {
        MotionEvent motionEvent;
        try {
            try {
                lga n = n(jgaVar, this.a, this.w);
                Long l = n.b;
                if (l != null) {
                    u0Var.A(l.longValue());
                }
                Long l2 = n.c;
                if (l2 != null) {
                    u0Var.B(l2.longValue());
                }
                Long l3 = n.d;
                if (l3 != null) {
                    u0Var.y(l3.longValue());
                }
                if (this.u) {
                    Long l4 = n.e;
                    if (l4 != null) {
                        u0Var.x(l4.longValue());
                    }
                    Long l5 = n.f;
                    if (l5 != null) {
                        u0Var.u(l5.longValue());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        } catch (zzavz unused) {
        }
        j1 L = k1.L();
        if (this.c > 0 && mga.e(this.w)) {
            L.q(mga.a(this.j, 1, this.w));
            L.E(mga.a(this.r - this.m, 1, this.w));
            L.F(mga.a(this.s - this.n, 1, this.w));
            L.w(mga.a(this.m, 1, this.w));
            L.y(mga.a(this.n, 1, this.w));
            if (this.u && (motionEvent = this.a) != null) {
                long a = mga.a(((this.m - this.r) + motionEvent.getRawX()) - this.a.getX(), 1, this.w);
                if (a != 0) {
                    L.B(a);
                }
                long a2 = mga.a(((this.n - this.s) + this.a.getRawY()) - this.a.getY(), 1, this.w);
                if (a2 != 0) {
                    L.D(a2);
                }
            }
        }
        try {
            lga j = j(this.a);
            Long l6 = j.b;
            if (l6 != null) {
                L.x(l6.longValue());
            }
            Long l7 = j.c;
            if (l7 != null) {
                L.z(l7.longValue());
            }
            L.v(j.d.longValue());
            if (this.u) {
                Long l8 = j.f;
                if (l8 != null) {
                    L.t(l8.longValue());
                }
                Long l9 = j.e;
                if (l9 != null) {
                    L.u(l9.longValue());
                }
                Long l10 = j.g;
                if (l10 != null) {
                    L.H(l10.longValue() != 0 ? 2 : 1);
                }
                if (this.d > 0) {
                    Long valueOf = mga.e(this.w) ? Long.valueOf(Math.round(this.i / this.d)) : null;
                    if (valueOf != null) {
                        L.o(valueOf.longValue());
                    } else {
                        L.n();
                    }
                    L.p(Math.round(this.h / this.d));
                }
                Long l11 = j.j;
                if (l11 != null) {
                    L.r(l11.longValue());
                }
                Long l12 = j.k;
                if (l12 != null) {
                    L.A(l12.longValue());
                }
                Long l13 = j.l;
                if (l13 != null) {
                    L.G(l13.longValue() != 0 ? 2 : 1);
                }
            }
        } catch (zzavz unused2) {
        }
        long j2 = this.g;
        if (j2 > 0) {
            L.s(j2);
        }
        u0Var.F((k1) L.i());
        long j3 = this.c;
        if (j3 > 0) {
            u0Var.v(j3);
        }
        long j4 = this.d;
        if (j4 > 0) {
            u0Var.w(j4);
        }
        long j5 = this.e;
        if (j5 > 0) {
            u0Var.z(j5);
        }
        long j6 = this.f;
        if (j6 > 0) {
            u0Var.t(j6);
        }
        try {
            int size = this.b.size() - 1;
            if (size > 0) {
                u0Var.X();
                for (int i = 0; i < size; i++) {
                    lga n2 = n(dfa.y, (MotionEvent) this.b.get(i), this.w);
                    j1 L2 = k1.L();
                    L2.x(n2.b.longValue());
                    L2.z(n2.c.longValue());
                    u0Var.P((k1) L2.i());
                }
            }
        } catch (zzavz unused3) {
            u0Var.X();
        }
    }

    private static final void t() {
        sga sgaVar = Z;
        if (sgaVar != null) {
            sgaVar.h();
        }
    }

    @Override // defpackage.cfa
    public final void a(View view) {
        if (((Boolean) pla.c().a(mpa.v2)).booleanValue()) {
            if (this.L == null) {
                jga jgaVar = dfa.y;
                this.L = new qga(jgaVar.a, jgaVar.f());
            }
            this.L.f(view);
        }
    }

    @Override // defpackage.dfa
    protected final long f(StackTraceElement[] stackTraceElementArr) {
        Method j = dfa.y.j("kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=");
        if (j == null || stackTraceElementArr == null) {
            throw new zzavz();
        }
        try {
            return new aga((String) j.invoke(null, stackTraceElementArr)).b.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzavz(e);
        }
    }

    @Override // defpackage.dfa
    protected final u0 g(Context context, View view, Activity activity) {
        t();
        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
            e0.i();
        }
        String str = this.H;
        u0 l0 = n1.l0();
        if (!TextUtils.isEmpty(str)) {
            l0.d0(this.H);
        }
        p(m(context, this.B), l0, view, activity, true, context);
        return l0;
    }

    @Override // defpackage.dfa
    protected final u0 h(Context context, n0 n0Var) {
        t();
        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
            e0.j();
        }
        String str = this.H;
        u0 l0 = n1.l0();
        if (!TextUtils.isEmpty(str)) {
            l0.d0(this.H);
        }
        jga m = m(context, this.B);
        if (m.k() != null) {
            r(o(m, context, l0, null));
        }
        return l0;
    }

    @Override // defpackage.dfa
    protected final u0 i(Context context, View view, Activity activity) {
        t();
        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
            e0.k(context, view);
        }
        String str = this.H;
        u0 l0 = n1.l0();
        l0.d0(str);
        p(m(context, this.B), l0, view, activity, false, context);
        return l0;
    }

    @Override // defpackage.dfa
    protected final lga j(MotionEvent motionEvent) {
        Method j = dfa.y.j("0BurIdBwA1Yjcso9P1TmQgVgvpSOR3INLha4uP5JdYXgWQEacWBPKA8E9hy+9dAe", "TOlHmdp8XsKJiprHSu957VTnJJL2Dj58ytcwt3QLHDQ=");
        if (j == null || motionEvent == null) {
            throw new zzavz();
        }
        try {
            return new lga((String) j.invoke(null, motionEvent, this.w));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new zzavz(e);
        }
    }

    protected List o(jga jgaVar, Context context, u0 u0Var, n0 n0Var) {
        long j;
        long j2;
        int a = jgaVar.a();
        ArrayList arrayList = new ArrayList();
        if (!jgaVar.r()) {
            u0Var.q(16384L);
            return arrayList;
        }
        arrayList.add(new xga(jgaVar, "CbnHJiUmcb7bV3nHtVfkQJESWUzuF9spYS2HkpVPEQ4sOQCQUFomcsL6vpMTm+JY", "m4BHDSYRnsEEIrYlgM0yy1C5NfyYnIIeJvwgjuCY5HY=", u0Var, a, 27, context, null));
        arrayList.add(new fha(jgaVar, "hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", u0Var, X, a, 25));
        arrayList.add(new pha(jgaVar, "d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", u0Var, a, 1));
        arrayList.add(new sha(jgaVar, "0gWjYXznHW/Eye6gdpKNKYjX/XLpx1vdgxUIuTN4hh6FwE+EupqjErYFsUwwKenZ", "tk45mDotIpTZidmNYxxiIBsjVftw/e0h3Unlwpf2Me4=", u0Var, a, 31, context));
        arrayList.add(new xha(jgaVar, "nKZwK8oioxkTwDfG9V2sR2xNb9GbO72JaQ9OaUpmWGl7ZX+EiCwiESnhzEGly7cm", "WIPKXsZv2l0NBmLvWdV3TkucPJ5dkfbRYYrTASAxFfQ=", u0Var, a, 33));
        arrayList.add(new wga(jgaVar, "F0+pSvx9GtXcjR12oFzzp5apK08MRky74IYez805WxvZBZTjFs672zxMax8w5kp9", "69psxaRqrIVZzPpt4pN0wGmA/kc6O8gjOJlblyEzW1E=", u0Var, a, 29, context));
        arrayList.add(new yga(jgaVar, "nK4MIXXv/sY+coqtAjalB6f9NiJ1zVnlRnfsJ++LIaOoNJXY+cpXhUK9rjjc0N2G", "gziBDgIPHk3UnbqAN9Ta9zRxJ8KBrTfiKBXyCZDQ588=", u0Var, a, 5));
        arrayList.add(new oha(jgaVar, "somG6HzRa3YZJrwwnfL6K8d6jP9Npv493BtTLjfx2vaqxDUDPiPCNzpi42Jpggs8", "t0k+Q4WGODPCHlTh1fiMgaVG6LJXWEyq2lqorD4gMCo=", u0Var, a, 12));
        arrayList.add(new qha(jgaVar, "hvOzu3pRF2dcNdvDy8db1rttL97bOQyvLLd+NabZhD5sRaprNsAQL2vdtDd+eY16", "XE2927Ta6gTWmjrPmk4in7GLLwsXJnqTbhVN3N+/b3M=", u0Var, a, 3));
        arrayList.add(new zga(jgaVar, "L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", u0Var, a, 44));
        arrayList.add(new kha(jgaVar, "J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", u0Var, a, 22));
        arrayList.add(new yha(jgaVar, "CYcH4LBpiH+KaEScKuk48/IbmIORuaeHTHx2iwUA0vRWrbIkTWIgIbVYJ8eozDwX", "AtCF0F/Ugi3KOt6zYtgfLSsd+8KzXVTsnhwfj9NoYBY=", u0Var, a, 48));
        arrayList.add(new vga(jgaVar, "IcH9chIM8pdQBP/eeaIVQOxIkEFtHwPKwBzAXjYRdyw5KOKrZsfN3FYxHItVH2IL", "WQCGmUFTrgSOZ83nswxrNh39wVE6t1Ouq3E0zMLvIMA=", u0Var, a, 49));
        arrayList.add(new vha(jgaVar, "U5Ngb8pPuPEbyAEAeNCt0wgGFK4YAtkNGCrOQKfD/ONzQcV8GTtSZ6EoO3NY8V1s", "GZJYAQ87uqT/39Vw1xO4VkKaUA+BZKFiVkKasBC0VSw=", u0Var, a, 51));
        arrayList.add(new tha(jgaVar, "JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", u0Var, a, 61));
        if (((Boolean) pla.c().a(mpa.i3)).booleanValue()) {
            sga sgaVar = Z;
            if (sgaVar != null) {
                j = sgaVar.c();
                j2 = sgaVar.b();
            } else {
                j = -1;
                j2 = -1;
            }
            arrayList.add(new nha(jgaVar, "ChMYhePBDqkXl5DeRTg9cgSXXNPVEcIqgEVciYHEVlkZyx/HkVQXSnen8aw33G2s", "tJ+SvALjKnpAv9FF8u56pKKRS55/vzUDe+m9ct97Lx4=", u0Var, a, 11, Y, j, j2));
        }
        if (((Boolean) pla.c().a(mpa.g3)).booleanValue()) {
            arrayList.add(new rha(jgaVar, "PyZj3I+LGZvAhJ9n3OQrlENydgM2JwW0T6dRxf3as8iTDiIpqvAE/3692CSblz+3", "8lD2ezwwsI93agi51tjtw1sdZVRU2vHPSc7HynOlFDE=", u0Var, a, 73));
        }
        arrayList.add(new lha(jgaVar, "IWYMNwupvIr4nCzhi63Y96rPhOxZK2U2oV0yQU5ISOuxDdywn/U6CBTwu78HOm4H", "Q0EftCh9LNoL/97bVNRGH4YGKN2mjVuI8Ruidx0q8xs=", u0Var, a, 76));
        if (((Boolean) pla.c().a(mpa.l3)).booleanValue()) {
            arrayList.add(new uga(jgaVar, "Q2oRzQFBrNQ6PISKRcfuekSxxMHiBiKCGVgSnsIVkCh9YR7J4L17zMBZU0VVyUEU", "eEgPK4FD9N/fpMPwsM6h+Wvbqi3j4L5DBTwMY2KteC4=", u0Var, a, 89));
        }
        return arrayList;
    }

    protected final void p(jga jgaVar, u0 u0Var, View view, Activity activity, boolean z, Context context) {
        List list;
        if (jgaVar.r()) {
            s(jgaVar, u0Var);
            ArrayList arrayList = new ArrayList();
            if (jgaVar.k() != null) {
                int a = jgaVar.a();
                arrayList.add(new hha(jgaVar, u0Var));
                arrayList.add(new pha(jgaVar, "d4INySQwKXrFgcw/Yp0O6t4YGx7HF+F75DncE44LSIy22mr4UP50R657OPRB1jqZ", "AemuwIJaLmYE+nU5fadET3FINkdby4LnWDkawsC9pWk=", u0Var, a, 1));
                arrayList.add(new fha(jgaVar, "hIbo0WHjc5N2XBD7HI+Mwh9BXu/nIzOhdTaHZ1DPjeizuR48SZNCpBdtOxY4cHlb", "mLbfRIQxtPVbZphUgAhWqMeuqa25Ale/5rz8vv9YVkc=", u0Var, X, a, 25));
                arrayList.add(new zga(jgaVar, "L1KomYFd7sBH8JLOTR3glPup1jq/oqWyQJNU/5dJtxixjKQHD3ZBhAic9dH4TZgA", "m4uJd6hJYeAUgFAUB1OT370Awen8YINd4hKC7XM/6ec=", u0Var, a, 44));
                arrayList.add(new oha(jgaVar, "somG6HzRa3YZJrwwnfL6K8d6jP9Npv493BtTLjfx2vaqxDUDPiPCNzpi42Jpggs8", "t0k+Q4WGODPCHlTh1fiMgaVG6LJXWEyq2lqorD4gMCo=", u0Var, a, 12));
                arrayList.add(new qha(jgaVar, "hvOzu3pRF2dcNdvDy8db1rttL97bOQyvLLd+NabZhD5sRaprNsAQL2vdtDd+eY16", "XE2927Ta6gTWmjrPmk4in7GLLwsXJnqTbhVN3N+/b3M=", u0Var, a, 3));
                arrayList.add(new kha(jgaVar, "J3qHQsXE9gxUWY3EQze3pD9LpRQkp3i0z4IBb3xvxMfPfsFZNBOU+l2pHi8zC3DO", "W1peSRrFFzj+W6DyflucA6CQWTsphM4X4AkhjKjRy/o=", u0Var, a, 22));
                arrayList.add(new yga(jgaVar, "nK4MIXXv/sY+coqtAjalB6f9NiJ1zVnlRnfsJ++LIaOoNJXY+cpXhUK9rjjc0N2G", "gziBDgIPHk3UnbqAN9Ta9zRxJ8KBrTfiKBXyCZDQ588=", u0Var, a, 5));
                arrayList.add(new yha(jgaVar, "CYcH4LBpiH+KaEScKuk48/IbmIORuaeHTHx2iwUA0vRWrbIkTWIgIbVYJ8eozDwX", "AtCF0F/Ugi3KOt6zYtgfLSsd+8KzXVTsnhwfj9NoYBY=", u0Var, a, 48));
                arrayList.add(new vga(jgaVar, "IcH9chIM8pdQBP/eeaIVQOxIkEFtHwPKwBzAXjYRdyw5KOKrZsfN3FYxHItVH2IL", "WQCGmUFTrgSOZ83nswxrNh39wVE6t1Ouq3E0zMLvIMA=", u0Var, a, 49));
                arrayList.add(new vha(jgaVar, "U5Ngb8pPuPEbyAEAeNCt0wgGFK4YAtkNGCrOQKfD/ONzQcV8GTtSZ6EoO3NY8V1s", "GZJYAQ87uqT/39Vw1xO4VkKaUA+BZKFiVkKasBC0VSw=", u0Var, a, 51));
                arrayList.add(new uha(jgaVar, "kB6Ls9/mn9iw4biP/HsD3FFR9Vy1jOQ1ljTH52MXzz14qrvyk1QMusJQlJpZNqjT", "pY1LPqV65osROa0AkcabhXHjwpz5nP0HOapDW2QtdtU=", u0Var, a, 45, new Throwable().getStackTrace()));
                arrayList.add(new zha(jgaVar, "a1Na7bntM+sktGxZBhUnqailj8ITQ7piLQZ5OyqVU2HU4R0rOCZ63N/fUHG081A+", "eISRjanjhAfdgJ9+lE3tGViJFRMvsuX1oVbmo+9k2XU=", u0Var, a, 57, view));
                arrayList.add(new tha(jgaVar, "JHENilgoa32pdW2+FQZfbiKa1To+b6hAFc5hyxP6u/LWvHbIhkfTDC3kQMR4mpq3", "JQeYWB/Ar5LqSSZ5i6IhxYZ+uXn8SEDYL9xPjgGTx2M=", u0Var, a, 61));
                if (((Boolean) pla.c().a(mpa.t2)).booleanValue()) {
                    arrayList.add(new tga(jgaVar, "sA157cQy3kuoY6/Q8khf6XMDmxSzcYyzmkuwKzX0O8QIfXTfkmyj/S2OF9jehLNc", "FdxRYG9/HOndmgVdj1eVgDulreHUGSjsWl31nKn2TzY=", u0Var, a, 62, view, activity));
                }
                if (((Boolean) pla.c().a(mpa.l3)).booleanValue()) {
                    arrayList.add(new uga(jgaVar, "Q2oRzQFBrNQ6PISKRcfuekSxxMHiBiKCGVgSnsIVkCh9YR7J4L17zMBZU0VVyUEU", "eEgPK4FD9N/fpMPwsM6h+Wvbqi3j4L5DBTwMY2KteC4=", u0Var, a, 89));
                }
                if (!z) {
                    try {
                        if (((Boolean) pla.c().a(mpa.w2)).booleanValue()) {
                            arrayList.add(new jha(jgaVar, "DNq6U+mZz2ZReiKgjo/VDFnaMNaZiKgTjVzJ4/NswvXzkfhe/AgU2N86qSmmEbDf", "ZzhYXgKMhken/ic2sDR8A53WLOTMzsBN7DfnMjKoyhk=", u0Var, a, 85, this.M, view, context));
                        }
                    } catch (IllegalStateException unused) {
                    }
                    try {
                        if (((Boolean) pla.c().a(mpa.x2)).booleanValue()) {
                            arrayList.add(new iha(jgaVar, "Srq4/7DDafVhhxKPQvFzGwPCcbAxjsRhBUoTZMyZ8i1elMwCHCPiECib9I+dpg+U", "+ExOXtPxYV6dYowx9W8QaGOBr19dRESYWAuzCGJGeu8=", u0Var, a, 85, e0));
                        }
                    } catch (IllegalStateException unused2) {
                    }
                    if (((Boolean) pla.c().a(mpa.z2)).booleanValue()) {
                        arrayList.add(new mha(jgaVar, "ouo6/s5NPxZlxezvpiuAYZ73R/AsqpZljIGTfLgJpzrsB+84nXU0ZzhmetmfkBrN", "5BsC37pqFx3Fp5Qtv0y+RSU8LVttAMXjX8aFccLrzxg=", u0Var, a, 94, this.x));
                    }
                } else if (((Boolean) pla.c().a(mpa.v2)).booleanValue()) {
                    arrayList.add(new wha(jgaVar, "2ZUgS25mCfmBpvNAAnoop42ZvK9H4E17vIqHMHWBgDSruAgpJ0/PRWhyN3sqcUbC", "ZqqofhkB4+yK9ARzF+IbcECpWBtuTXlqWFDkC/AVdcM=", u0Var, a, 53, this.L));
                }
            }
            list = arrayList;
        } else {
            u0Var.q(16384L);
            list = Arrays.asList(new hha(jgaVar, u0Var));
        }
        r(list);
    }
}
