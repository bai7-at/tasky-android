package defpackage;

import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public abstract class sd9 implements WebMessageBoundaryInterface {
    private static final String[] a = {"WEB_MESSAGE_GET_MESSAGE_PAYLOAD"};

    private static vd9[] a(InvocationHandler[] invocationHandlerArr) {
        vd9[] vd9VarArr = new vd9[invocationHandlerArr.length];
        for (int i = 0; i < invocationHandlerArr.length; i++) {
            vd9VarArr[i] = new wd9(invocationHandlerArr[i]);
        }
        return vd9VarArr;
    }

    public static td9 b(WebMessageBoundaryInterface webMessageBoundaryInterface) {
        vd9[] a2 = a(webMessageBoundaryInterface.getPorts());
        if (!se9.C.c()) {
            return new td9(webMessageBoundaryInterface.getData(), a2);
        }
        WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface = (WebMessagePayloadBoundaryInterface) zb0.a(WebMessagePayloadBoundaryInterface.class, webMessageBoundaryInterface.getMessagePayload());
        int type2 = webMessagePayloadBoundaryInterface.getType();
        if (type2 == 0) {
            return new td9(webMessagePayloadBoundaryInterface.getAsString(), a2);
        }
        if (type2 != 1) {
            return null;
        }
        return new td9(webMessagePayloadBoundaryInterface.getAsArrayBuffer(), a2);
    }
}
