package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.settings.c;
import defpackage.e41;
import org.json.JSONObject;

/* loaded from: classes3.dex */
class a implements f {
    a() {
    }

    static c b(e41 e41Var) {
        return new c(e41Var.a() + 3600000, new c.b(8, 4), new c.a(true, false), 0, 3600, 10.0d, 1.2d, 60);
    }

    @Override // com.google.firebase.crashlytics.internal.settings.f
    public c a(e41 e41Var, JSONObject jSONObject) {
        return b(e41Var);
    }
}
