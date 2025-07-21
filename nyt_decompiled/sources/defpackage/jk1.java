package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.comscore.streaming.ContentMediaFormat;
import com.google.android.exoplayer2.a2;
import com.google.android.exoplayer2.g;
import com.google.android.exoplayer2.g2;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.z1;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.o;
import com.google.common.primitives.Ints;
import com.nytimes.android.api.cms.AssetConstants;
import defpackage.fq8;
import defpackage.jk1;
import defpackage.k8;
import defpackage.q72;
import defpackage.ye4;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public class jk1 extends ye4 implements a2.a {
    private static final o k = o.a(new Comparator() { // from class: ak1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int P;
            P = jk1.P((Integer) obj, (Integer) obj2);
            return P;
        }
    });
    private static final o l = o.a(new Comparator() { // from class: bk1
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int Q;
            Q = jk1.Q((Integer) obj, (Integer) obj2);
            return Q;
        }
    });
    private final Object d;
    public final Context e;
    private final q72.b f;
    private final boolean g;
    private d h;
    private f i;
    private com.google.android.exoplayer2.audio.a j;

    /* JADX INFO: Access modifiers changed from: private */
    static final class b extends h implements Comparable {
        private final boolean B;
        private final int e;
        private final boolean f;
        private final String g;
        private final d h;
        private final boolean i;
        private final int j;
        private final int k;
        private final int l;
        private final boolean m;
        private final int n;
        private final int r;
        private final boolean s;
        private final int t;
        private final int u;
        private final int w;
        private final int x;
        private final boolean y;

        /* JADX WARN: Multi-variable type inference failed */
        public b(int i, up8 up8Var, int i2, d dVar, int i3, boolean z, i16 i16Var) {
            super(i, up8Var, i2);
            int i4;
            int i5;
            int i6;
            this.h = dVar;
            this.g = jk1.U(this.d.c);
            this.i = jk1.L(i3, false);
            int i7 = 0;
            while (true) {
                i4 = Integer.MAX_VALUE;
                if (i7 >= dVar.n.size()) {
                    i5 = 0;
                    i7 = Integer.MAX_VALUE;
                    break;
                } else {
                    i5 = jk1.E(this.d, (String) dVar.n.get(i7), false);
                    if (i5 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.k = i7;
            this.j = i5;
            this.l = jk1.H(this.d.e, dVar.r);
            t0 t0Var = this.d;
            int i8 = t0Var.e;
            this.m = i8 == 0 || (i8 & 1) != 0;
            this.s = (t0Var.d & 1) != 0;
            int i9 = t0Var.M;
            this.t = i9;
            this.u = t0Var.N;
            int i10 = t0Var.h;
            this.w = i10;
            this.f = (i10 == -1 || i10 <= dVar.t) && (i9 == -1 || i9 <= dVar.s) && i16Var.apply(t0Var);
            String[] j0 = z19.j0();
            int i11 = 0;
            while (true) {
                if (i11 >= j0.length) {
                    i6 = 0;
                    i11 = Integer.MAX_VALUE;
                    break;
                } else {
                    i6 = jk1.E(this.d, j0[i11], false);
                    if (i6 > 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.n = i11;
            this.r = i6;
            int i12 = 0;
            while (true) {
                if (i12 < dVar.u.size()) {
                    String str = this.d.l;
                    if (str != null && str.equals(dVar.u.get(i12))) {
                        i4 = i12;
                        break;
                    }
                    i12++;
                } else {
                    break;
                }
            }
            this.x = i4;
            this.y = a2.l(i3) == 128;
            this.B = a2.w(i3) == 64;
            this.e = f(i3, z);
        }

        public static int c(List list, List list2) {
            return ((b) Collections.max(list)).compareTo((b) Collections.max(list2));
        }

        public static ImmutableList e(int i, up8 up8Var, d dVar, int[] iArr, boolean z, i16 i16Var) {
            ImmutableList.a p = ImmutableList.p();
            for (int i2 = 0; i2 < up8Var.a; i2++) {
                p.a(new b(i, up8Var, i2, dVar, iArr[i2], z, i16Var));
            }
            return p.k();
        }

        private int f(int i, boolean z) {
            if (!jk1.L(i, this.h.M0)) {
                return 0;
            }
            if (!this.f && !this.h.G0) {
                return 0;
            }
            if (jk1.L(i, false) && this.f && this.d.h != -1) {
                d dVar = this.h;
                if (!dVar.L && !dVar.H && (dVar.O0 || !z)) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // jk1.h
        public int a() {
            return this.e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            o f = (this.f && this.i) ? jk1.k : jk1.k.f();
            sp0 f2 = sp0.j().g(this.i, bVar.i).f(Integer.valueOf(this.k), Integer.valueOf(bVar.k), o.c().f()).d(this.j, bVar.j).d(this.l, bVar.l).g(this.s, bVar.s).g(this.m, bVar.m).f(Integer.valueOf(this.n), Integer.valueOf(bVar.n), o.c().f()).d(this.r, bVar.r).g(this.f, bVar.f).f(Integer.valueOf(this.x), Integer.valueOf(bVar.x), o.c().f()).f(Integer.valueOf(this.w), Integer.valueOf(bVar.w), this.h.H ? jk1.k.f() : jk1.l).g(this.y, bVar.y).g(this.B, bVar.B).f(Integer.valueOf(this.t), Integer.valueOf(bVar.t), f).f(Integer.valueOf(this.u), Integer.valueOf(bVar.u), f);
            Integer valueOf = Integer.valueOf(this.w);
            Integer valueOf2 = Integer.valueOf(bVar.w);
            if (!z19.c(this.g, bVar.g)) {
                f = jk1.l;
            }
            return f2.f(valueOf, valueOf2, f).i();
        }

        @Override // jk1.h
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public boolean b(b bVar) {
            int i;
            String str;
            int i2;
            d dVar = this.h;
            if ((dVar.J0 || ((i2 = this.d.M) != -1 && i2 == bVar.d.M)) && (dVar.H0 || ((str = this.d.l) != null && TextUtils.equals(str, bVar.d.l)))) {
                d dVar2 = this.h;
                if ((dVar2.I0 || ((i = this.d.N) != -1 && i == bVar.d.N)) && (dVar2.K0 || (this.y == bVar.y && this.B == bVar.B))) {
                    return true;
                }
            }
            return false;
        }
    }

    private static final class c implements Comparable {
        private final boolean a;
        private final boolean b;

        public c(t0 t0Var, int i) {
            this.a = (t0Var.d & 1) != 0;
            this.b = jk1.L(i, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return sp0.j().g(this.b, cVar.b).g(this.a, cVar.a).i();
        }
    }

    public static final class d extends fq8 implements com.google.android.exoplayer2.g {
        public static final d S0;
        public static final d T0;
        private static final String U0;
        private static final String V0;
        private static final String W0;
        private static final String X0;
        private static final String Y0;
        private static final String Z0;
        private static final String a1;
        private static final String b1;
        private static final String c1;
        private static final String d1;
        private static final String e1;
        private static final String f1;
        private static final String g1;
        private static final String h1;
        private static final String i1;
        private static final String j1;
        private static final String k1;
        private static final String l1;
        public static final g.a m1;
        public final boolean C0;
        public final boolean D0;
        public final boolean E0;
        public final boolean F0;
        public final boolean G0;
        public final boolean H0;
        public final boolean I0;
        public final boolean J0;
        public final boolean K0;
        public final boolean L0;
        public final boolean M0;
        public final boolean N0;
        public final boolean O0;
        public final boolean P0;
        private final SparseArray Q0;
        private final SparseBooleanArray R0;

        static {
            d A = new a().A();
            S0 = A;
            T0 = A;
            U0 = z19.t0(NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            V0 = z19.t0(1001);
            W0 = z19.t0(ContentMediaFormat.FULL_CONTENT_EPISODE);
            X0 = z19.t0(ContentMediaFormat.FULL_CONTENT_MOVIE);
            Y0 = z19.t0(ContentMediaFormat.PARTIAL_CONTENT_GENERIC);
            Z0 = z19.t0(1005);
            a1 = z19.t0(ContentMediaFormat.PARTIAL_CONTENT_MOVIE);
            b1 = z19.t0(ContentMediaFormat.PREVIEW_GENERIC);
            c1 = z19.t0(ContentMediaFormat.PREVIEW_EPISODE);
            d1 = z19.t0(ContentMediaFormat.PREVIEW_MOVIE);
            e1 = z19.t0(ContentMediaFormat.EXTRA_GENERIC);
            f1 = z19.t0(1011);
            g1 = z19.t0(ContentMediaFormat.EXTRA_EPISODE);
            h1 = z19.t0(ContentMediaFormat.EXTRA_MOVIE);
            i1 = z19.t0(ContentMediaFormat.FULL_CONTENT_PODCAST);
            j1 = z19.t0(ContentMediaFormat.PARTIAL_CONTENT_PODCAST);
            k1 = z19.t0(1016);
            l1 = z19.t0(1017);
            m1 = new g.a() { // from class: kk1
                @Override // com.google.android.exoplayer2.g.a
                public final g a(Bundle bundle) {
                    jk1.d O;
                    O = jk1.d.O(bundle);
                    return O;
                }
            };
        }

        private static boolean F(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean G(SparseArray sparseArray, SparseArray sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (indexOfKey < 0 || !H((Map) sparseArray.valueAt(i), (Map) sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        private static boolean H(Map map, Map map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry entry : map.entrySet()) {
                wp8 wp8Var = (wp8) entry.getKey();
                if (!map2.containsKey(wp8Var) || !z19.c(entry.getValue(), map2.get(wp8Var))) {
                    return false;
                }
            }
            return true;
        }

        public static d J(Context context) {
            return new a(context).A();
        }

        private static int[] K(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ d O(Bundle bundle) {
            return new a(bundle).A();
        }

        private static void P(Bundle bundle, SparseArray sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                for (Map.Entry entry : ((Map) sparseArray.valueAt(i)).entrySet()) {
                    e eVar = (e) entry.getValue();
                    if (eVar != null) {
                        sparseArray2.put(arrayList2.size(), eVar);
                    }
                    arrayList2.add((wp8) entry.getKey());
                    arrayList.add(Integer.valueOf(keyAt));
                }
                bundle.putIntArray(e1, Ints.l(arrayList));
                bundle.putParcelableArrayList(f1, pe0.i(arrayList2));
                bundle.putSparseParcelableArray(g1, pe0.j(sparseArray2));
            }
        }

        public a I() {
            return new a();
        }

        public boolean L(int i) {
            return this.R0.get(i);
        }

        public e M(int i, wp8 wp8Var) {
            Map map = (Map) this.Q0.get(i);
            if (map != null) {
                return (e) map.get(wp8Var);
            }
            return null;
        }

        public boolean N(int i, wp8 wp8Var) {
            Map map = (Map) this.Q0.get(i);
            return map != null && map.containsKey(wp8Var);
        }

        @Override // defpackage.fq8, com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle a2 = super.a();
            a2.putBoolean(U0, this.C0);
            a2.putBoolean(V0, this.D0);
            a2.putBoolean(W0, this.E0);
            a2.putBoolean(i1, this.F0);
            a2.putBoolean(X0, this.G0);
            a2.putBoolean(Y0, this.H0);
            a2.putBoolean(Z0, this.I0);
            a2.putBoolean(a1, this.J0);
            a2.putBoolean(j1, this.K0);
            a2.putBoolean(k1, this.L0);
            a2.putBoolean(b1, this.M0);
            a2.putBoolean(c1, this.N0);
            a2.putBoolean(d1, this.O0);
            a2.putBoolean(l1, this.P0);
            P(a2, this.Q0);
            a2.putIntArray(h1, K(this.R0));
            return a2;
        }

        @Override // defpackage.fq8
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.C0 == dVar.C0 && this.D0 == dVar.D0 && this.E0 == dVar.E0 && this.F0 == dVar.F0 && this.G0 == dVar.G0 && this.H0 == dVar.H0 && this.I0 == dVar.I0 && this.J0 == dVar.J0 && this.K0 == dVar.K0 && this.L0 == dVar.L0 && this.M0 == dVar.M0 && this.N0 == dVar.N0 && this.O0 == dVar.O0 && this.P0 == dVar.P0 && F(this.R0, dVar.R0) && G(this.Q0, dVar.Q0);
        }

        @Override // defpackage.fq8
        public int hashCode() {
            return ((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C0 ? 1 : 0)) * 31) + (this.D0 ? 1 : 0)) * 31) + (this.E0 ? 1 : 0)) * 31) + (this.F0 ? 1 : 0)) * 31) + (this.G0 ? 1 : 0)) * 31) + (this.H0 ? 1 : 0)) * 31) + (this.I0 ? 1 : 0)) * 31) + (this.J0 ? 1 : 0)) * 31) + (this.K0 ? 1 : 0)) * 31) + (this.L0 ? 1 : 0)) * 31) + (this.M0 ? 1 : 0)) * 31) + (this.N0 ? 1 : 0)) * 31) + (this.O0 ? 1 : 0)) * 31) + (this.P0 ? 1 : 0);
        }

        public static final class a extends fq8.a {
            private boolean A;
            private boolean B;
            private boolean C;
            private boolean D;
            private boolean E;
            private boolean F;
            private boolean G;
            private boolean H;
            private boolean I;
            private boolean J;
            private boolean K;
            private boolean L;
            private boolean M;
            private boolean N;
            private final SparseArray O;
            private final SparseBooleanArray P;

            private static SparseArray Z(SparseArray sparseArray) {
                SparseArray sparseArray2 = new SparseArray();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void a0() {
                this.A = true;
                this.B = false;
                this.C = true;
                this.D = false;
                this.E = true;
                this.F = false;
                this.G = false;
                this.H = false;
                this.I = false;
                this.J = true;
                this.K = true;
                this.L = false;
                this.M = true;
                this.N = false;
            }

            private SparseBooleanArray b0(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void s0(Bundle bundle) {
                int[] intArray = bundle.getIntArray(d.e1);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(d.f1);
                ImmutableList x = parcelableArrayList == null ? ImmutableList.x() : pe0.d(wp8.f, parcelableArrayList);
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(d.g1);
                SparseArray sparseArray = sparseParcelableArray == null ? new SparseArray() : pe0.e(e.h, sparseParcelableArray);
                if (intArray == null || intArray.length != x.size()) {
                    return;
                }
                for (int i = 0; i < intArray.length; i++) {
                    r0(intArray[i], (wp8) x.get(i), (e) sparseArray.get(i));
                }
            }

            @Override // fq8.a
            /* renamed from: Y, reason: merged with bridge method [inline-methods] */
            public d A() {
                return new d(this);
            }

            protected a c0(fq8 fq8Var) {
                super.D(fq8Var);
                return this;
            }

            public a d0(boolean z) {
                this.H = z;
                return this;
            }

            public a e0(boolean z) {
                this.I = z;
                return this;
            }

            public a f0(boolean z) {
                this.F = z;
                return this;
            }

            public a g0(boolean z) {
                this.G = z;
                return this;
            }

            public a h0(boolean z) {
                this.N = z;
                return this;
            }

            public a i0(boolean z) {
                this.M = z;
                return this;
            }

            public a j0(boolean z) {
                this.D = z;
                return this;
            }

            public a k0(boolean z) {
                this.B = z;
                return this;
            }

            public a l0(boolean z) {
                this.C = z;
                return this;
            }

            public a m0(boolean z) {
                this.J = z;
                return this;
            }

            public a n0(boolean z) {
                this.E = z;
                return this;
            }

            public a o0(boolean z) {
                this.K = z;
                return this;
            }

            public a p0(boolean z) {
                this.A = z;
                return this;
            }

            @Override // fq8.a
            /* renamed from: q0, reason: merged with bridge method [inline-methods] */
            public a E(Context context) {
                super.E(context);
                return this;
            }

            public a r0(int i, wp8 wp8Var, e eVar) {
                Map map = (Map) this.O.get(i);
                if (map == null) {
                    map = new HashMap();
                    this.O.put(i, map);
                }
                if (map.containsKey(wp8Var) && z19.c(map.get(wp8Var), eVar)) {
                    return this;
                }
                map.put(wp8Var, eVar);
                return this;
            }

            public a t0(boolean z) {
                this.L = z;
                return this;
            }

            @Override // fq8.a
            /* renamed from: u0, reason: merged with bridge method [inline-methods] */
            public a G(int i, int i2, boolean z) {
                super.G(i, i2, z);
                return this;
            }

            @Override // fq8.a
            /* renamed from: v0, reason: merged with bridge method [inline-methods] */
            public a H(Context context, boolean z) {
                super.H(context, z);
                return this;
            }

            public a() {
                this.O = new SparseArray();
                this.P = new SparseBooleanArray();
                a0();
            }

            public a(Context context) {
                super(context);
                this.O = new SparseArray();
                this.P = new SparseBooleanArray();
                a0();
            }

            private a(d dVar) {
                super(dVar);
                this.A = dVar.C0;
                this.B = dVar.D0;
                this.C = dVar.E0;
                this.D = dVar.F0;
                this.E = dVar.G0;
                this.F = dVar.H0;
                this.G = dVar.I0;
                this.H = dVar.J0;
                this.I = dVar.K0;
                this.J = dVar.L0;
                this.K = dVar.M0;
                this.L = dVar.N0;
                this.M = dVar.O0;
                this.N = dVar.P0;
                this.O = Z(dVar.Q0);
                this.P = dVar.R0.clone();
            }

            private a(Bundle bundle) {
                super(bundle);
                a0();
                d dVar = d.S0;
                p0(bundle.getBoolean(d.U0, dVar.C0));
                k0(bundle.getBoolean(d.V0, dVar.D0));
                l0(bundle.getBoolean(d.W0, dVar.E0));
                j0(bundle.getBoolean(d.i1, dVar.F0));
                n0(bundle.getBoolean(d.X0, dVar.G0));
                f0(bundle.getBoolean(d.Y0, dVar.H0));
                g0(bundle.getBoolean(d.Z0, dVar.I0));
                d0(bundle.getBoolean(d.a1, dVar.J0));
                e0(bundle.getBoolean(d.j1, dVar.K0));
                m0(bundle.getBoolean(d.k1, dVar.L0));
                o0(bundle.getBoolean(d.b1, dVar.M0));
                t0(bundle.getBoolean(d.c1, dVar.N0));
                i0(bundle.getBoolean(d.d1, dVar.O0));
                h0(bundle.getBoolean(d.l1, dVar.P0));
                this.O = new SparseArray();
                s0(bundle);
                this.P = b0(bundle.getIntArray(d.h1));
            }
        }

        private d(a aVar) {
            super(aVar);
            this.C0 = aVar.A;
            this.D0 = aVar.B;
            this.E0 = aVar.C;
            this.F0 = aVar.D;
            this.G0 = aVar.E;
            this.H0 = aVar.F;
            this.I0 = aVar.G;
            this.J0 = aVar.H;
            this.K0 = aVar.I;
            this.L0 = aVar.J;
            this.M0 = aVar.K;
            this.N0 = aVar.L;
            this.O0 = aVar.M;
            this.P0 = aVar.N;
            this.Q0 = aVar.O;
            this.R0 = aVar.P;
        }
    }

    public static final class e implements com.google.android.exoplayer2.g {
        private static final String e = z19.t0(0);
        private static final String f = z19.t0(1);
        private static final String g = z19.t0(2);
        public static final g.a h = new g.a() { // from class: lk1
            @Override // com.google.android.exoplayer2.g.a
            public final g a(Bundle bundle) {
                jk1.e c;
                c = jk1.e.c(bundle);
                return c;
            }
        };
        public final int a;
        public final int[] b;
        public final int c;
        public final int d;

        public e(int i, int[] iArr, int i2) {
            this.a = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.b = copyOf;
            this.c = iArr.length;
            this.d = i2;
            Arrays.sort(copyOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ e c(Bundle bundle) {
            int i = bundle.getInt(e, -1);
            int[] intArray = bundle.getIntArray(f);
            int i2 = bundle.getInt(g, -1);
            ur.a(i >= 0 && i2 >= 0);
            ur.e(intArray);
            return new e(i, intArray, i2);
        }

        @Override // com.google.android.exoplayer2.g
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putInt(e, this.a);
            bundle.putIntArray(f, this.b);
            bundle.putInt(g, this.d);
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
            return this.a == eVar.a && Arrays.equals(this.b, eVar.b) && this.d == eVar.d;
        }

        public int hashCode() {
            return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.d;
        }
    }

    private static class f {
        private final Spatializer a;
        private final boolean b;
        private Handler c;
        private Spatializer$OnSpatializerStateChangedListener d;

        class a implements Spatializer$OnSpatializerStateChangedListener {
            final /* synthetic */ jk1 a;

            a(jk1 jk1Var) {
                this.a = jk1Var;
            }

            public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z) {
                this.a.S();
            }

            public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z) {
                this.a.S();
            }
        }

        private f(Spatializer spatializer) {
            int immersiveAudioLevel;
            this.a = spatializer;
            immersiveAudioLevel = spatializer.getImmersiveAudioLevel();
            this.b = immersiveAudioLevel != 0;
        }

        public static f g(Context context) {
            Spatializer spatializer;
            AudioManager audioManager = (AudioManager) context.getSystemService(AssetConstants.AUDIO_TYPE);
            if (audioManager == null) {
                return null;
            }
            spatializer = audioManager.getSpatializer();
            return new f(spatializer);
        }

        public boolean a(com.google.android.exoplayer2.audio.a aVar, t0 t0Var) {
            boolean canBeSpatialized;
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(z19.H(("audio/eac3-joc".equals(t0Var.l) && t0Var.M == 16) ? 12 : t0Var.M));
            int i = t0Var.N;
            if (i != -1) {
                channelMask.setSampleRate(i);
            }
            canBeSpatialized = this.a.canBeSpatialized(aVar.c().a, channelMask.build());
            return canBeSpatialized;
        }

        public void b(jk1 jk1Var, Looper looper) {
            if (this.d == null && this.c == null) {
                this.d = new a(jk1Var);
                Handler handler = new Handler(looper);
                this.c = handler;
                Spatializer spatializer = this.a;
                Objects.requireNonNull(handler);
                spatializer.addOnSpatializerStateChangedListener(new gm4(handler), this.d);
            }
        }

        public boolean c() {
            boolean isAvailable;
            isAvailable = this.a.isAvailable();
            return isAvailable;
        }

        public boolean d() {
            boolean isEnabled;
            isEnabled = this.a.isEnabled();
            return isEnabled;
        }

        public boolean e() {
            return this.b;
        }

        public void f() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.d;
            if (spatializer$OnSpatializerStateChangedListener == null || this.c == null) {
                return;
            }
            this.a.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            ((Handler) z19.j(this.c)).removeCallbacksAndMessages(null);
            this.c = null;
            this.d = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g extends h implements Comparable {
        private final int e;
        private final boolean f;
        private final boolean g;
        private final boolean h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final boolean m;

        /* JADX WARN: Multi-variable type inference failed */
        public g(int i, up8 up8Var, int i2, d dVar, int i3, String str) {
            super(i, up8Var, i2);
            int i4;
            int i5 = 0;
            this.f = jk1.L(i3, false);
            int i6 = this.d.d & (~dVar.y);
            this.g = (i6 & 1) != 0;
            this.h = (i6 & 2) != 0;
            ImmutableList y = dVar.w.isEmpty() ? ImmutableList.y("") : dVar.w;
            int i7 = 0;
            while (true) {
                if (i7 >= y.size()) {
                    i7 = Integer.MAX_VALUE;
                    i4 = 0;
                    break;
                } else {
                    i4 = jk1.E(this.d, (String) y.get(i7), dVar.B);
                    if (i4 > 0) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            this.i = i7;
            this.j = i4;
            int H = jk1.H(this.d.e, dVar.x);
            this.k = H;
            this.m = (this.d.e & 1088) != 0;
            int E = jk1.E(this.d, str, jk1.U(str) == null);
            this.l = E;
            boolean z = i4 > 0 || (dVar.w.isEmpty() && H > 0) || this.g || (this.h && E > 0);
            if (jk1.L(i3, dVar.M0) && z) {
                i5 = 1;
            }
            this.e = i5;
        }

        public static int c(List list, List list2) {
            return ((g) list.get(0)).compareTo((g) list2.get(0));
        }

        public static ImmutableList e(int i, up8 up8Var, d dVar, int[] iArr, String str) {
            ImmutableList.a p = ImmutableList.p();
            for (int i2 = 0; i2 < up8Var.a; i2++) {
                p.a(new g(i, up8Var, i2, dVar, iArr[i2], str));
            }
            return p.k();
        }

        @Override // jk1.h
        public int a() {
            return this.e;
        }

        @Override // java.lang.Comparable
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            sp0 d = sp0.j().g(this.f, gVar.f).f(Integer.valueOf(this.i), Integer.valueOf(gVar.i), o.c().f()).d(this.j, gVar.j).d(this.k, gVar.k).g(this.g, gVar.g).f(Boolean.valueOf(this.h), Boolean.valueOf(gVar.h), this.j == 0 ? o.c() : o.c().f()).d(this.l, gVar.l);
            if (this.k == 0) {
                d = d.h(this.m, gVar.m);
            }
            return d.i();
        }

        @Override // jk1.h
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public boolean b(g gVar) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static abstract class h {
        public final int a;
        public final up8 b;
        public final int c;
        public final t0 d;

        public interface a {
            List a(int i, up8 up8Var, int[] iArr);
        }

        public h(int i, up8 up8Var, int i2) {
            this.a = i;
            this.b = up8Var;
            this.c = i2;
            this.d = up8Var.d(i2);
        }

        public abstract int a();

        public abstract boolean b(h hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class i extends h {
        private final boolean e;
        private final d f;
        private final boolean g;
        private final boolean h;
        private final int i;
        private final int j;
        private final int k;
        private final int l;
        private final boolean m;
        private final boolean n;
        private final int r;
        private final boolean s;
        private final boolean t;
        private final int u;

        /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x00b2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x00d5  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00c8 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public i(int r5, defpackage.up8 r6, int r7, jk1.d r8, int r9, int r10, boolean r11) {
            /*
                Method dump skipped, instructions count: 246
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: jk1.i.<init>(int, up8, int, jk1$d, int, int, boolean):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int e(i iVar, i iVar2) {
            sp0 g = sp0.j().g(iVar.h, iVar2.h).d(iVar.l, iVar2.l).g(iVar.m, iVar2.m).g(iVar.e, iVar2.e).g(iVar.g, iVar2.g).f(Integer.valueOf(iVar.k), Integer.valueOf(iVar2.k), o.c().f()).g(iVar.s, iVar2.s).g(iVar.t, iVar2.t);
            if (iVar.s && iVar.t) {
                g = g.d(iVar.u, iVar2.u);
            }
            return g.i();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int f(i iVar, i iVar2) {
            o f = (iVar.e && iVar.h) ? jk1.k : jk1.k.f();
            return sp0.j().f(Integer.valueOf(iVar.i), Integer.valueOf(iVar2.i), iVar.f.H ? jk1.k.f() : jk1.l).f(Integer.valueOf(iVar.j), Integer.valueOf(iVar2.j), f).f(Integer.valueOf(iVar.i), Integer.valueOf(iVar2.i), f).i();
        }

        public static int g(List list, List list2) {
            return sp0.j().f((i) Collections.max(list, new Comparator() { // from class: tk1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e;
                    e = jk1.i.e((jk1.i) obj, (jk1.i) obj2);
                    return e;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: tk1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e;
                    e = jk1.i.e((jk1.i) obj, (jk1.i) obj2);
                    return e;
                }
            }), new Comparator() { // from class: tk1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int e;
                    e = jk1.i.e((jk1.i) obj, (jk1.i) obj2);
                    return e;
                }
            }).d(list.size(), list2.size()).f((i) Collections.max(list, new Comparator() { // from class: uk1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f;
                    f = jk1.i.f((jk1.i) obj, (jk1.i) obj2);
                    return f;
                }
            }), (i) Collections.max(list2, new Comparator() { // from class: uk1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f;
                    f = jk1.i.f((jk1.i) obj, (jk1.i) obj2);
                    return f;
                }
            }), new Comparator() { // from class: uk1
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int f;
                    f = jk1.i.f((jk1.i) obj, (jk1.i) obj2);
                    return f;
                }
            }).i();
        }

        public static ImmutableList i(int i, up8 up8Var, d dVar, int[] iArr, int i2) {
            int F = jk1.F(up8Var, dVar.i, dVar.j, dVar.k);
            ImmutableList.a p = ImmutableList.p();
            for (int i3 = 0; i3 < up8Var.a; i3++) {
                int g = up8Var.d(i3).g();
                p.a(new i(i, up8Var, i3, dVar, iArr[i3], i2, F == Integer.MAX_VALUE || (g != -1 && g <= F)));
            }
            return p.k();
        }

        private int j(int i, int i2) {
            if ((this.d.e & Http2.INITIAL_MAX_FRAME_SIZE) != 0 || !jk1.L(i, this.f.M0)) {
                return 0;
            }
            if (!this.e && !this.f.C0) {
                return 0;
            }
            if (jk1.L(i, false) && this.g && this.e && this.d.h != -1) {
                d dVar = this.f;
                if (!dVar.L && !dVar.H && (i & i2) != 0) {
                    return 2;
                }
            }
            return 1;
        }

        @Override // jk1.h
        public int a() {
            return this.r;
        }

        @Override // jk1.h
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean b(i iVar) {
            return (this.n || z19.c(this.d.l, iVar.d.l)) && (this.f.F0 || (this.s == iVar.s && this.t == iVar.t));
        }
    }

    public jk1(Context context) {
        this(context, new k8.b());
    }

    private static void B(ye4.a aVar, d dVar, q72.a[] aVarArr) {
        int d2 = aVar.d();
        for (int i2 = 0; i2 < d2; i2++) {
            wp8 f2 = aVar.f(i2);
            if (dVar.N(i2, f2)) {
                e M = dVar.M(i2, f2);
                aVarArr[i2] = (M == null || M.b.length == 0) ? null : new q72.a(f2.c(M.a), M.b, M.d);
            }
        }
    }

    private static void C(ye4.a aVar, fq8 fq8Var, q72.a[] aVarArr) {
        int d2 = aVar.d();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < d2; i2++) {
            D(aVar.f(i2), fq8Var, hashMap);
        }
        D(aVar.h(), fq8Var, hashMap);
        for (int i3 = 0; i3 < d2; i3++) {
            dq8 dq8Var = (dq8) hashMap.get(Integer.valueOf(aVar.e(i3)));
            if (dq8Var != null) {
                aVarArr[i3] = (dq8Var.b.isEmpty() || aVar.f(i3).d(dq8Var.a) == -1) ? null : new q72.a(dq8Var.a, Ints.l(dq8Var.b));
            }
        }
    }

    private static void D(wp8 wp8Var, fq8 fq8Var, Map map) {
        dq8 dq8Var;
        for (int i2 = 0; i2 < wp8Var.a; i2++) {
            dq8 dq8Var2 = (dq8) fq8Var.M.get(wp8Var.c(i2));
            if (dq8Var2 != null && ((dq8Var = (dq8) map.get(Integer.valueOf(dq8Var2.c()))) == null || (dq8Var.b.isEmpty() && !dq8Var2.b.isEmpty()))) {
                map.put(Integer.valueOf(dq8Var2.c()), dq8Var2);
            }
        }
    }

    protected static int E(t0 t0Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(t0Var.c)) {
            return 4;
        }
        String U = U(str);
        String U2 = U(t0Var.c);
        if (U2 == null || U == null) {
            return (z && U2 == null) ? 1 : 0;
        }
        if (U2.startsWith(U) || U.startsWith(U2)) {
            return 3;
        }
        return z19.W0(U2, "-")[0].equals(z19.W0(U, "-")[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int F(up8 up8Var, int i2, int i3, boolean z) {
        int i4;
        int i5 = Integer.MAX_VALUE;
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            for (int i6 = 0; i6 < up8Var.a; i6++) {
                t0 d2 = up8Var.d(i6);
                int i7 = d2.t;
                if (i7 > 0 && (i4 = d2.u) > 0) {
                    Point G = G(z, i2, i3, i7, i4);
                    int i8 = d2.t;
                    int i9 = d2.u;
                    int i10 = i8 * i9;
                    if (i8 >= ((int) (G.x * 0.98f)) && i9 >= ((int) (G.y * 0.98f)) && i10 < i5) {
                        i5 = i10;
                    }
                }
            }
        }
        return i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
    
        if ((r6 > r7) != (r4 > r5)) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Point G(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto Lf
            r3 = 0
            r0 = 1
            if (r6 <= r7) goto L8
            r1 = r0
            goto L9
        L8:
            r1 = r3
        L9:
            if (r4 <= r5) goto Lc
            r3 = r0
        Lc:
            if (r1 == r3) goto Lf
            goto L12
        Lf:
            r2 = r5
            r5 = r4
            r4 = r2
        L12:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L22
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = defpackage.z19.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L22:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = defpackage.z19.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk1.G(boolean, int, int, int, int):android.graphics.Point");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int H(int i2, int i3) {
        if (i2 == 0 || i2 != i3) {
            return Integer.bitCount(i2 & i3);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int I(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J(t0 t0Var) {
        boolean z;
        f fVar;
        f fVar2;
        synchronized (this.d) {
            try {
                if (this.h.L0) {
                    if (!this.g) {
                        if (t0Var.M > 2) {
                            if (K(t0Var)) {
                                if (z19.a >= 32 && (fVar2 = this.i) != null && fVar2.e()) {
                                }
                            }
                            if (z19.a < 32 || (fVar = this.i) == null || !fVar.e() || !this.i.c() || !this.i.d() || !this.i.a(this.j, t0Var)) {
                                z = false;
                            }
                        }
                    }
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    private static boolean K(t0 t0Var) {
        String str = t0Var.l;
        if (str == null) {
            return false;
        }
        str.hashCode();
        switch (str) {
        }
        return false;
    }

    protected static boolean L(int i2, boolean z) {
        int I = a2.I(i2);
        return I == 4 || (z && I == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List M(d dVar, boolean z, int i2, up8 up8Var, int[] iArr) {
        return b.e(i2, up8Var, dVar, iArr, z, new i16() { // from class: ik1
            @Override // defpackage.i16
            public final boolean apply(Object obj) {
                boolean J;
                J = jk1.this.J((t0) obj);
                return J;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List N(d dVar, String str, int i2, up8 up8Var, int[] iArr) {
        return g.e(i2, up8Var, dVar, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List O(d dVar, int[] iArr, int i2, up8 up8Var, int[] iArr2) {
        return i.i(i2, up8Var, dVar, iArr2, iArr[i2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int P(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int Q(Integer num, Integer num2) {
        return 0;
    }

    private static void R(ye4.a aVar, int[][][] iArr, cx6[] cx6VarArr, q72[] q72VarArr) {
        boolean z;
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.d(); i4++) {
            int e2 = aVar.e(i4);
            q72 q72Var = q72VarArr[i4];
            if ((e2 == 1 || e2 == 2) && q72Var != null && V(iArr[i4], aVar.f(i4), q72Var)) {
                if (e2 == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z = true;
        if (i3 != -1 && i2 != -1) {
            z2 = true;
        }
        if (z && z2) {
            cx6 cx6Var = new cx6(true);
            cx6VarArr[i3] = cx6Var;
            cx6VarArr[i2] = cx6Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        boolean z;
        f fVar;
        synchronized (this.d) {
            try {
                z = this.h.L0 && !this.g && z19.a >= 32 && (fVar = this.i) != null && fVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            e();
        }
    }

    private void T(z1 z1Var) {
        boolean z;
        synchronized (this.d) {
            z = this.h.P0;
        }
        if (z) {
            f(z1Var);
        }
    }

    protected static String U(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    private static boolean V(int[][] iArr, wp8 wp8Var, q72 q72Var) {
        if (q72Var == null) {
            return false;
        }
        int d2 = wp8Var.d(q72Var.n());
        for (int i2 = 0; i2 < q72Var.length(); i2++) {
            if (a2.p(iArr[d2][q72Var.g(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private Pair a0(int i2, ye4.a aVar, int[][][] iArr, h.a aVar2, Comparator comparator) {
        int i3;
        RandomAccess randomAccess;
        ye4.a aVar3 = aVar;
        ArrayList arrayList = new ArrayList();
        int d2 = aVar.d();
        int i4 = 0;
        while (i4 < d2) {
            if (i2 == aVar3.e(i4)) {
                wp8 f2 = aVar3.f(i4);
                for (int i5 = 0; i5 < f2.a; i5++) {
                    up8 c2 = f2.c(i5);
                    List a2 = aVar2.a(i4, c2, iArr[i4][i5]);
                    boolean[] zArr = new boolean[c2.a];
                    int i6 = 0;
                    while (i6 < c2.a) {
                        h hVar = (h) a2.get(i6);
                        int a3 = hVar.a();
                        if (zArr[i6] || a3 == 0) {
                            i3 = d2;
                        } else {
                            if (a3 == 1) {
                                randomAccess = ImmutableList.y(hVar);
                                i3 = d2;
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(hVar);
                                int i7 = i6 + 1;
                                while (i7 < c2.a) {
                                    h hVar2 = (h) a2.get(i7);
                                    int i8 = d2;
                                    if (hVar2.a() == 2 && hVar.b(hVar2)) {
                                        arrayList2.add(hVar2);
                                        zArr[i7] = true;
                                    }
                                    i7++;
                                    d2 = i8;
                                }
                                i3 = d2;
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        d2 = i3;
                    }
                }
            }
            i4++;
            aVar3 = aVar;
            d2 = d2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            iArr2[i9] = ((h) list.get(i9)).c;
        }
        h hVar3 = (h) list.get(0);
        return Pair.create(new q72.a(hVar3.b, iArr2), Integer.valueOf(hVar3.a));
    }

    protected q72.a[] W(ye4.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        String str;
        int d2 = aVar.d();
        q72.a[] aVarArr = new q72.a[d2];
        Pair b0 = b0(aVar, iArr, iArr2, dVar);
        if (b0 != null) {
            aVarArr[((Integer) b0.second).intValue()] = (q72.a) b0.first;
        }
        Pair X = X(aVar, iArr, iArr2, dVar);
        if (X != null) {
            aVarArr[((Integer) X.second).intValue()] = (q72.a) X.first;
        }
        if (X == null) {
            str = null;
        } else {
            Object obj = X.first;
            str = ((q72.a) obj).a.d(((q72.a) obj).b[0]).c;
        }
        Pair Z = Z(aVar, iArr, dVar, str);
        if (Z != null) {
            aVarArr[((Integer) Z.second).intValue()] = (q72.a) Z.first;
        }
        for (int i2 = 0; i2 < d2; i2++) {
            int e2 = aVar.e(i2);
            if (e2 != 2 && e2 != 1 && e2 != 3) {
                aVarArr[i2] = Y(e2, aVar.f(i2), iArr[i2], dVar);
            }
        }
        return aVarArr;
    }

    protected Pair X(ye4.a aVar, int[][][] iArr, int[] iArr2, final d dVar) {
        final boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 < aVar.d()) {
                if (2 == aVar.e(i2) && aVar.f(i2).a > 0) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return a0(1, aVar, iArr, new h.a() { // from class: ek1
            @Override // jk1.h.a
            public final List a(int i3, up8 up8Var, int[] iArr3) {
                List M;
                M = jk1.this.M(dVar, z, i3, up8Var, iArr3);
                return M;
            }
        }, new Comparator() { // from class: fk1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jk1.b.c((List) obj, (List) obj2);
            }
        });
    }

    protected q72.a Y(int i2, wp8 wp8Var, int[][] iArr, d dVar) {
        up8 up8Var = null;
        c cVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < wp8Var.a; i4++) {
            up8 c2 = wp8Var.c(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < c2.a; i5++) {
                if (L(iArr2[i5], dVar.M0)) {
                    c cVar2 = new c(c2.d(i5), iArr2[i5]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        up8Var = c2;
                        i3 = i5;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (up8Var == null) {
            return null;
        }
        return new q72.a(up8Var, i3);
    }

    protected Pair Z(ye4.a aVar, int[][][] iArr, final d dVar, final String str) {
        return a0(3, aVar, iArr, new h.a() { // from class: gk1
            @Override // jk1.h.a
            public final List a(int i2, up8 up8Var, int[] iArr2) {
                List N;
                N = jk1.N(jk1.d.this, str, i2, up8Var, iArr2);
                return N;
            }
        }, new Comparator() { // from class: hk1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jk1.g.c((List) obj, (List) obj2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.a2.a
    public void a(z1 z1Var) {
        T(z1Var);
    }

    protected Pair b0(ye4.a aVar, int[][][] iArr, final int[] iArr2, final d dVar) {
        return a0(2, aVar, iArr, new h.a() { // from class: ck1
            @Override // jk1.h.a
            public final List a(int i2, up8 up8Var, int[] iArr3) {
                List O;
                O = jk1.O(jk1.d.this, iArr2, i2, up8Var, iArr3);
                return O;
            }
        }, new Comparator() { // from class: dk1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jk1.i.g((List) obj, (List) obj2);
            }
        });
    }

    @Override // defpackage.hq8
    public a2.a c() {
        return this;
    }

    @Override // defpackage.hq8
    public boolean g() {
        return true;
    }

    @Override // defpackage.hq8
    public void i() {
        f fVar;
        synchronized (this.d) {
            try {
                if (z19.a >= 32 && (fVar = this.i) != null) {
                    fVar.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.i();
    }

    @Override // defpackage.hq8
    public void k(com.google.android.exoplayer2.audio.a aVar) {
        boolean equals;
        synchronized (this.d) {
            equals = this.j.equals(aVar);
            this.j = aVar;
        }
        if (equals) {
            return;
        }
        S();
    }

    @Override // defpackage.ye4
    protected final Pair o(ye4.a aVar, int[][][] iArr, int[] iArr2, o.b bVar, g2 g2Var) {
        d dVar;
        f fVar;
        synchronized (this.d) {
            try {
                dVar = this.h;
                if (dVar.L0 && z19.a >= 32 && (fVar = this.i) != null) {
                    fVar.b(this, (Looper) ur.i(Looper.myLooper()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int d2 = aVar.d();
        q72.a[] W = W(aVar, iArr, iArr2, dVar);
        C(aVar, dVar, W);
        B(aVar, dVar, W);
        for (int i2 = 0; i2 < d2; i2++) {
            int e2 = aVar.e(i2);
            if (dVar.L(i2) || dVar.N.contains(Integer.valueOf(e2))) {
                W[i2] = null;
            }
        }
        q72[] a2 = this.f.a(W, b(), bVar, g2Var);
        cx6[] cx6VarArr = new cx6[d2];
        for (int i3 = 0; i3 < d2; i3++) {
            cx6VarArr[i3] = (dVar.L(i3) || dVar.N.contains(Integer.valueOf(aVar.e(i3))) || (aVar.e(i3) != -2 && a2[i3] == null)) ? null : cx6.b;
        }
        if (dVar.N0) {
            R(aVar, iArr, cx6VarArr, a2);
        }
        return Pair.create(cx6VarArr, a2);
    }

    public jk1(Context context, q72.b bVar) {
        this(context, d.J(context), bVar);
    }

    public jk1(Context context, fq8 fq8Var, q72.b bVar) {
        this(fq8Var, bVar, context);
    }

    private jk1(fq8 fq8Var, q72.b bVar, Context context) {
        this.d = new Object();
        this.e = context != null ? context.getApplicationContext() : null;
        this.f = bVar;
        if (fq8Var instanceof d) {
            this.h = (d) fq8Var;
        } else {
            this.h = (context == null ? d.S0 : d.J(context)).I().c0(fq8Var).A();
        }
        this.j = com.google.android.exoplayer2.audio.a.g;
        boolean z = context != null && z19.z0(context);
        this.g = z;
        if (!z && context != null && z19.a >= 32) {
            this.i = f.g(context);
        }
        if (this.h.L0 && context == null) {
            a84.j("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }
}
