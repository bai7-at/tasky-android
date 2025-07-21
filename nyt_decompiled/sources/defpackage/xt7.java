package defpackage;

import android.content.Context;
import defpackage.qr1;

/* loaded from: classes.dex */
public final class xt7 {
    public static final xt7 a = new xt7();
    private static qr1 b;

    private xt7() {
    }

    public final synchronized qr1 a(Context context) {
        qr1 qr1Var;
        qr1Var = b;
        if (qr1Var == null) {
            qr1Var = new qr1.a().c(lf2.p(s.m(context), "image_cache")).a();
            b = qr1Var;
        }
        return qr1Var;
    }
}
