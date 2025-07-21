package defpackage;

import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;

/* loaded from: classes3.dex */
public final class wa extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public nn1 a(ua uaVar) {
            return new ta(uaVar.N().y());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ua a(va vaVar) {
            return (ua) ua.P().u(ByteString.g(po6.c(vaVar.M()))).v(wa.this.l()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public va c(ByteString byteString) {
            return va.O(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(va vaVar) {
            if (vaVar.M() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + vaVar.M() + ". Valid keys must have 64 bytes.");
        }
    }

    wa() {
        super(ua.class, new a(nn1.class));
    }

    public static final KeyTemplate j() {
        return k(64, KeyTemplate.OutputPrefixType.TINK);
    }

    private static KeyTemplate k(int i, KeyTemplate.OutputPrefixType outputPrefixType) {
        return KeyTemplate.a(new wa().c(), ((va) va.N().u(i).l()).f(), outputPrefixType);
    }

    public static void n(boolean z) {
        g.q(new wa(), z);
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(va.class);
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
    public ua g(ByteString byteString) {
        return ua.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void i(ua uaVar) {
        q39.c(uaVar.O(), l());
        if (uaVar.N().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + uaVar.N().size() + ". Valid keys must have 64 bytes.");
    }
}
