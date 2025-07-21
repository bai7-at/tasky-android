package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes3.dex */
public abstract class uud {
    /* JADX WARN: Multi-variable type inference failed */
    public static gqd a(vtd vtdVar, aod aodVar, ScheduledExecutorService scheduledExecutorService, int i) {
        if (i == 0) {
            vtdVar = aodVar;
        }
        return new iod(vtdVar, 0L, scheduledExecutorService);
    }

    public static gqd b(fud fudVar, ScheduledExecutorService scheduledExecutorService) {
        return new iod(fudVar, ((Long) pla.c().a(mpa.Z3)).longValue(), scheduledExecutorService);
    }

    public static gqd c(dvd dvdVar, ScheduledExecutorService scheduledExecutorService) {
        return new iod(dvdVar, 0L, scheduledExecutorService);
    }
}
