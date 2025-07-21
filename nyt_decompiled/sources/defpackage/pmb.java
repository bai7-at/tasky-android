package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzen;

/* loaded from: classes2.dex */
public abstract class pmb extends mia implements tnb {
    public pmb() {
        super("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    public static tnb asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ILiteSdkInfo");
        return queryLocalInterface instanceof tnb ? (tnb) queryLocalInterface : new mlb(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            zzen liteSdkVersion = getLiteSdkVersion();
            parcel2.writeNoException();
            nia.e(parcel2, liteSdkVersion);
        } else {
            if (i != 2) {
                return false;
            }
            h3b adapterCreator = getAdapterCreator();
            parcel2.writeNoException();
            nia.f(parcel2, adapterCreator);
        }
        return true;
    }
}
