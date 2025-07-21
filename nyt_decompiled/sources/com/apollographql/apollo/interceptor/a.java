package com.apollographql.apollo.interceptor;

import com.apollographql.apollo.exception.ApolloException;
import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.OfflineException;
import defpackage.uj;

/* loaded from: classes2.dex */
public abstract class a {
    private static final ApolloNetworkException a = new ApolloNetworkException("The device is offline", OfflineException.a);

    public static final uj a() {
        return new DefaultRetryOnErrorInterceptorImpl(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(ApolloException apolloException) {
        return apolloException instanceof ApolloNetworkException;
    }
}
