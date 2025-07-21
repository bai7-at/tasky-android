package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import defpackage.og8;
import defpackage.qg8;

@KeepForSdk
/* loaded from: classes2.dex */
public class TaskUtil {
    @KeepForSdk
    public static void setResultOrApiException(Status status, qg8 qg8Var) {
        setResultOrApiException(status, null, qg8Var);
    }

    @KeepForSdk
    @Deprecated
    public static og8 toVoidTaskThatFailsOnFalse(og8 og8Var) {
        return og8Var.h(new o0());
    }

    @ResultIgnorabilityUnspecified
    @KeepForSdk
    public static <ResultT> boolean trySetResultOrApiException(Status status, ResultT resultt, qg8 qg8Var) {
        return status.isSuccess() ? qg8Var.e(resultt) : qg8Var.d(ApiExceptionUtil.fromStatus(status));
    }

    @KeepForSdk
    public static <ResultT> void setResultOrApiException(Status status, ResultT resultt, qg8 qg8Var) {
        if (status.isSuccess()) {
            qg8Var.c(resultt);
        } else {
            qg8Var.b(ApiExceptionUtil.fromStatus(status));
        }
    }
}
