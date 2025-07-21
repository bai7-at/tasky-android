package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class ypc {
    private final u6c a;
    private final k8c b;
    private final x8c c;
    private final n9c d;
    private final lcc e;
    private final v0e f;
    private final y0e g;

    public ypc(u6c u6cVar, k8c k8cVar, x8c x8cVar, n9c n9cVar, lcc lccVar, v0e v0eVar, y0e y0eVar) {
        this.a = u6cVar;
        this.b = k8cVar;
        this.c = x8cVar;
        this.d = n9cVar;
        this.e = lccVar;
        this.f = v0eVar;
        this.g = y0eVar;
    }

    public final void a(cqc cqcVar) {
        ppc ppcVar;
        final k8c k8cVar = this.b;
        ppcVar = cqcVar.a;
        Objects.requireNonNull(k8cVar);
        ppcVar.a(this.a, this.c, this.d, this.e, new wq9() { // from class: xpc
            @Override // defpackage.wq9
            public final void zzg() {
                k8c.this.zzb();
            }
        });
        cqcVar.e(this.f, this.g);
    }
}
