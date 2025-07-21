package com.google.android.gms.internal.icing;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import defpackage.lh4;
import io.embrace.android.embracesdk.config.behavior.NetworkBehavior;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.zip.CRC32;

@ShowFirstParty
@SafeParcelable.Class(creator = "UsageInfoCreator")
@SafeParcelable.Reserved({NetworkBehavior.DEFAULT_NETWORK_CALL_LIMIT})
/* loaded from: classes3.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new d2();

    @SafeParcelable.Field(id = 1)
    final zzi zza;

    @SafeParcelable.Field(id = 2)
    final long zzb;

    @SafeParcelable.Field(id = 3)
    int zzc;

    @SafeParcelable.Field(id = 4)
    public final String zzd;

    @SafeParcelable.Field(id = 5)
    final zzg zze;

    @SafeParcelable.Field(defaultValue = "false", id = 6)
    final boolean zzf;

    @SafeParcelable.Field(defaultValue = "-1", id = 7)
    int zzg;

    @SafeParcelable.Field(id = 8)
    int zzh;

    @SafeParcelable.Field(id = 9)
    public final String zzi;

    zzx(zzi zziVar, long j, int i, String str, zzg zzgVar, boolean z, int i2, int i3, String str2) {
        this.zza = zziVar;
        this.zzb = j;
        this.zzc = i;
        this.zzd = str;
        this.zze = zzgVar;
        this.zzf = z;
        this.zzg = i2;
        this.zzh = i3;
        this.zzi = str2;
    }

    public static b1 G0(Intent intent, String str, Uri uri, String str2, List list) {
        String string;
        b1 b1Var = new b1();
        if (str != null) {
            a2 a2Var = new a2("title");
            a2Var.c(true);
            a2Var.d(AuthenticationTokenClaims.JSON_KEY_NAME);
            b1Var.a(new zzk(str, a2Var.e(), z1.b("text1"), null));
        }
        if (uri != null) {
            String uri2 = uri.toString();
            a2 a2Var2 = new a2("web_url");
            a2Var2.b(true);
            a2Var2.d("url");
            b1Var.a(new zzk(uri2, a2Var2.e(), zzk.zza, null));
        }
        if (list != null) {
            b o = e.o();
            int size = list.size();
            d[] dVarArr = new d[size];
            if (size > 0) {
                d.o();
                lh4.a(list.get(0));
                throw null;
            }
            o.i(Arrays.asList(dVarArr));
            byte[] b = ((e) o.g()).b();
            a2 a2Var3 = new a2("outlinks");
            a2Var3.b(true);
            a2Var3.d(".private:outLinks");
            a2Var3.a("blob");
            b1Var.a(new zzk(null, a2Var3.e(), zzk.zza, b));
        }
        String action = intent.getAction();
        if (action != null) {
            b1Var.a(K0("intent_action", action));
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            b1Var.a(K0("intent_data", dataString));
        }
        ComponentName component = intent.getComponent();
        if (component != null) {
            b1Var.a(K0("intent_activity", component.getClassName()));
        }
        Bundle extras = intent.getExtras();
        if (extras != null && (string = extras.getString("intent_extra_data_key")) != null) {
            b1Var.a(K0("intent_extra_data", string));
        }
        if (str2 != null) {
            b1Var.b(str2);
        }
        b1Var.c(true);
        return b1Var;
    }

    private static zzi H0(String str, String str2) {
        return new zzi(str, "", str2);
    }

    private static zzk K0(String str, String str2) {
        a2 a2Var = new a2(str);
        a2Var.b(true);
        return new zzk(str2, a2Var.e(), z1.b(str), null);
    }

    private static String X0(Intent intent) {
        String uri = intent.toUri(1);
        CRC32 crc32 = new CRC32();
        try {
            crc32.update(uri.getBytes(Constants.DEFAULT_ENCODING));
            return Long.toHexString(crc32.getValue());
        } catch (UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    public static zzi t0(String str, Intent intent) {
        return H0(str, X0(intent));
    }

    public final String toString() {
        return String.format(Locale.US, "UsageInfo[documentId=%s, timestamp=%d, usageType=%d, status=%d]", this.zza, Long.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzh));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zza, i, false);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zze, i, false);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zzf);
        SafeParcelWriter.writeInt(parcel, 7, this.zzg);
        SafeParcelWriter.writeInt(parcel, 8, this.zzh);
        SafeParcelWriter.writeString(parcel, 9, this.zzi, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
