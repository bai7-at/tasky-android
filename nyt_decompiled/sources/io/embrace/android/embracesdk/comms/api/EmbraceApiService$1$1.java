package io.embrace.android.embracesdk.comms.api;

import defpackage.gt2;
import defpackage.ss2;
import defpackage.zq3;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class EmbraceApiService$1$1 extends FunctionReferenceImpl implements gt2 {
    EmbraceApiService$1$1(EmbraceApiService embraceApiService) {
        super(2, embraceApiService, EmbraceApiService.class, "executePost", "executePost(Lio/embrace/android/embracesdk/comms/api/ApiRequest;Lkotlin/jvm/functions/Function1;)Lio/embrace/android/embracesdk/comms/api/ApiResponse;", 0);
    }

    @Override // defpackage.gt2
    public final ApiResponse invoke(ApiRequest apiRequest, ss2 ss2Var) {
        ApiResponse executePost;
        zq3.h(apiRequest, "p1");
        zq3.h(ss2Var, "p2");
        executePost = ((EmbraceApiService) this.receiver).executePost(apiRequest, ss2Var);
        return executePost;
    }
}
