package defpackage;

import com.google.crypto.tink.f;
import com.google.crypto.tink.g;
import com.google.crypto.tink.proto.OutputPrefixType;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
class od4 implements v26 {
    private static final Logger a = Logger.getLogger(od4.class.getName());

    private static class b implements md4 {
        private final f a;
        private final byte[] b;

        @Override // defpackage.md4
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length <= 5) {
                throw new GeneralSecurityException("tag too short");
            }
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (f.b bVar : this.a.c(copyOf)) {
                try {
                    if (bVar.b().equals(OutputPrefixType.LEGACY)) {
                        ((md4) bVar.c()).a(copyOfRange, uf0.a(bArr2, this.b));
                        return;
                    } else {
                        ((md4) bVar.c()).a(copyOfRange, bArr2);
                        return;
                    }
                } catch (GeneralSecurityException e) {
                    od4.a.info("tag prefix matches a key, but cannot verify: " + e);
                }
            }
            Iterator it2 = this.a.e().iterator();
            while (it2.hasNext()) {
                try {
                    ((md4) ((f.b) it2.next()).c()).a(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }

        @Override // defpackage.md4
        public byte[] b(byte[] bArr) {
            return this.a.b().b().equals(OutputPrefixType.LEGACY) ? uf0.a(this.a.b().a(), ((md4) this.a.b().c()).b(uf0.a(bArr, this.b))) : uf0.a(this.a.b().a(), ((md4) this.a.b().c()).b(bArr));
        }

        private b(f fVar) {
            this.b = new byte[]{0};
            this.a = fVar;
        }
    }

    od4() {
    }

    public static void e() {
        g.r(new od4());
    }

    @Override // defpackage.v26
    public Class b() {
        return md4.class;
    }

    @Override // defpackage.v26
    public Class c() {
        return md4.class;
    }

    @Override // defpackage.v26
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public md4 a(f fVar) {
        return new b(fVar);
    }
}
