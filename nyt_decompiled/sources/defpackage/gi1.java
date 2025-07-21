package defpackage;

import com.datadog.opentracing.a;
import java.util.Map;

/* loaded from: classes2.dex */
public class gi1 implements g84 {
    private void b(Map map, a aVar) {
        if (map.get("error.object") instanceof Throwable) {
            aVar.C((Throwable) map.get("error.object"));
        } else if (map.get("message") instanceof String) {
            aVar.e("error.msg", (String) map.get("message"));
        }
    }

    @Override // defpackage.g84
    public void a(Map map, a aVar) {
        b(map, aVar);
    }
}
