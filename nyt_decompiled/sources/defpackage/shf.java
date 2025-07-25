package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.comscore.streaming.EventType;
import com.google.android.gms.ads.internal.client.zzc;
import com.google.android.gms.ads.internal.client.zzfh;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class shf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        Bundle bundle = null;
        ArrayList<String> arrayList = null;
        String str = null;
        zzfh zzfhVar = null;
        Location location = null;
        String str2 = null;
        Bundle bundle2 = null;
        Bundle bundle3 = null;
        ArrayList<String> arrayList2 = null;
        String str3 = null;
        String str4 = null;
        zzc zzcVar = null;
        String str5 = null;
        ArrayList<String> arrayList3 = null;
        String str6 = null;
        long j = 0;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 2:
                    j = SafeParcelReader.readLong(parcel, readHeader);
                    break;
                case 3:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 4:
                    i2 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 6:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 7:
                    i3 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 8:
                    z2 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 9:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    zzfhVar = (zzfh) SafeParcelReader.createParcelable(parcel, readHeader, zzfh.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.createParcelable(parcel, readHeader, Location.CREATOR);
                    break;
                case 12:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 13:
                    bundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 14:
                    bundle3 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 16:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 18:
                    z3 = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, readHeader, zzc.CREATOR);
                    break;
                case 20:
                    i4 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 21:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 22:
                    arrayList3 = SafeParcelReader.createStringList(parcel, readHeader);
                    break;
                case 23:
                    i5 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 24:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case EventType.SUBS /* 25 */:
                    i6 = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new zzl(i, j, bundle, i2, arrayList, z, i3, z2, str, zzfhVar, location, str2, bundle2, bundle3, arrayList2, str3, str4, z3, zzcVar, i4, str5, arrayList3, i5, str6, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
