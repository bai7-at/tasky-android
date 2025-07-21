package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class wl9 extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(ul9 ul9Var) {
            return new tl9(ul9Var.N().y());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ul9 a(vl9 vl9Var) {
            return (ul9) ul9.P().v(wl9.this.j()).u(ByteString.g(po6.c(32))).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public vl9 c(ByteString byteString) {
            return vl9.L(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(vl9 vl9Var) {
        }
    }

    wl9() {
        super(ul9.class, new a(o9.class));
    }

    public static void l(boolean z) {
        g.q(new wl9(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(vl9.class);
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
    public ul9 g(ByteString byteString) {
        return ul9.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(ul9 ul9Var) {
        q39.c(ul9Var.O(), j());
        if (ul9Var.N().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
