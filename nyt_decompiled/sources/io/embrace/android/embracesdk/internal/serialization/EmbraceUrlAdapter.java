package io.embrace.android.embracesdk.internal.serialization;

import defpackage.er2;
import defpackage.um8;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.EmbraceUrl;

/* loaded from: classes5.dex */
public final class EmbraceUrlAdapter {
    @er2
    public final EmbraceUrl fromJson(EmbraceUrlJson embraceUrlJson) {
        zq3.h(embraceUrlJson, "json");
        String url = embraceUrlJson.getUrl();
        if (url == null) {
            return null;
        }
        return EmbraceUrl.Companion.create(url);
    }

    @um8
    public final EmbraceUrlJson toJson(EmbraceUrl embraceUrl) {
        String embraceUrl2;
        if (embraceUrl == null || (embraceUrl2 = embraceUrl.toString()) == null) {
            return null;
        }
        return new EmbraceUrlJson(embraceUrl2);
    }
}
