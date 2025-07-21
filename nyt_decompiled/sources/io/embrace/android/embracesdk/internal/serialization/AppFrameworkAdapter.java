package io.embrace.android.embracesdk.internal.serialization;

import defpackage.er2;
import defpackage.um8;
import defpackage.zq3;
import io.embrace.android.embracesdk.internal.payload.EnvelopeResource;

/* loaded from: classes5.dex */
public final class AppFrameworkAdapter {
    @er2
    public final EnvelopeResource.AppFramework fromJson(int i) {
        return EnvelopeResource.AppFramework.Companion.fromInt(i);
    }

    @um8
    public final int toJson(EnvelopeResource.AppFramework appFramework) {
        zq3.h(appFramework, "appFramework");
        return appFramework.getValue();
    }
}
