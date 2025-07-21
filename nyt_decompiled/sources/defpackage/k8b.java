package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.cognito.internal.util.DatasetUtils;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.zzcei;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes3.dex */
public final class k8b implements m8b {
    private static final Object f = new Object();
    public static m8b g;
    static m8b h;
    static m8b i;
    private final Context b;
    private final ExecutorService d;
    private final zzcei e;
    private final Object a = new Object();
    private final WeakHashMap c = new WeakHashMap();

    protected k8b(Context context, zzcei zzceiVar) {
        bde.a();
        this.d = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        this.b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.e = zzceiVar;
    }

    public static m8b c(Context context) {
        synchronized (f) {
            try {
                if (g == null) {
                    if (((Boolean) esa.e.e()).booleanValue()) {
                        if (!((Boolean) pla.c().a(mpa.F7)).booleanValue()) {
                            g = new k8b(context, zzcei.t0());
                        }
                    }
                    g = new l8b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return g;
    }

    public static m8b d(Context context, zzcei zzceiVar) {
        synchronized (f) {
            if (i == null) {
                if (((Boolean) esa.e.e()).booleanValue()) {
                    if (!((Boolean) pla.c().a(mpa.F7)).booleanValue()) {
                        k8b k8bVar = new k8b(context, zzceiVar);
                        Thread thread = Looper.getMainLooper().getThread();
                        if (thread != null) {
                            synchronized (k8bVar.a) {
                                k8bVar.c.put(thread, Boolean.TRUE);
                            }
                            thread.setUncaughtExceptionHandler(new j8b(k8bVar, thread.getUncaughtExceptionHandler()));
                        }
                        Thread.setDefaultUncaughtExceptionHandler(new i8b(k8bVar, Thread.getDefaultUncaughtExceptionHandler()));
                        i = k8bVar;
                    }
                }
                i = new l8b();
            }
        }
        return i;
    }

    public static m8b e(Context context) {
        synchronized (f) {
            try {
                if (h == null) {
                    if (((Boolean) pla.c().a(mpa.G7)).booleanValue()) {
                        if (!((Boolean) pla.c().a(mpa.F7)).booleanValue()) {
                            h = new k8b(context, zzcei.t0());
                        }
                    }
                    h = new l8b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h;
    }

    public static String f(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    public static String g(Throwable th) {
        return ehe.c(tfb.h(f(th)));
    }

    @Override // defpackage.m8b
    public final void a(Throwable th, String str, float f2) {
        Throwable th2;
        String str2;
        Handler handler = tfb.b;
        boolean z = false;
        if (((Boolean) esa.f.e()).booleanValue()) {
            th2 = th;
        } else {
            LinkedList linkedList = new LinkedList();
            for (Throwable th3 = th; th3 != null; th3 = th3.getCause()) {
                linkedList.push(th3);
            }
            th2 = null;
            while (!linkedList.isEmpty()) {
                Throwable th4 = (Throwable) linkedList.pop();
                StackTraceElement[] stackTrace = th4.getStackTrace();
                ArrayList arrayList = new ArrayList();
                arrayList.add(new StackTraceElement(th4.getClass().getName(), "<filtered>", "<filtered>", 1));
                boolean z2 = false;
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (tfb.q(stackTraceElement.getClassName())) {
                        arrayList.add(stackTraceElement);
                        z2 = true;
                    } else {
                        String className = stackTraceElement.getClassName();
                        if (!TextUtils.isEmpty(className) && (className.startsWith("android.") || className.startsWith("java."))) {
                            arrayList.add(stackTraceElement);
                        } else {
                            arrayList.add(new StackTraceElement("<filtered>", "<filtered>", "<filtered>", 1));
                        }
                    }
                }
                if (z2) {
                    th2 = th2 == null ? new Throwable(th4.getMessage()) : new Throwable(th4.getMessage(), th2);
                    th2.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
                }
            }
        }
        if (th2 == null) {
            return;
        }
        String name = th.getClass().getName();
        String f3 = f(th);
        String g2 = ((Boolean) pla.c().a(mpa.I8)).booleanValue() ? g(th) : "";
        double d = f2;
        double random = Math.random();
        int i2 = f2 > 0.0f ? (int) (1.0f / f2) : 1;
        if (random < d) {
            ArrayList<String> arrayList2 = new ArrayList();
            try {
                z = Wrappers.packageManager(this.b).isCallerInstantApp();
            } catch (Throwable th5) {
                fgb.e("Error fetching instant app info", th5);
            }
            try {
                str2 = this.b.getPackageName();
            } catch (Throwable unused) {
                fgb.g("Cannot obtain package name, proceeding.");
                str2 = DatasetUtils.UNKNOWN_IDENTITY_ID;
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").path("//pagead2.googlesyndication.com/pagead/gen_204").appendQueryParameter("is_aia", Boolean.toString(z)).appendQueryParameter("id", "gmob-apps-report-exception").appendQueryParameter("os", Build.VERSION.RELEASE).appendQueryParameter("api", String.valueOf(Build.VERSION.SDK_INT));
            String str3 = Build.MANUFACTURER;
            String str4 = Build.MODEL;
            if (!str4.startsWith(str3)) {
                str4 = str3 + " " + str4;
            }
            Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("device", str4).appendQueryParameter("js", this.e.zza).appendQueryParameter(AppsFlyerProperties.APP_ID, str2).appendQueryParameter("exceptiontype", name).appendQueryParameter("stacktrace", f3).appendQueryParameter("eids", TextUtils.join(",", pla.a().a())).appendQueryParameter("exceptionkey", str).appendQueryParameter("cl", "610756093").appendQueryParameter("rc", "dev").appendQueryParameter("sampling_rate", Integer.toString(i2)).appendQueryParameter("pb_tm", String.valueOf(esa.c.e())).appendQueryParameter("gmscv", String.valueOf(GoogleApiAvailabilityLight.getInstance().getApkVersion(this.b))).appendQueryParameter("lite", true != this.e.zze ? "0" : IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            if (!TextUtils.isEmpty(g2)) {
                appendQueryParameter2.appendQueryParameter("hash", g2);
            }
            arrayList2.add(appendQueryParameter2.toString());
            for (final String str5 : arrayList2) {
                final jgb jgbVar = new jgb(null);
                this.d.execute(new Runnable() { // from class: h8b
                    @Override // java.lang.Runnable
                    public final void run() {
                        jgb.this.a(str5);
                    }
                });
            }
        }
    }

    @Override // defpackage.m8b
    public final void b(Throwable th, String str) {
        a(th, str, 1.0f);
    }

    protected final void h(Thread thread, Throwable th) {
        if (th != null) {
            boolean z = false;
            boolean z2 = false;
            for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    z |= tfb.q(stackTraceElement.getClassName());
                    z2 |= k8b.class.getName().equals(stackTraceElement.getClassName());
                }
            }
            if (!z || z2) {
                return;
            }
            a(th, "", 1.0f);
        }
    }
}
