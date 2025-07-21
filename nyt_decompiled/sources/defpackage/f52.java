package defpackage;

import android.app.Application;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.coordinator.DefaultEventCoordinator;

/* loaded from: classes4.dex */
public interface f52 {

    public interface a {
        a a(Application application);

        a b(EventTracker.a aVar);

        f52 build();
    }

    void a(DefaultEventCoordinator defaultEventCoordinator);
}
