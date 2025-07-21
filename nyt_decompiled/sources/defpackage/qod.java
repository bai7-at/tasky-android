package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class qod implements fqd {
    private final Bundle a;

    public qod(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundle2 = this.a;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }
}
