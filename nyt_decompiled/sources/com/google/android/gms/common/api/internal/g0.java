package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class g0 implements BaseGmsClient.ConnectionProgressReportCallbacks, zacs {
    private final Api.Client a;
    private final ApiKey b;
    private IAccountAccessor c = null;
    private Set d = null;
    private boolean e = false;
    final /* synthetic */ GoogleApiManager f;

    public g0(GoogleApiManager googleApiManager, Api.Client client, ApiKey apiKey) {
        this.f = googleApiManager;
        this.a = client;
        this.b = apiKey;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e() {
        IAccountAccessor iAccountAccessor;
        if (!this.e || (iAccountAccessor = this.c) == null) {
            return;
        }
        this.a.getRemoteService(iAccountAccessor, this.d);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.ConnectionProgressReportCallbacks
    public final void onReportServiceBinding(ConnectionResult connectionResult) {
        this.f.zar.post(new f0(this, connectionResult));
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zae(ConnectionResult connectionResult) {
        Map map;
        map = this.f.zan;
        zabq zabqVar = (zabq) map.get(this.b);
        if (zabqVar != null) {
            zabqVar.zas(connectionResult);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zacs
    public final void zaf(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            zae(new ConnectionResult(4));
        } else {
            this.c = iAccountAccessor;
            this.d = set;
            e();
        }
    }
}
