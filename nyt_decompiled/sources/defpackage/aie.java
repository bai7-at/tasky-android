package defpackage;

/* loaded from: classes3.dex */
final class aie implements Runnable {
    final /* synthetic */ v0f a;

    aie(v0f v0fVar) {
        this.a = v0fVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        le5 le5Var;
        le5 le5Var2;
        obj = this.a.b;
        synchronized (obj) {
            try {
                v0f v0fVar = this.a;
                le5Var = v0fVar.c;
                if (le5Var != null) {
                    le5Var2 = v0fVar.c;
                    le5Var2.a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
