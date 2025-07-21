package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import defpackage.e28;

/* loaded from: classes2.dex */
final class u implements ResultCallback {
    final /* synthetic */ StatusPendingResult a;
    final /* synthetic */ boolean b;
    final /* synthetic */ GoogleApiClient c;
    final /* synthetic */ zabe d;

    u(zabe zabeVar, StatusPendingResult statusPendingResult, boolean z, GoogleApiClient googleApiClient) {
        this.d = zabeVar;
        this.a = statusPendingResult;
        this.b = z;
        this.c = googleApiClient;
    }

    @Override // com.google.android.gms.common.api.ResultCallback
    public final /* bridge */ /* synthetic */ void onResult(Result result) {
        Context context;
        Status status = (Status) result;
        context = this.d.zan;
        e28.b(context).i();
        if (status.isSuccess() && this.d.isConnected()) {
            zabe zabeVar = this.d;
            zabeVar.disconnect();
            zabeVar.connect();
        }
        this.a.setResult(status);
        if (this.b) {
            this.c.disconnect();
        }
    }
}
