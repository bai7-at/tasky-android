package defpackage;

import org.threeten.bp.LocalDateTime;

/* loaded from: classes4.dex */
public final class is4 {
    private final LocalDateTime a;
    private final boolean b;

    public is4(LocalDateTime localDateTime, boolean z) {
        this.a = localDateTime;
        this.b = z;
    }

    public final LocalDateTime a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is4)) {
            return false;
        }
        is4 is4Var = (is4) obj;
        return zq3.c(this.a, is4Var.a) && this.b == is4Var.b;
    }

    public int hashCode() {
        LocalDateTime localDateTime = this.a;
        return ((localDateTime == null ? 0 : localDateTime.hashCode()) * 31) + Boolean.hashCode(this.b);
    }

    public String toString() {
        return "MessagingPreferences(lastMessageDateTime=" + this.a + ", overrideMessagesLocally=" + this.b + ")";
    }
}
