package defpackage;

import android.os.ConditionVariable;

/* loaded from: classes3.dex */
final class afa implements Runnable {
    final /* synthetic */ bfa a;

    afa(bfa bfaVar) {
        this.a = bfaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        jga jgaVar;
        ConditionVariable conditionVariable2;
        if (this.a.b != null) {
            return;
        }
        conditionVariable = bfa.c;
        synchronized (conditionVariable) {
            if (this.a.b != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) mpa.q2.e()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    jgaVar = this.a.a;
                    bfa.d = fce.b(jgaVar.a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.a.b = Boolean.valueOf(z2);
            conditionVariable2 = bfa.c;
            conditionVariable2.open();
        }
    }
}
