package com.nytimes.android.abra.allocator;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AuthenticationTokenClaims;
import com.squareup.duktape.Duktape;
import defpackage.qs2;
import defpackage.zq3;

/* loaded from: classes2.dex */
public final class DuktapeClient {
    private Duktape duktape;
    private final qs2 provider;

    public DuktapeClient(qs2 qs2Var) {
        zq3.h(qs2Var, "provider");
        this.provider = qs2Var;
        this.duktape = (Duktape) qs2Var.mo865invoke();
    }

    public final void close() {
        this.duktape.close();
    }

    public final Object evaluate(String str) {
        zq3.h(str, "script");
        return this.duktape.evaluate(str);
    }

    public final AbraInterface get(String str, Class<AbraInterface> cls) throws Exception {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        zq3.h(cls, TransferTable.COLUMN_TYPE);
        Object obj = this.duktape.get(str, cls);
        zq3.g(obj, "get(...)");
        return (AbraInterface) obj;
    }

    public final void refresh() {
        this.duktape.close();
        this.duktape = (Duktape) this.provider.mo865invoke();
    }
}
