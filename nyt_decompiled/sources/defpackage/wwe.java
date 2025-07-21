package defpackage;

/* loaded from: classes3.dex */
final class wwe implements ole {
    private final wle a;
    private final qxe b;
    private final qxe c;

    /* synthetic */ wwe(wle wleVar, vwe vweVar) {
        qxe qxeVar;
        this.a = wleVar;
        if (wleVar.f()) {
            rxe b = mte.a().b();
            xxe a = fte.a(wleVar);
            this.b = b.a(a, "mac", "compute");
            qxeVar = b.a(a, "mac", "verify");
        } else {
            qxeVar = fte.a;
            this.b = qxeVar;
        }
        this.c = qxeVar;
    }
}
