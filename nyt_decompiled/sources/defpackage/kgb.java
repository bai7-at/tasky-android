package defpackage;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
final class kgb extends ScheduledThreadPoolExecutor {
    kgb(int i, ThreadFactory threadFactory) {
        super(3, threadFactory);
    }
}
