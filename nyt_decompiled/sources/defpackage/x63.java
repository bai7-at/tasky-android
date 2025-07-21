package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.Message;

/* loaded from: classes4.dex */
public final class x63 {
    private final Message a;
    private final qs2 b;

    public x63(Message message, qs2 qs2Var) {
        zq3.h(message, "message");
        zq3.h(qs2Var, "onShown");
        this.a = message;
        this.b = qs2Var;
    }

    public final Message a() {
        return this.a;
    }

    public final qs2 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x63)) {
            return false;
        }
        x63 x63Var = (x63) obj;
        return zq3.c(this.a, x63Var.a) && zq3.c(this.b, x63Var.b);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        return "HardcodedMessage(message=" + this.a + ", onShown=" + this.b + ")";
    }
}
