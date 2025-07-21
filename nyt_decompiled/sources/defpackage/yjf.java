package defpackage;

import java.security.GeneralSecurityException;

/* loaded from: classes3.dex */
final class yjf implements naf {
    final jdf a;

    public yjf(jdf jdfVar) {
        this.a = jdfVar;
    }

    @Override // defpackage.naf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        jdf jdfVar = this.a;
        if (jdfVar.a() != null) {
            return q4g.c(jdfVar.a().d(), ((naf) this.a.a().c()).zza(bArr, bArr2));
        }
        throw new GeneralSecurityException("keyset without primary key");
    }
}
