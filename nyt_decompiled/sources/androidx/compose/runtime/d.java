package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import defpackage.at0;
import defpackage.bc7;
import defpackage.ej0;
import defpackage.es0;
import defpackage.ff3;
import defpackage.fy0;
import defpackage.gt0;
import defpackage.gt2;
import defpackage.hd;
import defpackage.ht0;
import defpackage.ht6;
import defpackage.i17;
import defpackage.ku8;
import defpackage.kw4;
import defpackage.kz4;
import defpackage.ln;
import defpackage.lw4;
import defpackage.nv6;
import defpackage.ov6;
import defpackage.oy4;
import defpackage.py4;
import defpackage.qs2;
import defpackage.to8;
import defpackage.ua7;
import defpackage.ww8;
import defpackage.y08;
import defpackage.yb5;
import defpackage.z08;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d implements fy0, i17, ht6 {
    private gt2 B;
    private final c a;
    private final ln b;
    private final AtomicReference c;
    private final Object d;
    private final HashSet e;
    private final r f;
    private final bc7 g;
    private final HashSet h;
    private final bc7 i;
    private final ej0 j;
    private final ej0 k;
    private final bc7 l;
    private ff3 m;
    private boolean n;
    private d r;
    private int s;
    private final ht0 t;
    private final ComposerImpl u;
    private final CoroutineContext w;
    private final boolean x;
    private boolean y;

    private static final class a implements nv6 {
        private final Set a;
        private final List b = new ArrayList();
        private final List c = new ArrayList();
        private final List d = new ArrayList();
        private py4 e;

        public a(Set set) {
            this.a = set;
        }

        @Override // defpackage.nv6
        public void a(qs2 qs2Var) {
            this.d.add(qs2Var);
        }

        @Override // defpackage.nv6
        public void b(es0 es0Var) {
            py4 py4Var = this.e;
            if (py4Var == null) {
                py4Var = ua7.a();
                this.e = py4Var;
            }
            py4Var.o(es0Var);
            this.c.add(es0Var);
        }

        @Override // defpackage.nv6
        public void c(ov6 ov6Var) {
            this.b.add(ov6Var);
        }

        @Override // defpackage.nv6
        public void d(ov6 ov6Var) {
            this.c.add(ov6Var);
        }

        @Override // defpackage.nv6
        public void e(es0 es0Var) {
            this.c.add(es0Var);
        }

        public final void f() {
            if (this.a.isEmpty()) {
                return;
            }
            Object a = to8.a.a("Compose:abandons");
            try {
                Iterator it2 = this.a.iterator();
                while (it2.hasNext()) {
                    ov6 ov6Var = (ov6) it2.next();
                    it2.remove();
                    ov6Var.d();
                }
                ww8 ww8Var = ww8.a;
                to8.a.b(a);
            } catch (Throwable th) {
                to8.a.b(a);
                throw th;
            }
        }

        public final void g() {
            Object a;
            if (!this.c.isEmpty()) {
                a = to8.a.a("Compose:onForgotten");
                try {
                    py4 py4Var = this.e;
                    for (int size = this.c.size() - 1; -1 < size; size--) {
                        Object obj = this.c.get(size);
                        ku8.a(this.a).remove(obj);
                        if (obj instanceof ov6) {
                            ((ov6) obj).e();
                        }
                        if (obj instanceof es0) {
                            if (py4Var == null || !py4Var.a(obj)) {
                                ((es0) obj).d();
                            } else {
                                ((es0) obj).b();
                            }
                        }
                    }
                    ww8 ww8Var = ww8.a;
                    to8.a.b(a);
                } finally {
                }
            }
            if (this.b.isEmpty()) {
                return;
            }
            a = to8.a.a("Compose:onRemembered");
            try {
                List list = this.b;
                int size2 = list.size();
                for (int i = 0; i < size2; i++) {
                    ov6 ov6Var = (ov6) list.get(i);
                    this.a.remove(ov6Var);
                    ov6Var.c();
                }
                ww8 ww8Var2 = ww8.a;
                to8.a.b(a);
            } finally {
            }
        }

        public final void h() {
            if (this.d.isEmpty()) {
                return;
            }
            Object a = to8.a.a("Compose:sideeffects");
            try {
                List list = this.d;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    ((qs2) list.get(i)).mo865invoke();
                }
                this.d.clear();
                ww8 ww8Var = ww8.a;
                to8.a.b(a);
            } catch (Throwable th) {
                to8.a.b(a);
                throw th;
            }
        }
    }

    public d(c cVar, ln lnVar, CoroutineContext coroutineContext) {
        this.a = cVar;
        this.b = lnVar;
        this.c = new AtomicReference(null);
        this.d = new Object();
        HashSet hashSet = new HashSet();
        this.e = hashSet;
        r rVar = new r();
        this.f = rVar;
        this.g = new bc7();
        this.h = new HashSet();
        this.i = new bc7();
        ej0 ej0Var = new ej0();
        this.j = ej0Var;
        ej0 ej0Var2 = new ej0();
        this.k = ej0Var2;
        this.l = new bc7();
        this.m = new ff3(0, 1, null);
        this.t = new ht0(null, false, 3, null);
        ComposerImpl composerImpl = new ComposerImpl(lnVar, cVar, rVar, hashSet, ej0Var, ej0Var2, this);
        cVar.m(composerImpl);
        this.u = composerImpl;
        this.w = coroutineContext;
        this.x = cVar instanceof Recomposer;
        this.B = ComposableSingletons$CompositionKt.a.a();
    }

    private final void A() {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j;
        int i3;
        boolean z;
        Object[] objArr;
        Object[] objArr2;
        oy4 d = this.i.d();
        long[] jArr3 = d.a;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j2 = jArr3[i4];
                char c = 7;
                long j3 = -9187201950435737472L;
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8;
                    int i6 = 8 - ((~(i4 - length)) >>> 31);
                    int i7 = 0;
                    while (i7 < i6) {
                        if ((j2 & 255) < 128) {
                            int i8 = (i4 << 3) + i7;
                            Object obj = d.b[i8];
                            Object obj2 = d.c[i8];
                            if (obj2 instanceof py4) {
                                zq3.f(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1>");
                                py4 py4Var = (py4) obj2;
                                Object[] objArr3 = py4Var.b;
                                long[] jArr4 = py4Var.a;
                                int length2 = jArr4.length - 2;
                                jArr2 = jArr3;
                                i = length;
                                if (length2 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j4 = jArr4[i9];
                                        i2 = i6;
                                        long[] jArr5 = jArr4;
                                        j = -9187201950435737472L;
                                        if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            int i11 = 0;
                                            while (i11 < i10) {
                                                if ((j4 & 255) < 128) {
                                                    int i12 = (i9 << 3) + i11;
                                                    objArr2 = objArr3;
                                                    if (!this.g.c((f) objArr3[i12])) {
                                                        py4Var.q(i12);
                                                    }
                                                } else {
                                                    objArr2 = objArr3;
                                                }
                                                j4 >>= 8;
                                                i11++;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i10 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        c = 7;
                                        i6 = i2;
                                        jArr4 = jArr5;
                                        objArr3 = objArr;
                                    }
                                } else {
                                    i2 = i6;
                                    j = -9187201950435737472L;
                                }
                                z = py4Var.d();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i6;
                                j = j3;
                                zq3.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.ScopeMap.removeScopeIf$lambda$1");
                                z = !this.g.c((f) obj2);
                            }
                            if (z) {
                                d.o(i8);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i6;
                            j = j3;
                            i3 = i5;
                        }
                        j2 >>= i3;
                        i7++;
                        i5 = i3;
                        j3 = j;
                        jArr3 = jArr2;
                        length = i;
                        i6 = i2;
                        c = 7;
                    }
                    jArr = jArr3;
                    int i13 = length;
                    if (i6 != i5) {
                        break;
                    } else {
                        length = i13;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i4 == length) {
                    break;
                }
                i4++;
                jArr3 = jArr;
            }
        }
        if (this.h.isEmpty()) {
            return;
        }
        Iterator it2 = this.h.iterator();
        while (it2.hasNext()) {
            if (!((RecomposeScopeImpl) it2.next()).u()) {
                it2.remove();
            }
        }
    }

    private final void B(gt2 gt2Var) {
        if (this.y) {
            throw new IllegalStateException("The composition is disposed");
        }
        this.B = gt2Var;
        this.a.a(this, gt2Var);
    }

    private final void C() {
        Object obj;
        Object obj2;
        AtomicReference atomicReference = this.c;
        obj = at0.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            obj2 = at0.a;
            if (zq3.c(andSet, obj2)) {
                b.t("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                y((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                b.t("corrupt pendingModifications drain: " + this.c);
                throw new KotlinNothingValueException();
            }
            for (Set set : (Set[]) andSet) {
                y(set, true);
            }
        }
    }

    private final void D() {
        Object obj;
        Object andSet = this.c.getAndSet(null);
        obj = at0.a;
        if (zq3.c(andSet, obj)) {
            return;
        }
        if (andSet instanceof Set) {
            y((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                y(set, false);
            }
            return;
        }
        if (andSet == null) {
            b.t("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        }
        b.t("corrupt pendingModifications drain: " + this.c);
        throw new KotlinNothingValueException();
    }

    private final boolean E() {
        return this.u.A0();
    }

    private final InvalidationResult G(RecomposeScopeImpl recomposeScopeImpl, hd hdVar, Object obj) {
        synchronized (this.d) {
            try {
                d dVar = this.r;
                if (dVar == null || !this.f.x(this.s, hdVar)) {
                    dVar = null;
                }
                if (dVar == null) {
                    if (M(recomposeScopeImpl, obj)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (obj == null) {
                        this.m.j(recomposeScopeImpl, null);
                    } else {
                        at0.e(this.m, recomposeScopeImpl, obj);
                    }
                }
                if (dVar != null) {
                    return dVar.G(recomposeScopeImpl, hdVar, obj);
                }
                this.a.j(this);
                return n() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } finally {
            }
        }
    }

    private final void H(Object obj) {
        Object b = this.g.d().b(obj);
        if (b == null) {
            return;
        }
        if (!(b instanceof py4)) {
            RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) b;
            if (recomposeScopeImpl.t(obj) == InvalidationResult.IMMINENT) {
                this.l.a(obj, recomposeScopeImpl);
                return;
            }
            return;
        }
        py4 py4Var = (py4) b;
        Object[] objArr = py4Var.b;
        long[] jArr = py4Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                        if (recomposeScopeImpl2.t(obj) == InvalidationResult.IMMINENT) {
                            this.l.a(obj, recomposeScopeImpl2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final gt0 I() {
        ht0 ht0Var = this.t;
        if (ht0Var.b()) {
            ht0Var.a();
        } else {
            ht0 h = this.a.h();
            if (h != null) {
                h.a();
            }
            ht0Var.a();
            if (!zq3.c(null, null)) {
                ht0Var.c(null);
            }
        }
        return null;
    }

    private final ff3 L() {
        ff3 ff3Var = this.m;
        this.m = new ff3(0, 1, null);
        return ff3Var;
    }

    private final boolean M(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        return n() && this.u.m1(recomposeScopeImpl, obj);
    }

    private final void u() {
        this.c.set(null);
        this.j.a();
        this.k.a();
        this.e.clear();
    }

    private final HashSet x(HashSet hashSet, Object obj, boolean z) {
        HashSet hashSet2;
        Object b = this.g.d().b(obj);
        if (b != null) {
            if (b instanceof py4) {
                py4 py4Var = (py4) b;
                Object[] objArr = py4Var.b;
                long[] jArr = py4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    hashSet2 = hashSet;
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) objArr[(i << 3) + i3];
                                    if (!this.l.e(obj, recomposeScopeImpl) && recomposeScopeImpl.t(obj) != InvalidationResult.IGNORED) {
                                        if (!recomposeScopeImpl.u() || z) {
                                            if (hashSet2 == null) {
                                                hashSet2 = new HashSet();
                                            }
                                            hashSet2.add(recomposeScopeImpl);
                                        } else {
                                            this.h.add(recomposeScopeImpl);
                                        }
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                } else {
                    hashSet2 = hashSet;
                }
                return hashSet2;
            }
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) b;
            if (!this.l.e(obj, recomposeScopeImpl2) && recomposeScopeImpl2.t(obj) != InvalidationResult.IGNORED) {
                if (!recomposeScopeImpl2.u() || z) {
                    HashSet hashSet3 = hashSet == null ? new HashSet() : hashSet;
                    hashSet3.add(recomposeScopeImpl2);
                    return hashSet3;
                }
                this.h.add(recomposeScopeImpl2);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f3, code lost:
    
        if (r13 == true) goto L94;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void y(java.util.Set r30, boolean r31) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.d.y(java.util.Set, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(defpackage.ej0 r32) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.d.z(ej0):void");
    }

    public final ht0 F() {
        return this.t;
    }

    public final void J(f fVar) {
        if (this.g.c(fVar)) {
            return;
        }
        this.i.f(fVar);
    }

    public final void K(Object obj, RecomposeScopeImpl recomposeScopeImpl) {
        this.g.e(obj, recomposeScopeImpl);
    }

    @Override // defpackage.fy0, defpackage.ht6
    public void a(Object obj) {
        RecomposeScopeImpl C0;
        if (E() || (C0 = this.u.C0()) == null) {
            return;
        }
        C0.H(true);
        if (C0.w(obj)) {
            return;
        }
        if (obj instanceof z08) {
            ((z08) obj).B(androidx.compose.runtime.snapshots.c.a(1));
        }
        this.g.a(obj, C0);
        if (!(obj instanceof f)) {
            return;
        }
        this.i.f(obj);
        yb5 b = ((f) obj).z().b();
        Object[] objArr = b.b;
        long[] jArr = b.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        y08 y08Var = (y08) objArr[(i << 3) + i3];
                        if (y08Var instanceof z08) {
                            ((z08) y08Var).B(androidx.compose.runtime.snapshots.c.a(1));
                        }
                        this.i.a(y08Var, obj);
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.fy0
    public Object b(fy0 fy0Var, int i, qs2 qs2Var) {
        if (fy0Var == null || zq3.c(fy0Var, this) || i < 0) {
            return qs2Var.mo865invoke();
        }
        this.r = (d) fy0Var;
        this.s = i;
        try {
            return qs2Var.mo865invoke();
        } finally {
            this.r = null;
            this.s = 0;
        }
    }

    @Override // defpackage.fy0
    public void c() {
        synchronized (this.d) {
            try {
                if (this.k.d()) {
                    z(this.k);
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.isEmpty()) {
                            new a(this.e).f();
                        }
                        throw th;
                    } catch (Exception e) {
                        this.u();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.ws0
    public void d(gt2 gt2Var) {
        B(gt2Var);
    }

    @Override // defpackage.i17
    public void deactivate() {
        boolean z = this.f.p() > 0;
        if (z || !this.e.isEmpty()) {
            to8 to8Var = to8.a;
            Object a2 = to8Var.a("Compose:deactivate");
            try {
                a aVar = new a(this.e);
                if (z) {
                    this.b.h();
                    t z2 = this.f.z();
                    try {
                        b.u(z2, aVar);
                        ww8 ww8Var = ww8.a;
                        z2.L();
                        this.b.e();
                        aVar.g();
                    } catch (Throwable th) {
                        z2.L();
                        throw th;
                    }
                }
                aVar.f();
                ww8 ww8Var2 = ww8.a;
                to8Var.b(a2);
            } catch (Throwable th2) {
                to8.a.b(a2);
                throw th2;
            }
        }
        this.g.b();
        this.i.b();
        this.m.a();
        this.j.a();
        this.u.o0();
    }

    @Override // defpackage.ws0
    public void dispose() {
        synchronized (this.d) {
            try {
                if (this.u.L0()) {
                    throw new IllegalStateException("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (!this.y) {
                    boolean z = true;
                    this.y = true;
                    this.B = ComposableSingletons$CompositionKt.a.b();
                    ej0 D0 = this.u.D0();
                    if (D0 != null) {
                        z(D0);
                    }
                    if (this.f.p() <= 0) {
                        z = false;
                    }
                    if (z || !this.e.isEmpty()) {
                        a aVar = new a(this.e);
                        if (z) {
                            this.b.h();
                            t z2 = this.f.z();
                            try {
                                b.M(z2, aVar);
                                ww8 ww8Var = ww8.a;
                                z2.L();
                                this.b.clear();
                                this.b.e();
                                aVar.g();
                            } catch (Throwable th) {
                                z2.L();
                                throw th;
                            }
                        }
                        aVar.f();
                    }
                    this.u.p0();
                }
                ww8 ww8Var2 = ww8.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.q(this);
    }

    @Override // defpackage.fy0
    public void e(List list) {
        boolean z = true;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            if (!zq3.c(((lw4) ((Pair) list.get(i)).c()).b(), this)) {
                z = false;
                break;
            }
            i++;
        }
        b.Q(z);
        try {
            this.u.I0(list);
            ww8 ww8Var = ww8.a;
        } finally {
        }
    }

    @Override // defpackage.fy0
    public void f(kw4 kw4Var) {
        a aVar = new a(this.e);
        t z = kw4Var.a().z();
        try {
            b.M(z, aVar);
            ww8 ww8Var = ww8.a;
            z.L();
            aVar.g();
        } catch (Throwable th) {
            z.L();
            throw th;
        }
    }

    @Override // defpackage.ht6
    public void g(RecomposeScopeImpl recomposeScopeImpl) {
        this.n = true;
    }

    @Override // defpackage.ht6
    public InvalidationResult h(RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        d dVar;
        if (recomposeScopeImpl.l()) {
            recomposeScopeImpl.C(true);
        }
        hd j = recomposeScopeImpl.j();
        if (j == null || !j.b()) {
            return InvalidationResult.IGNORED;
        }
        if (this.f.A(j)) {
            return !recomposeScopeImpl.k() ? InvalidationResult.IGNORED : G(recomposeScopeImpl, j, obj);
        }
        synchronized (this.d) {
            dVar = this.r;
        }
        return (dVar == null || !dVar.M(recomposeScopeImpl, obj)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
    }

    @Override // defpackage.fy0
    public boolean i() {
        boolean R0;
        synchronized (this.d) {
            try {
                C();
                try {
                    ff3 L = L();
                    try {
                        I();
                        R0 = this.u.R0(L);
                        if (!R0) {
                            D();
                        }
                    } catch (Exception e) {
                        this.m = L;
                        throw e;
                    }
                } finally {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return R0;
    }

    @Override // defpackage.ws0
    public boolean isDisposed() {
        return this.y;
    }

    @Override // defpackage.fy0
    public void j(gt2 gt2Var) {
        try {
            synchronized (this.d) {
                C();
                ff3 L = L();
                try {
                    I();
                    this.u.j0(L, gt2Var);
                } catch (Exception e) {
                    this.m = L;
                    throw e;
                }
            }
        } finally {
        }
    }

    @Override // defpackage.fy0
    public boolean k(Set set) {
        if (!(set instanceof IdentityArraySet)) {
            for (Object obj : set) {
                if (this.g.c(obj) || this.i.c(obj)) {
                    return true;
                }
            }
            return false;
        }
        IdentityArraySet identityArraySet = (IdentityArraySet) set;
        Object[] j = identityArraySet.j();
        int size = identityArraySet.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = j[i];
            zq3.f(obj2, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (this.g.c(obj2) || this.i.c(obj2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.Set[]] */
    @Override // defpackage.fy0
    public void l(Set set) {
        Object obj;
        Object obj2;
        boolean c;
        Set set2;
        do {
            obj = this.c.get();
            if (obj == null) {
                c = true;
            } else {
                obj2 = at0.a;
                c = zq3.c(obj, obj2);
            }
            if (c) {
                set2 = set;
            } else if (obj instanceof Set) {
                set2 = new Set[]{obj, set};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.c).toString());
                }
                zq3.f(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                set2 = kotlin.collections.d.B((Set[]) obj, set);
            }
        } while (!kz4.a(this.c, obj, set2));
        if (obj == null) {
            synchronized (this.d) {
                D();
                ww8 ww8Var = ww8.a;
            }
        }
    }

    @Override // defpackage.fy0
    public void m() {
        synchronized (this.d) {
            try {
                z(this.j);
                D();
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.isEmpty()) {
                            new a(this.e).f();
                        }
                        throw th;
                    } catch (Exception e) {
                        this.u();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.fy0
    public boolean n() {
        return this.u.L0();
    }

    @Override // defpackage.fy0
    public void o(Object obj) {
        synchronized (this.d) {
            try {
                H(obj);
                Object b = this.i.d().b(obj);
                if (b != null) {
                    if (b instanceof py4) {
                        py4 py4Var = (py4) b;
                        Object[] objArr = py4Var.b;
                        long[] jArr = py4Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            H((f) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    }
                                }
                                if (i == length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    } else {
                        H((f) b);
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fy0
    public void p(qs2 qs2Var) {
        this.u.Q0(qs2Var);
    }

    @Override // defpackage.ws0
    public boolean q() {
        boolean z;
        synchronized (this.d) {
            z = this.m.g() > 0;
        }
        return z;
    }

    @Override // defpackage.fy0
    public void r() {
        synchronized (this.d) {
            try {
                this.u.g0();
                if (!this.e.isEmpty()) {
                    new a(this.e).f();
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                try {
                    try {
                        if (!this.e.isEmpty()) {
                            new a(this.e).f();
                        }
                        throw th;
                    } catch (Exception e) {
                        this.u();
                        throw e;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // defpackage.i17
    public void s(gt2 gt2Var) {
        this.u.k1();
        B(gt2Var);
        this.u.u0();
    }

    @Override // defpackage.fy0
    public void t() {
        synchronized (this.d) {
            try {
                for (Object obj : this.f.q()) {
                    RecomposeScopeImpl recomposeScopeImpl = obj instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) obj : null;
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.invalidate();
                    }
                }
                ww8 ww8Var = ww8.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ d(c cVar, ln lnVar, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, lnVar, (i & 4) != 0 ? null : coroutineContext);
    }
}
