package defpackage;

import defpackage.eb7;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes5.dex */
public final class q55 extends eb7 {
    private final ThreadFactory b;

    public q55(ThreadFactory threadFactory) {
        this.b = threadFactory;
    }

    @Override // defpackage.eb7
    public eb7.a a() {
        return new r55(this.b);
    }
}
