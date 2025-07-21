package androidx.compose.animation.core;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b;
import androidx.compose.runtime.b0;
import defpackage.cc7;
import defpackage.ci;
import defpackage.gg8;
import defpackage.gt2;
import defpackage.gt6;
import defpackage.hu8;
import defpackage.py1;
import defpackage.sy4;
import defpackage.vy4;
import defpackage.ww8;
import defpackage.x08;

/* loaded from: classes.dex */
public final class InfiniteTransition {
    public static final int f = 8;
    private final String a;
    private final vy4 b = new vy4(new a[16], 0);
    private final sy4 c = b0.e(Boolean.FALSE, null, 2, null);
    private long d = Long.MIN_VALUE;
    private final sy4 e = b0.e(Boolean.TRUE, null, 2, null);

    public final class a implements x08 {
        private Object a;
        private Object b;
        private final hu8 c;
        private final String d;
        private final sy4 e;
        private ci f;
        private gg8 g;
        private boolean h;
        private boolean i;
        private long j;

        public a(Object obj, Object obj2, hu8 hu8Var, ci ciVar, String str) {
            this.a = obj;
            this.b = obj2;
            this.c = hu8Var;
            this.d = str;
            this.e = b0.e(obj, null, 2, null);
            this.f = ciVar;
            this.g = new gg8(this.f, hu8Var, this.a, this.b, null, 16, null);
        }

        public final void A() {
            this.i = true;
        }

        public void B(Object obj) {
            this.e.setValue(obj);
        }

        public final void C() {
            B(this.g.g());
            this.i = true;
        }

        public final void D(Object obj, Object obj2, ci ciVar) {
            this.a = obj;
            this.b = obj2;
            this.f = ciVar;
            this.g = new gg8(ciVar, this.c, obj, obj2, null, 16, null);
            InfiniteTransition.this.l(true);
            this.h = false;
            this.i = true;
        }

        @Override // defpackage.x08
        public Object getValue() {
            return this.e.getValue();
        }

        public final Object j() {
            return this.a;
        }

        public final Object n() {
            return this.b;
        }

        public final boolean o() {
            return this.h;
        }

        public final void t(long j) {
            InfiniteTransition.this.l(false);
            if (this.i) {
                this.i = false;
                this.j = j;
            }
            long j2 = j - this.j;
            B(this.g.f(j2));
            this.h = this.g.c(j2);
        }
    }

    public InfiniteTransition(String str) {
        this.a = str;
    }

    private final boolean g() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    private final boolean h() {
        return ((Boolean) this.e.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i(long j) {
        boolean z;
        vy4 vy4Var = this.b;
        int q = vy4Var.q();
        if (q > 0) {
            Object[] p = vy4Var.p();
            z = true;
            int i = 0;
            do {
                a aVar = (a) p[i];
                if (!aVar.o()) {
                    aVar.t(j);
                }
                if (!aVar.o()) {
                    z = false;
                }
                i++;
            } while (i < q);
        } else {
            z = true;
        }
        m(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(boolean z) {
        this.c.setValue(Boolean.valueOf(z));
    }

    private final void m(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }

    public final void f(a aVar) {
        this.b.b(aVar);
        l(true);
    }

    public final void j(a aVar) {
        this.b.w(aVar);
    }

    public final void k(Composer composer, final int i) {
        Composer h = composer.h(-318043801);
        if (b.G()) {
            b.S(-318043801, i, -1, "androidx.compose.animation.core.InfiniteTransition.run (InfiniteTransition.kt:171)");
        }
        h.z(-492369756);
        Object A = h.A();
        if (A == Composer.a.a()) {
            A = b0.e(null, null, 2, null);
            h.q(A);
        }
        h.R();
        sy4 sy4Var = (sy4) A;
        if (h() || g()) {
            py1.d(this, new InfiniteTransition$run$1(sy4Var, this, null), h, 72);
        }
        if (b.G()) {
            b.R();
        }
        cc7 k = h.k();
        if (k != null) {
            k.a(new gt2() { // from class: androidx.compose.animation.core.InfiniteTransition$run$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    invoke((Composer) obj, ((Number) obj2).intValue());
                    return ww8.a;
                }

                public final void invoke(Composer composer2, int i2) {
                    InfiniteTransition.this.k(composer2, gt6.a(i | 1));
                }
            });
        }
    }
}
