package androidx.compose.animation.core;

import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.y;
import com.comscore.streaming.ContentType;
import defpackage.cc7;
import defpackage.di;
import defpackage.gg8;
import defpackage.gi;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hu8;
import defpackage.hy4;
import defpackage.ic9;
import defpackage.mi;
import defpackage.ph2;
import defpackage.py1;
import defpackage.qs2;
import defpackage.qw7;
import defpackage.qz7;
import defpackage.rr8;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ty4;
import defpackage.ww8;
import defpackage.x08;
import defpackage.zq3;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* loaded from: classes.dex */
public final class Transition {
    private final rr8 a;
    private final String b;
    private final sy4 c;
    private final sy4 d;
    private final hy4 e;
    private final hy4 f;
    private final sy4 g;
    private final SnapshotStateList h;
    private final SnapshotStateList i;
    private final sy4 j;
    private long k;
    private final x08 l;

    public final class a {
        private final hu8 a;
        private final String b;
        private final sy4 c = b0.e(null, null, 2, null);

        /* renamed from: androidx.compose.animation.core.Transition$a$a, reason: collision with other inner class name */
        public final class C0018a implements x08 {
            private final d a;
            private ss2 b;
            private ss2 c;

            public C0018a(d dVar, ss2 ss2Var, ss2 ss2Var2) {
                this.a = dVar;
                this.b = ss2Var;
                this.c = ss2Var2;
            }

            public final void A(ss2 ss2Var) {
                this.b = ss2Var;
            }

            public final void B(b bVar) {
                Object invoke = this.c.invoke(bVar.a());
                if (!Transition.this.r()) {
                    this.a.Q(invoke, (ph2) this.b.invoke(bVar));
                } else {
                    this.a.P(this.c.invoke(bVar.d()), invoke, (ph2) this.b.invoke(bVar));
                }
            }

            @Override // defpackage.x08
            public Object getValue() {
                B(Transition.this.l());
                return this.a.getValue();
            }

            public final d j() {
                return this.a;
            }

            public final ss2 n() {
                return this.c;
            }

            public final ss2 o() {
                return this.b;
            }

            public final void t(ss2 ss2Var) {
                this.c = ss2Var;
            }
        }

        public a(hu8 hu8Var, String str) {
            this.a = hu8Var;
            this.b = str;
        }

        public final x08 a(ss2 ss2Var, ss2 ss2Var2) {
            C0018a b = b();
            if (b == null) {
                Transition transition = Transition.this;
                b = new C0018a(transition.new d(ss2Var2.invoke(transition.h()), gi.i(this.a, ss2Var2.invoke(Transition.this.h())), this.a, this.b), ss2Var, ss2Var2);
                Transition transition2 = Transition.this;
                c(b);
                transition2.d(b.j());
            }
            Transition transition3 = Transition.this;
            b.t(ss2Var2);
            b.A(ss2Var);
            b.B(transition3.l());
            return b;
        }

        public final C0018a b() {
            return (C0018a) this.c.getValue();
        }

        public final void c(C0018a c0018a) {
            this.c.setValue(c0018a);
        }

        public final void d() {
            C0018a b = b();
            if (b != null) {
                Transition transition = Transition.this;
                b.j().P(b.n().invoke(transition.l().d()), b.n().invoke(transition.l().a()), (ph2) b.o().invoke(transition.l()));
            }
        }
    }

    public interface b {
        Object a();

        Object d();

        default boolean f(Object obj, Object obj2) {
            return zq3.c(obj, d()) && zq3.c(obj2, a());
        }
    }

    private static final class c implements b {
        private final Object a;
        private final Object b;

        public c(Object obj, Object obj2) {
            this.a = obj;
            this.b = obj2;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public Object a() {
            return this.b;
        }

        @Override // androidx.compose.animation.core.Transition.b
        public Object d() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (zq3.c(d(), bVar.d()) && zq3.c(a(), bVar.a())) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object d = d();
            int hashCode = (d != null ? d.hashCode() : 0) * 31;
            Object a = a();
            return hashCode + (a != null ? a.hashCode() : 0);
        }
    }

