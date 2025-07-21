package com.google.android.gms.internal.appset;

import android.content.Context;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.internal.appset.a;
import com.google.android.gms.internal.appset.b;
import com.google.android.gms.internal.appset.g;
import defpackage.og8;
import defpackage.rzc;
import defpackage.vg8;
import defpackage.vm;

/* loaded from: classes3.dex */
public final class g extends GoogleApi implements vm {
    private static final Api.ClientKey c;
    private static final Api.AbstractClientBuilder d;
    private static final Api e;
    private final Context a;
    private final GoogleApiAvailabilityLight b;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        c = clientKey;
        f fVar = new f();
        d = fVar;
        e = new Api("AppSet.API", fVar, clientKey);
    }

    g(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        super(context, (Api<Api.ApiOptions.NoOptions>) e, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
        this.a = context;
        this.b = googleApiAvailabilityLight;
    }

    @Override // defpackage.vm
    public final og8 b() {
        return this.b.isGooglePlayServicesAvailable(this.a, 212800000) == 0 ? doRead(TaskApiCall.builder().setFeatures(rzc.a).run(new RemoteCall() { // from class: lff
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(Object obj, Object obj2) {
                ((b) ((a) obj).getService()).l3(new zza(null, null), new ilf(g.this, (qg8) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(27601).build()) : vg8.d(new ApiException(new Status(17)));
    }
}
