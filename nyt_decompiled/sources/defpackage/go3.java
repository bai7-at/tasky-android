package defpackage;

import com.nytimes.android.deeplink.NytUriHandler;
import com.nytimes.android.features.discovery.discoverytab.DiscoveryEventTracker;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public final class go3 implements br, sh7 {
    private final NytUriHandler a;
    private final NetworkStatus b;
    private final SnackbarUtil c;
    private final DiscoveryEventTracker d;

    public go3(NytUriHandler nytUriHandler, NetworkStatus networkStatus, SnackbarUtil snackbarUtil, DiscoveryEventTracker discoveryEventTracker) {
        zq3.h(nytUriHandler, "uriHandler");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(discoveryEventTracker, "discoveryEventTracker");
        this.a = nytUriHandler;
        this.b = networkStatus;
        this.c = snackbarUtil;
        this.d = discoveryEventTracker;
    }

    @Override // defpackage.sh7
    public void a(mh7 mh7Var) {
        zq3.h(mh7Var, "lockup");
        if (!this.b.g() && !mh7Var.e()) {
            SnackbarUtil.p(this.c, false, 1, null);
        } else {
            this.d.m(mh7Var);
            this.a.a(mh7Var.d());
        }
    }

    @Override // defpackage.sh7
    public void b(uv4 uv4Var) {
        zq3.h(uv4Var, "lockup");
        if (!this.b.g() && !uv4Var.g()) {
            SnackbarUtil.p(this.c, false, 1, null);
        } else {
            this.d.l(uv4Var);
            this.a.a(uv4Var.e());
        }
    }

    @Override // defpackage.br
    public void c(j38 j38Var) {
        zq3.h(j38Var, "lockup");
        this.d.k(j38Var);
        this.a.f(j38Var.c(), j38Var.d());
    }
}
