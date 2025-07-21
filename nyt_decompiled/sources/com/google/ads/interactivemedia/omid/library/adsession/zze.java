package com.google.ads.interactivemedia.omid.library.adsession;

import android.view.View;
import com.google.ads.interactivemedia.v3.internal.zzbx;
import com.google.ads.interactivemedia.v3.internal.zzbz;
import com.google.ads.interactivemedia.v3.internal.zzcc;
import com.google.ads.interactivemedia.v3.internal.zzcd;
import com.google.ads.interactivemedia.v3.internal.zzcj;
import com.google.ads.interactivemedia.v3.internal.zzck;
import com.google.ads.interactivemedia.v3.internal.zzcm;
import com.google.ads.interactivemedia.v3.internal.zzcp;
import com.google.ads.interactivemedia.v3.internal.zzdg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class zze extends zza {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final zzc zzb;
    private final zzb zzc;
    private zzdg zze;
    private zzcj zzf;
    private final List zzd = new ArrayList();
    private boolean zzg = false;
    private boolean zzh = false;
    private final String zzi = UUID.randomUUID().toString();

    zze(zzb zzbVar, zzc zzcVar) {
        this.zzc = zzbVar;
        this.zzb = zzcVar;
        zzl(null);
        if (zzcVar.zzc() == zzd.HTML || zzcVar.zzc() == zzd.JAVASCRIPT) {
            this.zzf = new zzck(zzcVar.zza());
        } else {
            this.zzf = new zzcm(zzcVar.zzh(), null);
        }
        this.zzf.zzj();
        zzbx.zza().zzd(this);
        zzcc.zza().zzd(this.zzf.zza(), zzbVar.zzb());
    }

    private final void zzl(View view) {
        this.zze = new zzdg(view);
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzb(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        zzbz zzbzVar;
        if (this.zzh) {
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        }
        if (str != null) {
            if (str.length() > 50) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason over 50 characters in length");
            }
            if (!zza.matcher(str).matches()) {
                throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            }
        }
        Iterator it2 = this.zzd.iterator();
        while (true) {
            if (!it2.hasNext()) {
                zzbzVar = null;
                break;
            } else {
                zzbzVar = (zzbz) it2.next();
                if (zzbzVar.zzb().get() == view) {
                    break;
                }
            }
        }
        if (zzbzVar == null) {
            this.zzd.add(new zzbz(view, friendlyObstructionPurpose, str));
        }
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzc() {
        if (this.zzh) {
            return;
        }
        this.zze.clear();
        zze();
        this.zzh = true;
        zzcc.zza().zzc(this.zzf.zza());
        zzbx.zza().zze(this);
        this.zzf.zzc();
        this.zzf = null;
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzd(View view) {
        if (this.zzh) {
            return;
        }
        zzcp.zzb(view, "AdView is null");
        if (zzg() == view) {
            return;
        }
        zzl(view);
        this.zzf.zzb();
        Collection<zze> zzc = zzbx.zza().zzc();
        if (zzc == null || zzc.isEmpty()) {
            return;
        }
        for (zze zzeVar : zzc) {
            if (zzeVar != this && zzeVar.zzg() == view) {
                zzeVar.zze.clear();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zze() {
        if (this.zzh) {
            return;
        }
        this.zzd.clear();
    }

    @Override // com.google.ads.interactivemedia.omid.library.adsession.zza
    public final void zzf() {
        if (this.zzg) {
            return;
        }
        this.zzg = true;
        zzbx.zza().zzf(this);
        this.zzf.zzh(zzcd.zzb().zza());
        this.zzf.zzf(this, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View zzg() {
        return (View) this.zze.get();
    }

    public final zzcj zzh() {
        return this.zzf;
    }

    public final String zzi() {
        return this.zzi;
    }

    public final List zzj() {
        return this.zzd;
    }

    public final boolean zzk() {
        return this.zzg && !this.zzh;
    }
}
