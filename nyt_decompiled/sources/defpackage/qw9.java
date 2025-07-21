package defpackage;

/* loaded from: classes3.dex */
public abstract class qw9 implements ov9 {
    private final ov9 a;

    public qw9(ov9 ov9Var) {
        this.a = ov9Var;
    }

    @Override // defpackage.ov9
    public final int a(int i) {
        throw null;
    }

    @Override // defpackage.ov9, defpackage.xyf
    public final int b(byte[] bArr, int i, int i2) {
        return this.a.b(bArr, i, i2);
    }

    @Override // defpackage.ov9
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return this.a.c(bArr, 0, 8, true);
    }

    @Override // defpackage.ov9
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return this.a.d(bArr, 0, 8, true);
    }

    @Override // defpackage.ov9
    public final void f(int i) {
        ((bv9) this.a).l(i, false);
    }

    @Override // defpackage.ov9
    public final int g(byte[] bArr, int i, int i2) {
        throw null;
    }

    @Override // defpackage.ov9
    public final void i(byte[] bArr, int i, int i2) {
        ((bv9) this.a).c(bArr, i, i2, false);
    }

    @Override // defpackage.ov9
    public final void j(byte[] bArr, int i, int i2) {
        ((bv9) this.a).d(bArr, i, i2, false);
    }

    @Override // defpackage.ov9
    public long zzd() {
        return this.a.zzd();
    }

    @Override // defpackage.ov9
    public long zze() {
        return this.a.zze();
    }

    @Override // defpackage.ov9
    public long zzf() {
        return this.a.zzf();
    }

    @Override // defpackage.ov9
    public final void zzg(int i) {
        ((bv9) this.a).k(i, false);
    }

    @Override // defpackage.ov9
    public final void zzj() {
        this.a.zzj();
    }
}
