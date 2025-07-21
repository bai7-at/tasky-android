package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.u;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite extends com.google.crypto.tink.shaded.protobuf.a {
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    protected x0 unknownFields = x0.e();
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

    public static abstract class a extends a.AbstractC0213a {
        private final GeneratedMessageLite a;
        protected GeneratedMessageLite b;
        protected boolean c = false;

        protected a(GeneratedMessageLite generatedMessageLite) {
            this.a = generatedMessageLite;
            this.b = (GeneratedMessageLite) generatedMessageLite.q(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        }

        private void t(GeneratedMessageLite generatedMessageLite, GeneratedMessageLite generatedMessageLite2) {
            n0.a().d(generatedMessageLite).a(generatedMessageLite, generatedMessageLite2);
        }

        public final GeneratedMessageLite l() {
            GeneratedMessageLite j = j();
            if (j.x()) {
                return j;
            }
            throw a.AbstractC0213a.k(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.f0.a
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite j() {
            if (this.c) {
                return this.b;
            }
            this.b.z();
            this.c = true;
            return this.b;
        }

        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a c = d().c();
            c.s(j());
            return c;
        }

        protected final void o() {
            if (this.c) {
                p();
                this.c = false;
            }
        }

        protected void p() {
            GeneratedMessageLite generatedMessageLite = (GeneratedMessageLite) this.b.q(MethodToInvoke.NEW_MUTABLE_INSTANCE);
            t(generatedMessageLite, this.b);
            this.b = generatedMessageLite;
        }

        @Override // defpackage.or4
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public GeneratedMessageLite d() {
            return this.a;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.a.AbstractC0213a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a h(GeneratedMessageLite generatedMessageLite) {
            return s(generatedMessageLite);
        }

        public a s(GeneratedMessageLite generatedMessageLite) {
            o();
            t(this.b, generatedMessageLite);
            return this;
        }
    }

    protected static class b extends com.google.crypto.tink.shaded.protobuf.b {
        private final GeneratedMessageLite b;

        public b(GeneratedMessageLite generatedMessageLite) {
            this.b = generatedMessageLite;
        }
    }

    public static class c extends k {
    }

    protected static u.d A(u.d dVar) {
        int size = dVar.size();
        return dVar.m(size == 0 ? 10 : size * 2);
    }

    protected static Object C(f0 f0Var, String str, Object[] objArr) {
        return new p0(f0Var, str, objArr);
    }

    protected static GeneratedMessageLite D(GeneratedMessageLite generatedMessageLite, ByteString byteString, m mVar) {
        return o(F(generatedMessageLite, byteString, mVar));
    }

    protected static GeneratedMessageLite E(GeneratedMessageLite generatedMessageLite, byte[] bArr, m mVar) {
        return o(H(generatedMessageLite, bArr, 0, bArr.length, mVar));
    }

    private static GeneratedMessageLite F(GeneratedMessageLite generatedMessageLite, ByteString byteString, m mVar) {
        g u = byteString.u();
        GeneratedMessageLite G = G(generatedMessageLite, u, mVar);
        try {
            u.a(0);
            return G;
        } catch (InvalidProtocolBufferException e) {
            throw e.i(G);
        }
    }

    static GeneratedMessageLite G(GeneratedMessageLite generatedMessageLite, g gVar, m mVar) {
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) generatedMessageLite.q(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            r0 d = n0.a().d(generatedMessageLite2);
            d.i(generatedMessageLite2, h.O(gVar), mVar);
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

    static GeneratedMessageLite H(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, m mVar) {
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) generatedMessageLite.q(MethodToInvoke.NEW_MUTABLE_INSTANCE);
        try {
            r0 d = n0.a().d(generatedMessageLite2);
            d.h(generatedMessageLite2, bArr, i, i + i2, new e.a(mVar));
            d.b(generatedMessageLite2);
            if (generatedMessageLite2.memoizedHashCode == 0) {
                return generatedMessageLite2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e.getCause());
            }
            throw new InvalidProtocolBufferException(e.getMessage()).i(generatedMessageLite2);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.j().i(generatedMessageLite2);
        }
    }

    protected static void I(Class cls, GeneratedMessageLite generatedMessageLite) {
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    private static GeneratedMessageLite o(GeneratedMessageLite generatedMessageLite) {
        if (generatedMessageLite == null || generatedMessageLite.x()) {
            return generatedMessageLite;
        }
        throw generatedMessageLite.l().a().i(generatedMessageLite);
    }

    protected static u.d t() {
        return o0.e();
    }

    static GeneratedMessageLite u(Class cls) {
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
            generatedMessageLite = ((GeneratedMessageLite) z0.i(cls)).d();
            if (generatedMessageLite == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, generatedMessageLite);
        }
        return generatedMessageLite;
    }

    static Object w(Method method, Object obj, Object... objArr) {
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

    protected static final boolean y(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.q(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean c2 = n0.a().d(generatedMessageLite).c(generatedMessageLite);
        if (z) {
            generatedMessageLite.r(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, c2 ? generatedMessageLite : null);
        }
        return c2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final a c() {
        return (a) q(MethodToInvoke.NEW_BUILDER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final a a() {
        a aVar = (a) q(MethodToInvoke.NEW_BUILDER);
        aVar.s(this);
        return aVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int b() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = n0.a().d(this).d(this);
        }
        return this.memoizedSerializedSize;
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

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public void g(CodedOutputStream codedOutputStream) {
        n0.a().d(this).j(this, i.P(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int h() {
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

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void m(int i) {
        this.memoizedSerializedSize = i;
    }

    Object n() {
        return q(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    protected final a p() {
        return (a) q(MethodToInvoke.NEW_BUILDER);
    }

    protected Object q(MethodToInvoke methodToInvoke) {
        return s(methodToInvoke, null, null);
    }

    protected Object r(MethodToInvoke methodToInvoke, Object obj) {
        return s(methodToInvoke, obj, null);
    }

    protected abstract Object s(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public String toString() {
        return g0.e(this, super.toString());
    }

    @Override // defpackage.or4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite d() {
        return (GeneratedMessageLite) q(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final boolean x() {
        return y(this, true);
    }

    protected void z() {
        n0.a().d(this).b(this);
    }
}
