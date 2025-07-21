package defpackage;

import com.google.crypto.tink.c;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.HashType;
import com.google.crypto.tink.proto.KeyData;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.crypto.tink.shaded.protobuf.m;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public final class j93 extends com.google.crypto.tink.c {

    class a extends c.b {
        a(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.b
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public md4 a(h93 h93Var) {
            HashType M = h93Var.Q().M();
            SecretKeySpec secretKeySpec = new SecretKeySpec(h93Var.P().y(), "HMAC");
            int N = h93Var.Q().N();
            int i = c.a[M.ordinal()];
            if (i == 1) {
                return new l26(new k26("HMACSHA1", secretKeySpec), N);
            }
            if (i == 2) {
                return new l26(new k26("HMACSHA256", secretKeySpec), N);
            }
            if (i == 3) {
                return new l26(new k26("HMACSHA512", secretKeySpec), N);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    class b extends c.a {
        b(Class cls) {
            super(cls);
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public h93 a(i93 i93Var) {
            return (h93) h93.S().w(j93.this.k()).v(i93Var.N()).u(ByteString.g(po6.c(i93Var.M()))).l();
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public i93 c(ByteString byteString) {
            return i93.O(byteString, m.b());
        }

        @Override // com.google.crypto.tink.c.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public void d(i93 i93Var) {
            if (i93Var.M() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            j93.o(i93Var.N());
        }
    }

    static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[HashType.values().length];
            a = iArr;
            try {
                iArr[HashType.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[HashType.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[HashType.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public j93() {
        super(h93.class, new a(md4.class));
    }

    public static void m(boolean z) {
        g.q(new j93(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(k93 k93Var) {
        if (k93Var.N() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i = c.a[k93Var.M().ordinal()];
        if (i == 1) {
            if (k93Var.N() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i == 2) {
            if (k93Var.N() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i != 3) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (k93Var.N() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.crypto.tink.c
    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.crypto.tink.c
    public c.a e() {
        return new b(i93.class);
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
    public h93 g(ByteString byteString) {
        return h93.T(byteString, m.b());
    }

    @Override // com.google.crypto.tink.c
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(h93 h93Var) {
        q39.c(h93Var.R(), k());
        if (h93Var.P().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        o(h93Var.Q());
    }
}
