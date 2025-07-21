package defpackage;

import defpackage.d8;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class ru7 {
    private final d8 a;

    public ru7(d8 d8Var) {
        zq3.h(d8Var, "ad");
        this.a = d8Var;
    }

    public final d8 a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ru7) && zq3.c(this.a, ((ru7) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SlideshowAdState(ad=" + this.a + ")";
    }

    public /* synthetic */ ru7(d8 d8Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? d8.b.b : d8Var);
    }
}
