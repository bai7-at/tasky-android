package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.internal.BaseGmsClient;

/* loaded from: classes2.dex */
final class d0 implements BaseGmsClient.SignOutCallbacks {
    final /* synthetic */ zabq a;

    d0(zabq zabqVar) {
        this.a = zabqVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.SignOutCallbacks
    public final void onSignOutComplete() {
        this.a.zaa.zar.post(new c0(this));
    }
}
