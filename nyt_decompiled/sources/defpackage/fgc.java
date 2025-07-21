package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class fgc {
    private final List a;
    private final d8e b;
    private boolean c;

    public fgc(v0e v0eVar, d8e d8eVar) {
        this.a = v0eVar.q;
        this.b = d8eVar;
    }

    public final void a() {
        if (this.c) {
            return;
        }
        this.b.d(this.a);
        this.c = true;
    }
}
