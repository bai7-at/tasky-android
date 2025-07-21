package defpackage;

import defpackage.oe9;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* loaded from: classes.dex */
public class af9 {
    WebViewProviderBoundaryInterface a;

    public af9(WebViewProviderBoundaryInterface webViewProviderBoundaryInterface) {
        this.a = webViewProviderBoundaryInterface;
    }

    public void a(String str, String[] strArr, oe9.a aVar) {
        this.a.addWebMessageListener(str, strArr, zb0.c(new ud9(aVar)));
    }

    public void b(Executor executor, ef9 ef9Var) {
        this.a.setWebViewRendererClient(ef9Var != null ? zb0.c(new ff9(executor, ef9Var)) : null);
    }
}
