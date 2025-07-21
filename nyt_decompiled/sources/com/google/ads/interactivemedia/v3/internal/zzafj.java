package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
final class zzafj extends zzafn {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ zzafj(zzafi zzafiVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List zzf(Object obj, long j, int i) {
        zzafg zzafgVar;
        List list = (List) zzaht.zzf(obj, j);
        if (list.isEmpty()) {
            List zzafgVar2 = list instanceof zzafh ? new zzafg(i) : ((list instanceof zzagg) && (list instanceof zzaez)) ? ((zzaez) list).zzd(i) : new ArrayList(i);
            zzaht.zzs(obj, j, zzafgVar2);
            return zzafgVar2;
        }
        if (zza.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            zzaht.zzs(obj, j, arrayList);
            zzafgVar = arrayList;
        } else {
            if (!(list instanceof zzaho)) {
                if (!(list instanceof zzagg) || !(list instanceof zzaez)) {
                    return list;
                }
                zzaez zzaezVar = (zzaez) list;
                if (zzaezVar.zzc()) {
                    return list;
                }
                zzaez zzd = zzaezVar.zzd(list.size() + i);
                zzaht.zzs(obj, j, zzd);
                return zzd;
            }
            zzafg zzafgVar3 = new zzafg(list.size() + i);
            zzafgVar3.addAll(zzafgVar3.size(), (zzaho) list);
            zzaht.zzs(obj, j, zzafgVar3);
            zzafgVar = zzafgVar3;
        }
        return zzafgVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    final void zzb(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) zzaht.zzf(obj, j);
        if (list instanceof zzafh) {
            unmodifiableList = ((zzafh) list).zze();
        } else {
            if (zza.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof zzagg) && (list instanceof zzaez)) {
                zzaez zzaezVar = (zzaez) list;
                if (zzaezVar.zzc()) {
                    zzaezVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        zzaht.zzs(obj, j, unmodifiableList);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafn
    final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzaht.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzaht.zzs(obj, j, list);
    }

    private zzafj() {
        super(null);
    }
}
