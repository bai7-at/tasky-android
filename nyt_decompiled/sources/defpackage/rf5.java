package defpackage;

import defpackage.jc5;

/* loaded from: classes5.dex */
public final class rf5 implements jc5.a {
    static final o47 c = r47.b().c();
    final jc5.a a;
    final jc5.b b;

    public rf5(jc5.a aVar, jc5.b bVar) {
        this.a = aVar;
        this.b = bVar;
    }

    @Override // defpackage.w3
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void call(wa8 wa8Var) {
        try {
            wa8 wa8Var2 = (wa8) c.b(this.b).call(wa8Var);
            try {
                wa8Var2.onStart();
                this.a.call(wa8Var2);
            } catch (Throwable th) {
                e62.d(th);
                wa8Var2.onError(th);
            }
        } catch (Throwable th2) {
            e62.d(th2);
            wa8Var.onError(th2);
        }
    }
}
