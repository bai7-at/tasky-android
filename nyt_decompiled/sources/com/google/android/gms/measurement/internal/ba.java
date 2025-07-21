package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.skb;
import defpackage.x4f;

/* loaded from: classes3.dex */
final class ba implements x4f {
    public final skb a;
    final /* synthetic */ AppMeasurementDynamiteService b;

    ba(AppMeasurementDynamiteService appMeasurementDynamiteService, skb skbVar) {
        this.b = appMeasurementDynamiteService;
        this.a = skbVar;
    }

    @Override // defpackage.x4f
    public final void a(String str, String str2, Bundle bundle, long j) {
        try {
            this.a.z0(str, str2, bundle, j);
        } catch (RemoteException e) {
            a5 a5Var = this.b.a;
            if (a5Var != null) {
                a5Var.o().v().b("Event listener threw exception", e);
            }
        }
    }
}
