package io.embrace.android.embracesdk.internal.network.http;

import io.embrace.android.embracesdk.annotation.InternalApi;

@InternalApi
/* loaded from: classes5.dex */
public interface HttpPathOverrideRequest {
    String getHeaderByName(String str);

    String getOverriddenURL(String str);

    String getURLString();
}
