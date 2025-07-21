package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class qub implements oub {
    private final hie a;

    public qub(hie hieVar) {
        this.a = hieVar;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        this.a.h(Boolean.parseBoolean((String) map.get("content_url_opted_out")));
    }
}
