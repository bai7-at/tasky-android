package defpackage;

import defpackage.gl1;

/* loaded from: classes3.dex */
class rk5 implements q76, gl1 {
    private static final gl1.a c = new gl1.a() { // from class: ok5
        @Override // gl1.a
        public final void a(q76 q76Var) {
            rk5.f(q76Var);
        }
    };
    private static final q76 d = new q76() { // from class: pk5
        @Override // defpackage.q76
        public final Object get() {
            Object g;
            g = rk5.g();
            return g;
        }
    };
    private gl1.a a;
    private volatile q76 b;

    private rk5(gl1.a aVar, q76 q76Var) {
        this.a = aVar;
        this.b = q76Var;
    }

    static rk5 e() {
        return new rk5(c, d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void f(q76 q76Var) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object g() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(gl1.a aVar, gl1.a aVar2, q76 q76Var) {
        aVar.a(q76Var);
        aVar2.a(q76Var);
    }

    static rk5 i(q76 q76Var) {
        return new rk5(null, q76Var);
    }

    @Override // defpackage.gl1
    public void a(final gl1.a aVar) {
        q76 q76Var;
        q76 q76Var2;
        q76 q76Var3 = this.b;
        q76 q76Var4 = d;
        if (q76Var3 != q76Var4) {
            aVar.a(q76Var3);
            return;
        }
        synchronized (this) {
            q76Var = this.b;
            if (q76Var != q76Var4) {
                q76Var2 = q76Var;
            } else {
                final gl1.a aVar2 = this.a;
                this.a = new gl1.a() { // from class: qk5
                    @Override // gl1.a
                    public final void a(q76 q76Var5) {
                        rk5.h(gl1.a.this, aVar, q76Var5);
                    }
                };
                q76Var2 = null;
            }
        }
        if (q76Var2 != null) {
            aVar.a(q76Var);
        }
    }

    @Override // defpackage.q76
    public Object get() {
        return this.b.get();
    }

    void j(q76 q76Var) {
        gl1.a aVar;
        if (this.b != d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.a;
            this.a = null;
            this.b = q76Var;
        }
        aVar.a(q76Var);
    }
}
