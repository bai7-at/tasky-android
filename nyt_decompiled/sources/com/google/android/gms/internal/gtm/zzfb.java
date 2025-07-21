package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;

/* loaded from: classes3.dex */
public final class zzfb extends zzbs {
    private static zzfb zza;

    public zzfb(zzbv zzbvVar) {
        super(zzbvVar);
    }

    public static zzfb zza() {
        return zza;
    }

    @VisibleForTesting
    protected static final String zzf(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (!(obj instanceof Long)) {
            return obj instanceof Boolean ? String.valueOf(obj) : obj instanceof Throwable ? obj.getClass().getCanonicalName() : "-";
        }
        Long l = (Long) obj;
        if (Math.abs(l.longValue()) < 100) {
            return String.valueOf(obj);
        }
        String str = String.valueOf(obj).charAt(0) != '-' ? "" : "-";
        String valueOf = String.valueOf(Math.abs(l.longValue()));
        return str + Math.round(Math.pow(10.0d, valueOf.length() - 1)) + "..." + str + Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
    }

    public final void zzb(zzex zzexVar, String str) {
        zzS(str.length() != 0 ? "Discarding hit. ".concat(str) : new String("Discarding hit. "), zzexVar != null ? zzexVar.toString() : "no hit data");
    }

    @Override // com.google.android.gms.internal.gtm.zzbs
    protected final void zzd() {
        synchronized (zzfb.class) {
            zza = this;
        }
    }

    public final synchronized void zze(int i, String str, Object obj, Object obj2, Object obj3) {
        char c;
        try {
            Preconditions.checkNotNull(str);
            if (zzw().zzb()) {
                zzw();
                c = 'C';
            } else {
                zzw();
                c = 'c';
            }
            char charAt = "01VDIWEA?".charAt(i);
            String str2 = zzbt.zza;
            String zzD = zzbr.zzD(str, zzf(obj), zzf(obj2), zzf(obj3));
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(zzD).length());
            sb.append("3");
            sb.append(charAt);
            sb.append(c);
            sb.append(str2);
            sb.append(":");
            sb.append(zzD);
            String sb2 = sb.toString();
            if (sb2.length() > 1024) {
                sb2 = sb2.substring(0, 1024);
            }
            zzfh zzp = zzt().zzp();
            if (zzp != null) {
                zzp.zze().zzc(sb2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
