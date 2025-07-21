package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class gya implements uxa {
    private final yyc a;

    public gya(yyc yycVar) {
        this.a = yycVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        if (((Boolean) pla.c().a(mpa.l9)).booleanValue()) {
            String str = (String) map.get("action");
            String str2 = (String) map.get("adUnitId");
            String str3 = (String) map.get("redirectUrl");
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                return;
            }
            String str4 = (String) map.get("format");
            if (str.equals("load") && !TextUtils.isEmpty(str4)) {
                this.a.B6(str2, str4, str3);
            } else if (str.equals("show")) {
                this.a.C6(str2, str3);
            }
        }
    }
}
