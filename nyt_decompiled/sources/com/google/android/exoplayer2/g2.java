package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.ads.a;
import com.google.android.exoplayer2.w0;
import com.google.common.collect.ImmutableList;
import defpackage.ne0;
import defpackage.oe0;
import defpackage.ur;
import defpackage.z19;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class g2 implements g {
    public static final g2 a = new a();
    private static final String b = z19.t0(0);
    private static final String c = z19.t0(1);
    private static final String d = z19.t0(2);
    public static final g.a e = new g.a() { // from class: mm8
        @Override // com.google.android.exoplayer2.g.a
        public final g a(Bundle bundle) {
            g2 c2;
            c2 = g2.c(bundle);
            return c2;
        }
    };

    class a extends g2 {
        a() {
        }

        @Override // com.google.android.exoplayer2.g2
        public int g(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.g2
        public b l(int i, b bVar, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.g2
        public int n() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.g2
        public Object r(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.g2
        public d t(int i, d dVar, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.g2
        public int u() {
            return 0;
        }
    }

    public static final class b implements g {
        private static final String h = z19.t0(0);
        private static final String i = z19.t0(1);
        private static final String j = z19.t0(2);
        private static final String k = z19.t0(3);
        private static final String l = z19.t0(4);
        public static final g.a m = new g.a() { // from class: nm8
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                g2.b d;
                d = g2.b.d(bundle);
                return d;
            }
        };
        public Object a;
        public Object b;
        public int c;
        public long d;
        public long e;
        public boolean f;
        private com.google.android.exoplayer2.source.ads.a g = com.google.android.exoplayer2.source.ads.a.g;

        /* JADX INFO: Access modifiers changed from: private */
        public static b d(Bundle bundle) {
            int i2 = bundle.getInt(h, 0);
            long j2 = bundle.getLong(i, -9223372036854775807L);
            long j3 = bundle.getLong(j, 0L);
            boolean z = bundle.getBoolean(k, false);
            Bundle bundle2 = bundle.getBundle(l);
            com.google.android.exoplayer2.source.ads.a aVar = bundle2 != null ? (com.google.android.exoplayer2.source.ads.a) com.google.android.exoplayer2.source.ads.a.m.a(bundle2) : com.google.android.exoplayer2.source.ads.a.g;
            b bVar = new b();
            bVar.y(null, null, i2, j2, j3, aVar, z);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            int i2 = this.c;
            if (i2 != 0) {
                bundle.putInt(h, i2);
            }
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(i, j2);
            }
            long j3 = this.e;
            if (j3 != 0) {
                bundle.putLong(j, j3);
            }
            boolean z = this.f;
            if (z) {
                bundle.putBoolean(k, z);
            }
            if (!this.g.equals(com.google.android.exoplayer2.source.ads.a.g)) {
                bundle.putBundle(l, this.g.a());
            }
            return bundle;
        }

        public int e(int i2) {
            return this.g.e(i2).b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return z19.c(this.a, bVar.a) && z19.c(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && this.e == bVar.e && this.f == bVar.f && z19.c(this.g, bVar.g);
        }

        public long f(int i2, int i3) {
            a.C0183a e = this.g.e(i2);
            if (e.b != -1) {
                return e.f[i3];
            }
            return -9223372036854775807L;
        }

        public int g() {
            return this.g.b;
        }

        public int h(long j2) {
            return this.g.f(j2, this.d);
        }

        public int hashCode() {
            Object obj = this.a;
            int hashCode = (217 + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.b;
            int hashCode2 = (((hashCode + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c) * 31;
            long j2 = this.d;
            int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.e;
            return ((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
        }

        public int i(long j2) {
            return this.g.g(j2, this.d);
        }

        public long j(int i2) {
            return this.g.e(i2).a;
        }

        public long k() {
            return this.g.c;
        }

        public int l(int i2, int i3) {
            a.C0183a e = this.g.e(i2);
            if (e.b != -1) {
                return e.e[i3];
            }
            return 0;
        }

        public Object m() {
            return this.g.a;
        }

        public long n(int i2) {
            return this.g.e(i2).g;
        }

        public long o() {
            return this.d;
        }

        public int p(int i2) {
            return this.g.e(i2).g();
        }

        public int q(int i2, int i3) {
            return this.g.e(i2).h(i3);
        }

        public long r() {
            return z19.h1(this.e);
        }

        public long s() {
            return this.e;
        }

        public int t() {
            return this.g.e;
        }

        public boolean u(int i2) {
            return !this.g.e(i2).i();
        }

        public boolean v(int i2) {
            return i2 == g() - 1 && this.g.i(i2);
        }

        public boolean w(int i2) {
            return this.g.e(i2).h;
        }

        public b x(Object obj, Object obj2, int i2, long j2, long j3) {
            return y(obj, obj2, i2, j2, j3, com.google.android.exoplayer2.source.ads.a.g, false);
        }

        public b y(Object obj, Object obj2, int i2, long j2, long j3, com.google.android.exoplayer2.source.ads.a aVar, boolean z) {
            this.a = obj;
            this.b = obj2;
            this.c = i2;
            this.d = j2;
            this.e = j3;
            this.g = aVar;
            this.f = z;
            return this;
        }
    }

    public static final class c extends g2 {
        private final ImmutableList f;
        private final ImmutableList g;
        private final int[] h;
        private final int[] i;

        public c(ImmutableList immutableList, ImmutableList immutableList2, int[] iArr) {
            ur.a(immutableList.size() == iArr.length);
            this.f = immutableList;
            this.g = immutableList2;
            this.h = iArr;
            this.i = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.i[iArr[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.g2
        public int f(boolean z) {
            if (v()) {
                return -1;
            }
            if (z) {
                return this.h[0];
            }
            return 0;
        }

        @Override // com.google.android.exoplayer2.g2
        public int g(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.g2
        public int h(boolean z) {
            if (v()) {
                return -1;
            }
            return z ? this.h[u() - 1] : u() - 1;
        }

        @Override // com.google.android.exoplayer2.g2
        public int j(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != h(z)) {
                return z ? this.h[this.i[i] + 1] : i + 1;
            }
            if (i2 == 2) {
                return f(z);
            }
            return -1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.g2
        public b l(int i, b bVar, boolean z) {
            b bVar2 = (b) this.g.get(i);
            bVar.y(bVar2.a, bVar2.b, bVar2.c, bVar2.d, bVar2.e, bVar2.g, bVar2.f);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.g2
        public int n() {
            return this.g.size();
        }

        @Override // com.google.android.exoplayer2.g2
        public int q(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i != f(z)) {
                return z ? this.h[this.i[i] - 1] : i - 1;
            }
            if (i2 == 2) {
                return h(z);
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.g2
        public Object r(int i) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.g2
        public d t(int i, d dVar, long j) {
            d dVar2 = (d) this.f.get(i);
            dVar.j(dVar2.a, dVar2.c, dVar2.d, dVar2.e, dVar2.f, dVar2.g, dVar2.h, dVar2.i, dVar2.k, dVar2.m, dVar2.n, dVar2.r, dVar2.s, dVar2.t);
            dVar.l = dVar2.l;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.g2
        public int u() {
            return this.f.size();
        }
    }

    public static final class d implements g {
        public Object b;
        public Object d;
        public long e;
        public long f;
        public long g;
        public boolean h;
        public boolean i;
        public boolean j;
        public w0.g k;
        public boolean l;
        public long m;
        public long n;
        public int r;
        public int s;
        public long t;
        public static final Object u = new Object();
        private static final Object w = new Object();
        private static final w0 x = new w0.c().d("com.google.android.exoplayer2.Timeline").g(Uri.EMPTY).a();
        private static final String y = z19.t0(1);
        private static final String B = z19.t0(2);
        private static final String H = z19.t0(3);
        private static final String L = z19.t0(4);
        private static final String M = z19.t0(5);
        private static final String N = z19.t0(6);
        private static final String Q = z19.t0(7);
        private static final String S = z19.t0(8);
        private static final String X = z19.t0(9);
        private static final String Y = z19.t0(10);
        private static final String Z = z19.t0(11);
        private static final String e0 = z19.t0(12);
        private static final String f0 = z19.t0(13);
        public static final g.a g0 = new g.a() { // from class: om8
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                g2.d c;
                c = g2.d.c(bundle);
                return c;
            }
        };
        public Object a = u;
        public w0 c = x;

        /* JADX INFO: Access modifiers changed from: private */
        public static d c(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(y);
            w0 w0Var = bundle2 != null ? (w0) w0.s.a(bundle2) : w0.i;
            long j = bundle.getLong(B, -9223372036854775807L);
            long j2 = bundle.getLong(H, -9223372036854775807L);
            long j3 = bundle.getLong(L, -9223372036854775807L);
            boolean z = bundle.getBoolean(M, false);
            boolean z2 = bundle.getBoolean(N, false);
            Bundle bundle3 = bundle.getBundle(Q);
            w0.g gVar = bundle3 != null ? (w0.g) w0.g.l.a(bundle3) : null;
            boolean z3 = bundle.getBoolean(S, false);
            long j4 = bundle.getLong(X, 0L);
            long j5 = bundle.getLong(Y, -9223372036854775807L);
            int i = bundle.getInt(Z, 0);
            int i2 = bundle.getInt(e0, 0);
            long j6 = bundle.getLong(f0, 0L);
            d dVar = new d();
            dVar.j(w, w0Var, null, j, j2, j3, z, z2, gVar, j4, j5, i, i2, j6);
            dVar.l = z3;
            return dVar;
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            if (!w0.i.equals(this.c)) {
                bundle.putBundle(y, this.c.a());
            }
            long j = this.e;
            if (j != -9223372036854775807L) {
                bundle.putLong(B, j);
            }
            long j2 = this.f;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(H, j2);
            }
            long j3 = this.g;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(L, j3);
            }
            boolean z = this.h;
            if (z) {
                bundle.putBoolean(M, z);
            }
            boolean z2 = this.i;
            if (z2) {
                bundle.putBoolean(N, z2);
            }
            w0.g gVar = this.k;
            if (gVar != null) {
                bundle.putBundle(Q, gVar.a());
            }
            boolean z3 = this.l;
            if (z3) {
                bundle.putBoolean(S, z3);
            }
            long j4 = this.m;
            if (j4 != 0) {
                bundle.putLong(X, j4);
            }
            long j5 = this.n;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(Y, j5);
            }
            int i = this.r;
            if (i != 0) {
                bundle.putInt(Z, i);
            }
            int i2 = this.s;
            if (i2 != 0) {
                bundle.putInt(e0, i2);
            }
            long j6 = this.t;
            if (j6 != 0) {
                bundle.putLong(f0, j6);
            }
            return bundle;
        }

        public long d() {
            return z19.d0(this.g);
        }

        public long e() {
            return z19.h1(this.m);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            d dVar = (d) obj;
            return z19.c(this.a, dVar.a) && z19.c(this.c, dVar.c) && z19.c(this.d, dVar.d) && z19.c(this.k, dVar.k) && this.e == dVar.e && this.f == dVar.f && this.g == dVar.g && this.h == dVar.h && this.i == dVar.i && this.l == dVar.l && this.m == dVar.m && this.n == dVar.n && this.r == dVar.r && this.s == dVar.s && this.t == dVar.t;
        }

        public long f() {
            return this.m;
        }

        public long g() {
            return z19.h1(this.n);
        }

        public long h() {
            return this.t;
        }

        public int hashCode() {
            int hashCode = (((217 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31;
            Object obj = this.d;
            int hashCode2 = (hashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            w0.g gVar = this.k;
            int hashCode3 = (hashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31;
            long j = this.e;
            int i = (hashCode3 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f;
            int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.g;
            int i3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31;
            long j4 = this.m;
            int i4 = (i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.n;
            int i5 = (((((i4 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.r) * 31) + this.s) * 31;
            long j6 = this.t;
            return i5 + ((int) (j6 ^ (j6 >>> 32)));
        }

        public boolean i() {
            ur.g(this.j == (this.k != null));
            return this.k != null;
        }

        public d j(Object obj, w0 w0Var, Object obj2, long j, long j2, long j3, boolean z, boolean z2, w0.g gVar, long j4, long j5, int i, int i2, long j6) {
            w0.h hVar;
            this.a = obj;
            this.c = w0Var != null ? w0Var : x;
            this.b = (w0Var == null || (hVar = w0Var.b) == null) ? null : hVar.i;
            this.d = obj2;
            this.e = j;
            this.f = j2;
            this.g = j3;
            this.h = z;
            this.i = z2;
            this.j = gVar != null;
            this.k = gVar;
            this.m = j4;
            this.n = j5;
            this.r = i;
            this.s = i2;
            this.t = j6;
            this.l = false;
            return this;
        }
    }

    protected g2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static g2 c(Bundle bundle) {
        ImmutableList d2 = d(d.g0, oe0.a(bundle, b));
        ImmutableList d3 = d(b.m, oe0.a(bundle, c));
        int[] intArray = bundle.getIntArray(d);
        if (intArray == null) {
            intArray = e(d2.size());
        }
        return new c(d2, d3, intArray);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ImmutableList d(g.a aVar, IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.x();
        }
        ImmutableList.a aVar2 = new ImmutableList.a();
        ImmutableList a2 = ne0.a(iBinder);
        for (int i = 0; i < a2.size(); i++) {
            aVar2.a(aVar.a((Bundle) a2.get(i)));
        }
        return aVar2.k();
    }

    private static int[] e(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    @Override // com.google.android.exoplayer2.g
    public final Bundle a() {
        ArrayList arrayList = new ArrayList();
        int u = u();
        d dVar = new d();
        for (int i = 0; i < u; i++) {
            arrayList.add(t(i, dVar, 0L).a());
        }
        ArrayList arrayList2 = new ArrayList();
        int n = n();
        b bVar = new b();
        for (int i2 = 0; i2 < n; i2++) {
            arrayList2.add(l(i2, bVar, false).a());
        }
        int[] iArr = new int[u];
        if (u > 0) {
            iArr[0] = f(true);
        }
        for (int i3 = 1; i3 < u; i3++) {
            iArr[i3] = j(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        oe0.c(bundle, b, new ne0(arrayList));
        oe0.c(bundle, c, new ne0(arrayList2));
        bundle.putIntArray(d, iArr);
        return bundle;
    }

    public boolean equals(Object obj) {
        int h;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        g2 g2Var = (g2) obj;
        if (g2Var.u() != u() || g2Var.n() != n()) {
            return false;
        }
        d dVar = new d();
        b bVar = new b();
        d dVar2 = new d();
        b bVar2 = new b();
        for (int i = 0; i < u(); i++) {
            if (!s(i, dVar).equals(g2Var.s(i, dVar2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < n(); i2++) {
            if (!l(i2, bVar, true).equals(g2Var.l(i2, bVar2, true))) {
                return false;
            }
        }
        int f = f(true);
        if (f != g2Var.f(true) || (h = h(true)) != g2Var.h(true)) {
            return false;
        }
        while (f != h) {
            int j = j(f, 0, true);
            if (j != g2Var.j(f, 0, true)) {
                return false;
            }
            f = j;
        }
        return true;
    }

    public int f(boolean z) {
        return v() ? -1 : 0;
    }

    public abstract int g(Object obj);

    public int h(boolean z) {
        if (v()) {
            return -1;
        }
        return u() - 1;
    }

    public int hashCode() {
        d dVar = new d();
        b bVar = new b();
        int u = 217 + u();
        for (int i = 0; i < u(); i++) {
            u = (u * 31) + s(i, dVar).hashCode();
        }
        int n = (u * 31) + n();
        for (int i2 = 0; i2 < n(); i2++) {
            n = (n * 31) + l(i2, bVar, true).hashCode();
        }
        int f = f(true);
        while (f != -1) {
            n = (n * 31) + f;
            f = j(f, 0, true);
        }
        return n;
    }

    public final int i(int i, b bVar, d dVar, int i2, boolean z) {
        int i3 = k(i, bVar).c;
        if (s(i3, dVar).s != i) {
            return i + 1;
        }
        int j = j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return s(j, dVar).r;
    }

    public int j(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == h(z)) {
                return -1;
            }
            return i + 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == h(z) ? f(z) : i + 1;
        }
        throw new IllegalStateException();
    }

    public final b k(int i, b bVar) {
        return l(i, bVar, false);
    }

    public abstract b l(int i, b bVar, boolean z);

    public b m(Object obj, b bVar) {
        return l(g(obj), bVar, true);
    }

    public abstract int n();

    public final Pair o(d dVar, b bVar, int i, long j) {
        return (Pair) ur.e(p(dVar, bVar, i, j, 0L));
    }

    public final Pair p(d dVar, b bVar, int i, long j, long j2) {
        ur.c(i, 0, u());
        t(i, dVar, j2);
        if (j == -9223372036854775807L) {
            j = dVar.f();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = dVar.r;
        k(i2, bVar);
        while (i2 < dVar.s && bVar.e != j) {
            int i3 = i2 + 1;
            if (k(i3, bVar).e > j) {
                break;
            }
            i2 = i3;
        }
        l(i2, bVar, true);
        long j3 = j - bVar.e;
        long j4 = bVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(ur.e(bVar.b), Long.valueOf(Math.max(0L, j3)));
    }

    public int q(int i, int i2, boolean z) {
        if (i2 == 0) {
            if (i == f(z)) {
                return -1;
            }
            return i - 1;
        }
        if (i2 == 1) {
            return i;
        }
        if (i2 == 2) {
            return i == f(z) ? h(z) : i - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object r(int i);

    public final d s(int i, d dVar) {
        return t(i, dVar, 0L);
    }

    public abstract d t(int i, d dVar, long j);

    public abstract int u();

    public final boolean v() {
        return u() == 0;
    }

    public final boolean w(int i, b bVar, d dVar, int i2, boolean z) {
        return i(i, bVar, dVar, i2, z) == -1;
    }
}
