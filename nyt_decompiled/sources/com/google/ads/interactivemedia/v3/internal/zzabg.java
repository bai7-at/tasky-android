package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzabg extends zzxi {
    zzabg() {
    }

    private static final zzwr zzb(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 5) {
            return new zzww(zzacvVar.zzi());
        }
        if (i2 == 6) {
            return new zzww(new zzyq(zzacvVar.zzi()));
        }
        if (i2 == 7) {
            return new zzww(Boolean.valueOf(zzacvVar.zzs()));
        }
        if (i2 != 8) {
            throw new IllegalStateException("Unexpected token: ".concat(zzacw.zza(i)));
        }
        zzacvVar.zzn();
        return zzwt.zza;
    }

    private static final zzwr zzc(zzacv zzacvVar, int i) throws IOException {
        int i2 = i - 1;
        if (i2 == 0) {
            zzacvVar.zzj();
            return new zzwp();
        }
        if (i2 != 2) {
            return null;
        }
        zzacvVar.zzk();
        return new zzwu();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        int zzt = zzacvVar.zzt();
        zzwr zzc = zzc(zzacvVar, zzt);
        if (zzc == null) {
            return zzb(zzacvVar, zzt);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (zzacvVar.zzq()) {
                String zzh = zzc instanceof zzwu ? zzacvVar.zzh() : null;
                int zzt2 = zzacvVar.zzt();
                zzwr zzc2 = zzc(zzacvVar, zzt2);
                zzwr zzb = zzc2 == null ? zzb(zzacvVar, zzt2) : zzc2;
                if (zzc instanceof zzwp) {
                    ((zzwp) zzc).zza(zzb);
                } else {
                    ((zzwu) zzc).zzb(zzh, zzb);
                }
                if (zzc2 != null) {
                    arrayDeque.addLast(zzc);
                    zzc = zzb;
                }
            } else {
                if (zzc instanceof zzwp) {
                    zzacvVar.zzl();
                } else {
                    zzacvVar.zzm();
                }
                if (arrayDeque.isEmpty()) {
                    return zzc;
                }
                zzc = (zzwr) arrayDeque.removeLast();
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void write(zzacx zzacxVar, zzwr zzwrVar) throws IOException {
        if (zzwrVar == null || (zzwrVar instanceof zzwt)) {
            zzacxVar.zzf();
            return;
        }
        if (zzwrVar instanceof zzww) {
            zzww zzwwVar = (zzww) zzwrVar;
            if (zzwwVar.zzf()) {
                zzacxVar.zzj(zzwwVar.zza());
                return;
            } else if (zzwwVar.zze()) {
                zzacxVar.zzl(zzwwVar.zzd());
                return;
            } else {
                zzacxVar.zzk(zzwwVar.zzb());
                return;
            }
        }
        if (zzwrVar instanceof zzwp) {
            zzacxVar.zza();
            Iterator it2 = ((zzwp) zzwrVar).iterator();
            while (it2.hasNext()) {
                write(zzacxVar, (zzwr) it2.next());
            }
            zzacxVar.zzc();
            return;
        }
        if (!(zzwrVar instanceof zzwu)) {
            throw new IllegalArgumentException("Couldn't write ".concat(String.valueOf(zzwrVar.getClass())));
        }
        zzacxVar.zzb();
        for (Map.Entry entry : ((zzwu) zzwrVar).zza()) {
            zzacxVar.zze((String) entry.getKey());
            write(zzacxVar, (zzwr) entry.getValue());
        }
        zzacxVar.zzd();
    }
}
