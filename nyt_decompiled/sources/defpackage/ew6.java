package defpackage;

import android.os.Bundle;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.ondeviceprocessing.RemoteServiceWrapper;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.List;
import kotlin.collections.i;
import org.json.JSONArray;

/* loaded from: classes2.dex */
public final class ew6 {
    public static final ew6 a = new ew6();
    private static final String b;

    static {
        String simpleName = RemoteServiceWrapper.class.getSimpleName();
        zq3.g(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        b = simpleName;
    }

    private ew6() {
    }

    public static final Bundle a(RemoteServiceWrapper.EventType eventType, String str, List list) {
        if (c11.d(ew6.class)) {
            return null;
        }
        try {
            zq3.h(eventType, "eventType");
            zq3.h(str, "applicationId");
            zq3.h(list, "appEvents");
            Bundle bundle = new Bundle();
            bundle.putString("event", eventType.toString());
            bundle.putString("app_id", str);
            if (RemoteServiceWrapper.EventType.CUSTOM_APP_EVENTS == eventType) {
                JSONArray b2 = a.b(list, str);
                if (b2.length() == 0) {
                    return null;
                }
                bundle.putString("custom_events", b2.toString());
            }
            return bundle;
        } catch (Throwable th) {
            c11.b(th, ew6.class);
            return null;
        }
    }

    private final JSONArray b(List list, String str) {
        if (c11.d(this)) {
            return null;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            List<AppEvent> a1 = i.a1(list);
            x32.d(a1);
            boolean c = c(str);
            for (AppEvent appEvent : a1) {
                if (appEvent.g()) {
                    if (appEvent.h()) {
                        if (appEvent.h() && c) {
                        }
                    }
                    jSONArray.put(appEvent.e());
                } else {
                    g29 g29Var = g29.a;
                    g29.f0(b, zq3.q("Event with invalid checksum: ", appEvent));
                }
            }
            return jSONArray;
        } catch (Throwable th) {
            c11.b(th, this);
            return null;
        }
    }

    private final boolean c(String str) {
        if (c11.d(this)) {
            return false;
        }
        try {
            rd2 n = FetchedAppSettingsManager.n(str, false);
            if (n != null) {
                return n.m();
            }
            return false;
        } catch (Throwable th) {
            c11.b(th, this);
            return false;
        }
    }
}
