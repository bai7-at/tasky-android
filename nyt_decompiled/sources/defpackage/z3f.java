package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class z3f extends n3f {
    private static final e4f b = w3f.a(Collections.emptyMap());

    /* synthetic */ z3f(Map map, x3f x3fVar) {
        super(map);
    }

    public static y3f b(int i) {
        return new y3f(i, null);
    }

    @Override // defpackage.l4f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map zzb() {
        LinkedHashMap b2 = s3f.b(a().size());
        for (Map.Entry entry : a().entrySet()) {
            b2.put(entry.getKey(), ((e4f) entry.getValue()).zzb());
        }
        return Collections.unmodifiableMap(b2);
    }
}
