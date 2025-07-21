package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import defpackage.ee3;
import defpackage.fc5;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzmu extends zzmx {
    private final zzjl zza;
    private final zzjs zzb;

    public zzmu(Context context, Executor executor, zzm zzmVar) {
        zzjp zzjpVar = new zzjp(context, executor, zzmVar);
        this.zza = zzjpVar;
        this.zzb = new zzjs(zzjpVar);
    }

    @Deprecated
    private final ee3 zzt(ee3 ee3Var, ee3 ee3Var2, boolean z) {
        try {
            Uri uri = (Uri) fc5.Q1(ee3Var);
            Context context = (Context) fc5.Q1(ee3Var2);
            return fc5.l3(z ? this.zzb.zzb(uri, context) : this.zzb.zza(uri, context, null, null));
        } catch (zzjt unused) {
            return null;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final int zzb() {
        zzjl zzjlVar = this.zza;
        if (!(zzjlVar instanceof zzjp)) {
            return -1;
        }
        zzjl zza = ((zzjp) zzjlVar).zza();
        if (zza instanceof zzjr) {
            return 1;
        }
        return zza instanceof zzji ? 2 : -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final ee3 zzc(ee3 ee3Var, ee3 ee3Var2) {
        return zzt(ee3Var, ee3Var2, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final ee3 zzd(ee3 ee3Var, ee3 ee3Var2) {
        return zzt(ee3Var, ee3Var2, true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zze(ee3 ee3Var, String str) {
        return ((zzjp) this.zza).zze((Context) fc5.Q1(ee3Var), str, null, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zzf(ee3 ee3Var) {
        return zzg(ee3Var, null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final String zzg(ee3 ee3Var, byte[] bArr) {
        return this.zza.zzg((Context) fc5.Q1(ee3Var), bArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzh(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3, ee3 ee3Var4) {
        return this.zza.zze((Context) fc5.Q1(ee3Var), (String) fc5.Q1(ee3Var2), (View) fc5.Q1(ee3Var3), (Activity) fc5.Q1(ee3Var4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzi(ee3 ee3Var) {
        return ((zzjp) this.zza).zzg((Context) fc5.Q1(ee3Var), null);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzj() {
        return "ms";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final String zzk(ee3 ee3Var, ee3 ee3Var2, ee3 ee3Var3) {
        return this.zza.zzh((Context) fc5.Q1(ee3Var), (View) fc5.Q1(ee3Var2), (Activity) fc5.Q1(ee3Var3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final void zzl(ee3 ee3Var) {
        this.zzb.zzc((MotionEvent) fc5.Q1(ee3Var));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final void zzm(ee3 ee3Var) {
        this.zza.zzn((View) fc5.Q1(ee3Var));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final void zzn(String str, String str2) {
        this.zzb.zzd(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final void zzo(String str) {
        this.zzb.zze(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final boolean zzp(ee3 ee3Var) {
        return this.zzb.zzg((Uri) fc5.Q1(ee3Var));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    @Deprecated
    public final boolean zzq(ee3 ee3Var) {
        return this.zzb.zzf((Uri) fc5.Q1(ee3Var));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final boolean zzr() {
        return this.zza.zzq();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzmy
    public final boolean zzs() {
        return this.zza.zzs();
    }
}
