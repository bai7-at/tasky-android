package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class tqd implements gqd {
    private final kke a;
    private final Context b;

    public tqd(kke kkeVar, Context context) {
        this.a = kkeVar;
        this.b = context;
    }

    final /* synthetic */ pqd a() {
        boolean z;
        int i;
        TelephonyManager telephonyManager = (TelephonyManager) this.b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        dyf.r();
        int i2 = -1;
        if (wxf.b0(this.b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type2 = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i = type2;
                i2 = ordinal;
            } else {
                i = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
        } else {
            z = false;
            i = -2;
        }
        return new pqd(networkOperator, i, dyf.s().k(this.b), phoneType, z, i2);
    }

    @Override // defpackage.gqd
    public final int zza() {
        return 39;
    }

    @Override // defpackage.gqd
    public final j64 zzb() {
        return this.a.j(new Callable() { // from class: sqd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return tqd.this.a();
            }
        });
    }
}
