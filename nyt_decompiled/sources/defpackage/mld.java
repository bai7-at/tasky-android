package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class mld implements fqd {
    public final double a;
    public final boolean b;

    public mld(double d, boolean z) {
        this.a = d;
        this.b = z;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = f2e.a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = f2e.a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.b);
        a2.putDouble("battery_level", this.a);
    }
}
