package defpackage;

import android.content.Context;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ivb implements oub {
    private final Context a;
    private final hie b = dyf.q().i();

    public ivb(Context context) {
        this.a = context;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        String str;
        if (map.isEmpty() || (str = (String) map.get("gad_idless")) == null) {
            return;
        }
        hie hieVar = this.b;
        boolean parseBoolean = Boolean.parseBoolean(str);
        hieVar.m(parseBoolean);
        if (parseBoolean) {
            wv9.c(this.a);
        }
    }
}
