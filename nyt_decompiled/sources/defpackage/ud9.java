package defpackage;

import android.net.Uri;
import android.webkit.WebView;
import defpackage.oe9;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public class ud9 implements WebMessageListenerBoundaryInterface {
    private oe9.a a;

    public ud9(oe9.a aVar) {
        this.a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z, InvocationHandler invocationHandler2) {
        td9 b = sd9.b((WebMessageBoundaryInterface) zb0.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (b != null) {
            this.a.onPostMessage(webView, b, uri, z, gs3.a(invocationHandler2));
        }
    }
}
