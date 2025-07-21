package defpackage;

/* loaded from: classes3.dex */
final class bff implements Runnable {
    final /* synthetic */ og8 a;
    final /* synthetic */ qhf b;

    bff(qhf qhfVar, og8 og8Var) {
        this.b = qhfVar;
        this.a = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        vf5 vf5Var;
        vf5 vf5Var2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                qhf qhfVar = this.b;
                vf5Var = qhfVar.c;
                if (vf5Var != null) {
                    vf5Var2 = qhfVar.c;
                    vf5Var2.onSuccess(this.a.m());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
