package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public final class w9 extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public md4 a(u9 u9Var) {
            return new l26(new j26(u9Var.O().y()), u9Var.P().M());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public u9 a(v9 v9Var) {
            return (u9) u9.R().w(0).u(ByteString.g(po6.c(v9Var.L()))).v(v9Var.M()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v9 c(ByteString byteString) {
            return v9.N(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(v9 v9Var) {
            w9.p(v9Var.M());
            w9.q(v9Var.L());
        }
    }

    w9() {
        super(u9.class, new a(md4.class));
    }

    public static void n(boolean z) {
        g.q(new w9(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(x9 x9Var) {
        if (x9Var.M() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (x9Var.M() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(int i) {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(v9.class);
    }

    @Override // com.google.crypto.tink.c
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public u9 g(ByteString byteString) {
        return u9.S(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(u9 u9Var) {
        q39.c(u9Var.Q(), l());
        q(u9Var.O().size());
        p(u9Var.P());
    }
}
