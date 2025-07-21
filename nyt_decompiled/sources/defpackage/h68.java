package defpackage;

import android.content.SharedPreferences;
import android.webkit.CookieManager;
import androidx.preference.g;
import androidx.room.f;
import com.nytimes.android.subauth.core.api.client.NYTUser;
import com.nytimes.android.subauth.core.api.listeners.SubauthListenerManager;
import com.nytimes.android.subauth.core.auth.cookies.CookieMonster;
import com.nytimes.android.subauth.core.database.DatabaseManager;
import com.nytimes.android.subauth.core.database.SubauthDatabase;
import com.nytimes.android.subauth.core.di.DataStoreKt;
import com.nytimes.android.subauth.core.nytuser.NYTUserImpl;
import com.nytimes.android.subauth.core.purr.directive.PurrDirectiveOverrider;

/* loaded from: classes4.dex */
public final class h68 {
    public final ba1 a(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        return DataStoreKt.a(t68Var.j());
    }

    public final c05 b(t68 t68Var, DatabaseManager databaseManager, ba1 ba1Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(databaseManager, "databaseManager");
        zq3.h(ba1Var, "dataStore");
        SharedPreferences b = g.b(t68Var.j());
        CookieManager f = t68Var.f();
        zq3.e(b);
        return new CookieMonster(f, databaseManager, ba1Var, b, null, 16, null);
    }

    public final j86 c(DatabaseManager databaseManager) {
        zq3.h(databaseManager, "databaseManager");
        return databaseManager;
    }

    public final PurrDirectiveOverrider d(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        return new PurrDirectiveOverrider(t68Var.j(), null, 2, null);
    }

    public final o96 e(t68 t68Var, c05 c05Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(c05Var, "nytCookieProvider");
        SharedPreferences sharedPreferences = t68Var.getApplication().getSharedPreferences("com.nytimes.android.compliance.purr", 0);
        zq3.g(sharedPreferences, "getSharedPreferences(...)");
        SharedPreferences b = g.b(t68Var.j());
        zq3.g(b, "getDefaultSharedPreferences(...)");
        return new p96(sharedPreferences, b, c05Var);
    }

    public final SubauthDatabase f(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        return (SubauthDatabase) f.a(t68Var.getApplication(), SubauthDatabase.class, "subauth-database").g().d();
    }

    public final DatabaseManager g(SubauthDatabase subauthDatabase, NYTUserImpl nYTUserImpl) {
        zq3.h(subauthDatabase, "subauthDatabase");
        zq3.h(nYTUserImpl, "nytUserImpl");
        return new DatabaseManager(subauthDatabase, nYTUserImpl);
    }

    public final qz8 h(DatabaseManager databaseManager) {
        zq3.h(databaseManager, "databaseManager");
        return databaseManager;
    }

    public final NYTUser i(NYTUserImpl nYTUserImpl) {
        zq3.h(nYTUserImpl, "nytUserImpl");
        return nYTUserImpl;
    }

    public final NYTUserImpl j(t68 t68Var, f88 f88Var, SubauthListenerManager subauthListenerManager) {
        zq3.h(t68Var, "subauthDependencyProvider");
        zq3.h(f88Var, "subauthNYTUserDevSettingsOverrides");
        zq3.h(subauthListenerManager, "subauthListenerManager");
        return new NYTUserImpl(t68Var.i(), null, f88Var, subauthListenerManager, null, 18, null);
    }

    public final f88 k(t68 t68Var) {
        zq3.h(t68Var, "subauthDependencyProvider");
        SharedPreferences b = g.b(t68Var.j());
        zq3.e(b);
        return new f88(b);
    }
}
