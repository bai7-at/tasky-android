package defpackage;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class u8e extends x8e {
    private static final u8e d = new u8e();

    private u8e() {
    }

    public static u8e k() {
        return d;
    }

    @Override // defpackage.x8e
    public final void d(boolean z) {
        Iterator it2 = v8e.a().c().iterator();
        while (it2.hasNext()) {
            k9e g = ((n8e) it2.next()).g();
            if (g.l()) {
                d9e.a().b(g.a(), "setState", true != z ? "backgrounded" : "foregrounded");
            }
        }
    }

    @Override // defpackage.x8e
    public final boolean e() {
        Iterator it2 = v8e.a().b().iterator();
        while (it2.hasNext()) {
            View f = ((n8e) it2.next()).f();
            if (f != null && f.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
