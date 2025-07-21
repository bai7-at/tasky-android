package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class xod implements fqd {
    private final String a;
    private final String b;

    public xod(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) pla.c().a(mpa.W6)).booleanValue()) {
            bundle.putString("request_id", this.b);
        } else {
            bundle.putString("request_id", this.a);
        }
    }
}
