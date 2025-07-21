package defpackage;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
public abstract class z2e {
    static og8 a;
    public static vm b;
    private static final Object c = new Object();

    public static og8 a(Context context) {
        og8 og8Var;
        b(context, false);
        synchronized (c) {
            og8Var = a;
        }
        return og8Var;
    }

    public static void b(Context context, boolean z) {
        synchronized (c) {
            try {
                if (b == null) {
                    b = um.a(context);
                }
                og8 og8Var = a;
                if (og8Var == null || ((og8Var.p() && !a.q()) || (z && a.p()))) {
                    a = ((vm) Preconditions.checkNotNull(b, "the appSetIdClient shouldn't be null")).b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