    public final class d implements x08 {
        private final hu8 a;
        private final String b;
        private final sy4 c;
        private final sy4 e;
        private final sy4 i;
        private mi j;
        private final ph2 k;
        private final sy4 d = b0.e(di.i(0.0f, 0.0f, null, 7, null), null, 2, null);
        private final sy4 f = b0.e(Boolean.TRUE, null, 2, null);
        private final hy4 g = qw7.a(0);
        private final sy4 h = b0.e(Boolean.FALSE, null, 2, null);

        public d(Object obj, mi miVar, hu8 hu8Var, String str) {
            Object obj2;
            this.a = hu8Var;
            this.b = str;
            this.c = b0.e(obj, null, 2, null);
            this.e = b0.e(new gg8(n(), hu8Var, obj, B(), miVar), null, 2, null);
            this.i = b0.e(obj, null, 2, null);
            this.j = miVar;
            Float f = (Float) ic9.h().get(hu8Var);
            if (f != null) {
                float floatValue = f.floatValue();
                mi miVar2 = (mi) hu8Var.a().invoke(obj);
                int b = miVar2.b();
                for (int i = 0; i < b; i++) {
                    miVar2.e(i, floatValue);
                }
                obj2 = this.a.b().invoke(miVar2);
            } else {
                obj2 = null;
            }
            this.k = di.i(0.0f, 0.0f, obj2, 3, null);
        }

        private final long A() {
            return this.g.b();
        }

        private final Object B() {
            return this.c.getValue();
        }

        private final void G(gg8 gg8Var) {
            this.e.setValue(gg8Var);
        }

        private final void H(ph2 ph2Var) {
            this.d.setValue(ph2Var);
        }

        private final void J(boolean z) {
            this.h.setValue(Boolean.valueOf(z));
        }

        private final void K(long j) {
            this.g.x(j);
        }

        private final void L(Object obj) {
            this.c.setValue(obj);
        }

        private final void N(Object obj, boolean z) {
            G(new gg8(z ? n() instanceof qz7 ? n() : this.k : n(), this.a, obj, B(), this.j));
            Transition.this.s();
        }

