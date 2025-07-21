package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class k44 {
    private final String a;

    public k44(String str) {
        zq3.h(str, "contentUrl");
        this.a = str;
    }

    public final k44 a(String str) {
        zq3.h(str, "contentUrl");
        return new k44(str);
    }

    public final String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k44) && zq3.c(this.a, ((k44) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "LifestyleViewState(contentUrl=" + this.a + ")";
    }

    public /* synthetic */ k44(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
