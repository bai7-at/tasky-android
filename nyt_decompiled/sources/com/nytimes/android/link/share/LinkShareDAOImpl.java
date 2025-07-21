package com.nytimes.android.link.share;

import com.apollographql.apollo.ApolloClient;
import defpackage.e54;
import defpackage.f54;
import defpackage.rp7;
import defpackage.zq3;
import io.reactivex.Single;
import kotlinx.coroutines.rx2.RxSingleKt;

/* loaded from: classes4.dex */
public final class LinkShareDAOImpl implements e54 {
    private final ApolloClient a;
    private final f54 b;

    public LinkShareDAOImpl(ApolloClient apolloClient, f54 f54Var) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(f54Var, "linkShareParser");
        this.a = apolloClient;
        this.b = f54Var;
    }

    @Override // defpackage.e54
    public Single a(rp7 rp7Var, String str) {
        zq3.h(rp7Var, "shareCodeRequest");
        return RxSingleKt.rxSingle$default(null, new LinkShareDAOImpl$createShareLink$1(this, rp7Var, str, null), 1, null);
    }
}
