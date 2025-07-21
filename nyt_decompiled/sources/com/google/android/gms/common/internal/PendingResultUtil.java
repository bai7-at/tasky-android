package com.google.android.gms.common.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.api.Result;
import defpackage.og8;
import defpackage.qg8;

@KeepForSdk
/* loaded from: classes2.dex */
public class PendingResultUtil {
    private static final zas zaa = new f();

    @KeepForSdk
    public interface ResultConverter<R extends Result, T> {
        @KeepForSdk
        T convert(R r);
    }

    @KeepForSdk
    public static <R extends Result, T extends Response<R>> og8 toResponseTask(PendingResult<R> pendingResult, T t) {
        return toTask(pendingResult, new h(t));
    }

    @KeepForSdk
    public static <R extends Result, T> og8 toTask(PendingResult<R> pendingResult, ResultConverter<R, T> resultConverter) {
        zas zasVar = zaa;
        qg8 qg8Var = new qg8();
        pendingResult.addStatusListener(new g(pendingResult, qg8Var, resultConverter, zasVar));
        return qg8Var.a();
    }

    @KeepForSdk
    public static <R extends Result> og8 toVoidTask(PendingResult<R> pendingResult) {
        return toTask(pendingResult, new i());
    }
}
