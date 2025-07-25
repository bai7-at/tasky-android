package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import defpackage.b16;
import defpackage.gx8;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes3.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    static final ImmutableMap h = new RegularImmutableMap(null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    private final transient Object e;
    final transient Object[] f;
    private final transient int g;

    static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        private final transient ImmutableMap c;
        private final transient Object[] d;
        private final transient int e;
        private final transient int f;

        EntrySet(ImmutableMap immutableMap, Object[] objArr, int i, int i2) {
            this.c = immutableMap;
            this.d = objArr;
            this.e = i;
            this.f = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int c(Object[] objArr, int i) {
            return a().c(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.c.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public gx8 iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f;
        }

        @Override // com.google.common.collect.ImmutableSet
        ImmutableList w() {
            return new ImmutableList<Map.Entry<K, V>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                /* renamed from: F, reason: merged with bridge method [inline-methods] */
                public Map.Entry get(int i) {
                    b16.i(i, EntrySet.this.f);
                    int i2 = i * 2;
                    Object obj = EntrySet.this.d[EntrySet.this.e + i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.d[i2 + (EntrySet.this.e ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public boolean j() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return EntrySet.this.f;
                }
            };
        }
    }

    static final class KeySet<K> extends ImmutableSet<K> {
        private final transient ImmutableMap c;
        private final transient ImmutableList d;

        KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.c = immutableMap;
            this.d = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public ImmutableList a() {
            return this.d;
        }

        @Override // com.google.common.collect.ImmutableCollection
        int c(Object[] objArr, int i) {
            return a().c(objArr, i);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return this.c.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* renamed from: k */
        public gx8 iterator() {
            return a().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.c.size();
        }
    }

    static final class KeysOrValuesAsList extends ImmutableList<Object> {
        private final transient Object[] c;
        private final transient int d;
        private final transient int e;

        KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.List
        public Object get(int i) {
            b16.i(i, this.e);
            Object obj = this.c[(i * 2) + this.d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.e;
        }
    }

    private RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.e = obj;
        this.f = objArr;
        this.g = i;
    }

    static RegularImmutableMap u(int i, Object[] objArr) {
        return v(i, objArr, null);
    }

    static RegularImmutableMap v(int i, Object[] objArr, ImmutableMap.a aVar) {
        if (i == 0) {
            return (RegularImmutableMap) h;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            e.a(obj, obj2);
            return new RegularImmutableMap(null, objArr, 1);
        }
        b16.m(i, objArr.length >> 1);
        Object w = w(objArr, i, ImmutableSet.q(i), 0);
        if (w instanceof Object[]) {
            Object[] objArr2 = (Object[]) w;
            ImmutableMap.a.C0209a c0209a = (ImmutableMap.a.C0209a) objArr2[2];
            if (aVar == null) {
                throw c0209a.a();
            }
            aVar.e = c0209a;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            w = obj3;
            i = intValue;
        }
        return new RegularImmutableMap(w, objArr, i);
    }

    private static Object w(Object[] objArr, int i, int i2, int i3) {
        ImmutableMap.a.C0209a c0209a = null;
        if (i == 1) {
            Object obj = objArr[i3];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i3 ^ 1];
            Objects.requireNonNull(obj2);
            e.a(obj, obj2);
            return null;
        }
        int i4 = i2 - 1;
        int i5 = -1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i6 = 0;
            for (int i7 = 0; i7 < i; i7++) {
                int i8 = (i7 * 2) + i3;
                int i9 = (i6 * 2) + i3;
                Object obj3 = objArr[i8];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i8 ^ 1];
                Objects.requireNonNull(obj4);
                e.a(obj3, obj4);
                int b = i.b(obj3.hashCode());
                while (true) {
                    int i10 = b & i4;
                    int i11 = bArr[i10] & 255;
                    if (i11 == 255) {
                        bArr[i10] = (byte) i9;
                        if (i6 < i7) {
                            objArr[i9] = obj3;
                            objArr[i9 ^ 1] = obj4;
                        }
                        i6++;
                    } else {
                        if (obj3.equals(objArr[i11])) {
                            int i12 = i11 ^ 1;
                            Object obj5 = objArr[i12];
                            Objects.requireNonNull(obj5);
                            c0209a = new ImmutableMap.a.C0209a(obj3, obj4, obj5);
                            objArr[i12] = obj4;
                            break;
                        }
                        b = i10 + 1;
                    }
                }
            }
            return i6 == i ? bArr : new Object[]{bArr, Integer.valueOf(i6), c0209a};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i13 = 0;
            for (int i14 = 0; i14 < i; i14++) {
                int i15 = (i14 * 2) + i3;
                int i16 = (i13 * 2) + i3;
                Object obj6 = objArr[i15];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i15 ^ 1];
                Objects.requireNonNull(obj7);
                e.a(obj6, obj7);
                int b2 = i.b(obj6.hashCode());
                while (true) {
                    int i17 = b2 & i4;
                    int i18 = sArr[i17] & 65535;
                    if (i18 == 65535) {
                        sArr[i17] = (short) i16;
                        if (i13 < i14) {
                            objArr[i16] = obj6;
                            objArr[i16 ^ 1] = obj7;
                        }
                        i13++;
                    } else {
                        if (obj6.equals(objArr[i18])) {
                            int i19 = i18 ^ 1;
                            Object obj8 = objArr[i19];
                            Objects.requireNonNull(obj8);
                            c0209a = new ImmutableMap.a.C0209a(obj6, obj7, obj8);
                            objArr[i19] = obj7;
                            break;
                        }
                        b2 = i17 + 1;
                    }
                }
            }
            return i13 == i ? sArr : new Object[]{sArr, Integer.valueOf(i13), c0209a};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i20 = 0;
        int i21 = 0;
        while (i20 < i) {
            int i22 = (i20 * 2) + i3;
            int i23 = (i21 * 2) + i3;
            Object obj9 = objArr[i22];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i22 ^ 1];
            Objects.requireNonNull(obj10);
            e.a(obj9, obj10);
            int b3 = i.b(obj9.hashCode());
            while (true) {
                int i24 = b3 & i4;
                int i25 = iArr[i24];
                if (i25 == i5) {
                    iArr[i24] = i23;
                    if (i21 < i20) {
                        objArr[i23] = obj9;
                        objArr[i23 ^ 1] = obj10;
                    }
                    i21++;
                } else {
                    if (obj9.equals(objArr[i25])) {
                        int i26 = i25 ^ 1;
                        Object obj11 = objArr[i26];
                        Objects.requireNonNull(obj11);
                        c0209a = new ImmutableMap.a.C0209a(obj9, obj10, obj11);
                        objArr[i26] = obj10;
                        break;
                    }
                    b3 = i24 + 1;
                    i5 = -1;
                }
            }
            i20++;
            i5 = -1;
        }
        return i21 == i ? iArr : new Object[]{iArr, Integer.valueOf(i21), c0209a};
    }

    static Object x(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int b = i.b(obj2.hashCode());
            while (true) {
                int i3 = b & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                b = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int b2 = i.b(obj2.hashCode());
            while (true) {
                int i5 = b2 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                b2 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int b3 = i.b(obj2.hashCode());
            while (true) {
                int i7 = b3 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                b3 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public Object get(Object obj) {
        Object x = x(this.e, this.f, this.g, 0, obj);
        if (x == null) {
            return null;
        }
        return x;
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet h() {
        return new EntrySet(this, this.f, 0, this.g);
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableSet i() {
        return new KeySet(this, new KeysOrValuesAsList(this.f, 0, this.g));
    }

    @Override // com.google.common.collect.ImmutableMap
    ImmutableCollection j() {
        return new KeysOrValuesAsList(this.f, 1, this.g);
    }

    @Override // com.google.common.collect.ImmutableMap
    boolean m() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.g;
    }
}
