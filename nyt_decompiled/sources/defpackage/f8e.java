package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class f8e extends RemoteCreator {
    private static final f8e a = new f8e();

    private f8e() {
        super("com.google.android.gms.ads.adshield.AdShieldCreatorImpl");
    }

    public static cbe a(String str, Context context, boolean z, boolean z2) {
        cbe b = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 12800000) == 0 ? a.b("h.3.2.2/n.android.3.2.2", context, false) : null;
        return b == null ? new r7e("h.3.2.2/n.android.3.2.2", context, false) : b;
    }

    private final cbe b(String str, Context context, boolean z) {
        try {
            IBinder s4 = ((sbe) getRemoteCreatorInstance(context)).s4("h.3.2.2/n.android.3.2.2", fc5.l3(context));
            if (s4 == null) {
                return null;
            }
            IInterface queryLocalInterface = s4.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
            return queryLocalInterface instanceof cbe ? (cbe) queryLocalInterface : new a9e(s4);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException | LinkageError unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.adshield.internal.IAdShieldCreator");
        return queryLocalInterface instanceof sbe ? (sbe) queryLocalInterface : new sbe(iBinder);
    }
}
