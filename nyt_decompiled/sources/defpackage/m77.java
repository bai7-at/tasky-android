package defpackage;

import defpackage.da2;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class m77 {
    private final gd4 a = new gd4(1000);
    private final sz5 b = da2.d(10, new a());

    class a implements da2.d {
        a() {
        }

        @Override // da2.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static final class b implements da2.f {
        final MessageDigest a;
        private final b18 b = b18.a();

        b(MessageDigest messageDigest) {
            this.a = messageDigest;
        }

        @Override // da2.f
        public b18 b() {
            return this.b;
        }
    }

    private String a(ov3 ov3Var) {
        b bVar = (b) z06.d(this.b.b());
        try {
            ov3Var.b(bVar.a);
            return x19.s(bVar.a.digest());
        } finally {
            this.b.a(bVar);
        }
    }

    public String b(ov3 ov3Var) {
        String str;
        synchronized (this.a) {
            str = (String) this.a.f(ov3Var);
        }
        if (str == null) {
            str = a(ov3Var);
        }
        synchronized (this.a) {
            this.a.j(ov3Var, str);
        }
        return str;
    }
}
