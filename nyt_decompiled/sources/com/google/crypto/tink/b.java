package com.google.crypto.tink;

import com.google.crypto.tink.c;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import com.google.crypto.tink.shaded.protobuf.f0;
import defpackage.bw3;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class b implements bw3 {
    private final c a;
    private final Class b;

    private static class a {
        final c.a a;

        a(c.a aVar) {
            this.a = aVar;
        }

        private f0 b(f0 f0Var) {
            this.a.d(f0Var);
            return (f0) this.a.a(f0Var);
        }

        f0 a(ByteString byteString) {
            return b(this.a.c(byteString));
        }
    }

    public b(c cVar, Class cls) {
        if (!cVar.h().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", cVar.toString(), cls.getName()));
        }
        this.a = cVar;
        this.b = cls;
    }

    private a f() {
        return new a(this.a.e());
    }

    private Object g(f0 f0Var) {
        if (Void.class.equals(this.b)) {
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        }
        this.a.i(f0Var);
        return this.a.d(f0Var, this.b);
    }

    @Override // defpackage.bw3
    public final boolean a(String str) {
        return str.equals(e());
    }

    @Override // defpackage.bw3
    public final KeyData b(ByteString byteString) {
        try {
            return (KeyData) KeyData.S().v(e()).w(f().a(byteString).e()).u(this.a.f()).l();
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // defpackage.bw3
    public final Object c(ByteString byteString) {
        try {
            return g(this.a.g(byteString));
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.b().getName(), e);
        }
    }

    @Override // defpackage.bw3
    public final f0 d(ByteString byteString) {
        try {
            return f().a(byteString);
        } catch (InvalidProtocolBufferException e) {
            throw new GeneralSecurityException("Failures parsing proto of type " + this.a.e().b().getName(), e);
        }
    }

    public final String e() {
        return this.a.c();
    }
}
