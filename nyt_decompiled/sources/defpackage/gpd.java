package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class gpd implements fqd {
    private final String a;
    private final Bundle b;

    public gpd(String str, Bundle bundle) {
        this.a = str;
        this.b = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.a);
        if (this.b.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", this.b);
    }
}
