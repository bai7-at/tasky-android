package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class qo5 implements Iterable, yu3 {
    public static final b b = new b(null);
    public static final qo5 c = new qo5();
    private final Map a;

    public static final class a {
        private final Map a;

        public a(qo5 qo5Var) {
            this.a = t.x(qo5Var.a);
        }

        public final qo5 a() {
            return new qo5(e.b(this.a), null);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ qo5(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map c() {
        if (isEmpty()) {
            return t.i();
        }
        Map map = this.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = map.entrySet().iterator();
        if (!it2.hasNext()) {
            return linkedHashMap;
        }
        lh4.a(((Map.Entry) it2.next()).getValue());
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qo5) && zq3.c(this.a, ((qo5) obj).a);
    }

    public final a f() {
        return new a(this);
    }

    public final Object g(String str) {
        lh4.a(this.a.get(str));
        return null;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        Map map = this.a;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            lh4.a(entry.getValue());
            arrayList.add(du8.a(str, null));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.a + ')';
    }

    private qo5(Map map) {
        this.a = map;
    }

    public qo5() {
        this(t.i());
    }
}
