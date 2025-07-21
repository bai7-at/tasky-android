package defpackage;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ote {
    private static final ote b = new ote();
    private final Map a = new HashMap();

    ote() {
    }

    public static ote b() {
        return b;
    }

    public final synchronized ple a(String str) {
        if (!this.a.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (ple) this.a.get("AES128_GCM");
    }

    public final synchronized void c(String str, ple pleVar) {
        try {
            if (!this.a.containsKey(str)) {
                this.a.put(str, pleVar);
                return;
            }
            if (((ple) this.a.get(str)).equals(pleVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.a.get(str)) + "), cannot insert " + String.valueOf(pleVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c((String) entry.getKey(), (ple) entry.getValue());
        }
    }
}
