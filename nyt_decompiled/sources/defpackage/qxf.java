package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class qxf extends l1a {
    private final cvf c;

    public qxf(cvf cvfVar) {
        super("internal.logger");
        this.c = cvfVar;
        this.b.put("log", new uwf(this, false, true));
        this.b.put("silent", new pof(this, "silent"));
        ((l1a) this.b.get("silent")).Y("log", new uwf(this, true, true));
        this.b.put("unmonitored", new asf(this, "unmonitored"));
        ((l1a) this.b.get("unmonitored")).Y("log", new uwf(this, false, false));
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        return caa.T;
    }
}
