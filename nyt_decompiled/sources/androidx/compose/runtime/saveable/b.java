package androidx.compose.runtime.saveable;

import androidx.compose.runtime.saveable.a;
import defpackage.qs2;
import defpackage.ss2;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.text.h;

/* loaded from: classes.dex */
final class b implements androidx.compose.runtime.saveable.a {
    private final ss2 a;
    private final Map b;
    private final Map c;

    public static final class a implements a.InterfaceC0052a {
        final /* synthetic */ String b;
        final /* synthetic */ qs2 c;

        a(String str, qs2 qs2Var) {
            this.b = str;
            this.c = qs2Var;
        }

        @Override // androidx.compose.runtime.saveable.a.InterfaceC0052a
        public void unregister() {
            List list = (List) b.this.c.remove(this.b);
            if (list != null) {
                list.remove(this.c);
            }
            if (list == null || list.isEmpty()) {
                return;
            }
            b.this.c.put(this.b, list);
        }
    }

    public b(Map map, ss2 ss2Var) {
        Map x;
        this.a = ss2Var;
        this.b = (map == null || (x = t.x(map)) == null) ? new LinkedHashMap() : x;
        this.c = new LinkedHashMap();
    }

    @Override // androidx.compose.runtime.saveable.a
    public boolean a(Object obj) {
        return ((Boolean) this.a.invoke(obj)).booleanValue();
    }

    @Override // androidx.compose.runtime.saveable.a
    public a.InterfaceC0052a b(String str, qs2 qs2Var) {
        if (h.d0(str)) {
            throw new IllegalArgumentException("Registered key is empty or blank");
        }
        Map map = this.c;
        Object obj = map.get(str);
        if (obj == null) {
            obj = new ArrayList();
            map.put(str, obj);
        }
        ((List) obj).add(qs2Var);
        return new a(str, qs2Var);
    }

    @Override // androidx.compose.runtime.saveable.a
    public Map d() {
        Map x = t.x(this.b);
        for (Map.Entry entry : this.c.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object mo865invoke = ((qs2) list.get(0)).mo865invoke();
                if (mo865invoke == null) {
                    continue;
                } else {
                    if (!a(mo865invoke)) {
                        throw new IllegalStateException("item can't be saved");
                    }
                    x.put(str, i.h(mo865invoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object mo865invoke2 = ((qs2) list.get(i)).mo865invoke();
                    if (mo865invoke2 != null && !a(mo865invoke2)) {
                        throw new IllegalStateException("item can't be saved");
                    }
                    arrayList.add(mo865invoke2);
                }
                x.put(str, arrayList);
            }
        }
        return x;
    }

    @Override // androidx.compose.runtime.saveable.a
    public Object e(String str) {
        List list = (List) this.b.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            this.b.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
