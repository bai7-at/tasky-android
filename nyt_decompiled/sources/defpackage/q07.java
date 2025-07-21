package defpackage;

import defpackage.yj;
import defpackage.yz8;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
final class q07 {
    private yz8 a = new yz8();
    private final UUID b;
    private yz8.c c;
    private final List d;

    public q07() {
        zq3.g("cfe392767b02581dc750bcdc8d9960bbdce2", "substring(...)");
        this.b = t29.b("cfe392767b02581dc750bcdc8d9960bbdce2");
        this.d = new ArrayList();
    }

    public final yj a() {
        return new yj.a(this.a, this.b, this.c).d(this.d).b();
    }

    public final q07 b(yz8.c cVar) {
        this.c = cVar;
        return this;
    }

    public final q07 c(String str) {
        zq3.h(str, "message");
        this.d.add(new q22(str, null, null, null, null));
        return this;
    }

    public final q07 d(yz8.i iVar) {
        return b(new yz8.c(iVar));
    }
}
