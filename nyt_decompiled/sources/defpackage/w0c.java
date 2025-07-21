package defpackage;

import java.util.Map;

/* loaded from: classes3.dex */
public final class w0c implements x0c {
    private final Map a;

    w0c(Map map) {
        this.a = map;
    }

    @Override // defpackage.x0c
    public final g9d a(int i, String str) {
        return (g9d) this.a.get(str);
    }
}
