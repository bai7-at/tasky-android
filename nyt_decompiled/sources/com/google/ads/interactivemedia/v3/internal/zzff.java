package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.v3.api.UiElement;
import com.google.ads.interactivemedia.v3.impl.data.JavaScriptMsgData;
import java.net.MalformedURLException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzff {
    private static final zzwm zza;
    private final zzfd zzb;
    private final Object zzc;
    private final String zzd;
    private final zzfe zze;

    static {
        zzwn zzwnVar = new zzwn();
        zzwnVar.zzb(UiElement.class, com.google.ads.interactivemedia.v3.impl.data.zzbt.GSON_TYPE_ADAPTER);
        zzwnVar.zzb(CompanionAdSlot.class, new zzfc());
        zzwnVar.zzc(new zzra());
        zza = zzwnVar.zza();
    }

    public zzff(zzfd zzfdVar, zzfe zzfeVar, String str, Object obj) {
        this.zzb = zzfdVar;
        this.zze = zzfeVar;
        this.zzd = str;
        this.zzc = obj;
    }

    public static zzff zzc(String str) throws MalformedURLException {
        Uri parse = Uri.parse(str);
        String path = parse.getPath();
        if (path == null) {
            throw new MalformedURLException("URL must have message.");
        }
        String substring = path.substring(1);
        if (parse.getQueryParameter("sid") != null) {
            return new zzff(zzfd.zza(substring), zzfe.zza(parse.getQueryParameter(TransferTable.COLUMN_TYPE)), parse.getQueryParameter("sid"), zza.zze(parse.getQueryParameter("data"), JavaScriptMsgData.class));
        }
        throw new MalformedURLException("Session id must be provided in message.");
    }

    public static zzff zzd(String str) {
        zzwm zzwmVar = zza;
        com.google.ads.interactivemedia.v3.impl.data.zzbh zzbhVar = (com.google.ads.interactivemedia.v3.impl.data.zzbh) zzwmVar.zze(str, com.google.ads.interactivemedia.v3.impl.data.zzbh.class);
        if (zzbhVar.sid != null) {
            return new zzff(zzfd.zza(zzbhVar.name), zzfe.zza(zzbhVar.f43type), zzbhVar.sid, zzwmVar.zze(zzbhVar.data, JavaScriptMsgData.class));
        }
        throw new NullPointerException("Session id must be provided in message.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzff)) {
            return false;
        }
        zzff zzffVar = (zzff) obj;
        return this.zzb == zzffVar.zzb && zzri.zza(this.zzc, zzffVar.zzc) && zzri.zza(this.zzd, zzffVar.zzd) && this.zze == zzffVar.zze;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzb, this.zzc, this.zzd, this.zze});
    }

    public final String toString() {
        return String.format("JavaScriptMessage [command=%s, type=%s, sid=%s, data=%s]", this.zzb, this.zze, this.zzd, this.zzc);
    }

    public final zzfd zza() {
        return this.zzb;
    }

    public final zzfe zzb() {
        return this.zze;
    }

    public final Object zze() {
        return this.zzc;
    }

    public final String zzf() {
        return this.zzd;
    }

    public final String zzg() {
        zzsq zzsqVar = new zzsq();
        zzsqVar.zza(TransferTable.COLUMN_TYPE, this.zze);
        zzsqVar.zza("sid", this.zzd);
        Object obj = this.zzc;
        if (obj != null) {
            zzsqVar.zza("data", obj);
        }
        return String.format("%s('%s', %s);", "javascript:adsense.mobileads.afmanotify.receiveMessage", this.zzb, zza.zzf(zzsqVar.zzc()));
    }
}
