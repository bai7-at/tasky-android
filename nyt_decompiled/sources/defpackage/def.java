package defpackage;

/* loaded from: classes3.dex */
final class def implements haf {
    private final jdf a;
    private final ivf b;
    private final ivf c;

    /* synthetic */ def(jdf jdfVar, aef aefVar) {
        ivf ivfVar;
        this.a = jdfVar;
        if (jdfVar.e()) {
            kvf b = bqf.a().b();
            uvf a = spf.a(jdfVar);
            this.b = b.a(a, "aead", "encrypt");
            ivfVar = b.a(a, "aead", "decrypt");
        } else {
            ivfVar = spf.a;
            this.b = ivfVar;
        }
        this.c = ivfVar;
    }

    @Override // defpackage.haf
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        byte[] c = q4g.c(this.a.a().d(), ((haf) this.a.a().c()).zza(bArr, bArr2));
        this.a.a().a();
        int length = bArr.length;
        return c;
    }
}
