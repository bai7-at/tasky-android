package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Field;
import java.security.AccessController;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzabx extends zzxi {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final Map zzc = new HashMap();

    public zzabx(Class cls) {
        try {
            for (Field field : (Field[]) AccessController.doPrivileged(new zzabw(this, cls))) {
                Enum r4 = (Enum) field.get(null);
                String name = r4.name();
                String str = r4.toString();
                zzxl zzxlVar = (zzxl) field.getAnnotation(zzxl.class);
                if (zzxlVar != null) {
                    name = zzxlVar.zza();
                    for (String str2 : zzxlVar.zzb()) {
                        this.zza.put(str2, r4);
                    }
                }
                this.zza.put(name, r4);
                this.zzb.put(str, r4);
                this.zzc.put(r4, name);
            }
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ Object read(zzacv zzacvVar) throws IOException {
        if (zzacvVar.zzt() == 9) {
            zzacvVar.zzn();
            return null;
        }
        String zzi = zzacvVar.zzi();
        Enum r0 = (Enum) this.zza.get(zzi);
        return r0 != null ? r0 : (Enum) this.zzb.get(zzi);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzxi
    public final /* bridge */ /* synthetic */ void write(zzacx zzacxVar, Object obj) throws IOException {
        Enum r2 = (Enum) obj;
        zzacxVar.zzk(r2 == null ? null : (String) this.zzc.get(r2));
    }
}
