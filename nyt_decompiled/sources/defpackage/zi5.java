package defpackage;

import defpackage.eb7;
import defpackage.jc5;

/* loaded from: classes5.dex */
public final class zi5 implements jc5.a {
    final eb7 a;
    final jc5 b;

    class a implements v3 {
        final /* synthetic */ wa8 a;
        final /* synthetic */ eb7.a b;

        /* renamed from: zi5$a$a, reason: collision with other inner class name */
        class C0561a extends wa8 {
            final /* synthetic */ Thread a;

            /* renamed from: zi5$a$a$a, reason: collision with other inner class name */
            class C0562a implements b46 {
                final /* synthetic */ b46 a;

                /* renamed from: zi5$a$a$a$a, reason: collision with other inner class name */
                class C0563a implements v3 {
                    final /* synthetic */ long a;

                    C0563a(long j) {
                        this.a = j;
                    }

                    @Override // defpackage.v3
                    public void call() {
                        C0562a.this.a.request(this.a);
                    }
                }

                C0562a(b46 b46Var) {
                    this.a = b46Var;
                }

                @Override // defpackage.b46
                public void request(long j) {
                    if (C0561a.this.a == Thread.currentThread()) {
                        this.a.request(j);
                    } else {
                        a.this.b.b(new C0563a(j));
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0561a(wa8 wa8Var, Thread thread) {
                super(wa8Var);
                this.a = thread;
            }

            @Override // defpackage.uc5
            public void onCompleted() {
                try {
                    a.this.a.onCompleted();
                } finally {
                    a.this.b.unsubscribe();
                }
            }

            @Override // defpackage.uc5
            public void onError(Throwable th) {
                try {
                    a.this.a.onError(th);
                } finally {
                    a.this.b.unsubscribe();
                }
            }

            @Override // defpackage.uc5
            public void onNext(Object obj) {
                a.this.a.onNext(obj);
            }

            @Override // defpackage.wa8
            public void setProducer(b46 b46Var) {
                a.this.a.setProducer(new C0562a(b46Var));
            }
        }

        a(wa8 wa8Var, eb7.a aVar) {
            this.a = wa8Var;
            this.b = aVar;
        }

        @Override // defpackage.v3
        public void call() {
            zi5.this.b.t(new C0561a(this.a, Thread.currentThread()));
        }
    }

    public zi5(jc5 jc5Var, eb7 eb7Var) {
        this.a = eb7Var;
        this.b = jc5Var;
    }

    @Override // defpackage.w3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(wa8 wa8Var) {
        eb7.a a2 = this.a.a();
        wa8Var.add(a2);
        a2.b(new a(wa8Var, a2));
    }
}
