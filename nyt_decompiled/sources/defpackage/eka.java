package defpackage;

import java.util.Comparator;

/* loaded from: classes3.dex */
final class eka implements Comparator {
    eka(gka gkaVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        jka jkaVar = (jka) obj;
        jka jkaVar2 = (jka) obj2;
        int i = jkaVar.c - jkaVar2.c;
        return i != 0 ? i : Long.compare(jkaVar.a, jkaVar2.a);
    }
}
