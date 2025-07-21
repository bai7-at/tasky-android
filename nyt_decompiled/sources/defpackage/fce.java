package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzfrv;

/* loaded from: classes3.dex */
public final class fce {
    final ice a;
    final boolean b;

    private fce(ice iceVar) {
        this.a = iceVar;
        this.b = iceVar != null;
    }

    public static fce b(Context context, String str, String str2) {
        ice gceVar;
        try {
            try {
                try {
                    IBinder d = DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        gceVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        gceVar = queryLocalInterface instanceof ice ? (ice) queryLocalInterface : new gce(d);
                    }
                    gceVar.zze(fc5.l3(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new fce(gceVar);
                } catch (Exception e) {
                    throw new zzfrv(e);
                }
            } catch (Exception e2) {
                throw new zzfrv(e2);
            }
        } catch (RemoteException | zzfrv | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new fce(new jce());
        }
    }

    public static fce c() {
        jce jceVar = new jce();
        Log.d("GASS", "Clearcut logging disabled");
        return new fce(jceVar);
    }

    public final ece a(byte[] bArr) {
        return new ece(this, bArr, null);
    }
}
