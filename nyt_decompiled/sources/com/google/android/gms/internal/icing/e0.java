package com.google.android.gms.internal.icing;

import defpackage.k2e;
import defpackage.rlc;
import defpackage.vcc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class e0 extends g0 {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ e0(d0 d0Var) {
        super(null);
    }

    @Override // com.google.android.gms.internal.icing.g0
    final void a(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) k1.s(obj, j);
        if (list instanceof rlc) {
            unmodifiableList = ((rlc) list).zzi();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof u0) && (list instanceof vcc)) {
                vcc vccVar = (vcc) list;
                if (vccVar.zza()) {
                    vccVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        k1.t(obj, j, unmodifiableList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.icing.g0
    final void b(Object obj, Object obj2, long j) {
        c0 c0Var;
        List list = (List) k1.s(obj2, j);
        int size = list.size();
        List list2 = (List) k1.s(obj, j);
        if (list2.isEmpty()) {
            list2 = list2 instanceof rlc ? new c0(size) : ((list2 instanceof u0) && (list2 instanceof vcc)) ? ((vcc) list2).i(size) : new ArrayList(size);
            k1.t(obj, j, list2);
        } else {
            if (c.isAssignableFrom(list2.getClass())) {
                ArrayList arrayList = new ArrayList(list2.size() + size);
                arrayList.addAll(list2);
                k1.t(obj, j, arrayList);
                c0Var = arrayList;
            } else if (list2 instanceof k2e) {
                c0 c0Var2 = new c0(list2.size() + size);
                c0Var2.addAll(c0Var2.size(), (k2e) list2);
                k1.t(obj, j, c0Var2);
                c0Var = c0Var2;
            } else if ((list2 instanceof u0) && (list2 instanceof vcc)) {
                vcc vccVar = (vcc) list2;
                if (!vccVar.zza()) {
                    list2 = vccVar.i(list2.size() + size);
                    k1.t(obj, j, list2);
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
        k1.t(obj, j, list);
    }
}
