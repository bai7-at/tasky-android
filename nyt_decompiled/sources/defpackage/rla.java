package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
public final class rla implements Comparator {
    public rla(sla slaVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        cka ckaVar = (cka) obj;
        cka ckaVar2 = (cka) obj2;
        if (ckaVar.d() < ckaVar2.d()) {
            return -1;
        }
        if (ckaVar.d() <= ckaVar2.d()) {
            if (ckaVar.b() < ckaVar2.b()) {
                return -1;
            }
            if (ckaVar.b() <= ckaVar2.b()) {
                float a = (ckaVar.a() - ckaVar.d()) * (ckaVar.c() - ckaVar.b());
                float a2 = (ckaVar2.a() - ckaVar2.d()) * (ckaVar2.c() - ckaVar2.b());
                if (a > a2) {
                    return -1;
                }
                if (a >= a2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
