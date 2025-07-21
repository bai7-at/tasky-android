package defpackage;

import com.nytimes.android.logging.remote.models.Priority;
import kotlin.text.h;
import org.threeten.bp.Instant;
import org.threeten.bp.format.DateTimeFormatter;

/* loaded from: classes4.dex */
public final class b84 {
    private final Priority a;
    private final String b;
    private final Throwable c;

    public b84(Priority priority, String str, Throwable th) {
        zq3.h(priority, "priority");
        zq3.h(str, "message");
        this.a = priority;
        this.b = str;
        this.c = th;
    }

    public final String a() {
        DateTimeFormatter dateTimeFormatter;
        dateTimeFormatter = c84.a;
        return dateTimeFormatter.format(Instant.now()) + " -->";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b84)) {
            return false;
        }
        b84 b84Var = (b84) obj;
        return this.a == b84Var.a && zq3.c(this.b, b84Var.b) && zq3.c(this.c, b84Var.c);
    }

    public int hashCode() {
        int hashCode = ((this.a.hashCode() * 31) + this.b.hashCode()) * 31;
        Throwable th = this.c;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        String str;
        StackTraceElement[] stackTrace;
        String message;
        String a = a();
        String B = h.B(" ", a.length() + 1);
        str = "";
        if (this.b.length() == 0) {
            Throwable th = this.c;
            if (th != null && (message = th.getMessage()) != null) {
                str = message;
            }
        } else {
            Throwable th2 = this.c;
            if (th2 != null) {
                String str2 = this.b;
                String message2 = th2.getMessage();
                str = str2 + " : " + (message2 != null ? message2 : "") + " ";
            } else {
                str = this.b;
            }
        }
        StringBuilder sb = new StringBuilder(a + " " + this.a.getDisplayString() + ": " + str);
        sb.append("\n");
        Throwable th3 = this.c;
        if ((th3 != null) && th3 != null && (stackTrace = th3.getStackTrace()) != null) {
            zq3.e(stackTrace);
            for (StackTraceElement stackTraceElement : stackTrace) {
                sb.append(B + stackTraceElement);
                sb.append("\n");
            }
        }
        String sb2 = sb.toString();
        zq3.g(sb2, "toString(...)");
        return sb2;
    }
}