        static /* synthetic */ void O(d dVar, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i & 2) != 0) {
                z = false;
            }
            dVar.N(obj, z);
        }

        private final boolean t() {
            return ((Boolean) this.h.getValue()).booleanValue();
        }

        public final boolean C() {
            return ((Boolean) this.f.getValue()).booleanValue();
        }

        public final void D(long j, float f) {
            long d;
            if (f > 0.0f) {
                float A = (j - A()) / f;
                if (Float.isNaN(A)) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f + ",playTimeNanos: " + j + ", offsetTimeNanos: " + A()).toString());
                }
                d = (long) A;
            } else {
                d = j().d();
            }
            M(j().f(d));
            this.j = j().b(d);
            if (j().c(d)) {
                I(true);
                K(0L);
            }
        }

        public final void E() {
            J(true);
        }

        public final void F(long j) {
            M(j().f(j));
            this.j = j().b(j);
        }

        public final void I(boolean z) {
            this.f.setValue(Boolean.valueOf(z));
        }

        public void M(Object obj) {
            this.i.setValue(obj);
        }

        public final void P(Object obj, Object obj2, ph2 ph2Var) {
            L(obj2);
            H(ph2Var);
            if (zq3.c(j().h(), obj) && zq3.c(j().g(), obj2)) {
                return;
            }
            O(this, obj, false, 2, null);
        }

        public final void Q(Object obj, ph2 ph2Var) {
            if (!zq3.c(B(), obj) || t()) {
                L(obj);
                H(ph2Var);
                O(this, null, !C(), 1, null);
                I(false);
                K(Transition.this.k());
                J(false);
            }
        }

        @Override // defpackage.x08
        public Object getValue() {
            return this.i.getValue();
        }

        public final gg8 j() {
            return (gg8) this.e.getValue();
        }

        public final ph2 n() {
            return (ph2) this.d.getValue();
        }

        public final long o() {
            return j().d();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + B() + ", spec: " + n();
        }
    }

    public Transition(rr8 rr8Var, String str) {
        this.a = rr8Var;
        this.b = str;
        this.c = b0.e(h(), null, 2, null);
        this.d = b0.e(new c(h(), h()), null, 2, null);
        this.e = qw7.a(0L);
        this.f = qw7.a(Long.MIN_VALUE);
        this.g = b0.e(Boolean.TRUE, null, 2, null);
        this.h = y.f();
        this.i = y.f();
        this.j = b0.e(Boolean.FALSE, null, 2, null);
        this.l = y.d(new qs2() { // from class: androidx.compose.animation.core.Transition$totalDurationNanos$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final Long mo865invoke() {
                SnapshotStateList snapshotStateList;
                SnapshotStateList snapshotStateList2;
                snapshotStateList = Transition.this.h;
                int size = snapshotStateList.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    j = Math.max(j, ((Transition.d) snapshotStateList.get(i)).o());
                }
                snapshotStateList2 = Transition.this.i;
                int size2 = snapshotStateList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    j = Math.max(j, ((Transition) snapshotStateList2.get(i2)).o());
                }
                return Long.valueOf(j);
            }
        });
        rr8Var.d(this);
    }

    private final void C(b bVar) {
        this.d.setValue(bVar);
    }

    private final void D(long j) {
        this.f.x(j);
    }

    private final long m() {
        return this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        F(true);
        if (r()) {
            SnapshotStateList snapshotStateList = this.h;
            int size = snapshotStateList.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                d dVar = (d) snapshotStateList.get(i);
                j = Math.max(j, dVar.o());
                dVar.F(this.k);
            }
            F(false);
        }
    }

    public final void A(long j) {
        this.e.x(j);
    }

    public final void B(boolean z) {
        this.j.setValue(Boolean.valueOf(z));
    }

    public final void E(Object obj) {
        this.c.setValue(obj);
    }

    public final void F(boolean z) {
        this.g.setValue(Boolean.valueOf(z));
    }

    public final void G(final Object obj, Composer composer, final int i) {
        Composer h = composer.h(-583974681);
        int i2 = (i & 14) == 0 ? (h.S(obj) ? 4 : 2) | i : i;
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-583974681, i2, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:608)");
            }
            if (!r() && !zq3.c(n(), obj)) {
                C(new c(n(), obj));
                if (!zq3.c(h(), n())) {
                    rr8 rr8Var = this.a;
                    if (!(rr8Var instanceof ty4)) {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState");
                    }
                    ((ty4) rr8Var).e(n());
                }
                E(obj);
                if (!q()) {
                    F(true);
                }
                SnapshotStateList snapshotStateList = this.h;
                int size = snapshotStateList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((d) snapshotStateList.get(i3)).E();
                }
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.animation.core.Transition$updateTarget$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i4) {
                    Transition.this.G(obj, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final boolean d(d dVar) {
        return this.h.add(dVar);
    }

    public final boolean e(Transition transition) {
        return this.i.add(transition);
    }

    public final void f(final Object obj, Composer composer, final int i) {
        int i2;
        Composer h = composer.h(-1493585151);
        if ((i & 14) == 0) {
            i2 = (h.S(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & ContentType.LONG_FORM_ON_DEMAND) == 0) {
            i2 |= h.S(this) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && h.i()) {
            h.K();
        } else {
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.S(-1493585151, i2, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:639)");
            }
            if (!r()) {
                G(obj, h, i2 & WebSocketProtocol.PAYLOAD_SHORT);
                if (!zq3.c(obj, h()) || q() || p()) {
                    h.z(-561029496);
                    boolean S = h.S(this);
                    Object A = h.A();
                    if (S || A == Composer.a.a()) {
                        A = new Transition$animateTo$1$1(this, null);
                        h.q(A);
                    }
                    h.R();
                    py1.d(this, (gt2) A, h, ((i2 >> 3) & 14) | 64);
                }
            }
            if (androidx.compose.runtime.b.G()) {
                androidx.compose.runtime.b.R();
            }
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.animation.core.Transition$animateTo$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                    invoke((Composer) obj2, ((Number) obj3).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i3) {
                    Transition.this.f(obj, composer2, gt6.a(i | 1));
                }
            });
        }
    }

    public final List g() {
        return this.h;
    }

    public final Object h() {
        return this.a.a();
    }

    public final String i() {
        return this.b;
    }

    public final long j() {
        return this.k;
    }

    public final long k() {
        return this.e.b();
    }

    public final b l() {
        return (b) this.d.getValue();
    }

    public final Object n() {
        return this.c.getValue();
    }

    public final long o() {
        return ((Number) this.l.getValue()).longValue();
    }

    public final boolean p() {
        return ((Boolean) this.g.getValue()).booleanValue();
    }

    public final boolean q() {
        return m() != Long.MIN_VALUE;
    }

    public final boolean r() {
        return ((Boolean) this.j.getValue()).booleanValue();
    }

    public final void t(long j, float f) {
        if (m() == Long.MIN_VALUE) {
            v(j);
        }
        F(false);
        A(j - m());
        SnapshotStateList snapshotStateList = this.h;
        int size = snapshotStateList.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            d dVar = (d) snapshotStateList.get(i);
            if (!dVar.C()) {
                dVar.D(k(), f);
            }
            if (!dVar.C()) {
                z = false;
            }
        }
        SnapshotStateList snapshotStateList2 = this.i;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Transition transition = (Transition) snapshotStateList2.get(i2);
            if (!zq3.c(transition.n(), transition.h())) {
                transition.t(k(), f);
            }
            if (!zq3.c(transition.n(), transition.h())) {
                z = false;
            }
        }
        if (z) {
            u();
        }
    }

    public String toString() {
        List g = g();
        int size = g.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            str = str + ((d) g.get(i)) + ", ";
        }
        return str;
    }

    public final void u() {
        D(Long.MIN_VALUE);
        rr8 rr8Var = this.a;
        if (rr8Var instanceof ty4) {
            ((ty4) rr8Var).e(n());
        }
        A(0L);
        this.a.c(false);
    }

    public final void v(long j) {
        D(j);
        this.a.c(true);
    }

    public final void w(a aVar) {
        d j;
        a.C0018a b2 = aVar.b();
        if (b2 == null || (j = b2.j()) == null) {
            return;
        }
        x(j);
    }

    public final void x(d dVar) {
        this.h.remove(dVar);
    }

    public final boolean y(Transition transition) {
        return this.i.remove(transition);
    }

    public final void z(Object obj, Object obj2, long j) {
        D(Long.MIN_VALUE);
        this.a.c(false);
        if (!r() || !zq3.c(h(), obj) || !zq3.c(n(), obj2)) {
            if (!zq3.c(h(), obj)) {
                rr8 rr8Var = this.a;
                if (rr8Var instanceof ty4) {
                    ((ty4) rr8Var).e(obj);
                }
            }
            E(obj2);
            B(true);
            C(new c(obj, obj2));
        }
        SnapshotStateList snapshotStateList = this.i;
        int size = snapshotStateList.size();
        for (int i = 0; i < size; i++) {
            Transition transition = (Transition) snapshotStateList.get(i);
            zq3.f(transition, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (transition.r()) {
                transition.z(transition.h(), transition.n(), j);
            }
        }
        SnapshotStateList snapshotStateList2 = this.h;
        int size2 = snapshotStateList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((d) snapshotStateList2.get(i2)).F(j);
        }
        this.k = j;
    }

    public Transition(Object obj, String str) {
        this(new ty4(obj), str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Transition(ty4 ty4Var, String str) {
        this((rr8) ty4Var, str);
        zq3.f(ty4Var, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
