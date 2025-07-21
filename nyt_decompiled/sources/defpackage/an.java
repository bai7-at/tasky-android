package defpackage;

import com.nytimes.android.eventtracker.model.State;
import com.nytimes.android.eventtracker.state.AppStateObserver;

/* loaded from: classes4.dex */
public interface an {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final an a(AppStateObserver appStateObserver) {
            zq3.h(appStateObserver, "appLifecycleObserver");
            return new eg1(appStateObserver);
        }
    }

    State get();
}
