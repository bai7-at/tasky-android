package defpackage;

/* loaded from: classes3.dex */
final class ty9 implements uu9 {
    private final pw9 a;
    private final int b;
    private final hw9 c = new hw9();

    /* synthetic */ ty9(pw9 pw9Var, int i, sy9 sy9Var) {
        this.a = pw9Var;
        this.b = i;
    }

    private final long b(ov9 ov9Var) {
        while (ov9Var.zze() < ov9Var.zzd() - 6) {
            pw9 pw9Var = this.a;
            int i = this.b;
            hw9 hw9Var = this.c;
            long zze = ov9Var.zze();
            byte[] bArr = new byte[2];
            bv9 bv9Var = (bv9) ov9Var;
            bv9Var.d(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                ov9Var.zzj();
                bv9Var.k((int) (zze - ov9Var.zzf()), false);
            } else {
                b9e b9eVar = new b9e(16);
                System.arraycopy(bArr, 0, b9eVar.m(), 0, 2);
                b9eVar.j(tv9.a(ov9Var, b9eVar.m(), 2, 14));
                ov9Var.zzj();
                bv9Var.k((int) (zze - ov9Var.zzf()), false);
                if (jw9.c(b9eVar, pw9Var, i, hw9Var)) {
                    break;
                }
            }
            bv9Var.k(1, false);
        }
        if (ov9Var.zze() < ov9Var.zzd() - 6) {
            return this.c.a;
        }
        ((bv9) ov9Var).k((int) (ov9Var.zzd() - ov9Var.zze()), false);
        return this.a.j;
    }

    @Override // defpackage.uu9
    public final tu9 a(ov9 ov9Var, long j) {
        int i = this.a.c;
        long zzf = ov9Var.zzf();
        long b = b(ov9Var);
        long zze = ov9Var.zze();
        ((bv9) ov9Var).k(Math.max(6, i), false);
        long b2 = b(ov9Var);
        return (b > j || b2 <= j) ? b2 <= j ? tu9.f(b2, ov9Var.zze()) : tu9.d(b, zzf) : tu9.e(zze);
    }

    @Override // defpackage.uu9
    public final /* synthetic */ void zzb() {
    }
}
