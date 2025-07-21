package defpackage;

import android.content.SharedPreferences;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public class id3 {
    public static final a b = new a(null);
    public static final int c = 8;
    private final SharedPreferences a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public id3(SharedPreferences sharedPreferences) {
        zq3.h(sharedPreferences, "sharedPreferences");
        this.a = sharedPreferences;
    }

    public final boolean a() {
        String string = this.a.getString("kst", "none");
        return zq3.c("nyt-s", string) || zq3.c("google", string);
    }
}
