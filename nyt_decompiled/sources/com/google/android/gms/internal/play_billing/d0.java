package com.google.android.gms.internal.play_billing;

import defpackage.ccd;
import defpackage.cqb;
import defpackage.ehb;
import defpackage.irb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class d0 extends f0 {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ d0(irb irbVar) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.f0
    final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) h1.k(obj, j);
        if (list instanceof cqb) {
            unmodifiableList = ((cqb) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof t0) && (list instanceof ehb)) {
                ehb ehbVar = (ehb) list;
                if (ehbVar.zzc()) {
                    ehbVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        h1.x(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.f0
    final void b(Object obj, Object obj2, long j) {
        c0 c0Var;
        List list = (List) h1.k(obj2, j);
        int size = list.size();
        List list2 = (List) h1.k(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof cqb ? new c0(size) : ((list2 instanceof t0) && (list2 instanceof ehb)) ? ((ehb) list2).zzd(size) : new ArrayList(size);
            h1.x(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                h1.x(obj, j, arrayList);
                c0Var = arrayList;
            } else if (list2 instanceof ccd) {
                c0 c0Var2 = new c0(list2.size() + size);
                c0Var2.addAll(c0Var2.size(), (ccd) list2);
                h1.x(obj, j, c0Var2);
                c0Var = c0Var2;
            } else if ((list2 instanceof t0) && (list2 instanceof ehb)) {
                ehb ehbVar = (ehb) list2;
                if (!ehbVar.zzc()) {
                    list2 = ehbVar.zzd(list2.size() + size);
                    h1.x(obj, j, list2);
                }
            }
            list2 = c0Var;
        }
        int size2 = list2.size();
        int size3 = list.size();
        if (size2 > 0 && size3 > 0) {
            list2.addAll(list);
        }
        if (size2 > 0) {
            list = list2;
        }
        h1.x(obj, j, list);
    }
}
