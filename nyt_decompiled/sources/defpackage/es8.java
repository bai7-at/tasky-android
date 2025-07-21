package defpackage;

/* loaded from: classes2.dex */
final class es8 implements yr8 {
    private final as8 a;
    private final String b;
    private final f12 c;
    private final br8 d;
    private final fs8 e;

    es8(as8 as8Var, String str, f12 f12Var, br8 br8Var, fs8 fs8Var) {
        this.a = as8Var;
        this.b = str;
        this.c = f12Var;
        this.d = br8Var;
        this.e = fs8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Exception exc) {
    }

    @Override // defpackage.yr8
    public void a(b32 b32Var, ks8 ks8Var) {
        this.e.a(qj7.a().e(this.a).c(b32Var).f(this.b).d(this.d).b(this.c).a(), ks8Var);
    }

    @Override // defpackage.yr8
    public void b(b32 b32Var) {
        a(b32Var, new ks8() { // from class: ds8
            @Override // defpackage.ks8
            public final void a(Exception exc) {
                es8.d(exc);
            }
        });
    }
}
