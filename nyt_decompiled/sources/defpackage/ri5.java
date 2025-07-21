package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class ri5 implements d32 {
    private final String a;
    private final Map b;

    public ri5(String str, Map map) {
        zq3.h(map, "payload");
        this.a = str;
        this.b = map;
    }

    public final Map a() {
        return this.b;
    }

    @Override // defpackage.d32
    public String getId() {
        return this.a;
    }
}
