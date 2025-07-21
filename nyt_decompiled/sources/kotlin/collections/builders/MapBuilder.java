package kotlin.collections.builders;

import com.chartbeat.androidsdk.QueryKeys;
import defpackage.cv3;
import defpackage.t54;
import defpackage.uo6;
import defpackage.yu3;
import defpackage.zq3;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes5.dex */
public final class MapBuilder<K, V> implements Map<K, V>, Serializable, cv3 {
    public static final a a = new a(null);
    private static final MapBuilder b;
    private kotlin.collections.builders.a entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    private K[] keysArray;
    private kotlin.collections.builders.b keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;
    private int[] presenceArray;
    private int size;
    private V[] valuesArray;
    private kotlin.collections.builders.c valuesView;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int i) {
            return Integer.highestOneBit(uo6.d(i, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        public final MapBuilder e() {
            return MapBuilder.b;
        }

        private a() {
        }
    }

    public static final class b extends d implements Iterator, yu3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MapBuilder mapBuilder) {
            super(mapBuilder);
            zq3.h(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public c next() {
            c();
            if (d() >= g().length) {
                throw new NoSuchElementException();
            }
            int d = d();
            i(d + 1);
            j(d);
            c cVar = new c(g(), f());
            h();
            return cVar;
        }

        public final void m(StringBuilder sb) {
            zq3.h(sb, "sb");
            if (d() >= g().length) {
                throw new NoSuchElementException();
            }
            int d = d();
            i(d + 1);
            j(d);
            Object obj = g().keysArray[f()];
            if (obj == g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append('=');
            Object[] objArr = g().valuesArray;
            zq3.e(objArr);
            Object obj2 = objArr[f()];
            if (obj2 == g()) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            h();
        }

        public final int n() {
            if (d() >= g().length) {
                throw new NoSuchElementException();
            }
            int d = d();
            i(d + 1);
            j(d);
            Object obj = g().keysArray[f()];
            int hashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = g().valuesArray;
            zq3.e(objArr);
            Object obj2 = objArr[f()];
            int hashCode2 = hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            h();
            return hashCode2;
        }
    }

    public static final class c implements Map.Entry, cv3.a {
        private final MapBuilder a;
        private final int b;

        public c(MapBuilder mapBuilder, int i) {
            zq3.h(mapBuilder, "map");
            this.a = mapBuilder;
            this.b = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (zq3.c(entry.getKey(), getKey()) && zq3.c(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.a.keysArray[this.b];
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            Object[] objArr = this.a.valuesArray;
            zq3.e(objArr);
            return objArr[this.b];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object key = getKey();
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            return hashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            this.a.q();
            Object[] n = this.a.n();
            int i = this.b;
            Object obj2 = n[i];
            n[i] = obj;
            return obj2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    public static class d {
        private final MapBuilder a;
        private int b;
        private int c;
        private int d;

        public d(MapBuilder mapBuilder) {
            zq3.h(mapBuilder, "map");
            this.a = mapBuilder;
            this.c = -1;
            this.d = mapBuilder.modCount;
            h();
        }

        public final void c() {
            if (this.a.modCount != this.d) {
                throw new ConcurrentModificationException();
            }
        }

        public final int d() {
            return this.b;
        }

        public final int f() {
            return this.c;
        }

        public final MapBuilder g() {
            return this.a;
        }

        public final void h() {
            while (this.b < this.a.length) {
                int[] iArr = this.a.presenceArray;
                int i = this.b;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.b = i + 1;
                }
            }
        }

        public final boolean hasNext() {
            return this.b < this.a.length;
        }

        public final void i(int i) {
            this.b = i;
        }

        public final void j(int i) {
            this.c = i;
        }

        public final void remove() {
            c();
            if (this.c == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.a.q();
            this.a.Q(this.c);
            this.c = -1;
            this.d = this.a.modCount;
        }
    }

    public static final class e extends d implements Iterator, yu3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MapBuilder mapBuilder) {
            super(mapBuilder);
            zq3.h(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (d() >= g().length) {
                throw new NoSuchElementException();
            }
            int d = d();
            i(d + 1);
            j(d);
            Object obj = g().keysArray[f()];
            h();
            return obj;
        }
    }

    public static final class f extends d implements Iterator, yu3 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(MapBuilder mapBuilder) {
            super(mapBuilder);
            zq3.h(mapBuilder, "map");
        }

        @Override // java.util.Iterator
        public Object next() {
            c();
            if (d() >= g().length) {
                throw new NoSuchElementException();
            }
            int d = d();
            i(d + 1);
            j(d);
            Object[] objArr = g().valuesArray;
            zq3.e(objArr);
            Object obj = objArr[f()];
            h();
            return obj;
        }
    }

    static {
        MapBuilder mapBuilder = new MapBuilder(0);
        mapBuilder.isReadOnly = true;
        b = mapBuilder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private MapBuilder(Object[] objArr, Object[] objArr2, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = objArr;
        this.valuesArray = objArr2;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = a.d(C());
    }

    private final int C() {
        return this.hashArray.length;
    }

    private final int G(Object obj) {
        return ((obj != null ? obj.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean J(Collection collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        w(collection.size());
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            if (K((Map.Entry) it2.next())) {
                z = true;
            }
        }
        return z;
    }

    private final boolean K(Map.Entry entry) {
        int m = m(entry.getKey());
        Object[] n = n();
        if (m >= 0) {
            n[m] = entry.getValue();
            return true;
        }
        int i = (-m) - 1;
        if (zq3.c(entry.getValue(), n[i])) {
            return false;
        }
        n[i] = entry.getValue();
        return true;
    }

    private final boolean L(int i) {
        int G = G(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[G] == 0) {
                iArr[G] = i + 1;
                this.presenceArray[i] = G;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            G = G == 0 ? C() - 1 : G - 1;
        }
    }

    private final void M() {
        this.modCount++;
    }

    private final void N(int i) {
        M();
        if (this.length > size()) {
            r();
        }
        int i2 = 0;
        if (i != C()) {
            this.hashArray = new int[i];
            this.hashShift = a.d(i);
        } else {
            kotlin.collections.d.r(this.hashArray, 0, 0, C());
        }
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (!L(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(int i) {
        t54.f(this.keysArray, i);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            t54.f(vArr, i);
        }
        R(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
        M();
    }

    private final void R(int i) {
        int i2 = uo6.i(this.maxProbeDistance * 2, C() / 2);
        int i3 = 0;
        int i4 = i;
        do {
            i = i == 0 ? C() - 1 : i - 1;
            i3++;
            if (i3 > this.maxProbeDistance) {
                this.hashArray[i4] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i5 = iArr[i];
            if (i5 == 0) {
                iArr[i4] = 0;
                return;
            }
            if (i5 < 0) {
                iArr[i4] = -1;
            } else {
                int i6 = i5 - 1;
                if (((G(this.keysArray[i6]) - i) & (C() - 1)) >= i3) {
                    this.hashArray[i4] = i5;
                    this.presenceArray[i6] = i4;
                }
                i2--;
            }
            i4 = i;
            i3 = 0;
            i2--;
        } while (i2 >= 0);
        this.hashArray[i4] = -1;
    }

    private final boolean U(int i) {
        int A = A();
        int i2 = this.length;
        int i3 = A - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= A() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] n() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) t54.d(A());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void r() {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            if (this.presenceArray[i2] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        t54.g(this.keysArray, i3, i);
        if (vArr != null) {
            t54.g(vArr, i3, this.length);
        }
        this.length = i3;
    }

    private final boolean u(Map map) {
        return size() == map.size() && s(map.entrySet());
    }

    private final void v(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > A()) {
            int e2 = kotlin.collections.a.a.e(A(), i);
            this.keysArray = (K[]) t54.e(this.keysArray, e2);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) t54.e(vArr, e2) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, e2);
            zq3.g(copyOf, "copyOf(...)");
            this.presenceArray = copyOf;
            int c2 = a.c(e2);
            if (c2 > C()) {
                N(c2);
            }
        }
    }

    private final void w(int i) {
        if (U(i)) {
            N(C());
        } else {
            v(this.length + i);
        }
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new SerializedMap(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    private final int y(Object obj) {
        int G = G(obj);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[G];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (zq3.c(this.keysArray[i3], obj)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            G = G == 0 ? C() - 1 : G - 1;
        }
    }

    private final int z(Object obj) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                zq3.e(vArr);
                if (zq3.c(vArr[i], obj)) {
                    return i;
                }
            }
        }
    }

    public final int A() {
        return this.keysArray.length;
    }

    public Set B() {
        kotlin.collections.builders.a aVar = this.entriesView;
        if (aVar != null) {
            return aVar;
        }
        kotlin.collections.builders.a aVar2 = new kotlin.collections.builders.a(this);
        this.entriesView = aVar2;
        return aVar2;
    }

    public Set D() {
        kotlin.collections.builders.b bVar = this.keysView;
        if (bVar != null) {
            return bVar;
        }
        kotlin.collections.builders.b bVar2 = new kotlin.collections.builders.b(this);
        this.keysView = bVar2;
        return bVar2;
    }

    public int E() {
        return this.size;
    }

    public Collection F() {
        kotlin.collections.builders.c cVar = this.valuesView;
        if (cVar != null) {
            return cVar;
        }
        kotlin.collections.builders.c cVar2 = new kotlin.collections.builders.c(this);
        this.valuesView = cVar2;
        return cVar2;
    }

    public final boolean H() {
        return this.isReadOnly;
    }

    public final e I() {
        return new e(this);
    }

    public final boolean O(Map.Entry entry) {
        zq3.h(entry, "entry");
        q();
        int y = y(entry.getKey());
        if (y < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        zq3.e(vArr);
        if (!zq3.c(vArr[y], entry.getValue())) {
            return false;
        }
        Q(y);
        return true;
    }

    public final boolean S(Object obj) {
        q();
        int y = y(obj);
        if (y < 0) {
            return false;
        }
        Q(y);
        return true;
    }

    public final boolean T(Object obj) {
        q();
        int z = z(obj);
        if (z < 0) {
            return false;
        }
        Q(z);
        return true;
    }

    public final f V() {
        return new f(this);
    }

    @Override // java.util.Map
    public void clear() {
        q();
        int i = this.length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i3 = iArr[i2];
                if (i3 >= 0) {
                    this.hashArray[i3] = 0;
                    iArr[i2] = -1;
                }
                if (i2 == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        t54.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            t54.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        M();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return y(obj) >= 0;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return z(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && u((Map) obj));
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int y = y(obj);
        if (y < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        zq3.e(vArr);
        return vArr[y];
    }

    @Override // java.util.Map
    public int hashCode() {
        b x = x();
        int i = 0;
        while (x.hasNext()) {
            i += x.n();
        }
        return i;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return D();
    }

    public final int m(Object obj) {
        q();
        while (true) {
            int G = G(obj);
            int i = uo6.i(this.maxProbeDistance * 2, C() / 2);
            int i2 = 0;
            while (true) {
                int i3 = this.hashArray[G];
                if (i3 <= 0) {
                    if (this.length < A()) {
                        int i4 = this.length;
                        int i5 = i4 + 1;
                        this.length = i5;
                        ((K[]) this.keysArray)[i4] = obj;
                        this.presenceArray[i4] = G;
                        this.hashArray[G] = i5;
                        this.size = size() + 1;
                        M();
                        if (i2 > this.maxProbeDistance) {
                            this.maxProbeDistance = i2;
                        }
                        return i4;
                    }
                    w(1);
                } else {
                    if (zq3.c(this.keysArray[i3 - 1], obj)) {
                        return -i3;
                    }
                    i2++;
                    if (i2 > i) {
                        N(C() * 2);
                        break;
                    }
                    G = G == 0 ? C() - 1 : G - 1;
                }
            }
        }
    }

    public final Map o() {
        q();
        this.isReadOnly = true;
        if (size() > 0) {
            return this;
        }
        MapBuilder mapBuilder = b;
        zq3.f(mapBuilder, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return mapBuilder;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        q();
        int m = m(obj);
        Object[] n = n();
        if (m >= 0) {
            n[m] = obj2;
            return null;
        }
        int i = (-m) - 1;
        Object obj3 = n[i];
        n[i] = obj2;
        return obj3;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        zq3.h(map, "from");
        q();
        J(map.entrySet());
    }

    public final void q() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        q();
        int y = y(obj);
        if (y < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        zq3.e(vArr);
        V v = vArr[y];
        Q(y);
        return v;
    }

    public final boolean s(Collection collection) {
        zq3.h(collection, QueryKeys.MAX_SCROLL_DEPTH);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!t((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return E();
    }

    public final boolean t(Map.Entry entry) {
        zq3.h(entry, "entry");
        int y = y(entry.getKey());
        if (y < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        zq3.e(vArr);
        return zq3.c(vArr[y], entry.getValue());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        b x = x();
        int i = 0;
        while (x.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            x.m(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return F();
    }

    public final b x() {
        return new b(this);
    }

    public MapBuilder() {
        this(8);
    }

    public MapBuilder(int i) {
        this(t54.d(i), null, new int[i], new int[a.c(i)], 2, 0);
    }
}
