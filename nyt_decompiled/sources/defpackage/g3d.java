package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class g3d {
    private static final String[] e = {"android:establish_vpn_service", "android:establish_vpn_manager"};
    private long a = 0;
    private long b = 0;
    private long c = -1;
    private boolean d = false;

    g3d(Context context, Executor executor, String[] strArr) {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        try {
            ((AppOpsManager) context.getSystemService("appops")).startWatchingActive(strArr, executor, new d2d(this));
        } catch (IllegalArgumentException | NoSuchMethodError unused) {
        }
    }

    public static g3d d(Context context, Executor executor) {
        return new g3d(context, executor, e);
    }

    public final long b() {
        long j = this.c;
        this.c = -1L;
        return j;
    }

    public final long c() {
        if (this.d) {
            return this.b - this.a;
        }
        return -1L;
    }

    public final void h() {
        if (this.d) {
            this.b = System.currentTimeMillis();
        }
    }
}
