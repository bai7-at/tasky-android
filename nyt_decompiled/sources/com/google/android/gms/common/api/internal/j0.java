package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class j0 extends RegisterListenerMethod {
    final /* synthetic */ RegistrationMethods.Builder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j0(RegistrationMethods.Builder builder, ListenerHolder listenerHolder, Feature[] featureArr, boolean z, int i) {
        super(listenerHolder, featureArr, z, i);
        this.a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.RegisterListenerMethod
    protected final void registerListener(Api.AnyClient anyClient, qg8 qg8Var) {
        RemoteCall remoteCall;
        remoteCall = this.a.zaa;
        remoteCall.accept(anyClient, qg8Var);
    }
}
