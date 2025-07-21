package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes2.dex */
final class zzacm extends zzxi {
    static final zzxj zza = new zzack();
    private final DateFormat zzb = new SimpleDateFormat("hh:mm:ss a");

    private zzacm() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            zzacxVar.zzf();
            return;
        }
        synchronized (this) {
            format = this.zzb.format((Date) time);
        }
        zzacxVar.zzk(format);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Time read(zzacv zzacvVar) throws IOException {
        Time time;
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            synchronized (this) {
                time = new Time(this.zzb.parse(zzi).getTime());
            }
            return time;
        } catch (ParseException e) {
            throw new zzwz("Failed parsing '" + zzi + "' as SQL Time; at path " + zzacvVar.zzf(), e);
        }
    }

    /* synthetic */ zzacm(zzacl zzaclVar) {
    }
}
