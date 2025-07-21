package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes3.dex */
public abstract class sua extends mia implements tua {
    public sua() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    public static tua w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
        return queryLocalInterface instanceof tua ? (tua) queryLocalInterface : new rua(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        jua huaVar;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            huaVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            huaVar = queryLocalInterface instanceof jua ? (jua) queryLocalInterface : new hua(readStrongBinder);
        }
        String readString = parcel.readString();
        nia.c(parcel);
        E1(huaVar, readString);
        parcel2.writeNoException();
        return true;
    }
}
