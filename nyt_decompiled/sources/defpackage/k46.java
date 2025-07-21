package defpackage;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class k46 {
    public static final k46 a = new k46();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();

    private k46() {
    }

    public static final JSONObject a(String str) {
        zq3.h(str, "accessToken");
        return (JSONObject) b.get(str);
    }

    public static final void b(String str, JSONObject jSONObject) {
        zq3.h(str, TransferTable.COLUMN_KEY);
        zq3.h(jSONObject, "value");
        b.put(str, jSONObject);
    }
}
