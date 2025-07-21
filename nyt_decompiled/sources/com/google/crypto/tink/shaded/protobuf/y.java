package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes3.dex */
final class y implements s0 {
    private static final e0 b = new a();
    private final e0 a;

    class a implements e0 {
        a() {
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        public d0 a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        public boolean b(Class cls) {
            return false;
        }
    }

    private static class b implements e0 {
        private e0[] a;

        b(e0... e0VarArr) {
            this.a = e0VarArr;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        public d0 a(Class cls) {
            for (e0 e0Var : this.a) {
                if (e0Var.b(cls)) {
                    return e0Var.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.crypto.tink.shaded.protobuf.e0
        public boolean b(Class cls) {
            for (e0 e0Var : this.a) {
                if (e0Var.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public y() {
        this(b());
    }

    private static e0 b() {
        return new b(s.c(), c());
    }

    private static e0 c() {
        try {
            return (e0) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return b;
        }
    }

    private static boolean d(d0 d0Var) {
        return d0Var.c() == ProtoSyntax.PROTO2;
    }

    private static r0 e(Class cls, d0 d0Var) {
        return GeneratedMessageLite.class.isAssignableFrom(cls) ? d(d0Var) ? h0.Q(cls, d0Var, l0.b(), w.b(), t0.L(), p.b(), c0.b()) : h0.Q(cls, d0Var, l0.b(), w.b(), t0.L(), null, c0.b()) : d(d0Var) ? h0.Q(cls, d0Var, l0.a(), w.a(), t0.G(), p.a(), c0.a()) : h0.Q(cls, d0Var, l0.a(), w.a(), t0.H(), null, c0.a());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public r0 a(Class cls) {
        t0.I(cls);
        d0 a2 = this.a.a(cls);
        return a2.a() ? GeneratedMessageLite.class.isAssignableFrom(cls) ? i0.m(t0.L(), p.b(), a2.b()) : i0.m(t0.G(), p.a(), a2.b()) : e(cls, a2);
    }

    private y(e0 e0Var) {
        this.a = (e0) u.b(e0Var, "messageInfoFactory");
    }
}
