package defpackage;

import com.nytimes.android.assetretriever.e;
import org.threeten.bp.Instant;

/* loaded from: classes.dex */
public final class et {
    private final e a;
    private final Instant b;

    public et(e eVar, Instant instant) {
        zq3.h(eVar, "id");
        this.a = eVar;
        this.b = instant;
    }

    public final e a() {
        return this.a;
    }

    public final Instant b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return zq3.c(this.a, etVar.a) && zq3.c(this.b, etVar.b);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Instant instant = this.b;
        return hashCode + (instant == null ? 0 : instant.hashCode());
    }

    public String toString() {
        return "AssetRetrieverInput(id=" + this.a + ", lastModified=" + this.b + ")";
    }
}
