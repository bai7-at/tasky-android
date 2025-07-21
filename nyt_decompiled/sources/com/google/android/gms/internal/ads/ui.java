package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
final class ui {
    private static final ui c = new ui();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final cj a = new ji();

    private ui() {
    }

    public static ui a() {
        return c;
    }

    public final bj b(Class cls) {
        ai.c(cls, "messageType");
        bj bjVar = (bj) this.b.get(cls);
        if (bjVar == null) {
            bjVar = this.a.zza(cls);
            ai.c(cls, "messageType");
            bj bjVar2 = (bj) this.b.putIfAbsent(cls, bjVar);
            if (bjVar2 != null) {
                return bjVar2;
            }
        }
        return bjVar;
    }
}
