package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.b0;
import androidx.compose.ui.layout.l;
import defpackage.ci;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.in3;
import defpackage.iv0;
import defpackage.qg4;
import defpackage.rz3;
import defpackage.sg4;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes.dex */
final class SizeAnimationModifierNode extends rz3 {
    private ci n;
    private gt2 r;
    private boolean u;
    private long s = b.c();
    private long t = iv0.b(0, 0, 0, 0, 15, null);
    private final sy4 w = b0.e(null, null, 2, null);

    public static final class a {
        private final Animatable a;
        private long b;

        public /* synthetic */ a(Animatable animatable, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(animatable, j);
        }

        public final Animatable a() {
            return this.a;
        }

        public final long b() {
            return this.b;
        }

        public final void c(long j) {
            this.b = j;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return zq3.c(this.a, aVar.a) && hn3.e(this.b, aVar.b);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + hn3.h(this.b);
        }

        public String toString() {
            return "AnimData(anim=" + this.a + ", startSize=" + ((Object) hn3.i(this.b)) + ')';
        }

        private a(Animatable animatable, long j) {
            this.a = animatable;
            this.b = j;
        }
    }

    public SizeAnimationModifierNode(ci ciVar, gt2 gt2Var) {
        this.n = ciVar;
        this.r = gt2Var;
    }

    private final void l2(long j) {
        this.t = j;
        this.u = true;
    }

    private final long m2(long j) {
        return this.u ? this.t : j;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void O1() {
        super.O1();
        this.s = b.c();
        this.u = false;
    }

    @Override // androidx.compose.ui.Modifier.c
    public void Q1() {
        super.Q1();
        i2(null);
    }

    @Override // androidx.compose.ui.node.c
    public sg4 d(androidx.compose.ui.layout.f fVar, qg4 qg4Var, long j) {
        final l W;
        if (fVar.Z()) {
            l2(j);
            W = qg4Var.W(j);
        } else {
            W = qg4Var.W(m2(j));
        }
        long a2 = in3.a(W.F0(), W.v0());
        if (fVar.Z()) {
            this.s = a2;
        } else {
            if (b.d(this.s)) {
                a2 = this.s;
            }
            a2 = iv0.d(j, e2(a2));
        }
        return androidx.compose.ui.layout.f.J(fVar, hn3.g(a2), hn3.f(a2), null, new ss2() { // from class: androidx.compose.animation.SizeAnimationModifierNode$measure$2
            {
                super(1);
            }

            public final void b(l.a aVar) {
                l.a.j(aVar, l.this, 0, 0, 0.0f, 4, null);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((l.a) obj);
                return ww8.a;
            }
        }, 4, null);
    }

    public final long e2(long j) {
        a f2 = f2();
        if (f2 == null) {
            f2 = new a(new Animatable(hn3.b(j), VectorConvertersKt.g(hn3.b), hn3.b(in3.a(1, 1)), null, 8, null), j, null);
        } else if (!hn3.e(j, ((hn3) f2.a().k()).j())) {
            f2.c(((hn3) f2.a().m()).j());
            BuildersKt__Builders_commonKt.launch$default(E1(), null, null, new SizeAnimationModifierNode$animateTo$data$1$1(f2, j, this, null), 3, null);
        }
        i2(f2);
        return ((hn3) f2.a().m()).j();
    }

    public final a f2() {
        return (a) this.w.getValue();
    }

    public final ci g2() {
        return this.n;
    }

    public final gt2 h2() {
        return this.r;
    }

    public final void i2(a aVar) {
        this.w.setValue(aVar);
    }

    public final void j2(ci ciVar) {
        this.n = ciVar;
    }

    public final void k2(gt2 gt2Var) {
        this.r = gt2Var;
    }
}
