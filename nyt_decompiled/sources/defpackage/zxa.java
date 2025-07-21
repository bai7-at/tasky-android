package defpackage;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zxa implements uxa {
    private final Context a;

    public zxa(Context context) {
        this.a = context;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        char c;
        if (dyf.p().p(this.a)) {
            String str = (String) map.get("eventName");
            String str2 = (String) map.get("eventId");
            int hashCode = str.hashCode();
            if (hashCode == 94399) {
                if (str.equals("_aa")) {
                    c = 2;
                }
                c = 65535;
            } else if (hashCode != 94401) {
                if (hashCode == 94407 && str.equals("_ai")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("_ac")) {
                    c = 0;
                }
                c = 65535;
            }
            if (c == 0) {
                dyf.p().j(this.a, str2);
            } else if (c == 1) {
                dyf.p().k(this.a, str2);
            } else if (c != 2) {
                fgb.d("logScionEvent gmsg contained unsupported eventName");
            } else {
                dyf.p().h(this.a, str2);
            }
        }
    }
}
