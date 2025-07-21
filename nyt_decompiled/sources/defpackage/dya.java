package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class dya implements n5g {
    boolean a = false;
    final /* synthetic */ boolean b;
    final /* synthetic */ jq9 c;
    final /* synthetic */ Map d;
    final /* synthetic */ Map e;

    dya(fya fyaVar, boolean z, jq9 jq9Var, Map map, Map map2) {
        this.b = z;
        this.c = jq9Var;
        this.d = map;
        this.e = map2;
    }

    @Override // defpackage.n5g
    public final void a(boolean z) {
        if (this.a) {
            return;
        }
        if (z && this.b) {
            ((bgc) this.c).zzs();
        }
        this.a = true;
        this.d.put((String) this.e.get("event_id"), Boolean.valueOf(z));
        ((d0b) this.c).t("openIntentAsync", this.d);
    }

    @Override // defpackage.n5g
    public final void zzb(int i) {
    }
}
