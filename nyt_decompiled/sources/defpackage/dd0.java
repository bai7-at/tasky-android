package defpackage;

import android.app.Application;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.api.EventTrackerApi;
import com.nytimes.android.eventtracker.buffer.EventFlushLifecycleObserver;
import com.nytimes.android.eventtracker.buffer.db.BufferedEventDatabase;
import com.nytimes.android.eventtracker.state.AppStateObserver;
import com.nytimes.android.eventtracker.worker.EventJobManagerLifecycleObserver;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class dd0 {
    public static final dd0 a = new dd0();

    private dd0() {
    }

    public final AppStateObserver a() {
        return new AppStateObserver(null, 1, null);
    }

    public final nd0 b(BufferedEventDatabase bufferedEventDatabase) {
        zq3.h(bufferedEventDatabase, "bufferedEventDatabase");
        return bufferedEventDatabase.d();
    }

    public final BufferedEventDatabase c(Application application) {
        zq3.h(application, "context");
        return BufferedEventDatabase.Companion.a(application);
    }

    public final g32 d(nd0 nd0Var) {
        zq3.h(nd0Var, "bufferedEventDao");
        return g32.Companion.a(nd0Var);
    }

    public final z32 e(Application application, EventTracker.a aVar) {
        zq3.h(application, "context");
        zq3.h(aVar, "configuration");
        return new fh1(application, aVar.a(), TimeUnit.MILLISECONDS);
    }

    public final c44 f(Application application) {
        zq3.h(application, "context");
        return new EventFlushLifecycleObserver(application);
    }

    public final c44 g() {
        return new EventJobManagerLifecycleObserver();
    }

    public final u42 h(EventTracker.a aVar, g32 g32Var, EventTrackerApi eventTrackerApi, n01 n01Var) {
        zq3.h(aVar, "configuration");
        zq3.h(g32Var, "eventBuffer");
        zq3.h(eventTrackerApi, "eventTrackerApi");
        zq3.h(n01Var, "coroutineDispatchers");
        return u42.Companion.a(aVar.b(), aVar.g(), g32Var, eventTrackerApi, n01Var);
    }
}
