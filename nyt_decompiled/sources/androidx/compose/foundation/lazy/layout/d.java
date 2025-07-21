package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.layout.m;
import defpackage.zq3;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class d implements m {
    private final LazyLayoutItemContentFactory a;
    private final Map b = new LinkedHashMap();

    public d(LazyLayoutItemContentFactory lazyLayoutItemContentFactory) {
        this.a = lazyLayoutItemContentFactory;
    }

    @Override // androidx.compose.ui.layout.m
    public void a(m.a aVar) {
        this.b.clear();
        Iterator it2 = aVar.iterator();
        while (it2.hasNext()) {
            Object c = this.a.c(it2.next());
            Integer num = (Integer) this.b.get(c);
            int intValue = num != null ? num.intValue() : 0;
            if (intValue == 7) {
                it2.remove();
            } else {
                this.b.put(c, Integer.valueOf(intValue + 1));
            }
        }
    }

    @Override // androidx.compose.ui.layout.m
    public boolean b(Object obj, Object obj2) {
        return zq3.c(this.a.c(obj), this.a.c(obj2));
    }
}
