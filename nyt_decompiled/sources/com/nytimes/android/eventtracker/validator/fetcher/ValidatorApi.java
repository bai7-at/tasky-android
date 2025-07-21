package com.nytimes.android.eventtracker.validator.fetcher;

import defpackage.by0;
import retrofit2.http.GET;
import retrofit2.http.Url;

/* loaded from: classes4.dex */
public interface ValidatorApi {
    @GET
    Object fetch(@Url String str, by0<? super String> by0Var);
}
