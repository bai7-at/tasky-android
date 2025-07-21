package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.eventtracker.model.Session;
import com.nytimes.android.eventtracker.model.Timestamp;

/* loaded from: classes4.dex */
public interface jl7 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final jl7 a(SharedPreferences sharedPreferences, long j) {
            zq3.h(sharedPreferences, "sharedPreferences");
            return new oj1(sharedPreferences, j);
        }
    }

    Session a(Timestamp timestamp);
}
