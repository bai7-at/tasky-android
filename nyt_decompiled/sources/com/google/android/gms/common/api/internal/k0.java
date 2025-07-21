package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.RegistrationMethods;
import defpackage.qg8;

/* loaded from: classes2.dex */
final class k0 extends UnregisterListenerMethod {
    final /* synthetic */ RegistrationMethods.Builder a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k0(RegistrationMethods.Builder builder, ListenerHolder.ListenerKey listenerKey) {
        super(listenerKey);
        this.a = builder;
    }

    @Override // com.google.android.gms.common.api.internal.UnregisterListenerMethod
    protected final void unregisterListener(Api.AnyClient anyClient, qg8 qg8Var) {
        RemoteCall remoteCall;
        remoteCall = this.a.zab;
        remoteCall.accept(anyClient, qg8Var);
    }
}
