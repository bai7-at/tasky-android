package com.nytimes.android.eventtracker.api;

import com.nytimes.android.eventtracker.model.Event;
import defpackage.by0;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* loaded from: classes4.dex */
public interface EventTrackerApi {
    @POST("/track")
    Object track(@Body Event[] eventArr, by0<? super Response<String>> by0Var);
}
