package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import defpackage.nu0;

/* loaded from: classes2.dex */
final class sg1 implements nu0 {
    private final Context a;
    final nu0.a b;
    boolean c;
    private boolean d;
    private final BroadcastReceiver e = new a();

    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            sg1 sg1Var = sg1.this;
            boolean z = sg1Var.c;
            sg1Var.c = sg1Var.k(context);
            if (z != sg1.this.c) {
                if (Log.isLoggable("ConnectivityMonitor", 3)) {
                    Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + sg1.this.c);
                }
                sg1 sg1Var2 = sg1.this;
                sg1Var2.b.a(sg1Var2.c);
            }
        }
    }

    sg1(Context context, nu0.a aVar) {
        this.a = context.getApplicationContext();
        this.b = aVar;
    }

    private void l() {
        if (this.d) {
            return;
        }
        this.c = k(this.a);
        try {
            this.a.registerReceiver(this.e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.d = true;
        } catch (SecurityException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to register", e);
            }
        }
    }

    private void m() {
        if (this.d) {
            this.a.unregisterReceiver(this.e);
            this.d = false;
        }
    }

    @Override // defpackage.b44
    public void a() {
        m();
    }

    @Override // defpackage.b44
    public void b() {
        l();
    }

    boolean k(Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) z06.d((ConnectivityManager) context.getSystemService("connectivity"))).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (RuntimeException e) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e);
            }
            return true;
        }
    }

    @Override // defpackage.b44
    public void onDestroy() {
    }
}
