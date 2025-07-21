package defpackage;

import com.nytimes.android.eventtracker.model.Timestamp;
import java.util.Map;

/* loaded from: classes4.dex */
public final class sb6 {
    private final Timestamp a;
    private final e52 b;
    private final Map c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    public sb6(Timestamp timestamp, e52 e52Var, Map map, String str, String str2, String str3, String str4, String str5) {
        zq3.h(timestamp, "timestamp");
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        zq3.h(str, "contextId");
        zq3.h(str3, "pageviewId");
        zq3.h(str5, "eventId");
        this.a = timestamp;
        this.b = e52Var;
        this.c = map;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
    }

    public final String a() {
        return this.d;
    }

    public final Map b() {
        return this.c;
    }

    public final String c() {
        return this.h;
    }

    public final String d() {
        return this.e;
    }

    public final String e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb6)) {
            return false;
        }
        sb6 sb6Var = (sb6) obj;
        return zq3.c(this.a, sb6Var.a) && zq3.c(this.b, sb6Var.b) && zq3.c(this.c, sb6Var.c) && zq3.c(this.d, sb6Var.d) && zq3.c(this.e, sb6Var.e) && zq3.c(this.f, sb6Var.f) && zq3.c(this.g, sb6Var.g) && zq3.c(this.h, sb6Var.h);
    }

    public final String f() {
        return this.f;
    }

    public final e52 g() {
        return this.b;
    }

    public final Timestamp h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f.hashCode()) * 31;
        String str2 = this.g;
        return ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.h.hashCode();
    }

    public String toString() {
        return "QueuedEvent(timestamp=" + this.a + ", subject=" + this.b + ", data=" + this.c + ", contextId=" + this.d + ", lastContextId=" + this.e + ", pageviewId=" + this.f + ", lastPageviewId=" + this.g + ", eventId=" + this.h + ")";
    }
}
