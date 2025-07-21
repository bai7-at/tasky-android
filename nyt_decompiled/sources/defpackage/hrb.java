package defpackage;

import android.os.ConditionVariable;

/* loaded from: classes3.dex */
final class hrb implements Runnable {
    final /* synthetic */ msb a;

    hrb(msb msbVar) {
        this.a = msbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        boolean z;
        ksc kscVar;
        ConditionVariable conditionVariable2;
        if (this.a.b != null) {
            return;
        }
        conditionVariable = msb.c;
        synchronized (conditionVariable) {
            if (this.a.b != null) {
                return;
            }
            boolean z2 = false;
            try {
                z = ((Boolean) fpe.c2.b()).booleanValue();
            } catch (IllegalStateException unused) {
                z = false;
            }
            if (z) {
                try {
                    kscVar = this.a.a;
                    msb.d = g5f.b(kscVar.a, "ADSHIELD", null);
                } catch (Throwable unused2) {
                }
            }
            z2 = z;
            this.a.b = Boolean.valueOf(z2);
            conditionVariable2 = msb.c;
            conditionVariable2.open();
        }
    }
}
