package defpackage;

import com.nytimes.android.eventtracker.model.State;
import com.nytimes.android.eventtracker.state.AppStateObserver;

/* loaded from: classes4.dex */
public final class eg1 implements an {
    private final AppStateObserver a;

    public eg1(AppStateObserver appStateObserver) {
        zq3.h(appStateObserver, "appLifecycleObserver");
        this.a = appStateObserver;
    }

    @Override // defpackage.an
    public State get() {
        return new State(this.a.a());
    }
}
