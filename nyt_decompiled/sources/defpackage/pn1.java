package defpackage;

import com.google.crypto.tink.f;
import com.google.crypto.tink.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public class pn1 implements v26 {
    private static final Logger a = Logger.getLogger(pn1.class.getName());

    private static class a implements nn1 {
        private f a;

        public a(f fVar) {
            this.a = fVar;
        }

        @Override // defpackage.nn1
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return uf0.a(this.a.b().a(), ((nn1) this.a.b().c()).a(bArr, bArr2));
        }

        @Override // defpackage.nn1
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                Iterator it2 = this.a.c(copyOfRange).iterator();
                while (it2.hasNext()) {
                    try {
                        return ((nn1) ((f.b) it2.next()).c()).b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e) {
                        pn1.a.info("ciphertext prefix matches a key, but cannot decrypt: " + e.toString());
                    }
                }
            }
            Iterator it3 = this.a.e().iterator();
            while (it3.hasNext()) {
                try {
                    return ((nn1) ((f.b) it3.next()).c()).b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    pn1() {
    }

    public static void e() {
        g.r(new pn1());
    }

    @Override // defpackage.v26
    public Class b() {
        return nn1.class;
    }

    @Override // defpackage.v26
    public Class c() {
        return nn1.class;
    }

    @Override // defpackage.v26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public nn1 a(f fVar) {
        return new a(fVar);
    }
}
