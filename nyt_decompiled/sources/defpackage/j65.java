package defpackage;

import android.app.Application;
import android.content.SharedPreferences;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class j65 {
    public static final a Companion = new a(null);
    private final Application a;
    private final SharedPreferences b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j65(Application application, SharedPreferences sharedPreferences) {
        zq3.h(application, "application");
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = application;
        this.b = sharedPreferences;
    }

    public final void a() {
        int i;
        String string = this.b.getString("pref_chosen_theme", "-1");
        if (string != null) {
            int hashCode = string.hashCode();
            if (hashCode != 49) {
                if (hashCode == 50 && string.equals("2")) {
                    i = 2;
                }
            } else if (string.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE)) {
                i = 1;
            }
            mk.N(i);
        }
        i = -1;
        mk.N(i);
    }

    public final boolean b() {
        int o = mk.o();
        if (o != -1) {
            if (o == 2) {
                return true;
            }
        } else if ((this.a.getResources().getConfiguration().uiMode & 48) == 32) {
            return true;
        }
        return false;
    }
}
