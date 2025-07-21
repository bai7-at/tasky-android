package defpackage;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class uaf {
    private final xuf a;
    protected final b1f b;
    private final List c;

    protected uaf(xuf xufVar, Clock clock) {
        Preconditions.checkNotNull(xufVar);
        this.a = xufVar;
        this.c = new ArrayList();
        b1f b1fVar = new b1f(this, clock);
        b1fVar.a();
        this.b = b1fVar;
    }
}
