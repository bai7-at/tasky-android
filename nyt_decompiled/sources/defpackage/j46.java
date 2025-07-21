package defpackage;

import android.content.SharedPreferences;
import com.facebook.Profile;
import com.google.android.gms.common.Scopes;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j46 {
    public static final a b = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j46() {
        SharedPreferences sharedPreferences = w92.l().getSharedPreferences("com.facebook.AccessTokenManager.SharedPreferences", 0);
        zq3.g(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)");
        this.a = sharedPreferences;
    }

    public final void a() {
        this.a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    public final Profile b() {
        String string = this.a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(Profile profile) {
        zq3.h(profile, Scopes.PROFILE);
        JSONObject b2 = profile.b();
        if (b2 != null) {
            this.a.edit().putString("com.facebook.ProfileManager.CachedProfile", b2.toString()).apply();
        }
    }
}
