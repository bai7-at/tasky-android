package io.embrace.android.embracesdk.capture.webview;

import io.embrace.android.embracesdk.arch.DataCaptureService;
import io.embrace.android.embracesdk.payload.WebViewInfo;
import java.util.List;

/* loaded from: classes5.dex */
public interface WebViewService extends DataCaptureService<List<? extends WebViewInfo>> {
    void collectWebData(String str, String str2);
}
