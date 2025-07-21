package com.google.ads.interactivemedia.v3.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.ee3;

/* loaded from: classes2.dex */
public abstract class zzmx extends zzmr implements zzmy {
    public zzmx() {
        super("com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmr
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                String zzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(zzj);
                return true;
            case 2:
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                zzms.zzb(parcel);
                zzn(readString, readString2);
                parcel2.writeNoException();
                return true;
            case 3:
                ee3 O = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                boolean zzp = zzp(O);
                parcel2.writeNoException();
                parcel2.writeInt(zzp ? 1 : 0);
                return true;
            case 4:
                ee3 O2 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                boolean zzq = zzq(O2);
                parcel2.writeNoException();
                parcel2.writeInt(zzq ? 1 : 0);
                return true;
            case 5:
                String readString3 = parcel.readString();
                zzms.zzb(parcel);
                zzo(readString3);
                parcel2.writeNoException();
                return true;
            case 6:
                ee3 O3 = ee3.a.O(parcel.readStrongBinder());
                ee3 O4 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                ee3 zzd = zzd(O3, O4);
                parcel2.writeNoException();
                zzms.zzd(parcel2, zzd);
                return true;
            case 7:
                ee3 O5 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzf = zzf(O5);
                parcel2.writeNoException();
                parcel2.writeString(zzf);
                return true;
            case 8:
                ee3 O6 = ee3.a.O(parcel.readStrongBinder());
                String readString4 = parcel.readString();
                zzms.zzb(parcel);
                String zze = zze(O6, readString4);
                parcel2.writeNoException();
                parcel2.writeString(zze);
                return true;
            case 9:
                ee3 O7 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                zzl(O7);
                parcel2.writeNoException();
                return true;
            case 10:
                ee3 O8 = ee3.a.O(parcel.readStrongBinder());
                ee3 O9 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                ee3 zzc = zzc(O8, O9);
                parcel2.writeNoException();
                zzms.zzd(parcel2, zzc);
                return true;
            case 11:
                parcel.readString();
                int i3 = zzms.zza;
                parcel.readInt();
                zzms.zzb(parcel);
                parcel2.writeNoException();
                parcel2.writeInt(0);
                return true;
            case 12:
                ee3 O10 = ee3.a.O(parcel.readStrongBinder());
                byte[] createByteArray = parcel.createByteArray();
                zzms.zzb(parcel);
                String zzg = zzg(O10, createByteArray);
                parcel2.writeNoException();
                parcel2.writeString(zzg);
                return true;
            case 13:
                ee3 O11 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzi = zzi(O11);
                parcel2.writeNoException();
                parcel2.writeString(zzi);
                return true;
            case 14:
                ee3 O12 = ee3.a.O(parcel.readStrongBinder());
                ee3 O13 = ee3.a.O(parcel.readStrongBinder());
                ee3 O14 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzk = zzk(O12, O13, O14);
                parcel2.writeNoException();
                parcel2.writeString(zzk);
                return true;
            case 15:
                ee3 O15 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                zzm(O15);
                parcel2.writeNoException();
                return true;
            case 16:
            default:
                return false;
            case 17:
                ee3 O16 = ee3.a.O(parcel.readStrongBinder());
                ee3 O17 = ee3.a.O(parcel.readStrongBinder());
                ee3 O18 = ee3.a.O(parcel.readStrongBinder());
                ee3 O19 = ee3.a.O(parcel.readStrongBinder());
                zzms.zzb(parcel);
                String zzh = zzh(O16, O17, O18, O19);
                parcel2.writeNoException();
                parcel2.writeString(zzh);
                return true;
            case 18:
                boolean zzr = zzr();
                parcel2.writeNoException();
                int i4 = zzms.zza;
                parcel2.writeInt(zzr ? 1 : 0);
                return true;
            case 19:
                boolean zzs = zzs();
                parcel2.writeNoException();
                int i5 = zzms.zza;
                parcel2.writeInt(zzs ? 1 : 0);
                return true;
            case 20:
                int zzb = zzb();
                parcel2.writeNoException();
                parcel2.writeInt(zzb);
                return true;
        }
    }
}
