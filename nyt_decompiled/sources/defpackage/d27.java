package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.nytimes.android.utils.DeviceUtils;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class d27 {
    public static final a Companion = new a(null);
    private final Application a;
    private final SharedPreferences b;
    private final boolean c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public d27(Application application, SharedPreferences sharedPreferences, boolean z) {
        zq3.h(application, "context");
        zq3.h(sharedPreferences, "prefs");
        this.a = application;
        this.b = sharedPreferences;
        this.c = z;
    }

    private final String a() {
        String uuid = UUID.randomUUID().toString();
        zq3.g(uuid, "toString(...)");
        return uuid;
    }

    public final String b() {
        String c;
        if (this.c) {
            c = "qa-" + a();
        } else {
            c = DeviceUtils.c(this.a);
            if (c == null) {
                c = a();
            }
        }
        String string = this.b.getString("key_rid", "");
        zq3.e(string);
        if (!zq3.c(string, "")) {
            return string;
        }
        SharedPreferences.Editor edit = this.b.edit();
        zq3.g(edit, "editor");
        edit.putString("key_rid", c);
        edit.apply();
        return c;
    }
}
