package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class n0 extends TaskApiCall {
    final /* synthetic */ TaskApiCall.Builder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n0(TaskApiCall.Builder builder, Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final void doExecute(Api.AnyClient anyClient, qg8 qg8Var) {
        RemoteCall remoteCall;
        remoteCall = this.a.zaa;
        remoteCall.accept(anyClient, qg8Var);
    }
}
