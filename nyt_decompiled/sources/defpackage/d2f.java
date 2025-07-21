package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;

/* loaded from: classes3.dex */
public final class d2f extends GoogleApi implements cze {
    private static final Api.ClientKey a;
    private static final Api.AbstractClientBuilder b;
    private static final Api c;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        a = clientKey;
        i1f i1fVar = new i1f();
        b = i1fVar;
        c = new Api("SignalSdk.API", i1fVar, clientKey);
    }

    public d2f(Context context) {
        super(context, (Api<Api.ApiOptions>) c, (Api.ApiOptions) null, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
