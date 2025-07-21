package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzwn {
    private zzyn zza = zzyn.zza;
    private final zzwf zzb = zzwe.IDENTITY;
    private final Map zzc = new HashMap();
    private final List zzd = new ArrayList();
    private final List zze = new ArrayList();
    private final zzxg zzf = zzwm.zzb;
    private final zzxg zzg = zzwm.zzc;
    private final LinkedList zzh = new LinkedList();

    public final zzwm zza() {
        ArrayList arrayList = new ArrayList(this.zzd.size() + this.zze.size() + 3);
        arrayList.addAll(this.zzd);
        Collections.reverse(arrayList);
        ArrayList arrayList2 = new ArrayList(this.zze);
        Collections.reverse(arrayList2);
        arrayList.addAll(arrayList2);
        boolean z = zzacs.zza;
        return new zzwm(this.zza, this.zzb, new HashMap(this.zzc), false, false, false, true, null, false, false, true, 1, null, 2, 2, new ArrayList(this.zzd), new ArrayList(this.zze), arrayList, this.zzf, this.zzg, new ArrayList(this.zzh));
    }

    public final zzwn zzb(Type type2, Object obj) {
        boolean z = obj instanceof zzwy;
        boolean z2 = true;
        if (!z && !(obj instanceof zzwq) && !(obj instanceof zzwo) && !(obj instanceof zzxi)) {
            z2 = false;
        }
        zzxm.zza(z2);
        if (obj instanceof zzwo) {
            this.zzc.put(type2, (zzwo) obj);
        }
        if (z || (obj instanceof zzwq)) {
            this.zzd.add(zzaal.zzb(zzact.zzb(type2), obj));
        }
        if (obj instanceof zzxi) {
            this.zzd.add(zzaby.zza(zzact.zzb(type2), (zzxi) obj));
        }
        return this;
    }

    public final zzwn zzc(zzxj zzxjVar) {
        this.zzd.add(zzxjVar);
        return this;
    }

    public final zzwn zzd(zzqz zzqzVar) {
        this.zza = this.zza.zze(zzqzVar, true, false);
        return this;
    }
}
