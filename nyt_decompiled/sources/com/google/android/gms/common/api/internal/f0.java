package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import java.util.Map;

/* loaded from: classes2.dex */
final class f0 implements Runnable {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ g0 b;

    f0(g0 g0Var, ConnectionResult connectionResult) {
        this.b = g0Var;
        this.a = connectionResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        ApiKey apiKey;
        Api.Client client;
        Api.Client client2;
        Api.Client client3;
        Api.Client client4;
        g0 g0Var = this.b;
        map = g0Var.f.zan;
        apiKey = g0Var.b;
        zabq zabqVar = (zabq) map.get(apiKey);
        if (zabqVar == null) {
            return;
        }
        if (!this.a.isSuccess()) {
            zabqVar.zar(this.a, null);
            return;
        }
        this.b.e = true;
        client = this.b.a;
        if (client.requiresSignIn()) {
            this.b.e();
            return;
        }
        try {
            g0 g0Var2 = this.b;
            client3 = g0Var2.a;
            client4 = g0Var2.a;
            client3.getRemoteService(null, client4.getScopesForConnectionlessNonSignIn());
        } catch (SecurityException e) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e);
            client2 = this.b.a;
            client2.disconnect("Failed to get service from broker.");
            zabqVar.zar(new ConnectionResult(10), null);
        }
    }
}
