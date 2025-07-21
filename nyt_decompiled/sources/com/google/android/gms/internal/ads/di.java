package com.google.android.gms.internal.ads;

import defpackage.h2f;
import defpackage.n1f;
import defpackage.o1f;
import defpackage.p1f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
final class di extends fi {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ di(p1f p1fVar) {
        super(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static List f(Object obj, long j, int i) {
        ci ciVar;
        List list = (List) mj.p(obj, j);
        if (list.isEmpty()) {
            List ciVar2 = list instanceof o1f ? new ci(i) : ((list instanceof ti) && (list instanceof n1f)) ? ((n1f) list).zzd(i) : new ArrayList(i);
            mj.D(obj, j, ciVar2);
            return ciVar2;
        }
        if (c.isAssignableFrom(list.getClass())) {
            ArrayList arrayList = new ArrayList(list.size() + i);
            arrayList.addAll(list);
            mj.D(obj, j, arrayList);
            ciVar = arrayList;
        } else {
            if (!(list instanceof h2f)) {
                if (!(list instanceof ti) || !(list instanceof n1f)) {
                    return list;
                }
                n1f n1fVar = (n1f) list;
                if (n1fVar.zzc()) {
                    return list;
                }
                n1f zzd = n1fVar.zzd(list.size() + i);
                mj.D(obj, j, zzd);
                return zzd;
            }
            ci ciVar3 = new ci(list.size() + i);
            ciVar3.addAll(ciVar3.size(), (h2f) list);
            mj.D(obj, j, ciVar3);
            ciVar = ciVar3;
        }
        return ciVar;
    }

    @Override // com.google.android.gms.internal.ads.fi
    final List a(Object obj, long j) {
        return f(obj, j, 10);
    }

    @Override // com.google.android.gms.internal.ads.fi
    final void b(Object obj, long j) {
        Object unmodifiableList;
        List list = (List) mj.p(obj, j);
        if (list instanceof o1f) {
            unmodifiableList = ((o1f) list).zze();
        } else {
            if (c.isAssignableFrom(list.getClass())) {
                return;
            }
            if ((list instanceof ti) && (list instanceof n1f)) {
                n1f n1fVar = (n1f) list;
                if (n1fVar.zzc()) {
                    n1fVar.zzb();
                    return;
                }
                return;
            }
            unmodifiableList = Collections.unmodifiableList(list);
        }
        mj.D(obj, j, unmodifiableList);
    }

    @Override // com.google.android.gms.internal.ads.fi
    final void c(Object obj, Object obj2, long j) {
        List list = (List) mj.p(obj2, j);
        List f = f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        mj.D(obj, j, list);
    }
}
