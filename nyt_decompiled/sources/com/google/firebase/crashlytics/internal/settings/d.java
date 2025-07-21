package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import defpackage.bc8;
import defpackage.c91;
import defpackage.cb3;
import defpackage.df3;
import defpackage.e41;
import defpackage.ie8;
import defpackage.m94;
import defpackage.og8;
import defpackage.pn7;
import defpackage.qg8;
import defpackage.tg0;
import defpackage.ue2;
import defpackage.vg8;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class d implements pn7 {
    private final Context a;
    private final g b;
    private final e c;
    private final e41 d;
    private final tg0 e;
    private final h f;
    private final c91 g;
    private final AtomicReference h;
    private final AtomicReference i;

    class a implements bc8 {
        a() {
        }

        @Override // defpackage.bc8
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public og8 then(Void r5) {
            JSONObject a = d.this.f.a(d.this.b, true);
            if (a != null) {
                c b = d.this.c.b(a);
                d.this.e.c(b.c, a);
                d.this.q(a, "Loaded settings: ");
                d dVar = d.this;
                dVar.r(dVar.b.f);
                d.this.h.set(b);
                ((qg8) d.this.i.get()).e(b);
            }
            return vg8.e(null);
        }
    }

    d(Context context, g gVar, e41 e41Var, e eVar, tg0 tg0Var, h hVar, c91 c91Var) {
        AtomicReference atomicReference = new AtomicReference();
        this.h = atomicReference;
        this.i = new AtomicReference(new qg8());
        this.a = context;
        this.b = gVar;
        this.d = e41Var;
        this.c = eVar;
        this.e = tg0Var;
        this.f = hVar;
        this.g = c91Var;
        atomicReference.set(com.google.firebase.crashlytics.internal.settings.a.b(e41Var));
    }

    public static d l(Context context, String str, df3 df3Var, cb3 cb3Var, String str2, String str3, ue2 ue2Var, c91 c91Var) {
        String g = df3Var.g();
        ie8 ie8Var = new ie8();
        return new d(context, new g(str, df3Var.h(), df3Var.i(), df3Var.j(), df3Var, CommonUtils.h(CommonUtils.n(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(g).getId()), ie8Var, new e(ie8Var), new tg0(ue2Var), new b(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), cb3Var), c91Var);
    }

    private c m(SettingsCacheBehavior settingsCacheBehavior) {
        c cVar = null;
        try {
            if (!SettingsCacheBehavior.SKIP_CACHE_LOOKUP.equals(settingsCacheBehavior)) {
                JSONObject b = this.e.b();
                if (b != null) {
                    c b2 = this.c.b(b);
                    if (b2 != null) {
                        q(b, "Loaded cached settings: ");
                        long a2 = this.d.a();
                        if (!SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION.equals(settingsCacheBehavior) && b2.a(a2)) {
                            m94.f().i("Cached settings have expired.");
                        }
                        try {
                            m94.f().i("Returning cached settings.");
                            cVar = b2;
                        } catch (Exception e) {
                            e = e;
                            cVar = b2;
                            m94.f().e("Failed to get cached settings", e);
                            return cVar;
                        }
                    } else {
                        m94.f().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    m94.f().b("No cached settings data found.");
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return cVar;
    }

    private String n() {
        return CommonUtils.r(this.a).getString("existing_instance_identifier", "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(JSONObject jSONObject, String str) {
        m94.f().b(str + jSONObject.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean r(String str) {
        SharedPreferences.Editor edit = CommonUtils.r(this.a).edit();
        edit.putString("existing_instance_identifier", str);
        edit.apply();
        return true;
    }

    @Override // defpackage.pn7
    public og8 a() {
        return ((qg8) this.i.get()).a();
    }

    @Override // defpackage.pn7
    public c b() {
        return (c) this.h.get();
    }

    boolean k() {
        return !n().equals(this.b.f);
    }

    public og8 o(SettingsCacheBehavior settingsCacheBehavior, Executor executor) {
        c m;
        if (!k() && (m = m(settingsCacheBehavior)) != null) {
            this.h.set(m);
            ((qg8) this.i.get()).e(m);
            return vg8.e(null);
        }
        c m2 = m(SettingsCacheBehavior.IGNORE_CACHE_EXPIRATION);
        if (m2 != null) {
            this.h.set(m2);
            ((qg8) this.i.get()).e(m2);
        }
        return this.g.h(executor).s(executor, new a());
    }

    public og8 p(Executor executor) {
        return o(SettingsCacheBehavior.USE_CACHE, executor);
    }
}
