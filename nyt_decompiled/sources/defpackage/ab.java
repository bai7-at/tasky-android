package defpackage;

import android.content.SharedPreferences;
import com.nytimes.android.eventtracker.agent.DefaultAgentProvider;
import com.nytimes.android.eventtracker.model.Timestamp;
import java.util.Map;

/* loaded from: classes4.dex */
public interface ab {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final ab a(SharedPreferences sharedPreferences, boolean z, ss2 ss2Var, Map map) {
            zq3.h(sharedPreferences, "sharedPreferences");
            zq3.h(ss2Var, "agentId");
            return new DefaultAgentProvider(sharedPreferences, z, ss2Var, map);
        }
    }

    Object a(Timestamp timestamp, by0 by0Var);
}
