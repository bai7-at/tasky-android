package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class ekd implements fqd {
    private final Bundle a;

    ekd(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.a.isEmpty()) {
            return;
        }
        bundle.putBundle("installed_adapter_data", this.a);
    }
}
