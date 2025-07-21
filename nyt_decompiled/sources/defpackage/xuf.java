package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzav;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public final class xuf {
    private static volatile xuf g;
    private final Context a;
    private final List b;
    private final jie c;
    private final whf d;
    private volatile zzav e;
    private Thread.UncaughtExceptionHandler f;

    xuf(Context context) {
        Context applicationContext = context.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.a = applicationContext;
        this.d = new whf(this);
        this.b = new CopyOnWriteArrayList();
        this.c = new jie();
    }

    public static xuf a(Context context) {
        Preconditions.checkNotNull(context);
        if (g == null) {
            synchronized (xuf.class) {
                try {
                    if (g == null) {
                        g = new xuf(context);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public static void d() {
        if (!(Thread.currentThread() instanceof gsf)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    public final zzav b() {
        String packageName;
        if (this.e == null) {
            synchronized (this) {
                try {
                } catch (PackageManager.NameNotFoundException unused) {
                    String valueOf = String.valueOf(packageName);
                    Log.e("GAv4", valueOf.length() != 0 ? "Error retrieving package info: appName set to ".concat(valueOf) : new String("Error retrieving package info: appName set to "));
                } finally {
                }
                if (this.e == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.a.getPackageManager();
                    packageName = this.a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str = null;
                    PackageInfo packageInfo = packageManager.getPackageInfo(this.a.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (!TextUtils.isEmpty(applicationLabel)) {
                            packageName = applicationLabel.toString();
                        }
                        str = packageInfo.versionName;
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str);
                    this.e = zzavVar;
                }
            }
        }
        return this.e;
    }

    public final void e(Runnable runnable) {
        Preconditions.checkNotNull(runnable);
        this.d.submit(runnable);
    }

    public final void f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f = uncaughtExceptionHandler;
    }
}
