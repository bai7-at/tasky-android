package defpackage;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class qaf implements Runnable {
    final /* synthetic */ og8 a;
    final /* synthetic */ wcf b;

    qaf(wcf wcfVar, og8 og8Var) {
        this.b = wcfVar;
        this.a = og8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ue5 ue5Var;
        ue5 ue5Var2;
        obj = this.b.b;
        synchronized (obj) {
            try {
                wcf wcfVar = this.b;
                ue5Var = wcfVar.c;
                if (ue5Var != null) {
                    ue5Var2 = wcfVar.c;
                    ue5Var2.onFailure((Exception) Preconditions.checkNotNull(this.a.l()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
