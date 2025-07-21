package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.google.android.gms.internal.pal.g1;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;

/* loaded from: classes3.dex */
final class eqc implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ksc b;

    eqc(ksc kscVar, int i, boolean z) {
        this.b = kscVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        g1 g1Var;
        ksc kscVar = this.b;
        if (this.a > 0) {
            try {
                Thread.sleep(r1 * NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = kscVar.a.getPackageManager().getPackageInfo(kscVar.a.getPackageName(), 0);
            Context context = kscVar.a;
            g1Var = r2f.a(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            g1Var = null;
        }
        this.b.j = g1Var;
        if (this.a < 4) {
            if (g1Var != null && g1Var.f0() && !g1Var.q0().equals("0000000000000000000000000000000000000000000000000000000000000000") && g1Var.g0() && g1Var.p0().v() && g1Var.p0().s() != -2) {
                return;
            }
            this.b.o(this.a + 1, true);
        }
    }
}
