package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.ads.n1;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
final class hga implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ jga b;

    hga(jga jgaVar, int i, boolean z) {
        this.b = jgaVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        n1 n1Var;
        int i = this.a;
        jga jgaVar = this.b;
        if (i > 0) {
            try {
                Thread.sleep(i * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = jgaVar.a.getPackageManager().getPackageInfo(jgaVar.a.getPackageName(), 0);
            Context context = jgaVar.a;
            n1Var = bbe.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            n1Var = null;
        }
        this.b.j = n1Var;
        if (this.a < 4) {
            if (n1Var != null && n1Var.v0() && !n1Var.L0().equals("0000000000000000000000000000000000000000000000000000000000000000") && n1Var.w0() && n1Var.J0().O() && n1Var.J0().L() != -2) {
                return;
            }
            this.b.o(this.a + 1, true);
        }
    }
}
