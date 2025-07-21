package defpackage;

import defpackage.eb7;
import defpackage.jc5;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class tf5 implements jc5.a {
    final long a;
    final TimeUnit b;
    final eb7 c;

    class a implements v3 {
        final /* synthetic */ wa8 a;

        a(wa8 wa8Var) {
            this.a = wa8Var;
        }

        @Override // defpackage.v3
        public void call() {
            try {
                this.a.onNext(0L);
                this.a.onCompleted();
            } catch (Throwable th) {
                e62.e(th, this.a);
            }
        }
    }

    public tf5(long j, TimeUnit timeUnit, eb7 eb7Var) {
        this.a = j;
        this.b = timeUnit;
        this.c = eb7Var;
    }

    @Override // defpackage.w3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(wa8 wa8Var) {
        eb7.a a2 = this.c.a();
        wa8Var.add(a2);
        a2.c(new a(wa8Var), this.a, this.b);
    }
}
