package defpackage;

import defpackage.md8;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class hj9 {
    private final Executor a;
    private final w42 b;
    private final bk9 c;
    private final md8 d;

    hj9(Executor executor, w42 w42Var, bk9 bk9Var, md8 md8Var) {
        this.a = executor;
        this.b = w42Var;
        this.c = bk9Var;
        this.d = md8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object d() {
        Iterator it2 = this.b.K().iterator();
        while (it2.hasNext()) {
            this.c.a((as8) it2.next(), 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e() {
        this.d.b(new md8.a() { // from class: gj9
            @Override // md8.a
            public final Object execute() {
                Object d;
                d = hj9.this.d();
                return d;
            }
        });
    }

    public void c() {
        this.a.execute(new Runnable() { // from class: fj9
            @Override // java.lang.Runnable
            public final void run() {
                hj9.this.e();
            }
        });
    }
}
