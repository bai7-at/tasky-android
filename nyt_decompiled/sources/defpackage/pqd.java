package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class pqd implements fqd {
    public final String a;
    public final int b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;

    public pqd(String str, int i, int i2, int i3, boolean z, int i4) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = z;
        this.f = i4;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        f2e.f(bundle, "carrier", this.a, !TextUtils.isEmpty(this.a));
        int i = this.b;
        f2e.e(bundle, "cnt", i, i != -2);
        bundle.putInt("gnt", this.c);
        bundle.putInt("pt", this.d);
        Bundle a = f2e.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = f2e.a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f);
        a2.putBoolean("active_network_metered", this.e);
    }
}
