package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.RemoteCreator;

/* loaded from: classes3.dex */
public final class rva extends RemoteCreator {
    public rva() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    public final qta a(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder b4 = ((tta) getRemoteCreatorInstance(context)).b4(fc5.l3(context), fc5.l3(frameLayout), fc5.l3(frameLayout2), 240304000);
            if (b4 == null) {
                return null;
            }
            IInterface queryLocalInterface = b4.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof qta ? (qta) queryLocalInterface : new ota(b4);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            fgb.h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    protected final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof tta ? (tta) queryLocalInterface : new rta(iBinder);
    }
}
