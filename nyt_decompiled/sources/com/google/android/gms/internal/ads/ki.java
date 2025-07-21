package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
final class ki {
    ki() {
    }

    public static final boolean a(Object obj) {
        return !((zzhay) obj).h();
    }

    public static final Object b(Object obj, Object obj2) {
        zzhay zzhayVar = (zzhay) obj;
        zzhay zzhayVar2 = (zzhay) obj2;
        if (!zzhayVar2.isEmpty()) {
            if (!zzhayVar.h()) {
                zzhayVar = zzhayVar.c();
            }
            zzhayVar.f(zzhayVar2);
        }
        return zzhayVar;
    }
}
