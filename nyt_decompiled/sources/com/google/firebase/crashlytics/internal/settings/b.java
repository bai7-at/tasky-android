package com.google.firebase.crashlytics.internal.settings;

import android.text.TextUtils;
import defpackage.cb3;
import defpackage.eb3;
import defpackage.k11;
import defpackage.m94;
import defpackage.ta3;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import zendesk.core.Constants;

/* loaded from: classes3.dex */
class b implements h {
    private final String a;
    private final cb3 b;
    private final m94 c;

    public b(String str, cb3 cb3Var) {
        this(str, cb3Var, m94.f());
    }

    private ta3 b(ta3 ta3Var, g gVar) {
        c(ta3Var, "X-CRASHLYTICS-GOOGLE-APP-ID", gVar.a);
        c(ta3Var, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(ta3Var, "X-CRASHLYTICS-API-CLIENT-VERSION", k11.i());
        c(ta3Var, "Accept", Constants.APPLICATION_JSON);
        c(ta3Var, "X-CRASHLYTICS-DEVICE-MODEL", gVar.b);
        c(ta3Var, "X-CRASHLYTICS-OS-BUILD-VERSION", gVar.c);
        c(ta3Var, "X-CRASHLYTICS-OS-DISPLAY-VERSION", gVar.d);
        c(ta3Var, "X-CRASHLYTICS-INSTALLATION-ID", gVar.e.a());
        return ta3Var;
    }

    private void c(ta3 ta3Var, String str, String str2) {
        if (str2 != null) {
            ta3Var.d(str, str2);
        }
    }

    private JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e) {
            this.c.l("Failed to parse settings JSON from " + this.a, e);
            this.c.k("Settings response " + str);
            return null;
        }
    }

    private Map f(g gVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", gVar.h);
        hashMap.put("display_version", gVar.g);
        hashMap.put("source", Integer.toString(gVar.i));
        String str = gVar.f;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("instance", str);
        }
        return hashMap;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.h
    public JSONObject a(g gVar, boolean z) {
        if (!z) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map f = f(gVar);
            ta3 b = b(d(f), gVar);
            this.c.b("Requesting settings from " + this.a);
            this.c.i("Settings query params were: " + f);
            return g(b.c());
        } catch (IOException e) {
            this.c.e("Settings request failed.", e);
            return null;
        }
    }

    protected ta3 d(Map map) {
        return this.b.a(this.a, map).d("User-Agent", "Crashlytics Android SDK/" + k11.i()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    JSONObject g(eb3 eb3Var) {
        int b = eb3Var.b();
        this.c.i("Settings response code was: " + b);
        if (h(b)) {
            return e(eb3Var.a());
        }
        this.c.d("Settings request failed; (status: " + b + ") from " + this.a);
        return null;
    }

    boolean h(int i) {
        return i == 200 || i == 201 || i == 202 || i == 203;
    }

    b(String str, cb3 cb3Var, m94 m94Var) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.c = m94Var;
        this.b = cb3Var;
        this.a = str;
    }
}
