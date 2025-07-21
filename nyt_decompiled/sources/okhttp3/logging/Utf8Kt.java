package okhttp3.logging;

import defpackage.ad0;
import defpackage.uo6;
import defpackage.zq3;
import java.io.EOFException;

/* loaded from: classes5.dex */
public final class Utf8Kt {
    public static final boolean isProbablyUtf8(ad0 ad0Var) {
        zq3.h(ad0Var, "<this>");
        try {
            ad0 ad0Var2 = new ad0();
            ad0Var.i(ad0Var2, 0L, uo6.j(ad0Var.h1(), 64L));
            int i = 0;
            while (i < 16) {
                i++;
                if (ad0Var2.C0()) {
                    return true;
                }
                int W0 = ad0Var2.W0();
                if (Character.isISOControl(W0) && !Character.isWhitespace(W0)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
