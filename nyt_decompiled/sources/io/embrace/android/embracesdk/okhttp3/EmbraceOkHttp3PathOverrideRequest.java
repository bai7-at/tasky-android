package io.embrace.android.embracesdk.okhttp3;

import com.facebook.AuthenticationTokenClaims;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest;
import okhttp3.Request;

/* loaded from: classes5.dex */
public final class EmbraceOkHttp3PathOverrideRequest implements HttpPathOverrideRequest {
    private final Request request;

    public EmbraceOkHttp3PathOverrideRequest(Request request) {
        zq3.h(request, "request");
        this.request = request;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest
    public String getHeaderByName(String str) {
        zq3.h(str, AuthenticationTokenClaims.JSON_KEY_NAME);
        return this.request.header(str);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest
    public String getOverriddenURL(String str) {
        zq3.h(str, "pathOverride");
        return this.request.url().newBuilder().encodedPath(str).build().toString();
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest
    public String getURLString() {
        return this.request.url().toString();
    }
}
