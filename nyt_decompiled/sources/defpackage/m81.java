package defpackage;

import com.nytimes.android.coroutinesutils.ParallelDownloadStrategy;
import com.nytimes.android.dailyfive.domain.DailyFiveFeedStore;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes4.dex */
public final class m81 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private final DailyFiveFeedStore a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m81(DailyFiveFeedStore dailyFiveFeedStore) {
        zq3.h(dailyFiveFeedStore, "feedStore");
        this.a = dailyFiveFeedStore;
    }

    public final Flow a(ParallelDownloadStrategy parallelDownloadStrategy, sn2 sn2Var) {
        zq3.h(parallelDownloadStrategy, "strategy");
        return this.a.f(parallelDownloadStrategy, sn2Var);
    }
}
