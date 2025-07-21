package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Looper;
import android.view.accessibility.CaptioningManager;
import com.google.android.exoplayer2.g;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.primitives.Ints;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes2.dex */
public class fq8 implements g {
    private static final String A0;
    public static final g.a B0;
    public static final fq8 Q;
    public static final fq8 S;
    private static final String X;
    private static final String Y;
    private static final String Z;
    private static final String e0;
    private static final String f0;
    private static final String g0;
    private static final String h0;
    private static final String i0;
    private static final String j0;
    private static final String k0;
    private static final String l0;
    private static final String m0;
    private static final String n0;
    private static final String o0;
    private static final String p0;
    private static final String q0;
    private static final String r0;
    private static final String s0;
    private static final String t0;
    private static final String u0;
    private static final String v0;
    private static final String w0;
    private static final String x0;
    private static final String y0;
    private static final String z0;
    public final boolean B;
    public final boolean H;
    public final boolean L;
    public final ImmutableMap M;
    public final ImmutableSet N;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final ImmutableList l;
    public final int m;
    public final ImmutableList n;
    public final int r;
    public final int s;
    public final int t;
    public final ImmutableList u;
    public final ImmutableList w;
    public final int x;
    public final int y;

    static {
        fq8 A = new a().A();
        Q = A;
        S = A;
        X = z19.t0(1);
        Y = z19.t0(2);
        Z = z19.t0(3);
        e0 = z19.t0(4);
        f0 = z19.t0(5);
        g0 = z19.t0(6);
        h0 = z19.t0(7);
        i0 = z19.t0(8);
        j0 = z19.t0(9);
        k0 = z19.t0(10);
        l0 = z19.t0(11);
        m0 = z19.t0(12);
        n0 = z19.t0(13);
        o0 = z19.t0(14);
        p0 = z19.t0(15);
        q0 = z19.t0(16);
        r0 = z19.t0(17);
        s0 = z19.t0(18);
        t0 = z19.t0(19);
        u0 = z19.t0(20);
        v0 = z19.t0(21);
        w0 = z19.t0(22);
        x0 = z19.t0(23);
        y0 = z19.t0(24);
        z0 = z19.t0(25);
        A0 = z19.t0(26);
        B0 = new g.a() { // from class: eq8
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                return fq8.B(bundle);
            }
        };
    }

    protected fq8(a aVar) {
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
        this.m = aVar.m;
        this.n = aVar.n;
        this.r = aVar.o;
        this.s = aVar.p;
        this.t = aVar.q;
        this.u = aVar.r;
        this.w = aVar.s;
        this.x = aVar.t;
        this.y = aVar.u;
        this.B = aVar.v;
        this.H = aVar.w;
        this.L = aVar.x;
        this.M = ImmutableMap.f(aVar.y);
        this.N = ImmutableSet.u(aVar.z);
    }

    public static fq8 B(Bundle bundle) {
        return new a(bundle).A();
    }

    @Override // com.google.android.exoplayer2.g
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(g0, this.a);
        bundle.putInt(h0, this.b);
        bundle.putInt(i0, this.c);
        bundle.putInt(j0, this.d);
        bundle.putInt(k0, this.e);
        bundle.putInt(l0, this.f);
        bundle.putInt(m0, this.g);
        bundle.putInt(n0, this.h);
        bundle.putInt(o0, this.i);
        bundle.putInt(p0, this.j);
        bundle.putBoolean(q0, this.k);
        bundle.putStringArray(r0, (String[]) this.l.toArray(new String[0]));
        bundle.putInt(z0, this.m);
        bundle.putStringArray(X, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(Y, this.r);
        bundle.putInt(s0, this.s);
        bundle.putInt(t0, this.t);
        bundle.putStringArray(u0, (String[]) this.u.toArray(new String[0]));
        bundle.putStringArray(Z, (String[]) this.w.toArray(new String[0]));
        bundle.putInt(e0, this.x);
        bundle.putInt(A0, this.y);
        bundle.putBoolean(f0, this.B);
        bundle.putBoolean(v0, this.H);
        bundle.putBoolean(w0, this.L);
        bundle.putParcelableArrayList(x0, pe0.i(this.M.values()));
        bundle.putIntArray(y0, Ints.l(this.N));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        fq8 fq8Var = (fq8) obj;
        return this.a == fq8Var.a && this.b == fq8Var.b && this.c == fq8Var.c && this.d == fq8Var.d && this.e == fq8Var.e && this.f == fq8Var.f && this.g == fq8Var.g && this.h == fq8Var.h && this.k == fq8Var.k && this.i == fq8Var.i && this.j == fq8Var.j && this.l.equals(fq8Var.l) && this.m == fq8Var.m && this.n.equals(fq8Var.n) && this.r == fq8Var.r && this.s == fq8Var.s && this.t == fq8Var.t && this.u.equals(fq8Var.u) && this.w.equals(fq8Var.w) && this.x == fq8Var.x && this.y == fq8Var.y && this.B == fq8Var.B && this.H == fq8Var.H && this.L == fq8Var.L && this.M.equals(fq8Var.M) && this.N.equals(fq8Var.N);
    }

    public int hashCode() {
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.k ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode()) * 31) + this.r) * 31) + this.s) * 31) + this.t) * 31) + this.u.hashCode()) * 31) + this.w.hashCode()) * 31) + this.x) * 31) + this.y) * 31) + (this.B ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + this.M.hashCode()) * 31) + this.N.hashCode();
    }

    public static class a {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private ImmutableList l;
        private int m;
        private ImmutableList n;
        private int o;
        private int p;
        private int q;
        private ImmutableList r;
        private ImmutableList s;
        private int t;
        private int u;
        private boolean v;
        private boolean w;
        private boolean x;
        private HashMap y;
        private HashSet z;

        public a() {
            this.a = Integer.MAX_VALUE;
            this.b = Integer.MAX_VALUE;
            this.c = Integer.MAX_VALUE;
            this.d = Integer.MAX_VALUE;
            this.i = Integer.MAX_VALUE;
            this.j = Integer.MAX_VALUE;
            this.k = true;
            this.l = ImmutableList.x();
            this.m = 0;
            this.n = ImmutableList.x();
            this.o = 0;
            this.p = Integer.MAX_VALUE;
            this.q = Integer.MAX_VALUE;
            this.r = ImmutableList.x();
            this.s = ImmutableList.x();
            this.t = 0;
            this.u = 0;
            this.v = false;
            this.w = false;
            this.x = false;
            this.y = new HashMap();
            this.z = new HashSet();
        }

        private void B(fq8 fq8Var) {
            this.a = fq8Var.a;
            this.b = fq8Var.b;
            this.c = fq8Var.c;
            this.d = fq8Var.d;
            this.e = fq8Var.e;
            this.f = fq8Var.f;
            this.g = fq8Var.g;
            this.h = fq8Var.h;
            this.i = fq8Var.i;
            this.j = fq8Var.j;
            this.k = fq8Var.k;
            this.l = fq8Var.l;
            this.m = fq8Var.m;
            this.n = fq8Var.n;
            this.o = fq8Var.r;
            this.p = fq8Var.s;
            this.q = fq8Var.t;
            this.r = fq8Var.u;
            this.s = fq8Var.w;
            this.t = fq8Var.x;
            this.u = fq8Var.y;
            this.v = fq8Var.B;
            this.w = fq8Var.H;
            this.x = fq8Var.L;
            this.z = new HashSet(fq8Var.N);
            this.y = new HashMap(fq8Var.M);
        }

        private static ImmutableList C(String[] strArr) {
            ImmutableList.a p = ImmutableList.p();
            for (String str : (String[]) ur.e(strArr)) {
                p.a(z19.F0((String) ur.e(str)));
            }
            return p.k();
        }

        private void F(Context context) {
            CaptioningManager captioningManager;
            if ((z19.a >= 23 || Looper.myLooper() != null) && (captioningManager = (CaptioningManager) context.getSystemService("captioning")) != null && captioningManager.isEnabled()) {
                this.t = 1088;
                Locale locale = captioningManager.getLocale();
                if (locale != null) {
                    this.s = ImmutableList.y(z19.Z(locale));
                }
            }
        }

        public fq8 A() {
            return new fq8(this);
        }

        protected a D(fq8 fq8Var) {
            B(fq8Var);
            return this;
        }

        public a E(Context context) {
            if (z19.a >= 19) {
                F(context);
            }
            return this;
        }

        public a G(int i, int i2, boolean z) {
            this.i = i;
            this.j = i2;
            this.k = z;
            return this;
        }

        public a H(Context context, boolean z) {
            Point P = z19.P(context);
            return G(P.x, P.y, z);
        }

        public a(Context context) {
            this();
            E(context);
            H(context, true);
        }

        protected a(fq8 fq8Var) {
            B(fq8Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected a(Bundle bundle) {
            ImmutableList d;
            String str = fq8.g0;
            fq8 fq8Var = fq8.Q;
            this.a = bundle.getInt(str, fq8Var.a);
            this.b = bundle.getInt(fq8.h0, fq8Var.b);
            this.c = bundle.getInt(fq8.i0, fq8Var.c);
            this.d = bundle.getInt(fq8.j0, fq8Var.d);
            this.e = bundle.getInt(fq8.k0, fq8Var.e);
            this.f = bundle.getInt(fq8.l0, fq8Var.f);
            this.g = bundle.getInt(fq8.m0, fq8Var.g);
            this.h = bundle.getInt(fq8.n0, fq8Var.h);
            this.i = bundle.getInt(fq8.o0, fq8Var.i);
            this.j = bundle.getInt(fq8.p0, fq8Var.j);
            this.k = bundle.getBoolean(fq8.q0, fq8Var.k);
            this.l = ImmutableList.u((String[]) sv4.a(bundle.getStringArray(fq8.r0), new String[0]));
            this.m = bundle.getInt(fq8.z0, fq8Var.m);
            this.n = C((String[]) sv4.a(bundle.getStringArray(fq8.X), new String[0]));
            this.o = bundle.getInt(fq8.Y, fq8Var.r);
            this.p = bundle.getInt(fq8.s0, fq8Var.s);
            this.q = bundle.getInt(fq8.t0, fq8Var.t);
            this.r = ImmutableList.u((String[]) sv4.a(bundle.getStringArray(fq8.u0), new String[0]));
            this.s = C((String[]) sv4.a(bundle.getStringArray(fq8.Z), new String[0]));
            this.t = bundle.getInt(fq8.e0, fq8Var.x);
            this.u = bundle.getInt(fq8.A0, fq8Var.y);
            this.v = bundle.getBoolean(fq8.f0, fq8Var.B);
            this.w = bundle.getBoolean(fq8.v0, fq8Var.H);
            this.x = bundle.getBoolean(fq8.w0, fq8Var.L);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(fq8.x0);
            if (parcelableArrayList == null) {
                d = ImmutableList.x();
            } else {
                d = pe0.d(dq8.e, parcelableArrayList);
            }
            this.y = new HashMap();
            for (int i = 0; i < d.size(); i++) {
                dq8 dq8Var = (dq8) d.get(i);
                this.y.put(dq8Var.a, dq8Var);
            }
            int[] iArr = (int[]) sv4.a(bundle.getIntArray(fq8.y0), new int[0]);
            this.z = new HashSet();
            for (int i2 : iArr) {
                this.z.add(Integer.valueOf(i2));
            }
        }
    }
}
