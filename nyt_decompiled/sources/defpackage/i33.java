package defpackage;

import java.util.List;

/* loaded from: classes4.dex */
public final class i33 {
    private final List a;

    public i33(List list) {
        zq3.h(list, "greatReadsArticles");
        this.a = list;
    }

    public final List a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i33) && zq3.c(this.a, ((i33) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "GreatReadsViewState(greatReadsArticles=" + this.a + ")";
    }
}
