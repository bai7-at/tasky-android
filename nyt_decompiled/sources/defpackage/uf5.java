package defpackage;

import defpackage.eb7;
import defpackage.jc5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class uf5 implements jc5.a {
    final long a;
    final long b;
    final TimeUnit c;
    final eb7 d;

    class a implements v3 {
        long a;
        final /* synthetic */ wa8 b;
        final /* synthetic */ eb7.a c;

        a(wa8 wa8Var, eb7.a aVar) {
            this.b = wa8Var;
            this.c = aVar;
        }

        @Override // defpackage.v3
        public void call() {
            try {
                wa8 wa8Var = this.b;
                long j = this.a;
                this.a = 1 + j;
                wa8Var.onNext(Long.valueOf(j));
            } catch (Throwable th) {
                try {
                    this.c.unsubscribe();
                } finally {
                    e62.e(th, this.b);
                }
            }
        }
    }

    public uf5(long j, long j2, TimeUnit timeUnit, eb7 eb7Var) {
        this.a = j;
        this.b = j2;
        this.c = timeUnit;
        this.d = eb7Var;
    }

    @Override // defpackage.w3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(wa8 wa8Var) {
        eb7.a a2 = this.d.a();
        wa8Var.add(a2);
        a2.d(new a(wa8Var, a2), this.a, this.b, this.c);
    }
}
