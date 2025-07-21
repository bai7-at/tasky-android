package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.z;
import defpackage.lh4;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
class b0 implements a0 {
    b0() {
    }

    private static int i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        lh4.a(obj2);
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        Iterator it2 = mapFieldLite.entrySet().iterator();
        if (!it2.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it2.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static MapFieldLite j(Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        MapFieldLite mapFieldLite2 = (MapFieldLite) obj2;
        if (!mapFieldLite2.isEmpty()) {
            if (!mapFieldLite.m()) {
                mapFieldLite = mapFieldLite.q();
            }
            mapFieldLite.o(mapFieldLite2);
        }
        return mapFieldLite;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public z.a b(Object obj) {
        lh4.a(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public Map c(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public Object d(Object obj) {
        return MapFieldLite.f().q();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public Map e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public Object f(Object obj) {
        ((MapFieldLite) obj).n();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a0
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).m();
    }
}
