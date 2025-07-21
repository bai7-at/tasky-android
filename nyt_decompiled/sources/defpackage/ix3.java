package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public class ix3 extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(gx3 gx3Var) {
            String M = gx3Var.N().M();
            return kx3.a(M).b(M);
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public gx3 a(hx3 hx3Var) {
            return (gx3) gx3.P().u(hx3Var).v(ix3.this.j()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public hx3 c(ByteString byteString) {
            return hx3.N(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(hx3 hx3Var) {
        }
    }

    ix3() {
        super(gx3.class, new a(o9.class));
    }

    public static void l(boolean z) {
        g.q(new ix3(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(hx3.class);
    }

    @Override // com.google.crypto.tink.c
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.REMOTE;
    }

    public int j() {
        return 0;
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public gx3 g(ByteString byteString) {
        return gx3.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(gx3 gx3Var) {
        q39.c(gx3Var.O(), j());
    }
}
