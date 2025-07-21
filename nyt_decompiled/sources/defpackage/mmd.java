package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
final class mmd implements fqd {
    private final String a;
    private final String b;
    private final Bundle c;

    /* synthetic */ mmd(String str, String str2, Bundle bundle, lmd lmdVar) {
        this.a = str;
        this.b = str2;
        this.c = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.a);
        bundle.putString("fc_consent", this.b);
        bundle.putBundle("iab_consent_info", this.c);
    }
}
