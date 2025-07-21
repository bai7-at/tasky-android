package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class spd implements fqd {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final Long e;

    public spd(String str, String str2, String str3, String str4, Long l) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        f2e.c(bundle, "gmp_app_id", this.a);
        f2e.c(bundle, "fbs_aiid", this.b);
        f2e.c(bundle, "fbs_aeid", this.c);
        f2e.c(bundle, "apm_id_origin", this.d);
        Long l = this.e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
