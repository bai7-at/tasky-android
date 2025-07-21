package defpackage;

import com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData;
import defpackage.hj5;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class gj5 {
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData b(hj5.c r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.b(hj5$c):com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData");
    }

    public final List a(hj5.b bVar) {
        hj5.d a;
        List<hj5.c> a2;
        zq3.h(bVar, "data");
        hj5.f a3 = bVar.a();
        if (a3 == null || (a = a3.a()) == null || (a2 = a.a()) == null) {
            return i.l();
        }
        ArrayList arrayList = new ArrayList();
        for (hj5.c cVar : a2) {
            OpinionItemLockupData b = cVar == null ? null : b(cVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
