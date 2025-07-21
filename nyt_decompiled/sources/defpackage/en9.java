package defpackage;

import android.content.Context;
import android.os.Debug;
import java.util.Map;
import kotlin.collections.t;

/* loaded from: classes.dex */
public final class en9 implements bo9 {
    private final Context a;
    private final String b;

    public en9(Context context, String str) {
        zq3.i(context, "context");
        zq3.i(str, "appVersion");
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.bo9
    public Map a() {
        return t.m(du8.a("a_debuggable", Boolean.valueOf((this.a.getApplicationInfo().flags & 2) != 0)), du8.a("a_debugger", Boolean.valueOf(Debug.isDebuggerConnected() || Debug.waitingForDebugger())), du8.a("a_debug", Boolean.FALSE), du8.a("ddv", "1.14.4"), du8.a("ddvv", this.b));
    }
}
