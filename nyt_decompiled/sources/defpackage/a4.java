package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;
import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class a4 {
    private final MessageProperties a;
    private final LocalDateTime b;

    public a4(MessageProperties messageProperties, LocalDateTime localDateTime) {
        zq3.h(messageProperties, "action");
        zq3.h(localDateTime, "timestamp");
        this.a = messageProperties;
        this.b = localDateTime;
    }

    public final MessageProperties a() {
        return this.a;
    }

    public final LocalDateTime b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return zq3.c(this.a, a4Var.a) && zq3.c(this.b, a4Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "ActionHistory(action=" + this.a + ", timestamp=" + this.b + ")";
    }
}
