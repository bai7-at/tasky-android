package io.embrace.android.embracesdk;

import android.webkit.ConsoleMessage;
import io.embrace.android.embracesdk.annotation.InternalApi;

@InternalApi
/* loaded from: classes5.dex */
public final class WebViewChromeClientSwazzledHooks {
    private WebViewChromeClientSwazzledHooks() {
    }

    public static void _preOnConsoleMessage(ConsoleMessage consoleMessage) {
        Embrace.getInstance().getInternalInterface().logInfo("webview _preOnConsoleMessage", null);
    }
}
