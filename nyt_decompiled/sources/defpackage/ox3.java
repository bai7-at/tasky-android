package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;

/* loaded from: classes3.dex */
public class ox3 extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(mx3 mx3Var) {
            String N = mx3Var.N().N();
            return new lx3(mx3Var.N().M(), kx3.a(N).b(N));
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public mx3 a(nx3 nx3Var) {
            return (mx3) mx3.P().u(nx3Var).v(ox3.this.j()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public nx3 c(ByteString byteString) {
            return nx3.O(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(nx3 nx3Var) {
        }
    }

    ox3() {
        super(mx3.class, new a(o9.class));
    }

    public static void l(boolean z) {
        g.q(new ox3(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(nx3.class);
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
    public mx3 g(ByteString byteString) {
        return mx3.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(mx3 mx3Var) {
        q39.c(mx3Var.O(), j());
    }
}
