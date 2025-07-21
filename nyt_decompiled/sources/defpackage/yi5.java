package defpackage;

import defpackage.jc5;

/* loaded from: classes5.dex */
public final class yi5 implements jc5.b {
    final ps2 a;

    static class a implements ps2 {
        final /* synthetic */ ps2 a;

        a(ps2 ps2Var) {
            this.a = ps2Var;
        }

        @Override // defpackage.ps2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public jc5 call(Throwable th) {
            return jc5.f(this.a.call(th));
        }
    }

    class b extends wa8 {
        private boolean a;
        long b;
        final /* synthetic */ wa8 c;
        final /* synthetic */ c46 d;
        final /* synthetic */ kk7 e;

        class a extends wa8 {
            a() {
            }

            @Override // defpackage.uc5
            public void onCompleted() {
                b.this.c.onCompleted();
            }

            @Override // defpackage.uc5
            public void onError(Throwable th) {
                b.this.c.onError(th);
            }

            @Override // defpackage.uc5
            public void onNext(Object obj) {
                b.this.c.onNext(obj);
            }

            @Override // defpackage.wa8
            public void setProducer(b46 b46Var) {
                b.this.d.c(b46Var);
            }
        }

        b(wa8 wa8Var, c46 c46Var, kk7 kk7Var) {
            this.c = wa8Var;
            this.d = c46Var;
            this.e = kk7Var;
        }

        @Override // defpackage.uc5
        public void onCompleted() {
            if (this.a) {
                return;
            }
            this.a = true;
            this.c.onCompleted();
        }

        @Override // defpackage.uc5
        public void onError(Throwable th) {
            if (this.a) {
                e62.d(th);
                r47.b().a().a(th);
                return;
            }
            this.a = true;
            try {
                unsubscribe();
                a aVar = new a();
                this.e.a(aVar);
                long j = this.b;
                if (j != 0) {
                    this.d.b(j);
                }
                ((jc5) yi5.this.a.call(th)).t(aVar);
            } catch (Throwable th2) {
                e62.e(th2, this.c);
            }
        }

        @Override // defpackage.uc5
        public void onNext(Object obj) {
            if (this.a) {
                return;
            }
            this.b++;
            this.c.onNext(obj);
        }

        @Override // defpackage.wa8
        public void setProducer(b46 b46Var) {
            this.d.c(b46Var);
        }
    }

    public yi5(ps2 ps2Var) {
        this.a = ps2Var;
    }

    public static yi5 b(ps2 ps2Var) {
        return new yi5(new a(ps2Var));
    }

    @Override // defpackage.ps2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wa8 call(wa8 wa8Var) {
        c46 c46Var = new c46();
        kk7 kk7Var = new kk7();
        b bVar = new b(wa8Var, c46Var, kk7Var);
        kk7Var.a(bVar);
        wa8Var.add(kk7Var);
        wa8Var.setProducer(c46Var);
        return bVar;
    }
}
