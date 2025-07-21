package com.google.android.gms.internal.measurement;

import defpackage.lh4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class u2 {
    u2() {
    }

    public static final int a(int i, Object obj, Object obj2) {
        zzld zzldVar = (zzld) obj;
        lh4.a(obj2);
        if (zzldVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzldVar.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        zzld zzldVar = (zzld) obj;
        zzld zzldVar2 = (zzld) obj2;
        if (!zzldVar2.isEmpty()) {
            if (!zzldVar.h()) {
                zzldVar = zzldVar.c();
            }
            zzldVar.f(zzldVar2);
        }
        return zzldVar;
    }
}
