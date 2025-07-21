package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class eq7 {
    private final String a;

    public eq7(String str) {
        zq3.h(str, "message");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eq7) && zq3.c(this.a, ((eq7) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "SharedTextClicked(message=" + this.a + ")";
    }

    public /* synthetic */ eq7(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "shareTextClicked" : str);
    }
}
