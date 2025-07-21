package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.Embrace;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes5.dex */
class EmbraceHttpUrlConnectionOverride implements HttpPathOverrideRequest {
    private final HttpURLConnection connection;

    EmbraceHttpUrlConnectionOverride(HttpURLConnection httpURLConnection) {
        this.connection = httpURLConnection;
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest
    public String getHeaderByName(String str) {
        return this.connection.getRequestProperty(str);
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest
    public String getOverriddenURL(String str) {
        try {
            return new URL(this.connection.getURL().getProtocol(), this.connection.getURL().getHost(), this.connection.getURL().getPort(), str + "?" + this.connection.getURL().getQuery()).toString();
        } catch (MalformedURLException unused) {
            Embrace.getInstance().getInternalInterface().logError("Failed to override path of " + this.connection.getURL() + " with " + str, null, null, false);
            return this.connection.getURL().toString();
        }
    }

    @Override // io.embrace.android.embracesdk.internal.network.http.HttpPathOverrideRequest
    public String getURLString() {
        return this.connection.getURL().toString();
    }
}
