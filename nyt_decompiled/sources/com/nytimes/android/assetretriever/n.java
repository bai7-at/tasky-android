package com.nytimes.android.assetretriever;

import com.nytimes.android.assetretriever.e;
import defpackage.zq3;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class n {
    private final e.b a;
    private final e.c b;
    private final Instant c;

    public n(e.b bVar, e.c cVar, Instant instant) {
        zq3.h(instant, "nextAttempt");
        this.a = bVar;
        this.b = cVar;
        this.c = instant;
    }

    public final e.b a() {
        return this.a;
    }

    public final e.c b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return zq3.c(this.a, nVar.a) && zq3.c(this.b, nVar.b) && zq3.c(this.c, nVar.c);
    }

    public int hashCode() {
        e.b bVar = this.a;
        int hashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        e.c cVar = this.b;
        return ((hashCode + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "OpenRequest(requestedUri=" + this.a + ", requestedUrl=" + this.b + ", nextAttempt=" + this.c + ")";
    }
}
