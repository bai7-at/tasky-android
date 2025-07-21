package defpackage;

import com.nytimes.android.dailyfive.domain.FollowStatus;
import defpackage.ho2;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class u71 {
    public final List a(ho2.b bVar) {
        zq3.h(bVar, "data");
        List<ho2.c> a = bVar.a();
        ArrayList arrayList = null;
        if (a != null) {
            ArrayList arrayList2 = new ArrayList();
            for (ho2.c cVar : a) {
                FollowStatus followStatus = cVar == null ? null : new FollowStatus(cVar.b(), cVar.a());
                if (followStatus != null) {
                    arrayList2.add(followStatus);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? i.l() : arrayList;
    }
}
