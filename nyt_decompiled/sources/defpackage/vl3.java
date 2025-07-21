package defpackage;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.facebook.AccessToken;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class vl3 {
    public static final vl3 a = new vl3();

    public interface a {
        void a(String str);
    }

    public static final class b implements InstallReferrerStateListener {
        final /* synthetic */ InstallReferrerClient a;
        final /* synthetic */ a b;

        b(InstallReferrerClient installReferrerClient, a aVar) {
            this.a = installReferrerClient;
            this.b = aVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i) {
            if (c11.d(this)) {
                return;
            }
            try {
                if (i != 0) {
                    if (i != 2) {
                        return;
                    }
                    vl3.a.e();
                    return;
                }
                try {
                    ReferrerDetails installReferrer = this.a.getInstallReferrer();
                    zq3.g(installReferrer, "{\n                      referrerClient.installReferrer\n                    }");
                    String installReferrer2 = installReferrer.getInstallReferrer();
                    if (installReferrer2 != null && (h.P(installReferrer2, "fb", false, 2, null) || h.P(installReferrer2, AccessToken.DEFAULT_GRAPH_DOMAIN, false, 2, null))) {
                        this.b.a(installReferrer2);
                    }
                    vl3.a.e();
                } catch (RemoteException unused) {
                }
            } catch (Throwable th) {
                c11.b(th, this);
            }
        }
    }

    private vl3() {
    }

    private final boolean b() {
        return w92.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    private final void c(a aVar) {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(w92.l()).build();
        try {
            build.startConnection(new b(build, aVar));
        } catch (Exception unused) {
        }
    }

    public static final void d(a aVar) {
        zq3.h(aVar, "callback");
        vl3 vl3Var = a;
        if (vl3Var.b()) {
            return;
        }
        vl3Var.c(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        w92.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }
}
