package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ond implements fqd {
    public final Bundle a;

    public ond(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = f2e.a(bundle, "device");
        a.putBundle("android_mem_info", this.a);
        bundle.putBundle("device", a);
    }
}
