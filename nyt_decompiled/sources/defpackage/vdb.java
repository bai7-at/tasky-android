package defpackage;

import android.content.Context;
import com.google.android.gms.common.util.Clock;

/* loaded from: classes3.dex */
final class vdb {
    private Context a;
    private Clock b;
    private hie c;
    private ceb d;

    /* synthetic */ vdb(rdb rdbVar) {
    }

    public final vdb a(hie hieVar) {
        this.c = hieVar;
        return this;
    }

    public final vdb b(Context context) {
        context.getClass();
        this.a = context;
        return this;
    }

    public final vdb c(Clock clock) {
        clock.getClass();
        this.b = clock;
        return this;
    }

    public final vdb d(ceb cebVar) {
        this.d = cebVar;
        return this;
    }

    public final deb e() {
        d4f.c(this.a, Context.class);
        d4f.c(this.b, Clock.class);
        d4f.c(this.c, hie.class);
        d4f.c(this.d, ceb.class);
        return new xdb(this.a, this.b, this.c, this.d, null);
    }
}
