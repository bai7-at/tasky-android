package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class mpd implements fqd {
    private final String a;

    public mpd(String str) {
        this.a = str;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (TextUtils.isEmpty(this.a)) {
            return;
        }
        bundle.putString("query_info", this.a);
    }
}
