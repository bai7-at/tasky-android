package defpackage;

import com.nytimes.android.deeplink.NytUriHandler;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.snackbar.SnackbarUtil;

/* loaded from: classes4.dex */
public final class mr6 implements sh7 {
    private final NytUriHandler a;
    private final NetworkStatus b;
    private final SnackbarUtil c;

    public mr6(NytUriHandler nytUriHandler, NetworkStatus networkStatus, SnackbarUtil snackbarUtil) {
        zq3.h(nytUriHandler, "uriHandler");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(snackbarUtil, "snackbarUtil");
        this.a = nytUriHandler;
        this.b = networkStatus;
        this.c = snackbarUtil;
    }

    private final void c(String str, boolean z) {
        if (this.b.g() || z) {
            this.a.a(str);
        } else {
            SnackbarUtil.p(this.c, false, 1, null);
        }
    }

    @Override // defpackage.sh7
    public void a(mh7 mh7Var) {
        zq3.h(mh7Var, "lockup");
        c(mh7Var.d(), mh7Var.e());
    }

    @Override // defpackage.sh7
    public void b(uv4 uv4Var) {
        zq3.h(uv4Var, "lockup");
        c(uv4Var.f(), uv4Var.g());
    }
}
