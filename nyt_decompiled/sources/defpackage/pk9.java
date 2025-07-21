package defpackage;

import androidx.work.NetworkType;
import com.nytimes.android.utils.NetworkStatus;
import defpackage.gv0;

/* loaded from: classes4.dex */
public final class pk9 {
    private final p76 a;
    private final p76 b;
    private final NetworkStatus c;

    public pk9(p76 p76Var, p76 p76Var2, NetworkStatus networkStatus) {
        zq3.h(p76Var, "isWifiOnly");
        zq3.h(p76Var2, "isPTRUpdatedOnly");
        zq3.h(networkStatus, "networkStatus");
        this.a = p76Var;
        this.b = p76Var2;
        this.c = networkStatus;
    }

    public final void a() {
        Object obj = this.b.get();
        zq3.g(obj, "get(...)");
        if (((Boolean) obj).booleanValue()) {
            throw new Exception("skipped because user only wants to update via PTR");
        }
        Object obj2 = this.a.get();
        zq3.g(obj2, "get(...)");
        if (((Boolean) obj2).booleanValue() && !this.c.l()) {
            throw new Exception("skipped for lack of wifi");
        }
    }

    public final gv0 b() {
        gv0.a aVar = new gv0.a();
        Object obj = this.a.get();
        zq3.g(obj, "get(...)");
        return aVar.b(((Boolean) obj).booleanValue() ? NetworkType.UNMETERED : NetworkType.CONNECTED).a();
    }

    public final boolean c() {
        return !((Boolean) this.b.get()).booleanValue();
    }
}
