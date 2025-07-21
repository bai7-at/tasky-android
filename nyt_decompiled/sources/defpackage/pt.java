package defpackage;

import androidx.work.NetworkType;
import com.nytimes.android.assetretriever.AssetRetrieverWorker;
import com.nytimes.android.assetretriever.h;
import com.nytimes.android.logging.NYTLogger;
import defpackage.gv0;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class pt {
    private final h a;
    private final h05 b;

    public pt(h hVar, h05 h05Var) {
        zq3.h(hVar, "repository");
        zq3.h(h05Var, "jobScheduler");
        this.a = hVar;
        this.b = h05Var;
    }

    private final void a(long j) {
        this.b.e(AssetRetrieverWorker.class, "AssetRetriever", j, new gv0.a().b(NetworkType.CONNECTED).a());
    }

    public final Object b(by0 by0Var) {
        this.a.e();
        Instant p = this.a.p();
        if (p != null) {
            long epochMilli = p.toEpochMilli() - Instant.now().toEpochMilli();
            NYTLogger.d("Scheduling AssetRetrieverWorker to start in " + epochMilli + " milliseconds", new Object[0]);
            a(uo6.e(epochMilli, 0L));
        } else {
            NYTLogger.d("No assets to download found", new Object[0]);
        }
        return ww8.a;
    }
}
