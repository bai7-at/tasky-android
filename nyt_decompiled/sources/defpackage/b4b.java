package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.comscore.streaming.EventType;
import defpackage.ee3;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class b4b extends mia implements c4b {
    public b4b() {
        super("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
    }

    public static c4b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
        return queryLocalInterface instanceof c4b ? (c4b) queryLocalInterface : new a4b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 3:
                List a = a();
                parcel2.writeNoException();
                parcel2.writeList(a);
                return true;
            case 4:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 5:
                mta zzl = zzl();
                parcel2.writeNoException();
                nia.f(parcel2, zzl);
                return true;
            case 6:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 7:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String c = c();
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 10:
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 11:
                znc zzj = zzj();
                parcel2.writeNoException();
                nia.f(parcel2, zzj);
                return true;
            case 12:
                parcel2.writeNoException();
                nia.f(parcel2, null);
                return true;
            case 13:
                ee3 zzm = zzm();
                parcel2.writeNoException();
                nia.f(parcel2, zzm);
                return true;
            case 14:
                ee3 zzn = zzn();
                parcel2.writeNoException();
                nia.f(parcel2, zzn);
                return true;
            case 15:
                ee3 zzo = zzo();
                parcel2.writeNoException();
                nia.f(parcel2, zzo);
                return true;
            case 16:
                Bundle zzi = zzi();
                parcel2.writeNoException();
                nia.e(parcel2, zzi);
                return true;
            case 17:
                boolean v = v();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(v ? 1 : 0);
                return true;
            case 18:
                boolean o = o();
                parcel2.writeNoException();
                int i4 = nia.b;
                parcel2.writeInt(o ? 1 : 0);
                return true;
            case 19:
                e();
                parcel2.writeNoException();
                return true;
            case 20:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                X5(O);
                parcel2.writeNoException();
                return true;
            case 21:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                N3(O2, O3, O4);
                parcel2.writeNoException();
                return true;
            case 22:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                nia.c(parcel);
                j5(O5);
                parcel2.writeNoException();
                return true;
            case 23:
                float zzf = zzf();
                parcel2.writeNoException();
                parcel2.writeFloat(zzf);
                return true;
            case 24:
                float zzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(zzh);
                return true;
            case EventType.SUBS /* 25 */:
                float zzg = zzg();
                parcel2.writeNoException();
                parcel2.writeFloat(zzg);
                return true;
            default:
                return false;
        }
    }
}
