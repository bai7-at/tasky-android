package defpackage;

import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes.dex */
public interface bf9 {
    String[] a();

    WebViewProviderBoundaryInterface createWebView(WebView webView);

    WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter();
}
