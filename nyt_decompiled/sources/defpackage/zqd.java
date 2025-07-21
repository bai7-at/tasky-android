package defpackage;

import android.os.Bundle;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class zqd implements fqd {
    final String a;
    final int b;

    /* synthetic */ zqd(String str, int i, yqd yqdVar) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) pla.c().a(mpa.U9)).booleanValue()) {
            if (!TextUtils.isEmpty(this.a)) {
                bundle.putString("topics", this.a);
            }
            int i = this.b;
            if (i != -1) {
                bundle.putInt("atps", i);
            }
        }
    }
}
