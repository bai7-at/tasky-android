package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class bza extends zaa {
    private final ugb m;
    private final egb n;

    public bza(String str, Map map, ugb ugbVar) {
        super(0, str, new oya(ugbVar));
        this.m = ugbVar;
        egb egbVar = new egb(null);
        this.n = egbVar;
        egbVar.d(str, "GET", null, null);
    }

    @Override // defpackage.zaa
    protected final dba g(qaa qaaVar) {
        return dba.b(qaaVar, rba.b(qaaVar));
    }

    @Override // defpackage.zaa
    protected final /* bridge */ /* synthetic */ void p(Object obj) {
        qaa qaaVar = (qaa) obj;
        this.n.f(qaaVar.c, qaaVar.a);
        byte[] bArr = qaaVar.b;
        if (egb.k() && bArr != null) {
            this.n.h(bArr);
        }
        this.m.c(qaaVar);
    }
}
