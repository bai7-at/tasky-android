package defpackage;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import com.google.android.gms.internal.ads.b4;
import com.google.android.gms.internal.ads.c4;
import com.google.android.gms.internal.ads.u3;
import com.google.android.gms.internal.ads.x3;
import com.google.android.gms.internal.ads.zb;
import com.google.android.gms.internal.ads.zzbec;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b7d extends c7d {
    private static final SparseArray h;
    private final Context c;
    private final a6c d;
    private final TelephonyManager e;
    private final t6d f;
    private int g;

    static {
        SparseArray sparseArray = new SparseArray();
        h = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbec.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbec zzbecVar = zzbec.CONNECTING;
        sparseArray.put(ordinal, zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbec.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbec zzbecVar2 = zzbec.DISCONNECTED;
        sparseArray.put(ordinal2, zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbecVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbec.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbecVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbecVar);
    }

    b7d(Context context, a6c a6cVar, t6d t6dVar, n6d n6dVar, hie hieVar) {
        super(n6dVar, hieVar);
        this.c = context;
        this.d = a6cVar;
        this.f = t6dVar;
        this.e = (TelephonyManager) context.getSystemService("phone");
    }

    static /* bridge */ /* synthetic */ x3 b(b7d b7dVar, Bundle bundle) {
        u3 L = x3.L();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            b7dVar.g = 2;
        } else {
            b7dVar.g = 1;
            if (i == 0) {
                L.o(2);
            } else if (i != 1) {
                L.o(1);
            } else {
                L.o(3);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            L.n(i3);
        }
        return (x3) L.i();
    }

    static /* bridge */ /* synthetic */ zzbec c(b7d b7dVar, Bundle bundle) {
        return (zzbec) h.get(f2e.a(f2e.a(bundle, "device"), "network").getInt("active_network_state", -1), zzbec.UNSPECIFIED);
    }

    static /* bridge */ /* synthetic */ byte[] f(b7d b7dVar, boolean z, ArrayList arrayList, x3 x3Var, zzbec zzbecVar) {
        b4 T = c4.T();
        T.n(arrayList);
        T.v(g(Settings.Global.getInt(b7dVar.c.getContentResolver(), "airplane_mode_on", 0) != 0));
        T.w(dyf.s().h(b7dVar.c, b7dVar.e));
        T.s(b7dVar.f.e());
        T.r(b7dVar.f.b());
        T.o(b7dVar.f.a());
        T.p(zzbecVar);
        T.q(x3Var);
        T.x(b7dVar.g);
        T.y(g(z));
        T.u(b7dVar.f.d());
        T.t(dyf.b().currentTimeMillis());
        T.z(g(Settings.Global.getInt(b7dVar.c.getContentResolver(), "wifi_on", 0) != 0));
        return ((c4) T.i()).i();
    }

    private static final int g(boolean z) {
        return z ? 2 : 1;
    }

    public final void e(boolean z) {
        zb.r(this.d.b(), new a7d(this, z), pgb.f);
    }
}
