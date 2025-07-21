package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes3.dex */
final class lme implements qke {
    private final wle a;
    private final qxe b;
    private final qxe c;

    /* synthetic */ lme(wle wleVar, kme kmeVar) {
        qxe qxeVar;
        this.a = wleVar;
        if (wleVar.f()) {
            rxe b = mte.a().b();
            xxe a = fte.a(wleVar);
            this.b = b.a(a, "aead", "encrypt");
            qxeVar = b.a(a, "aead", "decrypt");
        } else {
            qxeVar = fte.a;
            this.b = qxeVar;
        }
        this.c = qxeVar;
    }

    @Override // defpackage.qke
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (sle sleVar : this.a.e(copyOf)) {
                try {
                    byte[] zza = ((qke) sleVar.e()).zza(copyOfRange, bArr2);
                    sleVar.a();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (sle sleVar2 : this.a.e(vke.a)) {
            try {
                byte[] zza2 = ((qke) sleVar2.e()).zza(bArr, bArr2);
                sleVar2.a();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
