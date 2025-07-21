package defpackage;

import android.net.Uri;
import com.google.android.gms.internal.ads.zzgaa;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class wba {
    private String a;
    private Uri b;
    private final dda c = new dda();
    private final lla d = new lla(null);
    private final List e = Collections.emptyList();
    private final zzgaa f = zzgaa.t();
    private final vna g = new vna();
    private final dva h = dva.c;

    public final wba a(String str) {
        this.a = str;
        return this;
    }

    public final wba b(Uri uri) {
        this.b = uri;
        return this;
    }

    public final cza c() {
        rra rraVar;
        Uri uri = this.b;
        if (uri != null) {
            rraVar = new rra(uri, null, null, null, this.e, null, this.f, null, -9223372036854775807L, null);
        } else {
            rraVar = null;
        }
        String str = this.a;
        if (str == null) {
            str = "";
        }
        return new cza(str, new bha(this.c, null), rraVar, new moa(this.g), w5b.y, this.h, null);
    }
}
