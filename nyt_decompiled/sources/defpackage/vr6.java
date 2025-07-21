package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes4.dex */
public abstract class vr6 {
    public static final Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        zq3.h(context, "<this>");
        zq3.h(broadcastReceiver, "broadcastReceiver");
        zq3.h(intentFilter, "intentFilter");
        return c(context, broadcastReceiver, intentFilter, false, 4, null);
    }

    public static final Intent b(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z) {
        zq3.h(context, "<this>");
        zq3.h(broadcastReceiver, "broadcastReceiver");
        zq3.h(intentFilter, "intentFilter");
        if (Build.VERSION.SDK_INT >= 33) {
            return context.registerReceiver(broadcastReceiver, intentFilter, z ? 2 : 4);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }

    public static /* synthetic */ Intent c(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return b(context, broadcastReceiver, intentFilter, z);
    }
}
