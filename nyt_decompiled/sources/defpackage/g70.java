package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class g70 {
    private final String a;

    public g70(String str) {
        zq3.h(str, "contentUrl");
        this.a = str;
    }

    public final g70 a(String str) {
        zq3.h(str, "contentUrl");
        return new g70(str);
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g70) && zq3.c(this.a, ((g70) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "BestOfViewState(contentUrl=" + this.a + ")";
    }

    public /* synthetic */ g70(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
