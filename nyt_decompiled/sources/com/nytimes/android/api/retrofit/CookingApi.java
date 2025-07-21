package com.nytimes.android.api.retrofit;

import defpackage.by0;
import java.util.List;
import retrofit2.http.GET;

/* loaded from: classes3.dex */
public interface CookingApi {
    @GET("https://cooking.nytimes.com/api/v5/homepage/")
    Object getCookingHomepage(by0<? super List<CookingContent>> by0Var);
}
