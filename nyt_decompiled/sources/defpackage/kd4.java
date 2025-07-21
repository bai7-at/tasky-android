package defpackage;

import defpackage.pp4;

/* loaded from: classes2.dex */
public class kd4 extends gd4 implements pp4 {
    private pp4.a e;

    public kd4(long j) {
        super(j);
    }

    @Override // defpackage.pp4
    public void a(int i) {
        if (i >= 40) {
            clearMemory();
        } else if (i >= 20 || i == 15) {
            l(g() / 2);
        }
    }

    @Override // defpackage.pp4
    public /* bridge */ /* synthetic */ cz6 b(ov3 ov3Var) {
        return (cz6) super.k(ov3Var);
    }

    @Override // defpackage.pp4
    public void c(pp4.a aVar) {
        this.e = aVar;
    }

    @Override // defpackage.pp4
    public /* bridge */ /* synthetic */ cz6 d(ov3 ov3Var, cz6 cz6Var) {
        return (cz6) super.j(ov3Var, cz6Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gd4
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public int h(cz6 cz6Var) {
        return cz6Var == null ? super.h(null) : cz6Var.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.gd4
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void i(ov3 ov3Var, cz6 cz6Var) {
        pp4.a aVar = this.e;
        if (aVar == null || cz6Var == null) {
            return;
        }
        aVar.c(cz6Var);
    }
}
