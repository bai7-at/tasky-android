package io.embrace.android.embracesdk.anr.sigquit;

import defpackage.zq3;
import io.embrace.android.embracesdk.logging.InternalEmbraceLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes5.dex */
public final class GoogleAnrTimestampRepository {
    private final ArrayList<Long> googleAnrTimestamps;
    private final InternalEmbraceLogger logger;

    public GoogleAnrTimestampRepository(InternalEmbraceLogger internalEmbraceLogger) {
        zq3.h(internalEmbraceLogger, "logger");
        this.logger = internalEmbraceLogger;
        this.googleAnrTimestamps = new ArrayList<>();
    }

    public final void add(long j) {
        if (this.googleAnrTimestamps.size() >= 50) {
            this.logger.log("The max number of Google ANR intervals has been reached. Ignoring this one.", InternalEmbraceLogger.Severity.WARNING, null, false);
        } else {
            this.googleAnrTimestamps.add(Long.valueOf(j));
        }
    }

    public final void clear() {
        this.googleAnrTimestamps.clear();
    }

    public final List<Long> getGoogleAnrTimestamps(long j, long j2) {
        synchronized (this) {
            long j3 = j - 5;
            long j4 = j2 + 5;
            ArrayList arrayList = new ArrayList();
            if (j3 > j4) {
                return i.l();
            }
            Iterator<Long> it2 = this.googleAnrTimestamps.iterator();
            while (it2.hasNext()) {
                Long next = it2.next();
                if (next.longValue() > j4) {
                    break;
                }
                if (next.longValue() >= j3) {
                    zq3.g(next, "value");
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
    }
}
