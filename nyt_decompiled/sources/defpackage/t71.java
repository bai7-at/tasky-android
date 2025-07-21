package defpackage;

import com.nytimes.android.dailyfive.domain.TrackingParam;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class t71 {
    public static final Map a(List list) {
        zq3.h(list, "<this>");
        List<TrackingParam> list2 = list;
        ArrayList arrayList = new ArrayList(i.w(list2, 10));
        for (TrackingParam trackingParam : list2) {
            arrayList.add(du8.a(trackingParam.a(), trackingParam.b()));
        }
        return t.t(arrayList);
    }
}
