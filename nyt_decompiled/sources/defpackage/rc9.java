package defpackage;

import android.content.Context;
import android.os.PowerManager;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class rc9 {
    private static final String a;

    static {
        String i = h94.i("WakeLocks");
        zq3.g(i, "tagWithPrefix(\"WakeLocks\")");
        a = i;
    }

    public static final void a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        sc9 sc9Var = sc9.a;
        synchronized (sc9Var) {
            linkedHashMap.putAll(sc9Var.a());
            ww8 ww8Var = ww8.a;
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                h94.e().k(a, "WakeLock held for " + str);
            }
        }
    }

    public static final PowerManager.WakeLock b(Context context, String str) {
        zq3.h(context, "context");
        zq3.h(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        zq3.f(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, str2);
        sc9 sc9Var = sc9.a;
        synchronized (sc9Var) {
        }
        zq3.g(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
