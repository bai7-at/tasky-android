package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
final class ixa implements uxa {
    ixa() {
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        fgb.f("Received log message: ".concat(String.valueOf((String) map.get("string"))));
    }
}
