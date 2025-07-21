package defpackage;

import android.content.res.Resources;
import com.nytimes.android.utils.AppPreferences;
import com.nytimes.android.utils.NetworkStatus;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class g00 {
    public static final a Companion = new a(null);
    private final AppPreferences a;
    private final NetworkStatus b;
    private final Resources c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g00(AppPreferences appPreferences, NetworkStatus networkStatus, Resources resources) {
        zq3.h(appPreferences, "appPreferences");
        zq3.h(networkStatus, "networkStatus");
        zq3.h(resources, "resources");
        this.a = appPreferences;
        this.b = networkStatus;
        this.c = resources;
    }

    public final String a(String str) {
        zq3.h(str, "prefValue");
        return c(str) + " Enabled";
    }

    public final String b() {
        String string = this.c.getString(jl6.autoplay_agnostic_value);
        zq3.g(string, "getString(...)");
        AppPreferences appPreferences = this.a;
        String string2 = this.c.getString(jl6.auto_play_video_settings_key);
        zq3.g(string2, "getString(...)");
        return c(appPreferences.l(string2, string));
    }

    public final String c(String str) {
        zq3.h(str, "prefValue");
        String string = this.c.getString(jl6.autoplay_agnostic_value_reporting);
        zq3.g(string, "getString(...)");
        String string2 = this.c.getString(jl6.autoplay_never_value);
        zq3.g(string2, "getString(...)");
        String string3 = this.c.getString(jl6.autoplay_wifi_only_value);
        zq3.g(string3, "getString(...)");
        if (h.w(str, string2, true)) {
            String string4 = this.c.getString(jl6.autoplay_never_value_reporting);
            zq3.g(string4, "getString(...)");
            return string4;
        }
        if (!h.w(str, string3, true)) {
            return string;
        }
        String string5 = this.c.getString(jl6.autoplay_wifi_only_value_reporting);
        zq3.g(string5, "getString(...)");
        return string5;
    }

    public final boolean d() {
        String string = this.c.getString(jl6.autoplay_never_value);
        zq3.g(string, "getString(...)");
        String string2 = this.c.getString(jl6.autoplay_wifi_only_value);
        zq3.g(string2, "getString(...)");
        AppPreferences appPreferences = this.a;
        String string3 = this.c.getString(jl6.auto_play_video_settings_key);
        zq3.g(string3, "getString(...)");
        String l = appPreferences.l(string3, this.c.getString(jl6.autoplay_default));
        if (h.w(l, string, true)) {
            return false;
        }
        if (h.w(l, string2, true)) {
            return this.b.j();
        }
        return true;
    }
}
