package defpackage;

import android.app.Activity;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class h7b extends RemoteCreator {
    public h7b() {
        super("com.google.android.gms.ads.AdOverlayCreatorImpl");
    }

    public final k7b a(Activity activity) {
        try {
            IBinder zze = ((n7b) getRemoteCreatorInstance(activity)).zze(fc5.l3(activity));
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
            return queryLocalInterface instanceof k7b ? (k7b) queryLocalInterface : new i7b(zze);
        } catch (RemoteException e) {
            fgb.h("Could not create remote AdOverlay.", e);
            return null;
        } catch (RemoteCreator.RemoteCreatorException e2) {
            fgb.h("Could not create remote AdOverlay.", e2);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
        return queryLocalInterface instanceof n7b ? (n7b) queryLocalInterface : new l7b(iBinder);
    }
}
