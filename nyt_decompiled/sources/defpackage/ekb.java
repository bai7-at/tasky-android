package defpackage;

import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class ekb extends ila {
    final wib c;
    final mkb d;
    private final String e;
    private final String[] f;

    ekb(wib wibVar, mkb mkbVar, String str, String[] strArr) {
        this.c = wibVar;
        this.d = mkbVar;
        this.e = str;
        this.f = strArr;
        dyf.A().c(this);
    }

    @Override // defpackage.ila
    public final void a() {
        try {
            this.d.w(this.e, this.f);
        } finally {
            wxf.l.post(new dkb(this));
        }
    }

    @Override // defpackage.ila
    public final j64 b() {
        return (((Boolean) pla.c().a(mpa.W1)).booleanValue() && (this.d instanceof alb)) ? pgb.e.j(new Callable() { // from class: ckb
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ekb.this.d();
            }
        }) : super.b();
    }

    final /* synthetic */ Boolean d() {
        return Boolean.valueOf(this.d.x(this.e, this.f, this));
    }

    public final String e() {
        return this.e;
    }
}
