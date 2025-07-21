package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class pde extends nde {
    private static pde h;

    private pde(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    public static final pde k(Context context) {
        pde pdeVar;
        synchronized (pde.class) {
            try {
                if (h == null) {
                    h = new pde(context);
                }
                pdeVar = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pdeVar;
    }

    public final mde i(long j, boolean z) {
        mde b;
        synchronized (pde.class) {
            b = b(null, null, j, z);
        }
        return b;
    }

    public final mde j(String str, String str2, long j, boolean z) {
        mde b;
        synchronized (pde.class) {
            b = b(str, str2, j, z);
        }
        return b;
    }

    public final void l() {
        synchronized (pde.class) {
            f(false);
        }
    }

    public final void m() {
        synchronized (pde.class) {
            f(true);
        }
    }
}
