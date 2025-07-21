package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.a;
import androidx.datastore.preferences.protobuf.t;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends androidx.datastore.preferences.protobuf.a {
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    protected y0 unknownFields = y0.e();
    protected int memoizedSerializedSize = -1;

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static abstract class a extends a.AbstractC0077a {
        private final GeneratedMessageLite a;
        protected GeneratedMessageLite b;
        protected boolean c = false;

        protected a(GeneratedMessageLite generatedMessageLite) {
            this.a = generatedMessageLite;
            this.b = (GeneratedMessageLite) generatedMessageLite.p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void s(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            n0.a().d(generatedMessageLite).a(generatedMessageLite, generatedMessageLite2);
        }

        public final GeneratedMessageLite l() {
            GeneratedMessageLite j = j();
            if (j.w()) {
                return j;
            }
            throw a.AbstractC0077a.k(j);
        }

        @Override // androidx.datastore.preferences.protobuf.f0.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite j() {
            if (this.c) {
                return this.b;
            }
            this.b.y();
            this.c = true;
            return this.b;
        }

        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a c = d().c();
            c.r(j());
            return c;
        }

        protected void o() {
            if (this.c) {
                GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.b.p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
                s(generatedMessageLite, this.b);
                this.b = generatedMessageLite;
                this.c = false;
            }
        }

        @Override // defpackage.pr4
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite d() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.a.AbstractC0077a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public a h(GeneratedMessageLite generatedMessageLite) {
            return r(generatedMessageLite);
        }

        public a r(GeneratedMessageLite generatedMessageLite) {
            o();
            s(this.b, generatedMessageLite);
            return this;
        }
    }

    protected static class b extends androidx.datastore.preferences.protobuf.b {
        private final GeneratedMessageLite b;

        public b(GeneratedMessageLite generatedMessageLite) {
            this.b = generatedMessageLite;
        }
    }

    public static class c extends j {
    }

    protected static Object B(f0 f0Var, String str, Object[] objArr) {
        return new p0(f0Var, str, objArr);
    }

    protected static GeneratedMessageLite D(GeneratedMessageLite generatedMessageLite, InputStream inputStream) {
        return n(E(generatedMessageLite, f.f(inputStream), l.b()));
    }

    static GeneratedMessageLite E(GeneratedMessageLite generatedMessageLite, f fVar, l lVar) {
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) generatedMessageLite.p(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            r0 d = n0.a().d(generatedMessageLite2);
            d.h(generatedMessageLite2, g.O(fVar), lVar);
            d.b(generatedMessageLite2);
            return generatedMessageLite2;
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).i(generatedMessageLite2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    protected static void F(Class cls, GeneratedMessageLite generatedMessageLite) {
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    private static GeneratedMessageLite n(GeneratedMessageLite generatedMessageLite) {
        if (generatedMessageLite == null || generatedMessageLite.w()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.i().a().i(generatedMessageLite);
    }

    protected static t.b s() {
        return o0.e();
    }

    static GeneratedMessageLite t(Class cls) {
        GeneratedMessageLite generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (generatedMessageLite == null) {
            generatedMessageLite = ((GeneratedMessageLite) a1.i(cls)).d();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return generatedMessageLite;
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean x(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.p(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = n0.a().d(generatedMessageLite).c(generatedMessageLite);
        if (z) {
            generatedMessageLite.q(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, c2 ? generatedMessageLite : null);
        }
        return c2;
    }

    protected static t.b z(t.b bVar) {
        int size = bVar.size();
        return bVar.m(size == 0 ? 10 : size * 2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final a c() {
        return (a) p(MethodToInvoke.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final a a() {
        a aVar = (a) p(MethodToInvoke.NEW_BUILDER);
        aVar.r(this);
        return aVar;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public int b() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = n0.a().d(this).d(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void e(CodedOutputStream codedOutputStream) {
        n0.a().d(this).i(this, h.P(codedOutputStream));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (d().getClass().isInstance(obj)) {
            return n0.a().d(this).g(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    int g() {
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        int f = n0.a().d(this).f(this);
        this.memoizedHashCode = f;
        return f;
    }

    @Override // androidx.datastore.preferences.protobuf.a
    void k(int i) {
        this.memoizedSerializedSize = i;
    }

    Object m() {
        return p(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    protected final a o() {
        return (a) p(MethodToInvoke.NEW_BUILDER);
    }

    protected Object p(MethodToInvoke methodToInvoke) {
        return r(methodToInvoke, null, null);
    }

    protected Object q(MethodToInvoke methodToInvoke, Object obj) {
        return r(methodToInvoke, obj, null);
    }

    protected abstract Object r(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public String toString() {
        return g0.e(this, super.toString());
    }

    @Override // defpackage.pr4
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite d() {
        return (GeneratedMessageLite) p(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final boolean w() {
        return x(this, true);
    }

    protected void y() {
        n0.a().d(this).b(this);
    }
}
