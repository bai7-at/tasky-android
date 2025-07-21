package defpackage;

/* loaded from: classes3.dex */
final class tz9 extends qw9 {
    private final long b;

    public tz9(ov9 ov9Var, long j) {
        super(ov9Var);
        wad.d(ov9Var.zzf() >= j);
        this.b = j;
    }

    @Override // defpackage.qw9, defpackage.ov9
    public final long zzd() {
        return super.zzd() - this.b;
    }

    @Override // defpackage.qw9, defpackage.ov9
    public final long zze() {
        return super.zze() - this.b;
    }

    @Override // defpackage.qw9, defpackage.ov9
    public final long zzf() {
        return super.zzf() - this.b;
    }
}
