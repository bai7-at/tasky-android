package defpackage;

import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.libs.messagingarchitecture.model.Message;
import defpackage.e52;

/* loaded from: classes4.dex */
public final class ds4 {
    private final ET2Scope a;

    public ds4(ET2Scope eT2Scope) {
        zq3.h(eT2Scope, "et2Scope");
        this.a = eT2Scope;
    }

    private final void e(e52 e52Var, String str, String str2) {
        ET2PageScope.DefaultImpls.a(this.a, e52Var, new s42(str, str2, null, null, null, null, null, null, "messaging-architecture", 252, null), null, null, 12, null);
    }

    public final void a(Message message) {
        zq3.h(message, "message");
        ET2Scope eT2Scope = this.a;
        e52.e eVar = new e52.e();
        String h = message.h();
        if (h.length() == 0) {
            h = message.q();
        }
        String str = h;
        String i = message.i();
        ET2PageScope.DefaultImpls.a(eT2Scope, eVar, new s42("button tap", i.length() == 0 ? message.q() : i, str, null, null, null, null, null, "messaging-architecture", 248, null), null, null, 12, null);
    }

    public final void b(Message message) {
        zq3.h(message, "message");
        ET2Scope eT2Scope = this.a;
        e52.e eVar = new e52.e();
        String h = message.h();
        if (h.length() == 0) {
            h = message.q();
        }
        String str = h;
        String i = message.i();
        ET2PageScope.DefaultImpls.a(eT2Scope, eVar, new s42("x tap", i.length() == 0 ? message.q() : i, str, null, null, null, null, null, "messaging-architecture", 248, null), null, null, 12, null);
    }

    public final void c(Message message) {
        zq3.h(message, "message");
        e52.e eVar = new e52.e();
        String i = message.i();
        if (i.length() == 0) {
            i = message.q();
        }
        e(eVar, i, "close");
    }

    public final void d(Message message) {
        zq3.h(message, "message");
        e52.d dVar = new e52.d();
        String i = message.i();
        if (i.length() == 0) {
            i = message.q();
        }
        e(dVar, i, message.h());
    }
}
