package defpackage;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zuc {
    private final evc a;
    private final Executor b;
    private final Map c;

    public zuc(evc evcVar, Executor executor) {
        this.a = evcVar;
        this.c = evcVar.g();
        this.b = executor;
    }

    public final yuc a() {
        yuc yucVar = new yuc(this);
        yuc.a(yucVar);
        return yucVar;
    }

    public final void e() {
        if (((Boolean) pla.c().a(mpa.bb)).booleanValue()) {
            yuc a = a();
            a.b("action", "pecr");
            a.g();
        }
    }
}
