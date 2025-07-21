package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;

/* loaded from: classes4.dex */
public final class a19 {
    private final List a;

    public a19(Map map) {
        List l;
        if (map == null || map.isEmpty()) {
            l = i.l();
        } else {
            l = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                l.add(new b19((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this.a = l;
    }

    public final List a() {
        return this.a;
    }

    public final boolean b() {
        return this.a.isEmpty();
    }
}
