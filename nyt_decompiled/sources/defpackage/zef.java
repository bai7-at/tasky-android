package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
final class zef extends l1a {
    final /* synthetic */ zkf c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zef(nhf nhfVar, String str, zkf zkfVar) {
        super("getValue");
        this.c = zkfVar;
    }

    @Override // defpackage.l1a
    public final caa b(xhe xheVar, List list) {
        s0f.h("getValue", 2, list);
        caa b = xheVar.b((caa) list.get(0));
        caa b2 = xheVar.b((caa) list.get(1));
        String a = this.c.a(b.zzi());
        return a != null ? new eda(a) : b2;
    }
}
