package defpackage;

import defpackage.dk2;
import defpackage.i80;
import java.util.Objects;

/* loaded from: classes2.dex */
final class ak2 extends i80 {

    private static final class b implements i80.f {
        private final hk2 a;
        private final int b;
        private final dk2.a c;

        private long c(z72 z72Var) {
            while (z72Var.l() < z72Var.getLength() - 6 && !dk2.h(z72Var, this.a, this.b, this.c)) {
                z72Var.n(1);
            }
            if (z72Var.l() < z72Var.getLength() - 6) {
                return this.c.a;
            }
            z72Var.n((int) (z72Var.getLength() - z72Var.l()));
            return this.a.j;
        }

        @Override // i80.f
        public i80.e a(z72 z72Var, long j) {
            long position = z72Var.getPosition();
            long c = c(z72Var);
            long l = z72Var.l();
            z72Var.n(Math.max(6, this.a.c));
            long c2 = c(z72Var);
            return (c > j || c2 <= j) ? c2 <= j ? i80.e.f(c2, z72Var.l()) : i80.e.d(c, position) : i80.e.e(l);
        }

        private b(hk2 hk2Var, int i) {
            this.a = hk2Var;
            this.b = i;
            this.c = new dk2.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak2(final hk2 hk2Var, int i, long j, long j2) {
        super(new i80.d() { // from class: zj2
            @Override // i80.d
            public final long a(long j3) {
                return hk2.this.i(j3);
            }
        }, new b(hk2Var, i), hk2Var.f(), 0L, hk2Var.j, j, j2, hk2Var.d(), Math.max(6, hk2Var.c));
        Objects.requireNonNull(hk2Var);
    }
}
