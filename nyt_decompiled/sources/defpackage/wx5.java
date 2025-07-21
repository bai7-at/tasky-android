package defpackage;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class wx5 {
    private final lb4 a = new lb4(0, 1, null);

    private static final class a {
        private final long a;
        private final long b;
        private final boolean c;
        private final int d;

        public /* synthetic */ a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        public final boolean a() {
            return this.c;
        }

        public final long b() {
            return this.b;
        }

        public final long c() {
            return this.a;
        }

        private a(long j, long j2, boolean z, int i) {
            this.a = j;
            this.b = j2;
            this.c = z;
            this.d = i;
        }
    }

    public final void a() {
        this.a.a();
    }

    public final pq3 b(xx5 xx5Var, d06 d06Var) {
        long j;
        boolean a2;
        long l;
        lb4 lb4Var = new lb4(xx5Var.b().size());
        List b = xx5Var.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            yx5 yx5Var = (yx5) b.get(i);
            a aVar = (a) this.a.d(yx5Var.c());
            if (aVar == null) {
                j = yx5Var.k();
                l = yx5Var.f();
                a2 = false;
            } else {
                long c = aVar.c();
                j = c;
                a2 = aVar.a();
                l = d06Var.l(aVar.b());
            }
            lb4Var.h(yx5Var.c(), new vx5(yx5Var.c(), yx5Var.k(), yx5Var.f(), yx5Var.a(), yx5Var.h(), j, l, a2, false, yx5Var.j(), yx5Var.b(), yx5Var.i(), yx5Var.e(), null));
            if (yx5Var.a()) {
                this.a.h(yx5Var.c(), new a(yx5Var.k(), yx5Var.g(), yx5Var.a(), yx5Var.j(), null));
            } else {
                this.a.i(yx5Var.c());
            }
        }
        return new pq3(lb4Var, xx5Var);
    }
}
