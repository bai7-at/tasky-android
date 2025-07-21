package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.collection.IdentityArraySet;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.y08;
import defpackage.zq3;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public class a extends e {
    private static final C0054a p = new C0054a(null);
    public static final int q = 8;
    private static final int[] r = new int[0];
    private final ss2 g;
    private final ss2 h;
    private int i;
    private IdentityArraySet j;
    private List k;
    private SnapshotIdSet l;
    private int[] m;
    private int n;
    private boolean o;

    /* renamed from: androidx.compose.runtime.snapshots.a$a, reason: collision with other inner class name */
    private static final class C0054a {
        public /* synthetic */ C0054a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0054a() {
        }
    }

    public a(int i, SnapshotIdSet snapshotIdSet, ss2 ss2Var, ss2 ss2Var2) {
        super(i, snapshotIdSet, null);
        this.g = ss2Var;
        this.h = ss2Var2;
        this.l = SnapshotIdSet.e.a();
        this.m = r;
        this.n = 1;
    }

    private final void A() {
        IdentityArraySet E = E();
        if (E != null) {
            Q();
            O(null);
            int f = f();
            Object[] j = E.j();
            int size = E.size();
            for (int i = 0; i < size; i++) {
                Object obj = j[i];
                zq3.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                for (q o = ((y08) obj).o(); o != null; o = o.e()) {
                    if (o.f() == f || kotlin.collections.i.c0(this.l, Integer.valueOf(o.f()))) {
                        o.h(0);
                    }
                }
            }
        }
        b();
    }

    private final void M() {
        int length = this.m.length;
        for (int i = 0; i < length; i++) {
            SnapshotKt.Y(this.m[i]);
        }
    }

    private final void Q() {
        if (this.o) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied");
        }
    }

    private final void R() {
        int i;
        if (this.o) {
            i = ((e) this).d;
            if (i < 0) {
                throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot");
            }
        }
    }

    public final void B() {
        int i;
        SnapshotIdSet snapshotIdSet;
        I(f());
        ww8 ww8Var = ww8.a;
        if (D() || e()) {
            return;
        }
        int f = f();
        synchronized (SnapshotKt.I()) {
            i = SnapshotKt.e;
            SnapshotKt.e = i + 1;
            u(i);
            snapshotIdSet = SnapshotKt.d;
            SnapshotKt.d = snapshotIdSet.u(f());
        }
        v(SnapshotKt.z(g(), f + 1, f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7 A[LOOP:0: B:25:0x00c5->B:26:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2 A[LOOP:1: B:32:0x00e0->B:33:0x00e2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.snapshots.f C() {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.C():androidx.compose.runtime.snapshots.f");
    }

    public final boolean D() {
        return this.o;
    }

    public IdentityArraySet E() {
        return this.j;
    }

    public final SnapshotIdSet F() {
        return this.l;
    }

    public final int[] G() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0042, code lost:
    
        r15 = androidx.compose.runtime.snapshots.SnapshotKt.W(r11, f(), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.snapshots.f H(int r19, java.util.Map r20, androidx.compose.runtime.snapshots.SnapshotIdSet r21) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.a.H(int, java.util.Map, androidx.compose.runtime.snapshots.SnapshotIdSet):androidx.compose.runtime.snapshots.f");
    }

    public final void I(int i) {
        synchronized (SnapshotKt.I()) {
            this.l = this.l.u(i);
            ww8 ww8Var = ww8.a;
        }
    }

    public final void J(SnapshotIdSet snapshotIdSet) {
        synchronized (SnapshotKt.I()) {
            this.l = this.l.t(snapshotIdSet);
            ww8 ww8Var = ww8.a;
        }
    }

    public final void K(int i) {
        if (i >= 0) {
            this.m = kotlin.collections.d.y(this.m, i);
        }
    }

    public final void L(int[] iArr) {
        if (iArr.length == 0) {
            return;
        }
        int[] iArr2 = this.m;
        if (iArr2.length != 0) {
            iArr = kotlin.collections.d.z(iArr2, iArr);
        }
        this.m = iArr;
    }

    public final void N(boolean z) {
        this.o = z;
    }

    public void O(IdentityArraySet identityArraySet) {
        this.j = identityArraySet;
    }

    public a P(ss2 ss2Var, ss2 ss2Var2) {
        int i;
        SnapshotIdSet snapshotIdSet;
        b bVar;
        ss2 M;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        z();
        R();
        I(f());
        synchronized (SnapshotKt.I()) {
            i = SnapshotKt.e;
            SnapshotKt.e = i + 1;
            snapshotIdSet = SnapshotKt.d;
            SnapshotKt.d = snapshotIdSet.u(i);
            SnapshotIdSet g = g();
            v(g.u(i));
            SnapshotIdSet z = SnapshotKt.z(g, f() + 1, i);
            ss2 L = SnapshotKt.L(ss2Var, h(), false, 4, null);
            M = SnapshotKt.M(ss2Var2, k());
            bVar = new b(i, z, L, M, this);
        }
        if (!D() && !e()) {
            int f = f();
            synchronized (SnapshotKt.I()) {
                i2 = SnapshotKt.e;
                SnapshotKt.e = i2 + 1;
                u(i2);
                snapshotIdSet2 = SnapshotKt.d;
                SnapshotKt.d = snapshotIdSet2.u(f());
                ww8 ww8Var = ww8.a;
            }
            v(SnapshotKt.z(g(), f + 1, f()));
        }
        return bVar;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void c() {
        SnapshotIdSet snapshotIdSet;
        snapshotIdSet = SnapshotKt.d;
        SnapshotKt.d = snapshotIdSet.o(f()).n(this.l);
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void d() {
        if (e()) {
            return;
        }
        super.d();
        n(this);
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 h() {
        return this.g;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public boolean i() {
        return false;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public int j() {
        return this.i;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public ss2 k() {
        return this.h;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void m(e eVar) {
        this.n++;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void n(e eVar) {
        int i = this.n;
        if (i <= 0) {
            throw new IllegalArgumentException("no pending nested snapshots");
        }
        int i2 = i - 1;
        this.n = i2;
        if (i2 != 0 || this.o) {
            return;
        }
        A();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void o() {
        if (this.o || e()) {
            return;
        }
        B();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void p(y08 y08Var) {
        IdentityArraySet E = E();
        if (E == null) {
            E = new IdentityArraySet();
            O(E);
        }
        E.add(y08Var);
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void r() {
        M();
        super.r();
    }

    @Override // androidx.compose.runtime.snapshots.e
    public void w(int i) {
        this.i = i;
    }

    @Override // androidx.compose.runtime.snapshots.e
    public e x(ss2 ss2Var) {
        int i;
        SnapshotIdSet snapshotIdSet;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        int i2;
        SnapshotIdSet snapshotIdSet2;
        z();
        R();
        int f = f();
        I(f());
        synchronized (SnapshotKt.I()) {
            i = SnapshotKt.e;
            SnapshotKt.e = i + 1;
            snapshotIdSet = SnapshotKt.d;
            SnapshotKt.d = snapshotIdSet.u(i);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(i, SnapshotKt.z(g(), f + 1, i), ss2Var, this);
        }
        if (!D() && !e()) {
            int f2 = f();
            synchronized (SnapshotKt.I()) {
                i2 = SnapshotKt.e;
                SnapshotKt.e = i2 + 1;
                u(i2);
                snapshotIdSet2 = SnapshotKt.d;
                SnapshotKt.d = snapshotIdSet2.u(f());
                ww8 ww8Var = ww8.a;
            }
            v(SnapshotKt.z(g(), f2 + 1, f()));
        }
        return nestedReadonlySnapshot;
    }
}
