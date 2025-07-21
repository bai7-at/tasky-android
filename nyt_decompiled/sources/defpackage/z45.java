package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class z45 extends dv0 {
    private final ConnectivityManager f;
    private final a g;

    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String str;
            zq3.h(network, "network");
            zq3.h(networkCapabilities, "capabilities");
            h94 e = h94.e();
            str = a55.a;
            e.a(str, "Network capabilities changed: " + networkCapabilities);
            z45.this.g(a55.d(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            zq3.h(network, "network");
            h94 e = h94.e();
            str = a55.a;
            e.a(str, "Network connection lost");
            z45 z45Var = z45.this;
            z45Var.g(a55.c(z45Var.f));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z45(Context context, rg8 rg8Var) {
        super(context, rg8Var);
        zq3.h(context, "context");
        zq3.h(rg8Var, "taskExecutor");
        Object systemService = d().getSystemService("connectivity");
        zq3.f(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f = (ConnectivityManager) systemService;
        this.g = new a();
    }

    @Override // defpackage.dv0
    public void h() {
        String str;
        String str2;
        String str3;
        try {
            h94 e = h94.e();
            str3 = a55.a;
            e.a(str3, "Registering network callback");
            p35.a(this.f, this.g);
        } catch (IllegalArgumentException e2) {
            h94 e3 = h94.e();
            str2 = a55.a;
            e3.d(str2, "Received exception while registering network callback", e2);
        } catch (SecurityException e4) {
            h94 e5 = h94.e();
            str = a55.a;
            e5.d(str, "Received exception while registering network callback", e4);
        }
    }

    @Override // defpackage.dv0
    public void i() {
        String str;
        String str2;
        String str3;
        try {
            h94 e = h94.e();
            str3 = a55.a;
            e.a(str3, "Unregistering network callback");
            n35.c(this.f, this.g);
        } catch (IllegalArgumentException e2) {
            h94 e3 = h94.e();
            str2 = a55.a;
            e3.d(str2, "Received exception while unregistering network callback", e2);
        } catch (SecurityException e4) {
            h94 e5 = h94.e();
            str = a55.a;
            e5.d(str, "Received exception while unregistering network callback", e4);
        }
    }

    @Override // defpackage.dv0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public y45 e() {
        return a55.c(this.f);
    }
}
