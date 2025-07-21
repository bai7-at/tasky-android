package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.Looper;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.v1;
import defpackage.c41;
import defpackage.hc5;
import defpackage.ik2;
import defpackage.z19;
import defpackage.z89;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public interface v1 {

    public static final class b implements g {
        public static final b b = new a().e();
        private static final String c = z19.t0(0);
        public static final g.a d = new g.a() { // from class: qv5
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                v1.b e;
                e = v1.b.e(bundle);
                return e;
            }
        };
        private final ik2 a;

        public static final class a {
            private static final int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 33, 26, 34, 27, 28, 29, 30, 32};
            private final ik2.b a = new ik2.b();

            public a a(int i) {
                this.a.a(i);
                return this;
            }

            public a b(b bVar) {
                this.a.b(bVar.a);
                return this;
            }

            public a c(int... iArr) {
                this.a.c(iArr);
                return this;
            }

            public a d(int i, boolean z) {
                this.a.d(i, z);
                return this;
            }

            public b e() {
                return new b(this.a.e());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b e(Bundle bundle) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(c);
            if (integerArrayList == null) {
                return b;
            }
            a aVar = new a();
            for (int i = 0; i < integerArrayList.size(); i++) {
                aVar.a(integerArrayList.get(i).intValue());
            }
            return aVar.e();
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < this.a.c(); i++) {
                arrayList.add(Integer.valueOf(this.a.b(i)));
            }
            bundle.putIntegerArrayList(c, arrayList);
            return bundle;
        }

        public boolean d(int i) {
            return this.a.a(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        private b(ik2 ik2Var) {
            this.a = ik2Var;
        }
    }

    public static final class c {
        private final ik2 a;

        public c(ik2 ik2Var) {
            this.a = ik2Var;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                return this.a.equals(((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public interface d {
        default void A(e eVar, e eVar2, int i) {
        }

        default void B(int i) {
        }

        default void C(boolean z) {
        }

        default void D(b bVar) {
        }

        default void E(g2 g2Var, int i) {
        }

        default void F(int i) {
        }

        default void G(j jVar) {
        }

        default void I(x0 x0Var) {
        }

        default void N(int i, boolean z) {
        }

        default void Q() {
        }

        default void R(int i, int i2) {
        }

        default void S(PlaybackException playbackException) {
        }

        default void U(int i) {
        }

        default void W(h2 h2Var) {
        }

        default void X(boolean z) {
        }

        default void Y(PlaybackException playbackException) {
        }

        default void Z(float f) {
        }

        default void a(boolean z) {
        }

        default void f0(v1 v1Var, c cVar) {
        }

        default void h(Metadata metadata) {
        }

        default void i0(int i) {
        }

        default void j(List list) {
        }

        default void j0(boolean z, int i) {
        }

        default void k0(w0 w0Var, int i) {
        }

        default void m(u1 u1Var) {
        }

        default void n(z89 z89Var) {
        }

        default void o0(boolean z, int i) {
        }

        default void p0(boolean z) {
        }

        default void s(c41 c41Var) {
        }
    }

    public static final class e implements g {
        private static final String k = z19.t0(0);
        private static final String l = z19.t0(1);
        private static final String m = z19.t0(2);
        private static final String n = z19.t0(3);
        private static final String r = z19.t0(4);
        private static final String s = z19.t0(5);
        private static final String t = z19.t0(6);
        public static final g.a u = new g.a() { // from class: rv5
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                v1.e c;
                c = v1.e.c(bundle);
                return c;
            }
        };
        public final Object a;
        public final int b;
        public final int c;
        public final w0 d;
        public final Object e;
        public final int f;
        public final long g;
        public final long h;
        public final int i;
        public final int j;

        public e(Object obj, int i, w0 w0Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.a = obj;
            this.b = i;
            this.c = i;
            this.d = w0Var;
            this.e = obj2;
            this.f = i2;
            this.g = j;
            this.h = j2;
            this.i = i3;
            this.j = i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static e c(Bundle bundle) {
            int i = bundle.getInt(k, 0);
            Bundle bundle2 = bundle.getBundle(l);
            return new e(null, i, bundle2 == null ? null : (w0) w0.s.a(bundle2), null, bundle.getInt(m, 0), bundle.getLong(n, 0L), bundle.getLong(r, 0L), bundle.getInt(s, -1), bundle.getInt(t, -1));
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            return d(true, true);
        }

        public Bundle d(boolean z, boolean z2) {
            Bundle bundle = new Bundle();
            bundle.putInt(k, z2 ? this.c : 0);
            w0 w0Var = this.d;
            if (w0Var != null && z) {
                bundle.putBundle(l, w0Var.a());
            }
            bundle.putInt(m, z2 ? this.f : 0);
            bundle.putLong(n, z ? this.g : 0L);
            bundle.putLong(r, z ? this.h : 0L);
            bundle.putInt(s, z ? this.i : -1);
            bundle.putInt(t, z ? this.j : -1);
            return bundle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || e.class != obj.getClass()) {
                return false;
            }
            e eVar = (e) obj;
            return this.c == eVar.c && this.f == eVar.f && this.g == eVar.g && this.h == eVar.h && this.i == eVar.i && this.j == eVar.j && hc5.a(this.a, eVar.a) && hc5.a(this.e, eVar.e) && hc5.a(this.d, eVar.d);
        }

        public int hashCode() {
            return hc5.b(this.a, Integer.valueOf(this.c), this.d, this.e, Integer.valueOf(this.f), Long.valueOf(this.g), Long.valueOf(this.h), Integer.valueOf(this.i), Integer.valueOf(this.j));
        }
    }

    boolean A();

    boolean c();

    long d();

    void e(d dVar);

    PlaybackException f();

    h2 g();

    long getDuration();

    float getVolume();

    boolean h();

    int i();

    boolean j(int i);

    boolean k();

    int l();

    g2 m();

    Looper n();

    b o();

    boolean p();

    int q();

    int q0();

    boolean r();

    int s();

    long t();

    void u(d dVar);

    boolean v();

    int w();

    int x();

    boolean y();

    long z();
}
