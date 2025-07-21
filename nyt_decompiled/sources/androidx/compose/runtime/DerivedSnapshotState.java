package androidx.compose.runtime;

import androidx.compose.runtime.f;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.e;
import defpackage.dn3;
import defpackage.jy4;
import defpackage.pm1;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tw7;
import defpackage.u5;
import defpackage.vy4;
import defpackage.ww7;
import defpackage.ww8;
import defpackage.y08;
import defpackage.yb5;
import defpackage.z08;
import defpackage.zb5;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class DerivedSnapshotState extends z08 implements f {
    private final qs2 a;
    private final tw7 b;
    private a c = new a();

    public static final class a extends androidx.compose.runtime.snapshots.q implements f.a {
        public static final C0051a h = new C0051a(null);
        public static final int i = 8;
        private static final Object j = new Object();
        private int c;
        private int d;
        private yb5 e = zb5.a();
        private Object f = j;
        private int g;

        /* renamed from: androidx.compose.runtime.DerivedSnapshotState$a$a, reason: collision with other inner class name */
        public static final class C0051a {
            public /* synthetic */ C0051a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object a() {
                return a.j;
            }

            private C0051a() {
            }
        }

        @Override // androidx.compose.runtime.f.a
        public Object a() {
            return this.f;
        }

        @Override // androidx.compose.runtime.f.a
        public yb5 b() {
            return this.e;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public void c(androidx.compose.runtime.snapshots.q qVar) {
            zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            a aVar = (a) qVar;
            m(aVar.b());
            this.f = aVar.f;
            this.g = aVar.g;
        }

        @Override // androidx.compose.runtime.snapshots.q
        public androidx.compose.runtime.snapshots.q d() {
            return new a();
        }

        public final Object j() {
            return this.f;
        }

        public final boolean k(f fVar, androidx.compose.runtime.snapshots.e eVar) {
            boolean z;
            boolean z2;
            synchronized (SnapshotKt.I()) {
                z = true;
                if (this.c == eVar.f()) {
                    if (this.d == eVar.j()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.f == j || (z2 && this.g != l(fVar, eVar))) {
                z = false;
            }
            if (z && z2) {
                synchronized (SnapshotKt.I()) {
                    this.c = eVar.f();
                    this.d = eVar.j();
                    ww8 ww8Var = ww8.a;
                }
            }
            return z;
        }

        public final int l(f fVar, androidx.compose.runtime.snapshots.e eVar) {
            yb5 b;
            int i2;
            int i3;
            synchronized (SnapshotKt.I()) {
                b = b();
            }
            char c = 7;
            if (!b.g()) {
                return 7;
            }
            vy4 c2 = y.c();
            int q = c2.q();
            if (q > 0) {
                Object[] p = c2.p();
                int i4 = 0;
                do {
                    ((pm1) p[i4]).b(fVar);
                    i4++;
                } while (i4 < q);
            }
            try {
                Object[] objArr = b.b;
                int[] iArr = b.c;
                long[] jArr = b.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 7;
                    int i6 = 0;
                    while (true) {
                        long j2 = jArr[i6];
                        if ((((~j2) << c) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8;
                            int i8 = 8 - ((~(i6 - length)) >>> 31);
                            int i9 = 0;
                            while (i9 < i8) {
                                if ((j2 & 255) < 128) {
                                    int i10 = (i6 << 3) + i9;
                                    y08 y08Var = (y08) objArr[i10];
                                    if (iArr[i10] == 1) {
                                        androidx.compose.runtime.snapshots.q D = y08Var instanceof DerivedSnapshotState ? ((DerivedSnapshotState) y08Var).D(eVar) : SnapshotKt.G(y08Var.o(), eVar);
                                        i5 = (((i5 * 31) + u5.c(D)) * 31) + D.f();
                                    }
                                    i3 = 8;
                                } else {
                                    i3 = i7;
                                }
                                j2 >>= i3;
                                i9++;
                                i7 = i3;
                            }
                            if (i8 != i7) {
                                break;
                            }
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        c = 7;
                    }
                    i2 = i5;
                } else {
                    i2 = 7;
                }
                ww8 ww8Var = ww8.a;
                int q2 = c2.q();
                if (q2 <= 0) {
                    return i2;
                }
                Object[] p2 = c2.p();
                int i11 = 0;
                do {
                    ((pm1) p2[i11]).a(fVar);
                    i11++;
                } while (i11 < q2);
                return i2;
            } catch (Throwable th) {
                int q3 = c2.q();
                if (q3 > 0) {
                    Object[] p3 = c2.p();
                    int i12 = 0;
                    do {
                        ((pm1) p3[i12]).a(fVar);
                        i12++;
                    } while (i12 < q3);
                }
                throw th;
            }
        }

        public void m(yb5 yb5Var) {
            this.e = yb5Var;
        }

        public final void n(Object obj) {
            this.f = obj;
        }

        public final void o(int i2) {
            this.g = i2;
        }

        public final void p(int i2) {
            this.c = i2;
        }

        public final void q(int i2) {
            this.d = i2;
        }
    }

    public DerivedSnapshotState(qs2 qs2Var, tw7 tw7Var) {
        this.a = qs2Var;
        this.b = tw7Var;
    }

    private final a E(a aVar, androidx.compose.runtime.snapshots.e eVar, boolean z, qs2 qs2Var) {
        ww7 ww7Var;
        e.a aVar2;
        ww7 ww7Var2;
        tw7 c;
        ww7 ww7Var3;
        ww7 ww7Var4;
        int i;
        int i2;
        ww7 ww7Var5;
        a aVar3 = aVar;
        int i3 = 1;
        if (!aVar3.k(this, eVar)) {
            int i4 = 0;
            final jy4 jy4Var = new jy4(0, 1, null);
            ww7Var = z.a;
            final dn3 dn3Var = (dn3) ww7Var.a();
            if (dn3Var == null) {
                dn3Var = new dn3(0);
                ww7Var3 = z.a;
                ww7Var3.b(dn3Var);
            }
            final int a2 = dn3Var.a();
            vy4 c2 = y.c();
            int q = c2.q();
            if (q > 0) {
                Object[] p = c2.p();
                int i5 = 0;
                while (true) {
                    ((pm1) p[i5]).b(this);
                    int i6 = i5 + 1;
                    if (i6 >= q) {
                        break;
                    }
                    i5 = i6;
                }
            }
            try {
                dn3Var.b(a2 + 1);
                Object f = androidx.compose.runtime.snapshots.e.e.f(new ss2() { // from class: androidx.compose.runtime.DerivedSnapshotState$currentRecord$result$1$1$result$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m53invoke(obj);
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m53invoke(Object obj) {
                        if (obj == DerivedSnapshotState.this) {
                            throw new IllegalStateException("A derived state calculation cannot read itself");
                        }
                        if (obj instanceof y08) {
                            int a3 = dn3Var.a();
                            jy4 jy4Var2 = jy4Var;
                            jy4Var2.q(obj, Math.min(a3 - a2, jy4Var2.d(obj, Integer.MAX_VALUE)));
                        }
                    }
                }, null, qs2Var);
                dn3Var.b(a2);
                int q2 = c2.q();
                if (q2 > 0) {
                    Object[] p2 = c2.p();
                    do {
                        ((pm1) p2[i4]).a(this);
                        i4++;
                    } while (i4 < q2);
                }
                synchronized (SnapshotKt.I()) {
                    try {
                        aVar2 = androidx.compose.runtime.snapshots.e.e;
                        androidx.compose.runtime.snapshots.e d = aVar2.d();
                        if (aVar.j() == a.h.a() || (c = c()) == null || !c.b(f, aVar.j())) {
                            aVar3 = (a) SnapshotKt.O(this.c, this, d);
                            aVar3.m(jy4Var);
                            aVar3.o(aVar3.l(this, d));
                            aVar3.p(eVar.f());
                            aVar3.q(eVar.j());
                            aVar3.n(f);
                        } else {
                            aVar3.m(jy4Var);
                            aVar3.o(aVar3.l(this, d));
                            aVar3.p(eVar.f());
                            aVar3.q(eVar.j());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                ww7Var2 = z.a;
                dn3 dn3Var2 = (dn3) ww7Var2.a();
                if (dn3Var2 != null && dn3Var2.a() == 0) {
                    aVar2.e();
                }
                return aVar3;
            } catch (Throwable th2) {
                int q3 = c2.q();
                if (q3 > 0) {
                    Object[] p3 = c2.p();
                    int i7 = 0;
                    do {
                        ((pm1) p3[i7]).a(this);
                        i7++;
                    } while (i7 < q3);
                }
                throw th2;
            }
        }
        if (z) {
            vy4 c3 = y.c();
            int q4 = c3.q();
            if (q4 > 0) {
                Object[] p4 = c3.p();
                int i8 = 0;
                do {
                    ((pm1) p4[i8]).b(this);
                    i8++;
                } while (i8 < q4);
            }
            try {
                yb5 b = aVar.b();
                ww7Var4 = z.a;
                dn3 dn3Var3 = (dn3) ww7Var4.a();
                if (dn3Var3 == null) {
                    dn3Var3 = new dn3(0);
                    ww7Var5 = z.a;
                    ww7Var5.b(dn3Var3);
                }
                int a3 = dn3Var3.a();
                Object[] objArr = b.b;
                int[] iArr = b.c;
                long[] jArr = b.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j = jArr[i9];
                        long[] jArr2 = jArr;
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8;
                            int i11 = 8 - ((~(i9 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((j & 255) < 128) {
                                    int i13 = (i9 << 3) + i12;
                                    y08 y08Var = (y08) objArr[i13];
                                    dn3Var3.b(a3 + iArr[i13]);
                                    ss2 h = eVar.h();
                                    if (h != null) {
                                        h.invoke(y08Var);
                                    }
                                    i2 = 8;
                                } else {
                                    i2 = i10;
                                }
                                j >>= i2;
                                i12++;
                                i10 = i2;
                                i3 = 1;
                            }
                            int i14 = i10;
                            i = i3;
                            if (i11 != i14) {
                                break;
                            }
                        } else {
                            i = i3;
                        }
                        if (i9 == length) {
                            break;
                        }
                        i9 += i;
                        i3 = i;
                        jArr = jArr2;
                    }
                }
                dn3Var3.b(a3);
                ww8 ww8Var = ww8.a;
                int q5 = c3.q();
                if (q5 > 0) {
                    Object[] p5 = c3.p();
                    int i15 = 0;
                    do {
                        ((pm1) p5[i15]).a(this);
                        i15++;
                    } while (i15 < q5);
                }
            } catch (Throwable th3) {
                int q6 = c3.q();
                if (q6 > 0) {
                    Object[] p6 = c3.p();
                    int i16 = 0;
                    do {
                        ((pm1) p6[i16]).a(this);
                        i16++;
                    } while (i16 < q6);
                }
                throw th3;
            }
        }
        return aVar3;
    }

    private final String F() {
        a aVar = (a) SnapshotKt.F(this.c);
        return aVar.k(this, androidx.compose.runtime.snapshots.e.e.d()) ? String.valueOf(aVar.j()) : "<Not calculated>";
    }

    public final androidx.compose.runtime.snapshots.q D(androidx.compose.runtime.snapshots.e eVar) {
        return E((a) SnapshotKt.G(this.c, eVar), eVar, false, this.a);
    }

    @Override // androidx.compose.runtime.f
    public tw7 c() {
        return this.b;
    }

    @Override // defpackage.x08
    public Object getValue() {
        e.a aVar = androidx.compose.runtime.snapshots.e.e;
        ss2 h = aVar.d().h();
        if (h != null) {
            h.invoke(this);
        }
        return E((a) SnapshotKt.F(this.c), aVar.d(), true, this.a).j();
    }

    @Override // defpackage.y08
    public void n(androidx.compose.runtime.snapshots.q qVar) {
        zq3.f(qVar, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.c = (a) qVar;
    }

    @Override // defpackage.y08
    public androidx.compose.runtime.snapshots.q o() {
        return this.c;
    }

    public String toString() {
        return "DerivedState(value=" + F() + ")@" + hashCode();
    }

    @Override // androidx.compose.runtime.f
    public f.a z() {
        return E((a) SnapshotKt.F(this.c), androidx.compose.runtime.snapshots.e.e.d(), false, this.a);
    }
}
