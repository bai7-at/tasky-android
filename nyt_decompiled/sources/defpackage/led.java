package defpackage;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class led implements i9d {
    private final Map a = new HashMap();
    private final msc b;

    public led(msc mscVar) {
        this.b = mscVar;
    }

    @Override // defpackage.i9d
    public final j9d a(String str, JSONObject jSONObject) {
        j9d j9dVar;
        synchronized (this) {
            try {
                j9dVar = (j9d) this.a.get(str);
                if (j9dVar == null) {
                    j9dVar = new j9d(this.b.c(str, jSONObject), new kbd(), str);
                    this.a.put(str, j9dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j9dVar;
    }
}
