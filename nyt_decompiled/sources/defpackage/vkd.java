package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class vkd implements fqd {
    final String a;
    final int b;

    public vkd(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a) || this.b == -1) {
            return;
        }
        Bundle a = f2e.a(bundle, "pii");
        bundle.putBundle("pii", a);
        a.putString("pvid", this.a);
        a.putInt("pvid_s", this.b);
    }
}
