package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class r8f {
    private static final Set a = new HashSet(Arrays.asList("native", "unity"));
    private static final Map b = new HashMap();
    private static final n6f c = new n6f("PlayCoreVersion");

    public static Bundle a() {
        Bundle bundle = new Bundle();
        Map b2 = b();
        bundle.putInt("playcore_version_code", ((Integer) b2.get("java")).intValue());
        if (b2.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) b2.get("native")).intValue());
        }
        if (b2.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) b2.get("unity")).intValue());
        }
        return bundle;
    }

    public static synchronized Map b() {
        Map map;
        synchronized (r8f.class) {
            map = b;
            map.put("java", 11004);
        }
        return map;
    }
}
