package com.nytimes.android.poisonpill.di;

import android.app.Application;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.poisonpill.model.Pill;
import com.nytimes.android.poisonpill.model.PoisonPillFirebaseRemoteConfig;
import com.nytimes.android.poisonpill.view.PoisonPillOverlayViewImpl;
import com.nytimes.android.utils.DeviceUtils;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.cb2;
import defpackage.dz5;
import defpackage.ez5;
import defpackage.gt2;
import defpackage.jk;
import defpackage.jy5;
import defpackage.ky5;
import defpackage.ly5;
import defpackage.my5;
import defpackage.qs2;
import defpackage.qv6;
import defpackage.rp0;
import defpackage.sy3;
import defpackage.tl6;
import defpackage.ww8;
import defpackage.wy5;
import defpackage.xy5;
import defpackage.yy5;
import defpackage.zq3;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class PoisonPillModule {
    public static final PoisonPillModule a = new PoisonPillModule();

    private PoisonPillModule() {
    }

    public final rp0 a(Application application, cb2 cb2Var, SharedPreferences sharedPreferences) {
        String string;
        zq3.h(application, "application");
        zq3.h(cb2Var, "featureFlagUtil");
        zq3.h(sharedPreferences, "sharedPreferences");
        String u = DeviceUtils.u(application, false, false, 3, null);
        if (cb2Var.m() && (string = sharedPreferences.getString("poison_pill_version_override_key", null)) != null) {
            zq3.e(string);
            if (h.d0(string)) {
                string = u;
            }
            if (string != null) {
                u = string;
            }
        }
        return new rp0(u);
    }

    public final String b(Resources resources) {
        zq3.h(resources, "resources");
        String string = resources.getString(tl6.default_pill_copy);
        zq3.g(string, "getString(...)");
        return string;
    }

    public final ly5 c(qv6 qv6Var, JsonAdapter jsonAdapter, rp0 rp0Var) {
        zq3.h(qv6Var, "remoteConfig");
        zq3.h(jsonAdapter, "adapter");
        zq3.h(rp0Var, "appVersion");
        return new my5(qv6Var, jsonAdapter, rp0Var);
    }

    public final JsonAdapter d(i iVar) {
        zq3.h(iVar, "moshi");
        JsonAdapter c = iVar.c(Pill.class);
        zq3.g(c, "adapter(...)");
        return c;
    }

    public final jy5 e(ET2Scope eT2Scope, dz5 dz5Var, String str) {
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(dz5Var, "repo");
        zq3.h(str, "versionCode");
        return new ky5(eT2Scope, dz5Var, str);
    }

    public final wy5 f(dz5 dz5Var, String str, jy5 jy5Var) {
        zq3.h(dz5Var, "repo");
        zq3.h(str, "defaultCopy");
        zq3.h(jy5Var, "analytics");
        return new xy5(dz5Var, str, jy5Var, new qs2() { // from class: com.nytimes.android.poisonpill.di.PoisonPillModule$providePoisonPillOverlayPresenter$1
            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final yy5 mo865invoke() {
                return new PoisonPillOverlayViewImpl();
            }
        }, new gt2() { // from class: com.nytimes.android.poisonpill.di.PoisonPillModule$providePoisonPillOverlayPresenter$2
            public final void b(String str2, jk jkVar) {
                zq3.h(str2, "url");
                zq3.h(jkVar, "act");
                sy3.a(str2, jkVar);
            }

            @Override // defpackage.gt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                b((String) obj, (jk) obj2);
                return ww8.a;
            }
        });
    }

    public final dz5 g(ez5 ez5Var) {
        zq3.h(ez5Var, "impl");
        return ez5Var;
    }

    public final JsonAdapter h(i iVar) {
        zq3.h(iVar, "moshi");
        JsonAdapter c = iVar.c(PoisonPillFirebaseRemoteConfig.class);
        zq3.g(c, "adapter(...)");
        return c;
    }

    public final String i(Application application) {
        zq3.h(application, "application");
        return DeviceUtils.v(application);
    }
}
