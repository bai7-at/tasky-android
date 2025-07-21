package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.appsflyer.oaid.BuildConfig;
import com.comscore.streaming.EventType;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ova extends mia implements pva {
    public ova() {
        super("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        mva lvaVar;
        switch (i) {
            case 2:
                String zzq = zzq();
                parcel2.writeNoException();
                parcel2.writeString(zzq);
                return true;
            case 3:
                List c = c();
                parcel2.writeNoException();
                parcel2.writeList(c);
                return true;
            case 4:
                String zzo = zzo();
                parcel2.writeNoException();
                parcel2.writeString(zzo);
                return true;
            case 5:
                mta zzk = zzk();
                parcel2.writeNoException();
                nia.f(parcel2, zzk);
                return true;
            case 6:
                String zzp = zzp();
                parcel2.writeNoException();
                parcel2.writeString(zzp);
                return true;
            case 7:
                String zzn = zzn();
                parcel2.writeNoException();
                parcel2.writeString(zzn);
                return true;
            case 8:
                double zze = zze();
                parcel2.writeNoException();
                parcel2.writeDouble(zze);
                return true;
            case 9:
                String g = g();
                parcel2.writeNoException();
                parcel2.writeString(g);
                return true;
            case 10:
                String zzs = zzs();
                parcel2.writeNoException();
                parcel2.writeString(zzs);
                return true;
            case 11:
                znc zzh = zzh();
                parcel2.writeNoException();
                nia.f(parcel2, zzh);
                return true;
            case 12:
                String zzr = zzr();
                parcel2.writeNoException();
                parcel2.writeString(zzr);
                return true;
            case 13:
                e();
                parcel2.writeNoException();
                return true;
            case 14:
                fta zzi = zzi();
                parcel2.writeNoException();
                nia.f(parcel2, zzi);
                return true;
            case 15:
                Bundle bundle = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                z3(bundle);
                parcel2.writeNoException();
                return true;
            case 16:
                Bundle bundle2 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                boolean M2 = M2(bundle2);
                parcel2.writeNoException();
                parcel2.writeInt(M2 ? 1 : 0);
                return true;
            case 17:
                Bundle bundle3 = (Bundle) nia.a(parcel, Bundle.CREATOR);
                nia.c(parcel);
                S4(bundle3);
                parcel2.writeNoException();
                return true;
            case 18:
                ee3 zzm = zzm();
                parcel2.writeNoException();
                nia.f(parcel2, zzm);
                return true;
            case 19:
                ee3 zzl = zzl();
                parcel2.writeNoException();
                nia.f(parcel2, zzl);
                return true;
            case 20:
                Bundle zzf = zzf();
                parcel2.writeNoException();
                nia.e(parcel2, zzf);
                return true;
            case 21:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder == null) {
                    lvaVar = null;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnconfirmedClickListener");
                    lvaVar = queryLocalInterface instanceof mva ? (mva) queryLocalInterface : new lva(readStrongBinder);
                }
                nia.c(parcel);
                Z2(lvaVar);
                parcel2.writeNoException();
                return true;
            case 22:
                l();
                parcel2.writeNoException();
                return true;
            case 23:
                List a = a();
                parcel2.writeNoException();
                parcel2.writeList(a);
                return true;
            case 24:
                boolean m = m();
                parcel2.writeNoException();
                int i3 = nia.b;
                parcel2.writeInt(m ? 1 : 0);
                return true;
            case EventType.SUBS /* 25 */:
                m0c w6 = kzb.w6(parcel.readStrongBinder());
                nia.c(parcel);
                u6(w6);
                parcel2.writeNoException();
                return true;
            case EventType.CDN /* 26 */:
                bwb w62 = wub.w6(parcel.readStrongBinder());
                nia.c(parcel);
                F2(w62);
                parcel2.writeNoException();
                return true;
            case 27:
                m0();
                parcel2.writeNoException();
                return true;
            case 28:
                o();
                parcel2.writeNoException();
                return true;
            case BuildConfig.VERSION_CODE /* 29 */:
                jta zzj = zzj();
                parcel2.writeNoException();
                nia.f(parcel2, zzj);
                return true;
            case 30:
                boolean A = A();
                parcel2.writeNoException();
                int i4 = nia.b;
                parcel2.writeInt(A ? 1 : 0);
                return true;
            case 31:
                qkc zzg = zzg();
                parcel2.writeNoException();
                nia.f(parcel2, zzg);
                return true;
            case 32:
                zcc w63 = tbc.w6(parcel.readStrongBinder());
                nia.c(parcel);
                F0(w63);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
