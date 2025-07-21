package com.google.crypto.tink;

import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.f0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class c {
    private final Class a;
    private final Map b;
    private final Class c;

    public static abstract class a {
        private final Class a;

        public a(Class cls) {
            this.a = cls;
        }

        public abstract Object a(f0 f0Var);

        public final Class b() {
            return this.a;
        }

        public abstract f0 c(ByteString byteString);

        public abstract void d(f0 f0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class b {
        private final Class a;

        public b(Class cls) {
            this.a = cls;
        }

        public abstract Object a(Object obj);

        final Class b() {
            return this.a;
        }
    }

    protected c(Class cls, b... bVarArr) {
        this.a = cls;
        HashMap hashMap = new HashMap();
        for (b bVar : bVarArr) {
            if (hashMap.containsKey(bVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.b().getCanonicalName());
            }
            hashMap.put(bVar.b(), bVar);
        }
        if (bVarArr.length > 0) {
            this.c = bVarArr[0].b();
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(hashMap);
    }

    final Class a() {
        return this.c;
    }

    public final Class b() {
        return this.a;
    }

    public abstract String c();

    public final Object d(f0 f0Var, Class cls) {
        b bVar = (b) this.b.get(cls);
        if (bVar != null) {
            return bVar.a(f0Var);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a e();

    public abstract KeyData.KeyMaterialType f();

    public abstract f0 g(ByteString byteString);

    public final Set h() {
        return this.b.keySet();
    }

    public abstract void i(f0 f0Var);
}
