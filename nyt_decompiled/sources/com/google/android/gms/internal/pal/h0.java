package com.google.android.gms.internal.pal;

import defpackage.mw9;
import defpackage.sz9;
import defpackage.vw9;
import defpackage.xw9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class h0 extends j0 {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ h0(xw9 xw9Var) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List f(Object obj, long j, int i) {
        g0 g0Var;
        List list = (List) p1.k(obj, j);
        if (list.isEmpty()) {
            List g0Var2 = list instanceof vw9 ? new g0(i) : ((list instanceof y0) && (list instanceof mw9)) ? ((mw9) list).zzd(i) : new ArrayList(i);
            p1.x(obj, j, g0Var2);
            return g0Var2;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            p1.x(obj, j, arrayList);
            g0Var = arrayList;
        } else {
            if (!(list instanceof sz9)) {
                if (!(list instanceof y0) || !(list instanceof mw9)) {
                    return list;
                }
                mw9 mw9Var = (mw9) list;
                if (mw9Var.zzc()) {
                    return list;
                }
                mw9 zzd = mw9Var.zzd(list.size() + i);
                p1.x(obj, j, zzd);
                return zzd;
            }
            g0 g0Var3 = new g0(list.size() + i);
            g0Var3.addAll(g0Var3.size(), (sz9) list);
            p1.x(obj, j, g0Var3);
            g0Var = g0Var3;
        }
        return g0Var;
    }

    @Override // com.google.android.gms.internal.pal.j0
    final List a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.pal.j0
    final void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) p1.k(obj, j);
        if (list instanceof vw9) {
            unmodifiableList = ((vw9) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof y0) && (list instanceof mw9)) {
                mw9 mw9Var = (mw9) list;
                if (mw9Var.zzc()) {
                    mw9Var.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        p1.x(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.pal.j0
    final void c(Object obj, Object obj2, long j) {
        List list = (List) p1.k(obj2, j);
        List f = f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        p1.x(obj, j, list);
    }
}
