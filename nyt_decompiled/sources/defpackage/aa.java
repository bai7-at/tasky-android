package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public final class aa extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(y9 y9Var) {
            return new g12((vi3) new ea().d(y9Var.O(), vi3.class), (md4) new j93().d(y9Var.P(), md4.class), y9Var.P().Q().N());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public y9 a(z9 z9Var) {
            ca caVar = (ca) new ea().e().a(z9Var.L());
            return (y9) y9.R().u(caVar).v((h93) new j93().e().a(z9Var.M())).w(aa.this.j()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public z9 c(ByteString byteString) {
            return z9.N(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(z9 z9Var) {
            new ea().e().d(z9Var.L());
            new j93().e().d(z9Var.M());
            q39.a(z9Var.L().M());
        }
    }

    aa() {
        super(y9.class, new a(o9.class));
    }

    public static void l(boolean z) {
        g.q(new aa(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(z9.class);
    }

    @Override // com.google.crypto.tink.c
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public y9 g(ByteString byteString) {
        return y9.S(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(y9 y9Var) {
        q39.c(y9Var.Q(), j());
        new ea().i(y9Var.O());
        new j93().i(y9Var.P());
    }
}
