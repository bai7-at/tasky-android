package defpackage;

import com.nytimes.android.deeplink.NytUriHandler;

/* loaded from: classes4.dex */
public final class bq6 implements br {
    public static final int b = NytUriHandler.e;
    private final NytUriHandler a;

    public bq6(NytUriHandler nytUriHandler) {
        zq3.h(nytUriHandler, "uriHandler");
        this.a = nytUriHandler;
    }

    @Override // defpackage.br
    public void c(j38 j38Var) {
        zq3.h(j38Var, "lockup");
        this.a.a(j38Var.c());
    }
}
