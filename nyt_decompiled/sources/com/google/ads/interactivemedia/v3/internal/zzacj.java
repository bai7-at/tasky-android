package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/* loaded from: classes2.dex */
final class zzacj extends zzxi {
    static final zzxj zza = new zzach();
    private final DateFormat zzb = new SimpleDateFormat("MMM d, yyyy");

    private zzacj() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            zzacxVar.zzf();
            return;
        }
        synchronized (this) {
            format = this.zzb.format((java.util.Date) date);
        }
        zzacxVar.zzk(format);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final Date read(zzacv zzacvVar) throws IOException {
        java.util.Date parse;
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        try {
            synchronized (this) {
                parse = this.zzb.parse(zzi);
            }
            return new Date(parse.getTime());
        } catch (ParseException e) {
            throw new zzwz("Failed parsing '" + zzi + "' as SQL Date; at path " + zzacvVar.zzf(), e);
        }
    }

    /* synthetic */ zzacj(zzaci zzaciVar) {
    }
}
