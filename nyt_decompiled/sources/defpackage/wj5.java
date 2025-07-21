package defpackage;

import com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData;
import defpackage.xj5;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class wj5 {
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData b(xj5.d r18) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wj5.b(xj5$d):com.nytimes.android.ribbon.destinations.opinions.OpinionItemLockupData");
    }

    public final List a(xj5.b bVar) {
        xj5.h a;
        List<xj5.d> a2;
        zq3.h(bVar, "data");
        xj5.i a3 = bVar.a();
        if (a3 == null || (a = a3.a()) == null || (a2 = a.a()) == null) {
            return i.l();
        }
        ArrayList arrayList = new ArrayList();
        for (xj5.d dVar : a2) {
            OpinionItemLockupData b = dVar == null ? null : b(dVar);
            if (b != null) {
                arrayList.add(b);
            }
        }
        return arrayList;
    }
}
