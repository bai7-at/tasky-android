package defpackage;

import com.datadog.opentracing.a;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public abstract class w1 implements z77 {
    protected Map a = new HashMap();

    protected abstract boolean a(a aVar);

    @Override // defpackage.z77
    public boolean b(a aVar) {
        for (Map.Entry entry : this.a.entrySet()) {
            Object obj = aVar.x().get(entry.getKey());
            if (obj != null) {
                if (((Pattern) entry.getValue()).matcher(String.valueOf(obj)).matches()) {
                    return false;
                }
            }
        }
        return a(aVar);
    }
}
