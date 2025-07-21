package defpackage;

/* loaded from: classes3.dex */
final class kuf implements ecf {
    private final jdf a;
    private final ivf b;
    private final ivf c;

    /* synthetic */ kuf(jdf jdfVar, iuf iufVar) {
        ivf ivfVar;
        this.a = jdfVar;
        if (jdfVar.e()) {
            kvf b = bqf.a().b();
            uvf a = spf.a(jdfVar);
            this.b = b.a(a, "mac", "compute");
            ivfVar = b.a(a, "mac", "verify");
        } else {
            ivfVar = spf.a;
            this.b = ivfVar;
        }
        this.c = ivfVar;
    }

    @Override // defpackage.ecf
    public final byte[] a(byte[] bArr) {
        byte[] bArr2;
        if (this.a.a().f() == 4) {
            bArr2 = muf.b;
            bArr = q4g.c(bArr, bArr2);
        }
        byte[] c = q4g.c(this.a.a().d(), ((ecf) this.a.a().c()).a(bArr));
        this.a.a().a();
        return c;
    }
}
