package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;

/* loaded from: classes3.dex */
final class q6e extends BroadcastReceiver {
    final /* synthetic */ s7e a;

    /* synthetic */ q6e(s7e s7eVar, q5e q5eVar) {
        this.a = s7eVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i = 0;
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type2 = activeNetworkInfo.getType();
                    if (type2 != 0) {
                        if (type2 != 1) {
                            if (type2 != 4 && type2 != 5) {
                                if (type2 != 6) {
                                    i = type2 != 9 ? 8 : 7;
                                }
                                i = 5;
                            }
                        }
                        i = 2;
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            i = 3;
                            break;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            i = 4;
                            break;
                        case 13:
                            i = 5;
                            break;
                        case 16:
                        case 19:
                        default:
                            i = 6;
                            break;
                        case 18:
                            i = 2;
                            break;
                        case 20:
                            if (khe.a >= 29) {
                                i = 9;
                                break;
                            }
                            break;
                    }
                } else {
                    i = 1;
                }
            } catch (SecurityException unused) {
            }
        }
        if (khe.a < 31 || i != 5) {
            s7e.c(this.a, i);
            return;
        }
        s7e s7eVar = this.a;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                throw null;
            }
            p4e p4eVar = new p4e(s7eVar);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), p4eVar);
            telephonyManager.unregisterTelephonyCallback(p4eVar);
        } catch (RuntimeException unused2) {
            s7e.c(s7eVar, 5);
        }
    }
}
