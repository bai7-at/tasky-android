package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class h extends IStatusCallback.Stub {
    final /* synthetic */ qg8 a;

    h(zay zayVar, qg8 qg8Var) {
        this.a = qg8Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.trySetResultOrApiException(status, Boolean.TRUE, this.a);
    }
}
