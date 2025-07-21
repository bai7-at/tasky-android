package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzlo;
import com.google.android.gms.measurement.internal.zzq;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ogd extends lxa implements shd {
    public ogd() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.lxa
    protected final boolean O(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                zzaw zzawVar = (zzaw) qya.a(parcel, zzaw.CREATOR);
                zzq zzqVar = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                R1(zzawVar, zzqVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzlo zzloVar = (zzlo) qya.a(parcel, zzlo.CREATOR);
                zzq zzqVar2 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                L1(zzloVar, zzqVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                zzq zzqVar3 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                X1(zzqVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzaw zzawVar2 = (zzaw) qya.a(parcel, zzaw.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                qya.c(parcel);
                m5(zzawVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzq zzqVar4 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                S3(zzqVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzq zzqVar5 = (zzq) qya.a(parcel, zzq.CREATOR);
                boolean g = qya.g(parcel);
                qya.c(parcel);
                List O0 = O0(zzqVar5, g);
                parcel2.writeNoException();
                parcel2.writeTypedList(O0);
                return true;
            case 9:
                zzaw zzawVar3 = (zzaw) qya.a(parcel, zzaw.CREATOR);
                String readString3 = parcel.readString();
                qya.c(parcel);
                byte[] k4 = k4(zzawVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(k4);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                qya.c(parcel);
                g2(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzq zzqVar6 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                String r4 = r4(zzqVar6);
                parcel2.writeNoException();
                parcel2.writeString(r4);
                return true;
            case 12:
                zzac zzacVar = (zzac) qya.a(parcel, zzac.CREATOR);
                zzq zzqVar7 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                M5(zzacVar, zzqVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzac zzacVar2 = (zzac) qya.a(parcel, zzac.CREATOR);
                qya.c(parcel);
                L0(zzacVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean g2 = qya.g(parcel);
                zzq zzqVar8 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                List G2 = G2(readString7, readString8, g2, zzqVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(G2);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean g3 = qya.g(parcel);
                qya.c(parcel);
                List Z3 = Z3(readString9, readString10, readString11, g3);
                parcel2.writeNoException();
                parcel2.writeTypedList(Z3);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzq zzqVar9 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                List d5 = d5(readString12, readString13, zzqVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(d5);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                qya.c(parcel);
                List w4 = w4(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(w4);
                return true;
            case 18:
                zzq zzqVar10 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                S2(zzqVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) qya.a(parcel, Bundle.CREATOR);
                zzq zzqVar11 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                Y3(bundle, zzqVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzq zzqVar12 = (zzq) qya.a(parcel, zzq.CREATOR);
                qya.c(parcel);
                D2(zzqVar12);
                parcel2.writeNoException();
                return true;
        }
    }
}
