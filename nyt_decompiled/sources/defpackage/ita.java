package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import defpackage.ee3;

/* loaded from: classes3.dex */
public abstract class ita extends mia implements jta {
    public ita() {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        xua xuaVar;
        switch (i) {
            case 2:
                float zze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(zze);
                return true;
            case 3:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                J(O);
                parcel2.writeNoException();
                return true;
            case 4:
                ee3 zzi = zzi();
                parcel2.writeNoException();
                nia.f(parcel2, zzi);
                return true;
            case 5:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            case 6:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 7:
                znc zzh = zzh();
                parcel2.writeNoException();
                nia.f(parcel2, zzh);
                return true;
            case 8:
                boolean zzl = zzl();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(zzl ? 1 : 0);
                return true;
            case 9:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    xuaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    xuaVar = queryLocalInterface instanceof xua ? (xua) queryLocalInterface : new xua(readStrongBinder);
                }
                nia.c(parcel);
                k1(xuaVar);
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zzk = zzk();
                parcel2.writeNoException();
                int i4 = nia.b;
                parcel2.writeInt(zzk ? 1 : 0);
                return true;
            default:
                return false;
        }
    }
}
