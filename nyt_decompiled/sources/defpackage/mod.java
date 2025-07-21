package defpackage;

import com.google.android.gms.internal.pal.h3;
import java.util.List;

/* loaded from: classes3.dex */
public final class mod extends h0e {
    private List i;

    public mod(ksc kscVar, String str, String str2, h3 h3Var, int i, int i2) {
        super(kscVar, "tPxcLkiesd8JzrYIyuRbLGxWAQfsX+C1jrJaS2rsRu6lU/ve1b9hEzSSzo6VwqXx", "0RWQk7vrKrAXtxwBYq7T9nI/JnUnK0yiZtx30+mk7/g=", h3Var, i, 31);
        this.i = null;
    }

    @Override // defpackage.h0e
    protected final void a() {
        this.e.P(-1L);
        this.e.K(-1L);
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, this.b.b());
        }
        List list = this.i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.e) {
            this.e.P(((Long) this.i.get(0)).longValue());
            this.e.K(((Long) this.i.get(1)).longValue());
        }
    }
}
