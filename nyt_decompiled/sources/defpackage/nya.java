package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Map;

/* loaded from: classes3.dex */
public final class nya implements uxa {
    private final eyc a;

    public nya(eyc eycVar) {
        Preconditions.checkNotNull(eycVar, "The Inspector Manager must not be null");
        this.a = eycVar;
    }

    @Override // defpackage.uxa
    public final void a(Object obj, Map map) {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j = Long.parseLong((String) map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.a.i((String) map.get("extras"), j);
    }
}
