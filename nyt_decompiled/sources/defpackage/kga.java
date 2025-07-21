package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* loaded from: classes3.dex */
public final class kga {
    private long a = -1;
    private long b = -1;
    private long c = -1;
    private long d = -1;
    private long e = -1;
    private long f = -1;
    private long g = -1;
    private long h = -1;

    private static DisplayMetrics l(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        try {
            defaultDisplay.getRealMetrics(displayMetrics);
        } catch (NoSuchMethodError unused) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    private static boolean m(View view) {
        try {
            if (view.getClass().getName().contains("DebugGestureViewWrapper")) {
                view = ((ViewGroup) view).getChildAt(0);
            }
            Object invoke = view.getClass().getMethod("getAdConfiguration", null).invoke(view, null);
            Integer num = (Integer) invoke.getClass().getField("adType").get(invoke);
            num.intValue();
            String str = (String) invoke.getClass().getMethod("adTypeToString", Integer.TYPE).invoke(null, num);
            if (str.contains("INTERSTITIAL") || str.contains("APP_OPEN")) {
                return true;
            }
            return str.contains("REWARDED");
        } catch (ReflectiveOperationException | SecurityException unused) {
            return false;
        }
    }

    public final long a() {
        return this.g;
    }

    public final long b() {
        return this.e;
    }

    public final long c() {
        return this.a;
    }

    public final long d() {
        return this.c;
    }

    public final long e() {
        return this.h;
    }

    public final long f() {
        return this.f;
    }

    public final long g() {
        return this.b;
    }

    public final long h() {
        return this.d;
    }

    public final void i() {
        this.h = this.g;
        this.g = SystemClock.uptimeMillis();
    }

    public final void j() {
        this.b = this.a;
        this.a = SystemClock.uptimeMillis();
    }

    public final void k(Context context, View view) {
        this.d = this.c;
        this.c = SystemClock.uptimeMillis();
        long j = this.e;
        if (j != -1) {
            this.f = j;
        }
        DisplayMetrics l = l(context);
        int i = l.widthPixels * l.heightPixels;
        if (view != null) {
            int min = Math.min(view.getWidth(), l.widthPixels) * Math.min(view.getHeight(), l.heightPixels);
            if (min + min >= i || (min == 0 && m(view))) {
                this.e = this.c;
                return;
            }
        }
        this.e = -1L;
    }
}
