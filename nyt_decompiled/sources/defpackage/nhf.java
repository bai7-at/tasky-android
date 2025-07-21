package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class nhf extends l1a {
    private final zkf c;

    public nhf(String str, zkf zkfVar) {
        super("internal.remoteConfig");
        this.c = zkfVar;
        this.b.put("getValue", new zef(this, "getValue", zkfVar));
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        return caa.T;
    }
}
