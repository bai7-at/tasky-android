package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes3.dex */
public final class sa extends c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public o9 a(qa qaVar) {
            return new pa(qaVar.N().y());
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public qa a(ra raVar) {
            return (qa) qa.P().u(ByteString.g(po6.c(raVar.L()))).v(sa.this.k()).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public ra c(ByteString byteString) {
            return ra.M(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(ra raVar) {
            q39.a(raVar.L());
        }
    }

    sa() {
        super(qa.class, new a(o9.class));
    }

    private static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z) {
        if (j()) {
            g.q(new sa(), z);
        }
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(ra.class);
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
    public qa g(ByteString byteString) {
        return qa.Q(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(qa qaVar) {
        q39.c(qaVar.O(), k());
        q39.a(qaVar.N().size());
    }
}
