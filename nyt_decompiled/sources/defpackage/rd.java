package defpackage;

import defpackage.gl1;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class rd implements kn8 {
    private final gl1 a;
    private final AtomicReference b = new AtomicReference();

    public rd(gl1 gl1Var) {
        this.a = gl1Var;
        gl1Var.a(new gl1.a() { // from class: qd
            @Override // gl1.a
            public final void a(q76 q76Var) {
                rd.this.b(q76Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(q76 q76Var) {
        AtomicReference atomicReference = this.b;
        lh4.a(q76Var.get());
        atomicReference.set(null);
    }
}
