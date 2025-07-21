package com.nytimes.android.libs.messagingarchitecture.network;

import android.app.Application;
import com.apollographql.apollo.ApolloClient;
import defpackage.er4;
import defpackage.qr4;
import defpackage.u0;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class GraphQlMessageFetcher implements er4 {
    public static final a Companion = new a(null);
    public static final int g = 8;
    private final ApolloClient a;
    private final qr4 b;
    private final u0 c;
    private final com.nytimes.android.libs.messagingarchitecture.network.a d;
    private final boolean e;
    private final Application f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public GraphQlMessageFetcher(ApolloClient apolloClient, qr4 qr4Var, u0 u0Var, com.nytimes.android.libs.messagingarchitecture.network.a aVar, boolean z, Application application) {
        zq3.h(apolloClient, "apolloClient");
        zq3.h(qr4Var, "messageParser");
        zq3.h(u0Var, "abraParamProvider");
        zq3.h(aVar, "debugInputProvider");
        zq3.h(application, "context");
        this.a = apolloClient;
        this.b = qr4Var;
        this.c = u0Var;
        this.d = aVar;
        this.e = z;
        this.f = application;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.er4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.by0 r44) {
        /*
            Method dump skipped, instructions count: 389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.libs.messagingarchitecture.network.GraphQlMessageFetcher.a(by0):java.lang.Object");
    }
}
