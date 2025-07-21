package defpackage;

import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes3.dex */
final class nla implements Comparator {
    final /* synthetic */ l1a a;
    final /* synthetic */ xhe b;

    nla(l1a l1aVar, xhe xheVar) {
        this.a = l1aVar;
        this.b = xheVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        caa caaVar = (caa) obj;
        caa caaVar2 = (caa) obj2;
        l1a l1aVar = this.a;
        xhe xheVar = this.b;
        if (caaVar instanceof qda) {
            return !(caaVar2 instanceof qda) ? 1 : 0;
        }
        if (caaVar2 instanceof qda) {
            return -1;
        }
        return l1aVar == null ? caaVar.zzi().compareTo(caaVar2.zzi()) : (int) s0f.a(l1aVar.b(xheVar, Arrays.asList(caaVar, caaVar2)).zzh().doubleValue());
    }
}
