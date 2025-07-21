package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
public class ea extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public vi3 a(ca caVar) {
            return new ba(caVar.P().y(), caVar.Q().M());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public ca a(da daVar) {
            return (ca) ca.S().v(daVar.N()).u(ByteString.g(po6.c(daVar.M()))).w(ea.this.k()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public da c(ByteString byteString) {
            return da.O(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(da daVar) {
            q39.a(daVar.M());
            ea.this.n(daVar.N());
        }
    }

    ea() {
        super(ca.class, new a(vi3.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(fa faVar) {
        if (faVar.M() < 12 || faVar.M() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(da.class);
    }

    @Override // com.google.crypto.tink.c
    public KeyData.KeyMaterialType f() {
        return KeyData.KeyMaterialType.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public ca g(ByteString byteString) {
        return ca.T(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(ca caVar) {
        q39.c(caVar.R(), k());
        q39.a(caVar.P().size());
        n(caVar.Q());
    }
}
