package defpackage;

import defpackage.vs7;
import java.util.NoSuchElementException;

/* loaded from: classes5.dex */
public class sf5 implements vs7.b {
    private final jc5 a;

    class a extends wa8 {
        private boolean a = false;
        private boolean b = false;
        private Object c = null;
        final /* synthetic */ ut7 d;

        a(ut7 ut7Var) {
            this.d = ut7Var;
        }

        @Override // defpackage.uc5
        public void onCompleted() {
            if (this.a) {
                return;
            }
            if (this.b) {
                this.d.c(this.c);
            } else {
                this.d.b(new NoSuchElementException("Observable emitted no items"));
            }
        }

        @Override // defpackage.uc5
        public void onError(Throwable th) {
            this.d.b(th);
            unsubscribe();
        }

        @Override // defpackage.uc5
        public void onNext(Object obj) {
            if (!this.b) {
                this.b = true;
                this.c = obj;
            } else {
                this.a = true;
                this.d.b(new IllegalArgumentException("Observable emitted too many elements"));
                unsubscribe();
            }
        }

        @Override // defpackage.wa8
        public void onStart() {
            request(2L);
        }
    }

    public sf5(jc5 jc5Var) {
        this.a = jc5Var;
    }

    public static sf5 b(jc5 jc5Var) {
        return new sf5(jc5Var);
    }

    @Override // defpackage.w3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(ut7 ut7Var) {
        a aVar = new a(ut7Var);
        ut7Var.a(aVar);
        this.a.t(aVar);
    }
}
