package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public abstract class r2e {
    public static void a(Context context, boolean z) {
        if (z) {
            fgb.f("This request is sent from a test device.");
            return;
        }
        kia.b();
        fgb.f("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"" + tfb.A(context) + "\")) to get test ads on this device.");
    }

    public static void b(int i, Throwable th, String str) {
        fgb.f("Ad failed to load : " + i);
        pzc.l(str, th);
        if (i == 3) {
            return;
        }
        dyf.q().v(th, str);
    }
}
