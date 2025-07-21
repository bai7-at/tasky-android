package defpackage;

import android.content.SharedPreferences;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.cloudbridge.AppEventsConversionsAPITransformerWebRequests;
import com.facebook.appevents.cloudbridge.SettingsAPIFields;
import defpackage.k94;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i;
import kotlin.text.h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ul {
    public static final ul a = new ul();
    private static final String b = ul.class.getCanonicalName();
    private static boolean c;

    private ul() {
    }

    public static final void b() {
        try {
            GraphRequest graphRequest = new GraphRequest(null, zq3.q(w92.m(), "/cloudbridge_settings"), null, HttpMethod.GET, new GraphRequest.b() { // from class: tl
                @Override // com.facebook.GraphRequest.b
                public final void a(m23 m23Var) {
                    ul.c(m23Var);
                }
            }, null, 32, null);
            k94.a aVar = k94.e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(loggingBehavior, str, " \n\nCreating Graph Request: \n=============\n%s\n\n ", graphRequest);
            graphRequest.l();
        } catch (JSONException e) {
            k94.a aVar2 = k94.e;
            LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
            String str2 = b;
            if (str2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar2.c(loggingBehavior2, str2, " \n\nGraph Request Exception: \n=============\n%s\n\n ", g62.b(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(m23 m23Var) {
        zq3.h(m23Var, "response");
        a.d(m23Var);
    }

    public static final Map e() {
        if (c11.d(ul.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
            if (sharedPreferences == null) {
                return null;
            }
            SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
            String string = sharedPreferences.getString(settingsAPIFields.getRawValue(), null);
            SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
            String string2 = sharedPreferences.getString(settingsAPIFields2.getRawValue(), null);
            SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
            String string3 = sharedPreferences.getString(settingsAPIFields3.getRawValue(), null);
            if (string != null && !h.d0(string) && string2 != null && !h.d0(string2) && string3 != null && !h.d0(string3)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put(settingsAPIFields2.getRawValue(), string2);
                linkedHashMap.put(settingsAPIFields.getRawValue(), string);
                linkedHashMap.put(settingsAPIFields3.getRawValue(), string3);
                k94.e.c(LoggingBehavior.APP_EVENTS, String.valueOf(b), " \n\nLoading Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", string, string2, string3);
                return linkedHashMap;
            }
            return null;
        } catch (Throwable th) {
            c11.b(th, ul.class);
            return null;
        }
    }

    public final void d(m23 m23Var) {
        boolean z;
        zq3.h(m23Var, "response");
        if (m23Var.b() != null) {
            k94.a aVar = k94.e;
            LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
            String str = b;
            if (str == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            aVar.c(loggingBehavior, str, " \n\nGraph Response Error: \n================\nResponse Error: %s\nResponse Error Exception: %s\n\n ", m23Var.b().toString(), String.valueOf(m23Var.b().e()));
            Map e = e();
            if (e != null) {
                URL url = new URL(String.valueOf(e.get(SettingsAPIFields.URL.getRawValue())));
                AppEventsConversionsAPITransformerWebRequests appEventsConversionsAPITransformerWebRequests = AppEventsConversionsAPITransformerWebRequests.a;
                AppEventsConversionsAPITransformerWebRequests.d(String.valueOf(e.get(SettingsAPIFields.DATASETID.getRawValue())), url.getProtocol() + "://" + ((Object) url.getHost()), String.valueOf(e.get(SettingsAPIFields.ACCESSKEY.getRawValue())));
                c = true;
                return;
            }
            return;
        }
        k94.a aVar2 = k94.e;
        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
        String str2 = b;
        if (str2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        aVar2.c(loggingBehavior2, str2, " \n\nGraph Response Received: \n================\n%s\n\n ", m23Var);
        JSONObject c2 = m23Var.c();
        try {
            g29 g29Var = g29.a;
            Object obj = c2 == null ? null : c2.get("data");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
            }
            Map n = g29.n(new JSONObject((String) i.k0(g29.m((JSONArray) obj))));
            String str3 = (String) n.get(SettingsAPIFields.URL.getRawValue());
            String str4 = (String) n.get(SettingsAPIFields.DATASETID.getRawValue());
            String str5 = (String) n.get(SettingsAPIFields.ACCESSKEY.getRawValue());
            if (str3 == null || str4 == null || str5 == null) {
                aVar2.b(loggingBehavior2, str2, "CloudBridge Settings API response doesn't have valid data");
                return;
            }
            try {
                AppEventsConversionsAPITransformerWebRequests.d(str4, str3, str5);
                g(n);
                SettingsAPIFields settingsAPIFields = SettingsAPIFields.ENABLED;
                if (n.get(settingsAPIFields.getRawValue()) != null) {
                    Object obj2 = n.get(settingsAPIFields.getRawValue());
                    if (obj2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                    }
                    z = ((Boolean) obj2).booleanValue();
                } else {
                    z = false;
                }
                c = z;
            } catch (MalformedURLException e2) {
                k94.e.c(LoggingBehavior.APP_EVENTS, b, "CloudBridge Settings API response doesn't have valid url\n %s ", g62.b(e2));
            }
        } catch (NullPointerException e3) {
            k94.e.c(LoggingBehavior.APP_EVENTS, b, "CloudBridge Settings API response is not a valid json: \n%s ", g62.b(e3));
        } catch (JSONException e4) {
            k94.e.c(LoggingBehavior.APP_EVENTS, b, "CloudBridge Settings API response is not a valid json: \n%s ", g62.b(e4));
        }
    }

    public final boolean f() {
        return c;
    }

    public final void g(Map map) {
        SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.sdk.CloudBridgeSavedCredentials", 0);
        if (sharedPreferences == null) {
            return;
        }
        if (map == null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.apply();
            return;
        }
        SettingsAPIFields settingsAPIFields = SettingsAPIFields.DATASETID;
        Object obj = map.get(settingsAPIFields.getRawValue());
        SettingsAPIFields settingsAPIFields2 = SettingsAPIFields.URL;
        Object obj2 = map.get(settingsAPIFields2.getRawValue());
        SettingsAPIFields settingsAPIFields3 = SettingsAPIFields.ACCESSKEY;
        Object obj3 = map.get(settingsAPIFields3.getRawValue());
        if (obj == null || obj2 == null || obj3 == null) {
            return;
        }
        SharedPreferences.Editor edit2 = sharedPreferences.edit();
        edit2.putString(settingsAPIFields.getRawValue(), obj.toString());
        edit2.putString(settingsAPIFields2.getRawValue(), obj2.toString());
        edit2.putString(settingsAPIFields3.getRawValue(), obj3.toString());
        edit2.apply();
        k94.e.c(LoggingBehavior.APP_EVENTS, String.valueOf(b), " \n\nSaving Cloudbridge settings from saved Prefs: \n================\n DATASETID: %s\n URL: %s \n ACCESSKEY: %s \n\n ", obj, obj2, obj3);
    }
}
