package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b1f {
    private final uaf a;
    private final Clock b;
    private long c;
    private long d;
    private boolean e;
    private final Map f;
    private final List g;

    b1f(uaf uafVar, Clock clock) {
        Preconditions.checkNotNull(uafVar);
        Preconditions.checkNotNull(clock);
        this.a = uafVar;
        this.b = clock;
        this.c = 1800000L;
        this.d = 3024000000L;
        this.f = new HashMap();
        this.g = new ArrayList();
    }

    final void a() {
        this.e = true;
    }
}
