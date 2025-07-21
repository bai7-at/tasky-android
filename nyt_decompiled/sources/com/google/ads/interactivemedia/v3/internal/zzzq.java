package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzzq extends zzxi {
    public static final zzxj zza = new zzzp();
    private final List zzb;

    public zzzq() {
        ArrayList arrayList = new ArrayList();
        this.zzb = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (zzyo.zza()) {
            arrayList.add(new SimpleDateFormat("MMM d, yyyy h:mm:ss a", locale));
        }
    }

    private final Date zza(zzacv zzacvVar) throws IOException {
        String zzi = zzacvVar.zzi();
        synchronized (this.zzb) {
            try {
                Iterator it2 = this.zzb.iterator();
                while (it2.hasNext()) {
                    try {
                        return ((DateFormat) it2.next()).parse(zzi);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return zzabz.zza(zzi, new ParsePosition(0));
                } catch (ParseException e) {
                    throw new zzwz("Failed parsing '" + zzi + "' as Date; at path " + zzacvVar.zzf(), e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() != 9) {
            return zza(zzacvVar);
        }
        zzacvVar.zzn();
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            zzacxVar.zzf();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.zzb.get(0);
        synchronized (this.zzb) {
            format = dateFormat.format(date);
        }
        zzacxVar.zzk(format);
    }
}
