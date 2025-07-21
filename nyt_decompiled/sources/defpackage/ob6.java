package defpackage;

import com.nytimes.android.libs.messagingarchitecture.model.MessageProperties;

/* loaded from: classes4.dex */
public final class ob6 {
    private final MessageProperties a;

    public ob6(MessageProperties messageProperties) {
        zq3.h(messageProperties, "action");
        this.a = messageProperties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ob6) && zq3.c(this.a, ((ob6) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "action completed '" + this.a.b() + " " + this.a.c() + "'";
    }
}
