package com.squareup.picasso;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import defpackage.sd0;
import defpackage.wq8;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import okio.ByteString;

/* loaded from: classes4.dex */
abstract class w {
    static final StringBuilder a = new StringBuilder();
    private static final ByteString b = ByteString.e("RIFF");
    private static final ByteString c = ByteString.e("WEBP");

    static class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            sendMessageDelayed(obtainMessage(), 1000L);
        }
    }

    private static class b extends Thread {
        b(Runnable runnable) {
            super(runnable);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(10);
            super.run();
        }
    }

    static class c implements ThreadFactory {
        c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new b(runnable);
        }
    }

    static long a(File file) {
        long j;
        try {
            StatFs statFs = new StatFs(file.getAbsolutePath());
            j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
        } catch (IllegalArgumentException unused) {
            j = 5242880;
        }
        return Math.max(Math.min(j, 52428800L), 5242880L);
    }

    static int b(Context context) {
        ActivityManager activityManager = (ActivityManager) o(context, "activity");
        return (int) ((((context.getApplicationInfo().flags & Constants.MB) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass()) * PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) / 7);
    }

    static void c() {
        if (!r()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        }
    }

    static void d() {
        if (r()) {
            throw new IllegalStateException("Method call should not happen from the main thread.");
        }
    }

    static Object e(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    static File f(Context context) {
        File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    static String g(p pVar) {
        StringBuilder sb = a;
        String h = h(pVar, sb);
        sb.setLength(0);
        return h;
    }

    static String h(p pVar, StringBuilder sb) {
        String str = pVar.f;
        if (str != null) {
            sb.ensureCapacity(str.length() + 50);
            sb.append(pVar.f);
        } else {
            Uri uri = pVar.d;
            if (uri != null) {
                String uri2 = uri.toString();
                sb.ensureCapacity(uri2.length() + 50);
                sb.append(uri2);
            } else {
                sb.ensureCapacity(50);
                sb.append(pVar.e);
            }
        }
        sb.append('\n');
        if (pVar.n != 0.0f) {
            sb.append("rotation:");
            sb.append(pVar.n);
            if (pVar.q) {
                sb.append('@');
                sb.append(pVar.o);
                sb.append('x');
                sb.append(pVar.p);
            }
            sb.append('\n');
        }
        if (pVar.c()) {
            sb.append("resize:");
            sb.append(pVar.h);
            sb.append('x');
            sb.append(pVar.i);
            sb.append('\n');
        }
        if (pVar.j) {
            sb.append("centerCrop:");
            sb.append(pVar.k);
            sb.append('\n');
        } else if (pVar.l) {
            sb.append("centerInside");
            sb.append('\n');
        }
        List list = pVar.g;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                sb.append(((wq8) pVar.g.get(i)).a());
                sb.append('\n');
            }
        }
        return sb.toString();
    }

    static void i(Looper looper) {
        a aVar = new a(looper);
        aVar.sendMessageDelayed(aVar.obtainMessage(), 1000L);
    }

    static int j(Bitmap bitmap) {
        int allocationByteCount = bitmap.getAllocationByteCount();
        if (allocationByteCount >= 0) {
            return allocationByteCount;
        }
        throw new IllegalStateException("Negative size: " + bitmap);
    }

    static String k(com.squareup.picasso.c cVar) {
        return l(cVar, "");
    }

    static String l(com.squareup.picasso.c cVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        com.squareup.picasso.a h = cVar.h();
        if (h != null) {
            sb.append(h.b.d());
        }
        List i = cVar.i();
        if (i != null) {
            int size = i.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (i2 > 0 || h != null) {
                    sb.append(", ");
                }
                sb.append(((com.squareup.picasso.a) i.get(i2)).b.d());
            }
        }
        return sb.toString();
    }

    static int m(Resources resources, p pVar) {
        Uri uri;
        int i = pVar.e;
        if (i != 0 || (uri = pVar.d) == null) {
            return i;
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + pVar.d);
        }
        List<String> pathSegments = pVar.d.getPathSegments();
        if (pathSegments == null || pathSegments.isEmpty()) {
            throw new FileNotFoundException("No path segments: " + pVar.d);
        }
        if (pathSegments.size() == 1) {
            try {
                return Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new FileNotFoundException("Last path segment is not a resource ID: " + pVar.d);
            }
        }
        if (pathSegments.size() == 2) {
            return resources.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
        }
        throw new FileNotFoundException("More than two path segments: " + pVar.d);
    }

    static Resources n(Context context, p pVar) {
        Uri uri;
        if (pVar.e != 0 || (uri = pVar.d) == null) {
            return context.getResources();
        }
        String authority = uri.getAuthority();
        if (authority == null) {
            throw new FileNotFoundException("No package provided: " + pVar.d);
        }
        try {
            return context.getPackageManager().getResourcesForApplication(authority);
        } catch (PackageManager.NameNotFoundException unused) {
            throw new FileNotFoundException("Unable to obtain resources for package: " + pVar.d);
        }
    }

    static Object o(Context context, String str) {
        return context.getSystemService(str);
    }

    static boolean p(Context context, String str) {
        return context.checkCallingOrSelfPermission(str) == 0;
    }

    static boolean q(Context context) {
        try {
            return Settings.Global.getInt(context.getContentResolver(), "airplane_mode_on", 0) != 0;
        } catch (NullPointerException | SecurityException unused) {
            return false;
        }
    }

    static boolean r() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    static boolean s(sd0 sd0Var) {
        return sd0Var.W(0L, b) && sd0Var.W(8L, c);
    }

    static void t(String str, String str2, String str3) {
        u(str, str2, str3, "");
    }

    static void u(String str, String str2, String str3, String str4) {
        Log.d("Picasso", String.format("%1$-11s %2$-12s %3$s %4$s", str, str2, str3, str4));
    }
}
