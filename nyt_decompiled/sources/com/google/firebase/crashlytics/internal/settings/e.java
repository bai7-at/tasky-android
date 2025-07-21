package com.google.firebase.crashlytics.internal.settings;

import defpackage.e41;
import defpackage.m94;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {
    private final e41 a;

    e(e41 e41Var) {
        this.a = e41Var;
    }

    private static f a(int i) {
        if (i == 3) {
            return new i();
        }
        m94.f().d("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new a();
    }

    public c b(JSONObject jSONObject) {
        return a(jSONObject.getInt("settings_version")).a(this.a, jSONObject);
    }
}
