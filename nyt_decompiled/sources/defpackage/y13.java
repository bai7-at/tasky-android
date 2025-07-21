package defpackage;

import android.content.SharedPreferences;
import com.chartbeat.androidsdk.QueryKeys;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class y13 implements x13 {
    public static final a Companion = new a(null);
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public y13(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "prefs");
        this.a = sharedPreferences;
    }

    private final String c(String str, String str2, String str3) {
        return "ProgramHeadersHolder_" + str + QueryKeys.END_MARKER + str3 + QueryKeys.END_MARKER + str2;
    }

    @Override // defpackage.x13
    public void a(String str, String str2, String str3) {
        zq3.h(str, "query");
        zq3.h(str2, "variables");
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(c("LAST_MODIFIED", str, str2), str3);
        edit.apply();
    }

    @Override // defpackage.x13
    public String b(String str, String str2) {
        zq3.h(str, "query");
        zq3.h(str2, "variables");
        return this.a.getString(c("LAST_MODIFIED", str, str2), null);
    }
}
