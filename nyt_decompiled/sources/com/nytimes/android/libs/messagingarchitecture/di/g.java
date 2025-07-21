package com.nytimes.android.libs.messagingarchitecture.di;

import com.nytimes.android.libs.messagingarchitecture.network.local.OMAApiService;
import defpackage.ba2;
import defpackage.g16;
import retrofit2.Retrofit;

/* loaded from: classes4.dex */
public abstract class g implements ba2 {
    public static OMAApiService a(Retrofit.Builder builder) {
        return (OMAApiService) g16.e(LibsMessagingArchitectureModule.Companion.g(builder));
    }
}
