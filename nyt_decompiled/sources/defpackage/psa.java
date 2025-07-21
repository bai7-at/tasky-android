package defpackage;

import android.content.Context;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;

/* loaded from: classes3.dex */
public final class psa {
    private final Context a;

    public psa(Context context) {
        this.a = context;
    }

    public final void a(t8b t8bVar) {
        try {
            ((qsa) igb.b(this.a, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", new hgb() { // from class: osa
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
                    return queryLocalInterface instanceof qsa ? (qsa) queryLocalInterface : new qsa(obj);
                }
            })).s4(t8bVar);
        } catch (RemoteException e) {
            fgb.g("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e.getMessage())));
        } catch (zzcef e2) {
            fgb.g("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e2.getMessage())));
        }
    }
}
