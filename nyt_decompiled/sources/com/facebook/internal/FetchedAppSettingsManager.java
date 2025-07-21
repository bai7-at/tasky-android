package com.facebook.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.facebook.GraphRequest;
import com.facebook.internal.FetchedAppSettingsManager;
import defpackage.dx8;
import defpackage.g29;
import defpackage.kz4;
import defpackage.m92;
import defpackage.qd2;
import defpackage.rd2;
import defpackage.s20;
import defpackage.sq3;
import defpackage.vu0;
import defpackage.w92;
import defpackage.z38;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.i;
import okhttp3.internal.http2.Http2;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class FetchedAppSettingsManager {
    public static final FetchedAppSettingsManager a = new FetchedAppSettingsManager();
    private static final String b;
    private static final List c;
    private static final Map d;
    private static final AtomicReference e;
    private static final ConcurrentLinkedQueue f;
    private static boolean g;
    private static JSONArray h;

    public enum FetchAppSettingState {
        NOT_LOADED,
        LOADING,
        SUCCESS,
        ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static FetchAppSettingState[] valuesCustom() {
            FetchAppSettingState[] valuesCustom = values();
            return (FetchAppSettingState[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public interface a {
        void a();

        void b(rd2 rd2Var);
    }

    static {
        String simpleName = FetchedAppSettingsManager.class.getSimpleName();
        zq3.g(simpleName, "FetchedAppSettingsManager::class.java.simpleName");
        b = simpleName;
        c = i.o("supports_implicit_sdk_logging", "gdpv4_nux_content", "gdpv4_nux_enabled", "android_dialog_configs", "android_sdk_error_categories", "app_events_session_timeout", "app_events_feature_bitmask", "auto_event_mapping_android", "seamless_login", "smart_login_bookmark_icon_url", "smart_login_menu_icon_url", "restrictive_data_filter_params", "aam_rules", "suggested_events_setting");
        d = new ConcurrentHashMap();
        e = new AtomicReference(FetchAppSettingState.NOT_LOADED);
        f = new ConcurrentLinkedQueue();
    }

    private FetchedAppSettingsManager() {
    }

    public static final void d(a aVar) {
        zq3.h(aVar, "callback");
        f.add(aVar);
        g();
    }

    private final JSONObject e(String str) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(c);
        bundle.putString("fields", TextUtils.join(",", arrayList));
        GraphRequest x = GraphRequest.n.x(null, "app", null);
        x.E(true);
        x.H(bundle);
        JSONObject d2 = x.k().d();
        return d2 == null ? new JSONObject() : d2;
    }

    public static final rd2 f(String str) {
        if (str != null) {
            return (rd2) d.get(str);
        }
        return null;
    }

    public static final void g() {
        final Context l = w92.l();
        final String m = w92.m();
        if (g29.Y(m)) {
            e.set(FetchAppSettingState.ERROR);
            a.k();
            return;
        }
        if (d.containsKey(m)) {
            e.set(FetchAppSettingState.SUCCESS);
            a.k();
            return;
        }
        AtomicReference atomicReference = e;
        FetchAppSettingState fetchAppSettingState = FetchAppSettingState.NOT_LOADED;
        FetchAppSettingState fetchAppSettingState2 = FetchAppSettingState.LOADING;
        if (!kz4.a(atomicReference, fetchAppSettingState, fetchAppSettingState2) && !kz4.a(atomicReference, FetchAppSettingState.ERROR, fetchAppSettingState2)) {
            a.k();
            return;
        }
        z38 z38Var = z38.a;
        final String format = String.format("com.facebook.internal.APP_SETTINGS.%s", Arrays.copyOf(new Object[]{m}, 1));
        zq3.g(format, "java.lang.String.format(format, *args)");
        w92.t().execute(new Runnable() { // from class: sd2
            @Override // java.lang.Runnable
            public final void run() {
                FetchedAppSettingsManager.h(l, format, m);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Context context, String str, String str2) {
        JSONObject jSONObject;
        zq3.h(context, "$context");
        zq3.h(str, "$settingsKey");
        zq3.h(str2, "$applicationId");
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.internal.preferences.APP_SETTINGS", 0);
        rd2 rd2Var = null;
        String string = sharedPreferences.getString(str, null);
        if (!g29.Y(string)) {
            if (string == null) {
                throw new IllegalStateException("Required value was null.");
            }
            try {
                jSONObject = new JSONObject(string);
            } catch (JSONException e2) {
                g29.e0("FacebookSDK", e2);
                jSONObject = null;
            }
            if (jSONObject != null) {
                rd2Var = a.i(str2, jSONObject);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = a;
        JSONObject e3 = fetchedAppSettingsManager.e(str2);
        if (e3 != null) {
            fetchedAppSettingsManager.i(str2, e3);
            sharedPreferences.edit().putString(str, e3.toString()).apply();
        }
        if (rd2Var != null) {
            String i = rd2Var.i();
            if (!g && i != null && i.length() > 0) {
                g = true;
                Log.w(b, i);
            }
        }
        qd2.m(str2, true);
        s20.d();
        e.set(d.containsKey(str2) ? FetchAppSettingState.SUCCESS : FetchAppSettingState.ERROR);
        fetchedAppSettingsManager.k();
    }

    private final Map j(JSONObject jSONObject) {
        JSONArray optJSONArray;
        int length;
        HashMap hashMap = new HashMap();
        if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("data")) != null && (length = optJSONArray.length()) > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                rd2.b.a aVar = rd2.b.e;
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                zq3.g(optJSONObject, "dialogConfigData.optJSONObject(i)");
                rd2.b a2 = aVar.a(optJSONObject);
                if (a2 != null) {
                    String a3 = a2.a();
                    Map map = (Map) hashMap.get(a3);
                    if (map == null) {
                        map = new HashMap();
                        hashMap.put(a3, map);
                    }
                    map.put(a2.b(), a2);
                }
                if (i2 >= length) {
                    break;
                }
                i = i2;
            }
        }
        return hashMap;
    }

    private final synchronized void k() {
        FetchAppSettingState fetchAppSettingState = (FetchAppSettingState) e.get();
        if (FetchAppSettingState.NOT_LOADED != fetchAppSettingState && FetchAppSettingState.LOADING != fetchAppSettingState) {
            final rd2 rd2Var = (rd2) d.get(w92.m());
            Handler handler = new Handler(Looper.getMainLooper());
            if (FetchAppSettingState.ERROR == fetchAppSettingState) {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue = f;
                    if (concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    final a aVar = (a) concurrentLinkedQueue.poll();
                    handler.post(new Runnable() { // from class: td2
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.l(FetchedAppSettingsManager.a.this);
                        }
                    });
                }
            } else {
                while (true) {
                    ConcurrentLinkedQueue concurrentLinkedQueue2 = f;
                    if (concurrentLinkedQueue2.isEmpty()) {
                        return;
                    }
                    final a aVar2 = (a) concurrentLinkedQueue2.poll();
                    handler.post(new Runnable() { // from class: ud2
                        @Override // java.lang.Runnable
                        public final void run() {
                            FetchedAppSettingsManager.m(FetchedAppSettingsManager.a.this, rd2Var);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(a aVar) {
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(a aVar, rd2 rd2Var) {
        aVar.b(rd2Var);
    }

    public static final rd2 n(String str, boolean z) {
        zq3.h(str, "applicationId");
        if (!z) {
            Map map = d;
            if (map.containsKey(str)) {
                return (rd2) map.get(str);
            }
        }
        FetchedAppSettingsManager fetchedAppSettingsManager = a;
        JSONObject e2 = fetchedAppSettingsManager.e(str);
        if (e2 == null) {
            return null;
        }
        rd2 i = fetchedAppSettingsManager.i(str, e2);
        if (zq3.c(str, w92.m())) {
            e.set(FetchAppSettingState.SUCCESS);
            fetchedAppSettingsManager.k();
        }
        return i;
    }

    public final rd2 i(String str, JSONObject jSONObject) {
        zq3.h(str, "applicationId");
        zq3.h(jSONObject, "settingsJSON");
        JSONArray optJSONArray = jSONObject.optJSONArray("android_sdk_error_categories");
        m92.a aVar = m92.g;
        m92 a2 = aVar.a(optJSONArray);
        if (a2 == null) {
            a2 = aVar.b();
        }
        m92 m92Var = a2;
        int optInt = jSONObject.optInt("app_events_feature_bitmask", 0);
        boolean z = (optInt & 8) != 0;
        boolean z2 = (optInt & 16) != 0;
        boolean z3 = (optInt & 32) != 0;
        boolean z4 = (optInt & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0;
        boolean z5 = (optInt & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("auto_event_mapping_android");
        h = optJSONArray2;
        if (optJSONArray2 != null && sq3.b()) {
            dx8 dx8Var = dx8.a;
            dx8.c(optJSONArray2 == null ? null : optJSONArray2.toString());
        }
        boolean optBoolean = jSONObject.optBoolean("supports_implicit_sdk_logging", false);
        String optString = jSONObject.optString("gdpv4_nux_content", "");
        zq3.g(optString, "settingsJSON.optString(APP_SETTING_NUX_CONTENT, \"\")");
        boolean optBoolean2 = jSONObject.optBoolean("gdpv4_nux_enabled", false);
        int optInt2 = jSONObject.optInt("app_events_session_timeout", vu0.a());
        EnumSet a3 = SmartLoginOption.Companion.a(jSONObject.optLong("seamless_login"));
        Map j = j(jSONObject.optJSONObject("android_dialog_configs"));
        String optString2 = jSONObject.optString("smart_login_bookmark_icon_url");
        zq3.g(optString2, "settingsJSON.optString(SMART_LOGIN_BOOKMARK_ICON_URL)");
        String optString3 = jSONObject.optString("smart_login_menu_icon_url");
        zq3.g(optString3, "settingsJSON.optString(SMART_LOGIN_MENU_ICON_URL)");
        String optString4 = jSONObject.optString("sdk_update_message");
        zq3.g(optString4, "settingsJSON.optString(SDK_UPDATE_MESSAGE)");
        rd2 rd2Var = new rd2(optBoolean, optString, optBoolean2, optInt2, a3, j, z, m92Var, optString2, optString3, z2, z3, optJSONArray2, optString4, z4, z5, jSONObject.optString("aam_rules"), jSONObject.optString("suggested_events_setting"), jSONObject.optString("restrictive_data_filter_params"));
        d.put(str, rd2Var);
        return rd2Var;
    }
}
