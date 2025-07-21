package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class cj0 extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(aj0 aj0Var) {
            return new yi0(aj0Var.N().y());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public aj0 a(bj0 bj0Var) {
            return (aj0) aj0.P().v(cj0.this.j()).u(ByteString.g(po6.c(32))).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public bj0 c(ByteString byteString) {
            return bj0.L(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(bj0 bj0Var) {
        }
    }

    cj0() {
        super(aj0.class, new a(o9.class));
    }

    public static void l(boolean z) {
        g.q(new cj0(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(bj0.class);
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
    public aj0 g(ByteString byteString) {
        return aj0.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(aj0 aj0Var) {
        q39.c(aj0Var.O(), j());
        if (aj0Var.N().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
