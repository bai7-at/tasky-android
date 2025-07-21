package defpackage;

/* loaded from: classes3.dex */
final class m6f implements Runnable {
    final /* synthetic */ og8 a;
    final /* synthetic */ q8f b;

    m6f(q8f q8fVar, og8 og8Var) {
        this.b = q8fVar;
        this.a = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        me5 me5Var;
        me5 me5Var2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                q8f q8fVar = this.b;
                me5Var = q8fVar.c;
                if (me5Var != null) {
                    me5Var2 = q8fVar.c;
                    me5Var2.onComplete(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
