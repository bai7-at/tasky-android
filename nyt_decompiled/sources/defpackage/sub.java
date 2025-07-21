package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class sub implements oub {
    private final hie a;

    public sub(hie hieVar) {
        this.a = hieVar;
    }

    @Override // defpackage.oub
    public final void a(Map map) {
        this.a.x(Boolean.parseBoolean((String) map.get("content_vertical_opted_out")));
    }
}
