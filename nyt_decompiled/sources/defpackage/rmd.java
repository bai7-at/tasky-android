package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class rmd implements fqd {
    public final Bundle a;

    public rmd(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.a);
    }
}
