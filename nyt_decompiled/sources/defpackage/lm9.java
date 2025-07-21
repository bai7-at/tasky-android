package defpackage;

import com.nytimes.android.interests.db.TrackingParam;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes4.dex */
public abstract class lm9 {
    public static final Map a(List list) {
        zq3.h(list, "<this>");
        List<TrackingParam> list2 = list;
        LinkedHashMap linkedHashMap = new LinkedHashMap(uo6.d(t.e(i.w(list2, 10)), 16));
        for (TrackingParam trackingParam : list2) {
            Pair a = du8.a(trackingParam.a(), trackingParam.b());
            linkedHashMap.put(a.c(), a.d());
        }
        return linkedHashMap;
    }
}
