package io.embrace.android.embracesdk.payload;

import defpackage.bt3;
import defpackage.et3;
import defpackage.zq3;
import io.embrace.android.embracesdk.capture.crumbs.Breadcrumb;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class WebViewBreadcrumb implements Breadcrumb {
    private final long startTime;
    private final String url;

    public WebViewBreadcrumb(@bt3(name = "u") String str, @bt3(name = "st") long j) {
        zq3.h(str, "url");
        this.url = str;
        this.startTime = j;
    }

    @Override // io.embrace.android.embracesdk.capture.crumbs.Breadcrumb
    public long getStartTime() {
        return this.startTime;
    }

    public final long getStartTime$embrace_android_sdk_release() {
        return this.startTime;
    }

    public final String getUrl() {
        return this.url;
    }
}
