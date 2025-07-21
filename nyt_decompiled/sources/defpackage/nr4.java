package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.LegacyMessage;
import java.util.List;

/* loaded from: classes4.dex */
public final class nr4 {
    private final LegacyMessage a;
    private final List b;

    public nr4(LegacyMessage legacyMessage, List list) {
        zq3.h(legacyMessage, "message");
        zq3.h(list, "queueIssues");
        this.a = legacyMessage;
        this.b = list;
    }

    public final LegacyMessage a() {
        return this.a;
    }

    public final List b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nr4)) {
            return false;
        }
        nr4 nr4Var = (nr4) obj;
        return zq3.c(this.a, nr4Var.a) && zq3.c(this.b, nr4Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "MessageIssuesWrapper(message=" + this.a + ", queueIssues=" + this.b + ")";
    }
}
