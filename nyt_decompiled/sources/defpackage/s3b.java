package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzcag;

/* loaded from: classes3.dex */
public abstract class s3b extends mia implements t3b {
    public s3b() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static t3b w6(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return queryLocalInterface instanceof t3b ? (t3b) queryLocalInterface : new l3b(iBinder);
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int readInt = parcel.readInt();
                nia.c(parcel);
                zzg(readInt);
                break;
            case 4:
                zzn();
                break;
            case 5:
                zzp();
                break;
            case 6:
                zzo();
                break;
            case 7:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata");
                    if (queryLocalInterface instanceof x3b) {
                        lh4.a(queryLocalInterface);
                    }
                }
                nia.c(parcel);
                break;
            case 8:
                zzm();
                break;
            case 9:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                nia.c(parcel);
                B5(readString, readString2);
                break;
            case 10:
                iua.w6(parcel.readStrongBinder());
                parcel.readString();
                nia.c(parcel);
                break;
            case 11:
                a();
                break;
            case 12:
                parcel.readString();
                nia.c(parcel);
                break;
            case 13:
                k();
                break;
            case 14:
                zzcag zzcagVar = (zzcag) nia.a(parcel, zzcag.CREATOR);
                nia.c(parcel);
                e4(zzcagVar);
                break;
            case 15:
                l();
                break;
            case 16:
                zbb w6 = ybb.w6(parcel.readStrongBinder());
                nia.c(parcel);
                Z0(w6);
                break;
            case 17:
                int readInt2 = parcel.readInt();
                nia.c(parcel);
                J2(readInt2);
                break;
            case 18:
                c();
                break;
            case 19:
                nia.c(parcel);
                break;
            case 20:
                e();
                break;
            case 21:
                String readString3 = parcel.readString();
                nia.c(parcel);
                x(readString3);
                break;
            case 22:
                int readInt3 = parcel.readInt();
                String readString4 = parcel.readString();
                nia.c(parcel);
                K0(readInt3, readString4);
                break;
            case 23:
                zze zzeVar = (zze) nia.a(parcel, zze.CREATOR);
                nia.c(parcel);
                R0(zzeVar);
                break;
            case 24:
                zze zzeVar2 = (zze) nia.a(parcel, zze.CREATOR);
                nia.c(parcel);
                f2(zzeVar2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
