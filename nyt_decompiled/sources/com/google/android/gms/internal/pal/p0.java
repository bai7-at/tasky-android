package com.google.android.gms.internal.pal;

import defpackage.lh4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class p0 {
    p0() {
    }

    public static final int a(int i, Object obj, Object obj2) {
        zzadz zzadzVar = (zzadz) obj;
        lh4.a(obj2);
        if (zzadzVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzadzVar.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean b(Object obj) {
        return !((zzadz) obj).h();
    }

    public static final Object c(Object obj, Object obj2) {
        zzadz zzadzVar = (zzadz) obj;
        zzadz zzadzVar2 = (zzadz) obj2;
        if (!zzadzVar2.isEmpty()) {
            if (!zzadzVar.h()) {
                zzadzVar = zzadzVar.c();
            }
            zzadzVar.f(zzadzVar2);
        }
        return zzadzVar;
    }
}
