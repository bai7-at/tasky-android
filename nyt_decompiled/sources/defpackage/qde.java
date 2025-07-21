package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class qde extends nde {
    private static qde h;

    private qde(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    public static final qde j(Context context) {
        qde qdeVar;
        synchronized (qde.class) {
            try {
                if (h == null) {
                    h = new qde(context);
                }
                qdeVar = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qdeVar;
    }

    public final mde i(long j, boolean z) {
        synchronized (qde.class) {
            try {
                if (p()) {
                    return b(null, null, j, z);
                }
                return new mde();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void k() {
        synchronized (qde.class) {
            try {
                if (g(false)) {
                    f(false);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        this.f.e("paidv2_publisher_option");
    }

    public final void m() {
        this.f.e("paidv2_user_option");
    }

    public final void n(boolean z) {
        this.f.d("paidv2_user_option", Boolean.valueOf(z));
    }

    public final void o(boolean z) {
        this.f.d("paidv2_publisher_option", Boolean.valueOf(z));
        if (z) {
            return;
        }
        k();
    }

    public final boolean p() {
        return this.f.f("paidv2_publisher_option", true);
    }

    public final boolean q() {
        return this.f.f("paidv2_user_option", true);
    }
}
