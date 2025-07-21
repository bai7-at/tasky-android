package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class t6e implements k6e {
    private final x6e a;
    private final v6e b;
    private final h6e c;

    public t6e(h6e h6eVar, x6e x6eVar, v6e v6eVar) {
        this.c = h6eVar;
        this.a = x6eVar;
        this.b = v6eVar;
    }

    @Override // defpackage.k6e
    public final void a(j6e j6eVar) {
        this.c.b(b(j6eVar));
    }

    @Override // defpackage.k6e
    public final String b(j6e j6eVar) {
        v6e v6eVar = this.b;
        Map j = j6eVar.j();
        v6eVar.a(j);
        return this.a.a(j);
    }
}
