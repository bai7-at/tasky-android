package defpackage;

import defpackage.jc5;
import rx.exceptions.OnErrorThrowable;

/* loaded from: classes5.dex */
public final class vi5 implements jc5.b {
    final ps2 a;

    static final class a extends wa8 {
        final wa8 a;
        final ps2 b;
        boolean c;

        public a(wa8 wa8Var, ps2 ps2Var) {
            this.a = wa8Var;
            this.b = ps2Var;
            request(0L);
        }

        @Override // defpackage.uc5
        public void onCompleted() {
            if (this.c) {
                return;
            }
            this.a.onCompleted();
        }

        @Override // defpackage.uc5
        public void onError(Throwable th) {
            if (this.c) {
                q47.a(th);
            } else {
                this.c = true;
                this.a.onError(th);
            }
        }

        @Override // defpackage.uc5
        public void onNext(Object obj) {
            try {
                if (((Boolean) this.b.call(obj)).booleanValue()) {
                    this.a.onNext(obj);
                } else {
                    request(1L);
                }
            } catch (Throwable th) {
                e62.d(th);
                unsubscribe();
                onError(OnErrorThrowable.a(th, obj));
            }
        }

        @Override // defpackage.wa8
        public void setProducer(b46 b46Var) {
            super.setProducer(b46Var);
            this.a.setProducer(b46Var);
        }
    }

    public vi5(ps2 ps2Var) {
        this.a = ps2Var;
    }

    @Override // defpackage.ps2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public wa8 call(wa8 wa8Var) {
        a aVar = new a(wa8Var, this.a);
        wa8Var.add(aVar);
        return aVar;
    }
}
