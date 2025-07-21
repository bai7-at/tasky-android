package defpackage;

import android.webkit.WebViewRenderProcess;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;

/* loaded from: classes.dex */
public class hf9 extends df9 {
    private static final WeakHashMap c = new WeakHashMap();
    private WebViewRendererBoundaryInterface a;
    private WeakReference b;

    class a implements Callable {
        final /* synthetic */ WebViewRendererBoundaryInterface a;

        a(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
            this.a = webViewRendererBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new hf9(this.a);
        }
    }

    public hf9(WebViewRendererBoundaryInterface webViewRendererBoundaryInterface) {
        this.a = webViewRendererBoundaryInterface;
    }

    public static hf9 a(WebViewRenderProcess webViewRenderProcess) {
        WeakHashMap weakHashMap = c;
        hf9 hf9Var = (hf9) weakHashMap.get(webViewRenderProcess);
        if (hf9Var != null) {
            return hf9Var;
        }
        hf9 hf9Var2 = new hf9(webViewRenderProcess);
        weakHashMap.put(webViewRenderProcess, hf9Var2);
        return hf9Var2;
    }

    public static hf9 b(InvocationHandler invocationHandler) {
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) zb0.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        return (hf9) webViewRendererBoundaryInterface.getOrCreatePeer(new a(webViewRendererBoundaryInterface));
    }

    public hf9(WebViewRenderProcess webViewRenderProcess) {
        this.b = new WeakReference(webViewRenderProcess);
    }
}
