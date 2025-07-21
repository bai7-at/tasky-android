package com.iteratehq.iterate.data.local;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iteratehq.iterate.model.StringToAnyMap;
import defpackage.as3;
import defpackage.c04;
import defpackage.qs2;
import defpackage.zq3;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes3.dex */
public final class DefaultIterateSharedPrefs implements as3 {
    private static final a c = new a(null);
    private final Context a;
    private final c04 b;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public DefaultIterateSharedPrefs(Context context, final boolean z) {
        zq3.h(context, "context");
        this.a = context;
        this.b = c.a(new qs2() { // from class: com.iteratehq.iterate.data.local.DefaultIterateSharedPrefs$prefs$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: invoke */
            public final SharedPreferences mo865invoke() {
                Context context2;
                Context context3;
                Context context4;
                if (!z) {
                    context2 = this.a;
                    return context2.getSharedPreferences("PlainIterateSharedPrefs", 0);
                }
                context3 = this.a;
                MasterKey a2 = new MasterKey.b(context3).c(MasterKey.KeyScheme.AES256_GCM).a();
                zq3.g(a2, "Builder(context)\n       …\n                .build()");
                context4 = this.a;
                return EncryptedSharedPreferences.a(context4, "EncryptedIterateSharedPrefs", a2, EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV, EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);
            }
        });
    }

    private final SharedPreferences d() {
        Object value = this.b.getValue();
        zq3.g(value, "<get-prefs>(...)");
        return (SharedPreferences) value;
    }

    @Override // defpackage.as3
    public void a(StringToAnyMap stringToAnyMap) {
        zq3.h(stringToAnyMap, "userTraits");
        d().edit().putString("USER_TRAITS", new Gson().toJson(stringToAnyMap)).apply();
    }

    @Override // defpackage.as3
    public StringToAnyMap c() {
        return (StringToAnyMap) new Gson().fromJson(d().getString("USER_TRAITS", ""), new TypeToken<StringToAnyMap>() { // from class: com.iteratehq.iterate.data.local.DefaultIterateSharedPrefs$getUserTraits$type$1
        }.getType());
    }

    @Override // defpackage.as3
    public void clear() {
        d().edit().clear().apply();
    }

    @Override // defpackage.as3
    public void e(long j) {
        d().edit().putLong("LAST_UPDATED", j).apply();
    }

    @Override // defpackage.as3
    public String g() {
        return d().getString("USER_AUTH_TOKEN", null);
    }

    @Override // defpackage.as3
    public void h(String str) {
        zq3.h(str, "userAuthToken");
        d().edit().putString("USER_AUTH_TOKEN", str).apply();
    }

    @Override // defpackage.as3
    public Long j() {
        if (d().contains("LAST_UPDATED")) {
            return Long.valueOf(d().getLong("LAST_UPDATED", -1L));
        }
        return null;
    }
}
