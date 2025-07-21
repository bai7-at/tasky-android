package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyStatusType;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.proto.a;
import defpackage.a83;
import defpackage.s31;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes3.dex */
public final class f {
    private final ConcurrentMap a = new ConcurrentHashMap();
    private b b;
    private final Class c;

    public static final class b {
        private final Object a;
        private final byte[] b;
        private final KeyStatusType c;
        private final OutputPrefixType d;
        private final int e;

        b(Object obj, byte[] bArr, KeyStatusType keyStatusType, OutputPrefixType outputPrefixType, int i) {
            this.a = obj;
            this.b = Arrays.copyOf(bArr, bArr.length);
            this.c = keyStatusType;
            this.d = outputPrefixType;
            this.e = i;
        }

        public final byte[] a() {
            byte[] bArr = this.b;
            if (bArr == null) {
                return null;
            }
            return Arrays.copyOf(bArr, bArr.length);
        }

        public OutputPrefixType b() {
            return this.d;
        }

        public Object c() {
            return this.a;
        }

        public KeyStatusType d() {
            return this.c;
        }
    }

    private static class c implements Comparable {
        private final byte[] a;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            byte[] bArr = this.a;
            int length = bArr.length;
            byte[] bArr2 = cVar.a;
            if (length != bArr2.length) {
                return bArr.length - bArr2.length;
            }
            int i = 0;
            while (true) {
                byte[] bArr3 = this.a;
                if (i >= bArr3.length) {
                    return 0;
                }
                byte b = bArr3[i];
                byte b2 = cVar.a[i];
                if (b != b2) {
                    return b - b2;
                }
                i++;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return Arrays.equals(this.a, ((c) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.a);
        }

        public String toString() {
            return a83.b(this.a);
        }

        private c(byte[] bArr) {
            this.a = Arrays.copyOf(bArr, bArr.length);
        }
    }

    private f(Class cls) {
        this.c = cls;
    }

    public static f f(Class cls) {
        return new f(cls);
    }

    public b a(Object obj, a.c cVar) {
        if (cVar.S() != KeyStatusType.ENABLED) {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
        b bVar = new b(obj, s31.a(cVar), cVar.S(), cVar.R(), cVar.Q());
        ArrayList arrayList = new ArrayList();
        arrayList.add(bVar);
        c cVar2 = new c(bVar.a());
        List list = (List) this.a.put(cVar2, Collections.unmodifiableList(arrayList));
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list);
            arrayList2.add(bVar);
            this.a.put(cVar2, Collections.unmodifiableList(arrayList2));
        }
        return bVar;
    }

    public b b() {
        return this.b;
    }

    public List c(byte[] bArr) {
        List list = (List) this.a.get(new c(bArr));
        return list != null ? list : Collections.emptyList();
    }

    public Class d() {
        return this.c;
    }

    public List e() {
        return c(s31.a);
    }

    public void g(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException("the primary entry must be non-null");
        }
        if (bVar.d() != KeyStatusType.ENABLED) {
            throw new IllegalArgumentException("the primary entry has to be ENABLED");
        }
        if (c(bVar.a()).isEmpty()) {
            throw new IllegalArgumentException("the primary entry cannot be set to an entry which is not held by this primitive set");
        }
        this.b = bVar;
    }
}
