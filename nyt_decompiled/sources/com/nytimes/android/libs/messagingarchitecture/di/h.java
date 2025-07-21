package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.network.GraphQlMessageFetcher;
import defpackage.ba2;
import defpackage.er4;
import defpackage.g16;

/* loaded from: classes4.dex */
public abstract class h implements ba2 {
    public static er4 a(GraphQlMessageFetcher graphQlMessageFetcher) {
        return (er4) g16.e(LibsMessagingArchitectureModule.Companion.h(graphQlMessageFetcher));
    }
}
