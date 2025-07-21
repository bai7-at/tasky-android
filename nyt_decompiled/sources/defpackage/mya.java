package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes3.dex */
public final class mya implements uxa {
    private final Context a;

    public mya(Context context) {
        this.a = context;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        if (!map.containsKey("text") || TextUtils.isEmpty((CharSequence) map.get("text"))) {
            return;
        }
        pzc.k("Opening Share Sheet with text: ".concat(String.valueOf((String) map.get("text"))));
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.TEXT", (String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (String) map.get("title"));
        }
        try {
            dyf.r();
            wxf.s(this.a, intent);
        } catch (RuntimeException e) {
            fgb.h("Failed to open Share Sheet", e);
            dyf.q().w(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
