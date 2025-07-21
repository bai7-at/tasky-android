package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzcef;

/* loaded from: classes3.dex */
public final class ocb {
    public static final ccb a(Context context, String str, h3b h3bVar) {
        try {
            IBinder s4 = ((gcb) igb.b(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", new hgb() { // from class: ncb
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.hgb
                public final Object zza(Object obj) {
                    if (obj == 0) {
                        return null;
                    }
                    IInterface queryLocalInterface = obj.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
                    return queryLocalInterface instanceof gcb ? (gcb) queryLocalInterface : new gcb(obj);
                }
            })).s4(fc5.l3(context), str, h3bVar, 240304000);
            if (s4 == null) {
                return null;
            }
            IInterface queryLocalInterface = s4.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof ccb ? (ccb) queryLocalInterface : new acb(s4);
        } catch (RemoteException | zzcef e) {
            fgb.i("#007 Could not call remote method.", e);
            return null;
        }
    }
}
