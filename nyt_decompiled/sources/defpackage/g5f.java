package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.pal.zzhg;

/* loaded from: classes3.dex */
public final class g5f {
    final n5f a;
    final boolean b;

    private g5f(n5f n5fVar) {
        this.a = n5fVar;
        this.b = n5fVar != null;
    }

    public static g5f b(Context context, String str, String str2) {
        n5f i5fVar;
        try {
            try {
                try {
                    IBinder d = DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (d == null) {
                        i5fVar = null;
                    } else {
                        IInterface queryLocalInterface = d.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        i5fVar = queryLocalInterface instanceof n5f ? (n5f) queryLocalInterface : new i5f(d);
                    }
                    i5fVar.zze(fc5.l3(context), "ADSHIELD", null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new g5f(i5fVar);
                } catch (Exception e) {
                    throw new zzhg(e);
                }
            } catch (Exception e2) {
                throw new zzhg(e2);
            }
        } catch (RemoteException | zzhg | NullPointerException | SecurityException unused) {
            Log.d("GASS", "Cannot dynamite load clearcut");
            return new g5f(new q5f());
        }
    }

    public final e5f a(byte[] bArr) {
        return new e5f(this, bArr, null);
    }
}
