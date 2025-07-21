package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* loaded from: classes2.dex */
final class zzabe extends zzxi {
    zzabe() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        zzacvVar.zzk();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (zzacvVar.zzt() != 4) {
            String zzh = zzacvVar.zzh();
            int zzc = zzacvVar.zzc();
            if ("year".equals(zzh)) {
                i = zzc;
            } else if ("month".equals(zzh)) {
                i2 = zzc;
            } else if ("dayOfMonth".equals(zzh)) {
                i3 = zzc;
            } else if ("hourOfDay".equals(zzh)) {
                i4 = zzc;
            } else if ("minute".equals(zzh)) {
                i5 = zzc;
            } else if ("second".equals(zzh)) {
                i6 = zzc;
            }
        }
        zzacvVar.zzm();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        if (((Calendar) obj) == null) {
            zzacxVar.zzf();
            return;
        }
        zzacxVar.zzb();
        zzacxVar.zze("year");
        zzacxVar.zzh(r4.get(1));
        zzacxVar.zze("month");
        zzacxVar.zzh(r4.get(2));
        zzacxVar.zze("dayOfMonth");
        zzacxVar.zzh(r4.get(5));
        zzacxVar.zze("hourOfDay");
        zzacxVar.zzh(r4.get(11));
        zzacxVar.zze("minute");
        zzacxVar.zzh(r4.get(12));
        zzacxVar.zze("second");
        zzacxVar.zzh(r4.get(13));
        zzacxVar.zzd();
    }
}
