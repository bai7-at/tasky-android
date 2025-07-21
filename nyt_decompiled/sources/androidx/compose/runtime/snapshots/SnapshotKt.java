package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.AtomicInt;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.compose.runtime.snapshots.e;
import defpackage.ed9;
import defpackage.gt2;
import defpackage.mw7;
import defpackage.ss2;
import defpackage.ww7;
import defpackage.ww8;
import defpackage.xw7;
import defpackage.y08;
import defpackage.zq3;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* loaded from: classes.dex */
public abstract class SnapshotKt {
    private static final ss2 a = new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        public final void b(SnapshotIdSet snapshotIdSet) {
        }

        @Override // defpackage.ss2
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((SnapshotIdSet) obj);
            return ww8.a;
        }
    };
    private static final ww7 b = new ww7();
    private static final Object c = new Object();
    private static SnapshotIdSet d;
    private static int e;
    private static final mw7 f;
    private static final xw7 g;
    private static List h;
    private static List i;
    private static final AtomicReference j;
    private static final e k;
    private static AtomicInt l;

    static {
        SnapshotIdSet.a aVar = SnapshotIdSet.e;
        d = aVar.a();
        e = 1;
        f = new mw7();
        g = new xw7();
        h = kotlin.collections.i.l();
        i = kotlin.collections.i.l();
        int i2 = e;
        e = i2 + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i2, aVar.a());
        d = d.u(globalSnapshot.f());
        AtomicReference atomicReference = new AtomicReference(globalSnapshot);
        j = atomicReference;
        k = (e) atomicReference.get();
        l = new AtomicInt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object A(ss2 ss2Var) {
        Object obj;
        IdentityArraySet E;
        Object a0;
        e eVar = k;
        zq3.f(eVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        synchronized (I()) {
            try {
                obj = j.get();
                E = ((GlobalSnapshot) obj).E();
                if (E != null) {
                    l.a(1);
                }
                a0 = a0((e) obj, ss2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (E != null) {
            try {
                List list = h;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((gt2) list.get(i2)).invoke(E, obj);
                }
            } finally {
                l.a(-1);
            }
        }
        synchronized (I()) {
            try {
                C();
                if (E != null) {
                    Object[] j2 = E.j();
                    int size2 = E.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        Object obj2 = j2[i3];
                        zq3.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                        U((y08) obj2);
                    }
                    ww8 ww8Var = ww8.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B() {
        A(new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$advanceGlobalSnapshot$3
            public final void b(SnapshotIdSet snapshotIdSet) {
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((SnapshotIdSet) obj);
                return ww8.a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C() {
        xw7 xw7Var = g;
        int e2 = xw7Var.e();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= e2) {
                break;
            }
            ed9 ed9Var = xw7Var.f()[i2];
            Object obj = ed9Var != null ? ed9Var.get() : null;
            if (obj != null && T((y08) obj)) {
                if (i3 != i2) {
                    xw7Var.f()[i3] = ed9Var;
                    xw7Var.d()[i3] = xw7Var.d()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i4 = i3; i4 < e2; i4++) {
            xw7Var.f()[i4] = null;
            xw7Var.d()[i4] = 0;
        }
        if (i3 != e2) {
            xw7Var.g(i3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e D(e eVar, ss2 ss2Var, boolean z) {
        boolean z2 = eVar instanceof a;
        if (z2 || eVar == null) {
            return new s(z2 ? (a) eVar : null, ss2Var, null, false, z);
        }
        return new t(eVar, ss2Var, false, z);
    }

    static /* synthetic */ e E(e eVar, ss2 ss2Var, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            ss2Var = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return D(eVar, ss2Var, z);
    }

    public static final q F(q qVar) {
        q W;
        e.a aVar = e.e;
        e d2 = aVar.d();
        q W2 = W(qVar, d2.f(), d2.g());
        if (W2 != null) {
            return W2;
        }
        synchronized (I()) {
            e d3 = aVar.d();
            W = W(qVar, d3.f(), d3.g());
        }
        if (W != null) {
            return W;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final q G(q qVar, e eVar) {
        q W = W(qVar, eVar.f(), eVar.g());
        if (W != null) {
            return W;
        }
        V();
        throw new KotlinNothingValueException();
    }

    public static final e H() {
        e eVar = (e) b.a();
        return eVar == null ? (e) j.get() : eVar;
    }

    public static final Object I() {
        return c;
    }

    public static final e J() {
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss2 K(final ss2 ss2Var, final ss2 ss2Var2, boolean z) {
        if (!z) {
            ss2Var2 = null;
        }
        return (ss2Var == null || ss2Var2 == null || zq3.c(ss2Var, ss2Var2)) ? ss2Var == null ? ss2Var2 : ss2Var : new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m62invoke(obj);
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m62invoke(Object obj) {
                ss2.this.invoke(obj);
                ss2Var2.invoke(obj);
            }
        };
    }

    static /* synthetic */ ss2 L(ss2 ss2Var, ss2 ss2Var2, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = true;
        }
        return K(ss2Var, ss2Var2, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ss2 M(final ss2 ss2Var, final ss2 ss2Var2) {
        return (ss2Var == null || ss2Var2 == null || zq3.c(ss2Var, ss2Var2)) ? ss2Var == null ? ss2Var2 : ss2Var : new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m63invoke(obj);
                return ww8.a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m63invoke(Object obj) {
                ss2.this.invoke(obj);
                ss2Var2.invoke(obj);
            }
        };
    }

    public static final q N(q qVar, y08 y08Var) {
        q d0 = d0(y08Var);
        if (d0 != null) {
            d0.h(Integer.MAX_VALUE);
            return d0;
        }
        q d2 = qVar.d();
        d2.h(Integer.MAX_VALUE);
        d2.g(y08Var.o());
        zq3.f(d2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$15");
        y08Var.n(d2);
        zq3.f(d2, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return d2;
    }

    public static final q O(q qVar, y08 y08Var, e eVar) {
        q P;
        synchronized (I()) {
            P = P(qVar, y08Var, eVar);
        }
        return P;
    }

    private static final q P(q qVar, y08 y08Var, e eVar) {
        q N = N(qVar, y08Var);
        N.c(qVar);
        N.h(eVar.f());
        return N;
    }

    public static final void Q(e eVar, y08 y08Var) {
        eVar.w(eVar.j() + 1);
        ss2 k2 = eVar.k();
        if (k2 != null) {
            k2.invoke(y08Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map R(a aVar, a aVar2, SnapshotIdSet snapshotIdSet) {
        q W;
        IdentityArraySet E = aVar2.E();
        int f2 = aVar.f();
        if (E == null) {
            return null;
        }
        SnapshotIdSet t = aVar2.g().u(aVar2.f()).t(aVar2.F());
        Object[] j2 = E.j();
        int size = E.size();
        HashMap hashMap = null;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = j2[i2];
            zq3.f(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            y08 y08Var = (y08) obj;
            q o = y08Var.o();
            q W2 = W(o, f2, snapshotIdSet);
            if (W2 != null && (W = W(o, f2, t)) != null && !zq3.c(W2, W)) {
                q W3 = W(o, aVar2.f(), aVar2.g());
                if (W3 == null) {
                    V();
                    throw new KotlinNothingValueException();
                }
                q t2 = y08Var.t(W, W2, W3);
                if (t2 == null) {
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(W2, t2);
                hashMap = hashMap;
            }
        }
        return hashMap;
    }

    public static final q S(q qVar, y08 y08Var, e eVar, q qVar2) {
        q N;
        if (eVar.i()) {
            eVar.p(y08Var);
        }
        int f2 = eVar.f();
        if (qVar2.f() == f2) {
            return qVar2;
        }
        synchronized (I()) {
            N = N(qVar, y08Var);
        }
        N.h(f2);
        eVar.p(y08Var);
        return N;
    }

    private static final boolean T(y08 y08Var) {
        q qVar;
        int e2 = f.e(e);
        q qVar2 = null;
        q qVar3 = null;
        int i2 = 0;
        for (q o = y08Var.o(); o != null; o = o.e()) {
            int f2 = o.f();
            if (f2 != 0) {
                if (f2 >= e2) {
                    i2++;
                } else if (qVar2 == null) {
                    i2++;
                    qVar2 = o;
                } else {
                    if (o.f() < qVar2.f()) {
                        qVar = qVar2;
                        qVar2 = o;
                    } else {
                        qVar = o;
                    }
                    if (qVar3 == null) {
                        qVar3 = y08Var.o();
                        q qVar4 = qVar3;
                        while (true) {
                            if (qVar3 == null) {
                                qVar3 = qVar4;
                                break;
                            }
                            if (qVar3.f() >= e2) {
                                break;
                            }
                            if (qVar4.f() < qVar3.f()) {
                                qVar4 = qVar3;
                            }
                            qVar3 = qVar3.e();
                        }
                    }
                    qVar2.h(0);
                    qVar2.c(qVar3);
                    qVar2 = qVar;
                }
            }
        }
        return i2 > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(y08 y08Var) {
        if (T(y08Var)) {
            g.a(y08Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void V() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q W(q qVar, int i2, SnapshotIdSet snapshotIdSet) {
        q qVar2 = null;
        while (qVar != null) {
            if (f0(qVar, i2, snapshotIdSet) && (qVar2 == null || qVar2.f() < qVar.f())) {
                qVar2 = qVar;
            }
            qVar = qVar.e();
        }
        if (qVar2 != null) {
            return qVar2;
        }
        return null;
    }

    public static final q X(q qVar, y08 y08Var) {
        q W;
        e.a aVar = e.e;
        e d2 = aVar.d();
        ss2 h2 = d2.h();
        if (h2 != null) {
            h2.invoke(y08Var);
        }
        q W2 = W(qVar, d2.f(), d2.g());
        if (W2 != null) {
            return W2;
        }
        synchronized (I()) {
            e d3 = aVar.d();
            q o = y08Var.o();
            zq3.f(o, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
            W = W(o, d3.f(), d3.g());
            if (W == null) {
                V();
                throw new KotlinNothingValueException();
            }
        }
        return W;
    }

    public static final void Y(int i2) {
        f.f(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void Z() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object a0(e eVar, ss2 ss2Var) {
        Object invoke = ss2Var.invoke(d.o(eVar.f()));
        synchronized (I()) {
            int i2 = e;
            e = i2 + 1;
            d = d.o(eVar.f());
            j.set(new GlobalSnapshot(i2, d));
            eVar.d();
            d = d.u(i2);
            ww8 ww8Var = ww8.a;
        }
        return invoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e b0(final ss2 ss2Var) {
        return (e) A(new ss2() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final e invoke(SnapshotIdSet snapshotIdSet) {
                SnapshotIdSet snapshotIdSet2;
                e eVar = (e) ss2.this.invoke(snapshotIdSet);
                synchronized (SnapshotKt.I()) {
                    snapshotIdSet2 = SnapshotKt.d;
                    SnapshotKt.d = snapshotIdSet2.u(eVar.f());
                    ww8 ww8Var = ww8.a;
                }
                return eVar;
            }
        });
    }

    public static final int c0(int i2, SnapshotIdSet snapshotIdSet) {
        int a2;
        int q = snapshotIdSet.q(i2);
        synchronized (I()) {
            a2 = f.a(q);
        }
        return a2;
    }

    private static final q d0(y08 y08Var) {
        int e2 = f.e(e) - 1;
        SnapshotIdSet a2 = SnapshotIdSet.e.a();
        q qVar = null;
        for (q o = y08Var.o(); o != null; o = o.e()) {
            if (o.f() == 0) {
                return o;
            }
            if (f0(o, e2, a2)) {
                if (qVar != null) {
                    return o.f() < qVar.f() ? o : qVar;
                }
                qVar = o;
            }
        }
        return null;
    }

    private static final boolean e0(int i2, int i3, SnapshotIdSet snapshotIdSet) {
        return (i3 == 0 || i3 > i2 || snapshotIdSet.p(i3)) ? false : true;
    }

    private static final boolean f0(q qVar, int i2, SnapshotIdSet snapshotIdSet) {
        return e0(i2, qVar.f(), snapshotIdSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g0(e eVar) {
        int e2;
        if (d.p(eVar.f())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: id=");
        sb.append(eVar.f());
        sb.append(", disposed=");
        sb.append(eVar.e());
        sb.append(", applied=");
        a aVar = eVar instanceof a ? (a) eVar : null;
        sb.append(aVar != null ? Boolean.valueOf(aVar.D()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (I()) {
            e2 = f.e(-1);
        }
        sb.append(e2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static final q h0(q qVar, y08 y08Var, e eVar) {
        if (eVar.i()) {
            eVar.p(y08Var);
        }
        q W = W(qVar, eVar.f(), eVar.g());
        if (W == null) {
            V();
            throw new KotlinNothingValueException();
        }
        if (W.f() == eVar.f()) {
            return W;
        }
        q O = O(W, y08Var, eVar);
        eVar.p(y08Var);
        return O;
    }

    public static final SnapshotIdSet z(SnapshotIdSet snapshotIdSet, int i2, int i3) {
        while (i2 < i3) {
            snapshotIdSet = snapshotIdSet.u(i2);
            i2++;
        }
        return snapshotIdSet;
    }
}
