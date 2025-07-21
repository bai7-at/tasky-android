package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.List;

/* loaded from: classes3.dex */
public final class zd {
    public static final zd a = new zd();

    private zd() {
    }

    public static final xl0 a() {
        return new kg();
    }

    public static final tx3 b(Context context, kd8 kd8Var, List list, long j, long j2, long j3, long j4) {
        zq3.h(context, "context");
        zq3.h(list, "ntpHosts");
        xl0 a2 = a();
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.lyft.kronos.shared_preferences", 0);
        zq3.g(sharedPreferences, "context.getSharedPrefere…ME, Context.MODE_PRIVATE)");
        return bm0.a(a2, new pq7(sharedPreferences), kd8Var, list, j, j2, j3, j4);
    }
}
