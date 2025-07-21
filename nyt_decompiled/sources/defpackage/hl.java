package defpackage;

import android.content.Context;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.PersistedEvents;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class hl {
    private final HashMap a = new HashMap();

    private final synchronized el7 e(AccessTokenAppIdPair accessTokenAppIdPair) {
        Context l;
        kv e;
        el7 el7Var = (el7) this.a.get(accessTokenAppIdPair);
        if (el7Var == null && (e = kv.f.e((l = w92.l()))) != null) {
            el7Var = new el7(e, AppEventsLogger.b.c(l));
        }
        if (el7Var == null) {
            return null;
        }
        this.a.put(accessTokenAppIdPair, el7Var);
        return el7Var;
    }

    public final synchronized void a(AccessTokenAppIdPair accessTokenAppIdPair, AppEvent appEvent) {
        zq3.h(accessTokenAppIdPair, "accessTokenAppIdPair");
        zq3.h(appEvent, "appEvent");
        el7 e = e(accessTokenAppIdPair);
        if (e != null) {
            e.a(appEvent);
        }
    }

    public final synchronized void b(PersistedEvents persistedEvents) {
        if (persistedEvents == null) {
            return;
        }
        for (Map.Entry entry : persistedEvents.b()) {
            el7 e = e((AccessTokenAppIdPair) entry.getKey());
            if (e != null) {
                Iterator it2 = ((List) entry.getValue()).iterator();
                while (it2.hasNext()) {
                    e.a((AppEvent) it2.next());
                }
            }
        }
    }

    public final synchronized el7 c(AccessTokenAppIdPair accessTokenAppIdPair) {
        zq3.h(accessTokenAppIdPair, "accessTokenAppIdPair");
        return (el7) this.a.get(accessTokenAppIdPair);
    }

    public final synchronized int d() {
        int i;
        Iterator it2 = this.a.values().iterator();
        i = 0;
        while (it2.hasNext()) {
            i += ((el7) it2.next()).c();
        }
        return i;
    }

    public final synchronized Set f() {
        Set keySet;
        keySet = this.a.keySet();
        zq3.g(keySet, "stateMap.keys");
        return keySet;
    }
}
