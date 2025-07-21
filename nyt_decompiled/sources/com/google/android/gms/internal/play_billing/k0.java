package com.google.android.gms.internal.play_billing;

import defpackage.lh4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class k0 {
    k0() {
    }

    public static final int a(int i, Object obj, Object obj2) {
        zzcz zzczVar = (zzcz) obj;
        lh4.a(obj2);
        if (zzczVar.isEmpty()) {
            return 0;
        }
        Iterator it2 = zzczVar.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final Object b(Object obj, Object obj2) {
        zzcz zzczVar = (zzcz) obj;
        zzcz zzczVar2 = (zzcz) obj2;
        if (!zzczVar2.isEmpty()) {
            if (!zzczVar.h()) {
                zzczVar = zzczVar.c();
            }
            zzczVar.f(zzczVar2);
        }
        return zzczVar;
    }
}
