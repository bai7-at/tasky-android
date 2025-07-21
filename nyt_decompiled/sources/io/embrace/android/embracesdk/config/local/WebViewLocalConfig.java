package io.embrace.android.embracesdk.config.local;

import defpackage.bt3;
import defpackage.et3;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class WebViewLocalConfig {
    private final Boolean captureQueryParams;
    private final Boolean captureWebViews;

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewLocalConfig() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final Boolean getCaptureQueryParams() {
        return this.captureQueryParams;
    }

    public final Boolean getCaptureWebViews() {
        return this.captureWebViews;
    }

    public WebViewLocalConfig(@bt3(name = "enable") Boolean bool, @bt3(name = "capture_query_params") Boolean bool2) {
        this.captureWebViews = bool;
        this.captureQueryParams = bool2;
    }

    public /* synthetic */ WebViewLocalConfig(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }
}
