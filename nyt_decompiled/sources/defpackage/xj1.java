package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
final class xj1 implements gp8 {
    private static final gp8 a = new xj1();

    private static final class a implements vx7 {
        private xx7 a;

        private a() {
        }

        static a e() {
            return new a();
        }

        @Override // defpackage.vx7
        public ux7 a() {
            if (this.a == null) {
                this.a = ux7.current().b();
            }
            return ux7.f(this.a);
        }

        @Override // defpackage.vx7
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b() {
            this.a = xx7.e();
            return this;
        }

        @Override // defpackage.vx7
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a d(hx0 hx0Var) {
            if (hx0Var == null) {
                rj.a("context is null");
                return this;
            }
            this.a = ux7.i(hx0Var).b();
            return this;
        }

        @Override // defpackage.vx7
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a c(long j, TimeUnit timeUnit) {
            return this;
        }
    }

    private xj1() {
    }

    static gp8 b() {
        return a;
    }

    @Override // defpackage.gp8
    public vx7 a(String str) {
        return a.e();
    }
}
