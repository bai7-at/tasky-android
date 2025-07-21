package kotlin.collections;

import defpackage.ss2;
import defpackage.yu3;
import defpackage.zq3;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public abstract class AbstractMap implements Map, yu3 {
    public static final a a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    protected AbstractMap() {
    }

    private final String l(Object obj) {
        return obj == this ? "(this Map)" : String.valueOf(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String m(Map.Entry entry) {
        return l(entry.getKey()) + '=' + l(entry.getValue());
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        Set entrySet = entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            if (zq3.c(((Map.Entry) it2.next()).getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    public final boolean d(Map.Entry entry) {
        if (entry == null) {
            return false;
        }
        Object key = entry.getKey();
        Object value = entry.getValue();
        zq3.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        Object obj = get(key);
        if (!zq3.c(value, obj)) {
            return false;
        }
        if (obj != null) {
            return true;
        }
        zq3.f(this, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>");
        return containsKey(key);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return f();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (size() != map.size()) {
            return false;
        }
        Set entrySet = map.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return true;
        }
        Iterator it2 = entrySet.iterator();
        while (it2.hasNext()) {
            if (!d((Map.Entry) it2.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract Set f();

    public abstract Set h();

    @Override // java.util.Map
    public int hashCode() {
        return entrySet().hashCode();
    }

    public abstract int i();

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract Collection j();

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return h();
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return i();
    }

    public String toString() {
        return i.u0(entrySet(), ", ", "{", "}", 0, null, new ss2() { // from class: kotlin.collections.AbstractMap$toString$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(Map.Entry entry) {
                String m;
                zq3.h(entry, "it");
                m = AbstractMap.this.m(entry);
                return m;
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return j();
    }
}
