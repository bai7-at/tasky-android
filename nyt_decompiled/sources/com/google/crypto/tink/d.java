package com.google.crypto.tink;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.m;
import defpackage.ax3;
import defpackage.bx3;
import defpackage.i12;
import defpackage.o9;
import defpackage.zw3;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class d {
    private final com.google.crypto.tink.proto.a a;

    private d(com.google.crypto.tink.proto.a aVar) {
        this.a = aVar;
    }

    public static void a(i12 i12Var) {
        if (i12Var == null || i12Var.N().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(com.google.crypto.tink.proto.a aVar) {
        if (aVar == null || aVar.Q() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static com.google.crypto.tink.proto.a c(i12 i12Var, o9 o9Var) {
        try {
            com.google.crypto.tink.proto.a U = com.google.crypto.tink.proto.a.U(o9Var.b(i12Var.N().y(), new byte[0]), m.b());
            b(U);
            return U;
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static i12 d(com.google.crypto.tink.proto.a aVar, o9 o9Var) {
        byte[] a = o9Var.a(aVar.f(), new byte[0]);
        try {
            if (com.google.crypto.tink.proto.a.U(o9Var.b(a, new byte[0]), m.b()).equals(aVar)) {
                return (i12) i12.O().u(ByteString.g(a)).v(h.b(aVar)).l();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (InvalidProtocolBufferException unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    static final d e(com.google.crypto.tink.proto.a aVar) {
        b(aVar);
        return new d(aVar);
    }

    private Object i(Class cls, Class cls2) {
        return g.t(g.l(this, cls2), cls);
    }

    public static final d j(ax3 ax3Var, o9 o9Var) {
        i12 a = ax3Var.a();
        a(a);
        return new d(c(a, o9Var));
    }

    com.google.crypto.tink.proto.a f() {
        return this.a;
    }

    public zw3 g() {
        return h.b(this.a);
    }

    public Object h(Class cls) {
        Class e = g.e(cls);
        if (e != null) {
            return i(cls, e);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void k(bx3 bx3Var, o9 o9Var) {
        bx3Var.b(d(this.a, o9Var));
    }

    public String toString() {
        return g().toString();
    }
}
