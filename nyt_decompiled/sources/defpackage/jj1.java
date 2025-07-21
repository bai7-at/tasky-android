package defpackage;

import defpackage.md8;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* loaded from: classes2.dex */
public class jj1 implements fb7 {
    private static final Logger f = Logger.getLogger(hs8.class.getName());
    private final bk9 a;
    private final Executor b;
    private final o30 c;
    private final w42 d;
    private final md8 e;

    public jj1(Executor executor, o30 o30Var, bk9 bk9Var, w42 w42Var, md8 md8Var) {
        this.b = executor;
        this.c = o30Var;
        this.a = bk9Var;
        this.d = w42Var;
        this.e = md8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d(as8 as8Var, c42 c42Var) {
        this.d.d1(as8Var, c42Var);
        this.a.a(as8Var, 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(final as8 as8Var, ks8 ks8Var, c42 c42Var) {
        try {
            zr8 zr8Var = this.c.get(as8Var.b());
            if (zr8Var == null) {
                String format = String.format("Transport backend '%s' is not registered", as8Var.b());
                f.warning(format);
                ks8Var.a(new IllegalArgumentException(format));
            } else {
                final c42 a = zr8Var.a(c42Var);
                this.e.b(new md8.a() { // from class: ij1
                    @Override // md8.a
                    public final Object execute() {
                        Object d;
                        d = jj1.this.d(as8Var, a);
                        return d;
                    }
                });
                ks8Var.a(null);
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            ks8Var.a(e);
        }
    }

    @Override // defpackage.fb7
    public void a(final as8 as8Var, final c42 c42Var, final ks8 ks8Var) {
        this.b.execute(new Runnable() { // from class: hj1
            @Override // java.lang.Runnable
            public final void run() {
                jj1.this.e(as8Var, ks8Var, c42Var);
            }
        });
    }
}
