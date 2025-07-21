package defpackage;

import java.util.Map;

/* loaded from: classes4.dex */
public final class h85 implements l32 {
    private final void g() {
        ul8.a.z("ET2").d("Noop-EventTracker is currently installed. Please install a real instance via EventTracker.install()", new Object[0]);
    }

    @Override // defpackage.l32
    public void a(e52 e52Var, Map map, String str, String str2, String str3, String str4, String str5) {
        zq3.h(e52Var, "subject");
        zq3.h(map, "data");
        zq3.h(str, "contextId");
        zq3.h(str3, "pageviewId");
        zq3.h(str5, "eventId");
        g();
    }

    @Override // defpackage.l32
    public void b() {
        g();
    }

    @Override // defpackage.l32
    public void c() {
    }

    @Override // defpackage.l32
    public void d() {
        g();
    }

    @Override // defpackage.l32
    public void e() {
        g();
    }

    @Override // defpackage.l32
    public void f() {
    }

    @Override // defpackage.l32
    public void flush() {
        g();
    }
}
