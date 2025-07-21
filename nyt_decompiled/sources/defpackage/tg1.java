package defpackage;

import android.content.Context;
import android.util.Log;
import defpackage.nu0;

/* loaded from: classes2.dex */
public class tg1 implements ou0 {
    @Override // defpackage.ou0
    public nu0 a(Context context, nu0.a aVar) {
        boolean z = mx0.a(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        if (Log.isLoggable("ConnectivityMonitor", 3)) {
            Log.d("ConnectivityMonitor", z ? "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor" : "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor");
        }
        return z ? new sg1(context, aVar) : new wa5();
    }
}
