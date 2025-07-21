package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.ugb;

/* loaded from: classes3.dex */
final class v5 implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ ugb a;
    final /* synthetic */ x5 b;

    v5(x5 x5Var, ugb ugbVar) {
        this.a = ugbVar;
        this.b = x5Var;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        o5 o5Var;
        try {
            ugb ugbVar = this.a;
            o5Var = this.b.a;
            ugbVar.c(o5Var.c());
        } catch (DeadObjectException e) {
            this.a.d(e);
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
        this.a.d(new RuntimeException("onConnectionSuspended: " + i));
    }
}
