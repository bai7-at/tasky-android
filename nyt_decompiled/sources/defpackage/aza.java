package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbjb;
import com.google.android.gms.internal.ads.zzbpp;

/* loaded from: classes2.dex */
public abstract class aza extends mia implements c0b {
    public aza() {
        super("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    @Override // defpackage.mia
    protected final boolean v6(int i, Parcel parcel, Parcel parcel2, int i2) {
        pqa pqaVar = null;
        fhb fhbVar = null;
        switch (i) {
            case 1:
                jxa zze = zze();
                parcel2.writeNoException();
                nia.f(parcel2, zze);
                return true;
            case 2:
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
                    pqaVar = queryLocalInterface instanceof pqa ? (pqa) queryLocalInterface : new poa(readStrongBinder);
                }
                nia.c(parcel);
                r3(pqaVar);
                parcel2.writeNoException();
                return true;
            case 3:
                nua w6 = mua.w6(parcel.readStrongBinder());
                nia.c(parcel);
                l1(w6);
                parcel2.writeNoException();
                return true;
            case 4:
                qua w62 = pua.w6(parcel.readStrongBinder());
                nia.c(parcel);
                C5(w62);
                parcel2.writeNoException();
                return true;
            case 5:
                String readString = parcel.readString();
                wua w63 = vua.w6(parcel.readStrongBinder());
                tua w64 = sua.w6(parcel.readStrongBinder());
                nia.c(parcel);
                b2(readString, w63, w64);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbjb zzbjbVar = (zzbjb) nia.a(parcel, zzbjb.CREATOR);
                nia.c(parcel);
                u1(zzbjbVar);
                parcel2.writeNoException();
                return true;
            case 7:
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    fhbVar = queryLocalInterface2 instanceof fhb ? (fhb) queryLocalInterface2 : new fhb(readStrongBinder2);
                }
                nia.c(parcel);
                v3(fhbVar);
                parcel2.writeNoException();
                return true;
            case 8:
                ava w65 = zua.w6(parcel.readStrongBinder());
                zzq zzqVar = (zzq) nia.a(parcel, zzq.CREATOR);
                nia.c(parcel);
                j3(w65, zzqVar);
                parcel2.writeNoException();
                return true;
            case 9:
                PublisherAdViewOptions publisherAdViewOptions = (PublisherAdViewOptions) nia.a(parcel, PublisherAdViewOptions.CREATOR);
                nia.c(parcel);
                k6(publisherAdViewOptions);
                parcel2.writeNoException();
                return true;
            case 10:
                hva w66 = cva.w6(parcel.readStrongBinder());
                nia.c(parcel);
                p4(w66);
                parcel2.writeNoException();
                return true;
            case 11:
            case 12:
            default:
                return false;
            case 13:
                zzbpp zzbppVar = (zzbpp) nia.a(parcel, zzbpp.CREATOR);
                nia.c(parcel);
                A3(zzbppVar);
                parcel2.writeNoException();
                return true;
            case 14:
                wza w67 = vza.w6(parcel.readStrongBinder());
                nia.c(parcel);
                B0(w67);
                parcel2.writeNoException();
                return true;
            case 15:
                AdManagerAdViewOptions adManagerAdViewOptions = (AdManagerAdViewOptions) nia.a(parcel, AdManagerAdViewOptions.CREATOR);
                nia.c(parcel);
                o6(adManagerAdViewOptions);
                parcel2.writeNoException();
                return true;
        }
    }
}
