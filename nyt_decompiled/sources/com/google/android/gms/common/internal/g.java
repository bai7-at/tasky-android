package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import defpackage.qg8;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class g implements PendingResult.StatusListener {
    final /* synthetic */ PendingResult a;
    final /* synthetic */ qg8 b;
    final /* synthetic */ PendingResultUtil.ResultConverter c;
    final /* synthetic */ zas d;

    g(PendingResult pendingResult, qg8 qg8Var, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.a = pendingResult;
        this.b = qg8Var;
        this.c = resultConverter;
        this.d = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.b.b(ApiExceptionUtil.fromStatus(status));
        } else {
            this.b.c(this.c.convert(this.a.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}
