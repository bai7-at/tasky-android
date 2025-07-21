package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.ugb;

/* loaded from: classes3.dex */
final class w5 implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ ugb a;

    w5(x5 x5Var, ugb ugbVar) {
        this.a = ugbVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.a.d(new RuntimeException("Connection failed."));
    }
}
