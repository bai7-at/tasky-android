package defpackage;

/* loaded from: classes3.dex */
final class yea implements Runnable {
    final /* synthetic */ zea a;

    yea(zea zeaVar) {
        this.a = zeaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        boolean z;
        tae taeVar;
        Object obj2;
        obj = this.a.n;
        synchronized (obj) {
            z = this.a.r;
            if (z) {
                return;
            }
            this.a.r = true;
            try {
                zea.k(this.a);
            } catch (Exception e) {
                taeVar = this.a.f;
                taeVar.c(2023, -1L, e);
            }
            obj2 = this.a.n;
            synchronized (obj2) {
                this.a.r = false;
            }
        }
    }
}
