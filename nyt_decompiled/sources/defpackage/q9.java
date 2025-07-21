package defpackage;

import com.google.crypto.tink.f;
import com.google.crypto.tink.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class q9 implements v26 {
    private static final Logger a = Logger.getLogger(q9.class.getName());

    private static class b implements o9 {
        private final f a;

        @Override // defpackage.o9
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return uf0.a(this.a.b().a(), ((o9) this.a.b().c()).a(bArr, bArr2));
        }

        @Override // defpackage.o9
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator it2 = this.a.c(copyOfRange).iterator();
                while (it2.hasNext()) {
                    try {
                        return ((o9) ((f.b) it2.next()).c()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        q9.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator it3 = this.a.e().iterator();
            while (it3.hasNext()) {
                try {
                    return ((o9) ((f.b) it3.next()).c()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }

        private b(f fVar) {
            this.a = fVar;
        }
    }

    q9() {
    }

    public static void e() {
        g.r(new q9());
    }

    @Override // defpackage.v26
    public Class b() {
        return o9.class;
    }

    @Override // defpackage.v26
    public Class c() {
        return o9.class;
    }

    @Override // defpackage.v26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public o9 a(f fVar) {
        return new b(fVar);
    }
}
