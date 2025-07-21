package defpackage;

import android.content.Context;
import android.os.Bundle;

/* loaded from: classes3.dex */
public final class g6c {
    private final Context a;
    private final s1e b;
    private final Bundle c;
    private final h1e d;
    private final y4c e;
    private final k9d f;

    /* synthetic */ g6c(e6c e6cVar, f6c f6cVar) {
        Context context;
        s1e s1eVar;
        Bundle bundle;
        h1e h1eVar;
        y4c y4cVar;
        k9d k9dVar;
        context = e6cVar.a;
        this.a = context;
        s1eVar = e6cVar.b;
        this.b = s1eVar;
        bundle = e6cVar.c;
        this.c = bundle;
        h1eVar = e6cVar.d;
        this.d = h1eVar;
        y4cVar = e6cVar.e;
        this.e = y4cVar;
        k9dVar = e6cVar.f;
        this.f = k9dVar;
    }

    final Context a(Context context) {
        return this.a;
    }

    final Bundle b() {
        return this.c;
    }

    final y4c c() {
        return this.e;
    }

    final e6c d() {
        e6c e6cVar = new e6c();
        e6cVar.e(this.a);
        e6cVar.i(this.b);
        e6cVar.f(this.c);
        e6cVar.g(this.e);
        e6cVar.d(this.f);
        return e6cVar;
    }

    final k9d e(String str) {
        k9d k9dVar = this.f;
        return k9dVar != null ? k9dVar : new k9d(str);
    }

    final h1e f() {
        return this.d;
    }

    final s1e g() {
        return this.b;
    }
}
