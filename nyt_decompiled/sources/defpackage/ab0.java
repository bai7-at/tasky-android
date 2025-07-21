package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class ab0 implements gb8 {
    static final v3 b = new a();
    final AtomicReference a;

    static class a implements v3 {
        a() {
        }

        @Override // defpackage.v3
        public void call() {
        }
    }

    public ab0() {
        this.a = new AtomicReference();
    }

    public static ab0 a() {
        return new ab0();
    }

    public static ab0 b(v3 v3Var) {
        return new ab0(v3Var);
    }

    @Override // defpackage.gb8
    public boolean isUnsubscribed() {
        return this.a.get() == b;
    }

    @Override // defpackage.gb8
    public final void unsubscribe() {
        v3 v3Var;
        v3 v3Var2 = (v3) this.a.get();
        v3 v3Var3 = b;
        if (v3Var2 == v3Var3 || (v3Var = (v3) this.a.getAndSet(v3Var3)) == null || v3Var == v3Var3) {
            return;
        }
        v3Var.call();
    }

    private ab0(v3 v3Var) {
        this.a = new AtomicReference(v3Var);
    }
}
