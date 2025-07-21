package com.google.android.gms.internal.measurement;

import defpackage.gcf;
import defpackage.icf;
import defpackage.rgf;
import defpackage.tbf;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class n2 extends p2 {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ n2(icf icfVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.p2
    final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) s3.k(obj, j);
        if (list instanceof gcf) {
            unmodifiableList = ((gcf) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof d3) && (list instanceof tbf)) {
                tbf tbfVar = (tbf) list;
                if (tbfVar.zzc()) {
                    tbfVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        s3.x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.p2
    final void b(Object obj, Object obj2, long j) {
        m2 m2Var;
        List list = (List) s3.k(obj2, j);
        int size = list.size();
        List list2 = (List) s3.k(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof gcf ? new m2(size) : ((list2 instanceof d3) && (list2 instanceof tbf)) ? ((tbf) list2).zzd(size) : new ArrayList(size);
            s3.x(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                s3.x(obj, j, arrayList);
                m2Var = arrayList;
            } else if (list2 instanceof rgf) {
                m2 m2Var2 = new m2(list2.size() + size);
                m2Var2.addAll(m2Var2.size(), (rgf) list2);
                s3.x(obj, j, m2Var2);
                m2Var = m2Var2;
            } else if ((list2 instanceof d3) && (list2 instanceof tbf)) {
                tbf tbfVar = (tbf) list2;
                if (!tbfVar.zzc()) {
                    list2 = tbfVar.zzd(list2.size() + size);
                    s3.x(obj, j, list2);
                }
            }
            list2 = m2Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        s3.x(obj, j, list);
    }
}
