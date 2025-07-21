package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.Message;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class lr4 {
    private final pg0 a;
    private final Message b;
    private final LocalDateTime c;

    public lr4(pg0 pg0Var, Message message, LocalDateTime localDateTime) {
        zq3.h(pg0Var, "messageHistory");
        zq3.h(localDateTime, "timestamp");
        this.a = pg0Var;
        this.b = message;
        this.c = localDateTime;
    }

    public final Message a() {
        return this.b;
    }

    public final pg0 b() {
        return this.a;
    }

    public final LocalDateTime c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr4)) {
            return false;
        }
        lr4 lr4Var = (lr4) obj;
        return zq3.c(this.a, lr4Var.a) && zq3.c(this.b, lr4Var.b) && zq3.c(this.c, lr4Var.c);
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Message message = this.b;
        return ((hashCode + (message == null ? 0 : message.hashCode())) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "MessageHistoryWrapper(messageHistory=" + this.a + ", message=" + this.b + ", timestamp=" + this.c + ")";
    }
}
