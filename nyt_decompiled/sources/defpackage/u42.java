package defpackage;

import com.nytimes.android.eventtracker.api.EventTrackerApi;
import com.nytimes.android.eventtracker.buffer.DefaultEventReporter;

/* loaded from: classes4.dex */
public interface u42 {
    public static final a Companion = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final u42 a(long j, int i, g32 g32Var, EventTrackerApi eventTrackerApi, n01 n01Var) {
            zq3.h(g32Var, "eventBuffer");
            zq3.h(eventTrackerApi, "eventTrackerApi");
            zq3.h(n01Var, "coroutineDispatchers");
            return new DefaultEventReporter(j, i, g32Var, eventTrackerApi, n01Var);
        }
    }

    void a();
}
