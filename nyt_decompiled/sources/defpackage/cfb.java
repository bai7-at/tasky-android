package defpackage;

import android.os.Bundle;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
final class cfb {
    private long a = -1;
    private long b = -1;
    final /* synthetic */ dfb c;

    public cfb(dfb dfbVar) {
        this.c = dfbVar;
    }

    public final long a() {
        return this.b;
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.a);
        bundle.putLong("tclose", this.b);
        return bundle;
    }

    public final void c() {
        Clock clock;
        clock = this.c.a;
        this.b = clock.elapsedRealtime();
    }

    public final void d() {
        Clock clock;
        clock = this.c.a;
        this.a = clock.elapsedRealtime();
    }
}
