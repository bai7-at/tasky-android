package defpackage;

import java.util.Objects;

/* loaded from: classes3.dex */
public final class kqc {
    private final u6c a;
    private final k8c b;
    private final x8c c;
    private final n9c d;
    private final lcc e;
    private final zfc f;

    kqc(u6c u6cVar, k8c k8cVar, x8c x8cVar, n9c n9cVar, lcc lccVar, zfc zfcVar) {
        this.a = u6cVar;
        this.b = k8cVar;
        this.c = x8cVar;
        this.d = n9cVar;
        this.e = lccVar;
        this.f = zfcVar;
    }

    public final void a(lqc lqcVar) {
        iqc iqcVar;
        final k8c k8cVar = this.b;
        iqcVar = lqcVar.a;
        Objects.requireNonNull(k8cVar);
        iqcVar.c(this.a, this.c, this.d, this.e, new wq9() { // from class: jqc
            @Override // defpackage.wq9
            public final void zzg() {
                k8c.this.zzb();
            }
        }, this.f);
    }
}
