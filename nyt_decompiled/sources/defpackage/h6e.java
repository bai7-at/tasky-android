package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class h6e {
    private final Executor a;
    private final jgb b;

    public h6e(Executor executor, jgb jgbVar) {
        this.a = executor;
        this.b = jgbVar;
    }

    final /* synthetic */ void a(String str) {
        this.b.a(str);
    }

    public final void b(final String str) {
        this.a.execute(new Runnable() { // from class: g6e
            @Override // java.lang.Runnable
            public final void run() {
                h6e.this.a(str);
            }
        });
    }
}
