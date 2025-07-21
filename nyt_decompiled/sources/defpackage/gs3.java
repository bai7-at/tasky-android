package defpackage;

import java.lang.reflect.InvocationHandler;
import java.util.concurrent.Callable;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;

/* loaded from: classes.dex */
public class gs3 extends fs3 {
    private JsReplyProxyBoundaryInterface a;

    class a implements Callable {
        final /* synthetic */ JsReplyProxyBoundaryInterface a;

        a(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
            this.a = jsReplyProxyBoundaryInterface;
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return new gs3(this.a);
        }
    }

    public gs3(JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface) {
        this.a = jsReplyProxyBoundaryInterface;
    }

    public static gs3 a(InvocationHandler invocationHandler) {
        JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) zb0.a(JsReplyProxyBoundaryInterface.class, invocationHandler);
        return (gs3) jsReplyProxyBoundaryInterface.getOrCreatePeer(new a(jsReplyProxyBoundaryInterface));
    }
}
