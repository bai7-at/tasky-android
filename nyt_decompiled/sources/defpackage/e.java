package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;

/* loaded from: classes.dex */
public abstract class e {
    public static final List a(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(i.k0(list)) : i.l();
    }

    public static final Map b(Map map) {
        int size = map.size();
        if (size == 0) {
            return t.i();
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) i.j0(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
