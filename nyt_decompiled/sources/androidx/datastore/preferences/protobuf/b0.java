package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.z;
import java.util.Map;

/* loaded from: classes.dex */
class b0 implements a0 {
    b0() {
    }

    private static int i(int i, Object obj, Object obj2) {
        MapFieldLite mapFieldLite = (MapFieldLite) obj;
        z zVar = (z) obj2;
        int i2 = 0;
        if (mapFieldLite.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : mapFieldLite.entrySet()) {
            i2 += zVar.a(i, entry.getKey(), entry.getValue());
        }
        return i2;
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

    @Override // androidx.datastore.preferences.protobuf.a0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public z.a b(Object obj) {
        return ((z) obj).c();
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Map c(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Object d(Object obj) {
        return MapFieldLite.f().q();
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Map e(Object obj) {
        return (MapFieldLite) obj;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public Object f(Object obj) {
        ((MapFieldLite) obj).n();
        return obj;
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public int g(int i, Object obj, Object obj2) {
        return i(i, obj, obj2);
    }

    @Override // androidx.datastore.preferences.protobuf.a0
    public boolean h(Object obj) {
        return !((MapFieldLite) obj).m();
    }
}
