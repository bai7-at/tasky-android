package defpackage;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class mjd implements fqd {
    private final String a;

    public mjd(String str) {
        this.a = str;
    }

    @Override // defpackage.fqd
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        String str = this.a;
        Bundle bundle = (Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
