package defpackage;

/* loaded from: classes3.dex */
final class gy9 implements gx9 {
    private final long a;
    final /* synthetic */ jy9 b;

    public gy9(jy9 jy9Var, long j) {
        this.b = jy9Var;
        this.a = j;
    }

    @Override // defpackage.gx9
    public final ex9 a(long j) {
        my9[] my9VarArr;
        my9[] my9VarArr2;
        my9[] my9VarArr3;
        my9VarArr = this.b.g;
        ex9 a = my9VarArr[0].a(j);
        int i = 1;
        while (true) {
            jy9 jy9Var = this.b;
            my9VarArr2 = jy9Var.g;
            if (i >= my9VarArr2.length) {
                return a;
            }
            my9VarArr3 = jy9Var.g;
            ex9 a2 = my9VarArr3[i].a(j);
            if (a2.a.b < a.a.b) {
                a = a2;
            }
            i++;
        }
    }

    @Override // defpackage.gx9
    public final long zza() {
        return this.a;
    }

    @Override // defpackage.gx9
    public final boolean zzh() {
        return true;
    }
}
