package defpackage;

import com.nytimes.android.ads.hybrid.bridge.commands.AdCommBridgeCommand;
import com.nytimes.android.hybrid.bridge.JavascriptEventParameter;
import kotlin.collections.t;

/* loaded from: classes2.dex */
public abstract class x5 {
    public static final JavascriptEventParameter a(String str) {
        zq3.h(str, "div");
        return b(AdCommBridgeCommand.AdCommActions.Collapse, str);
    }

    private static final JavascriptEventParameter b(AdCommBridgeCommand.AdCommActions adCommActions, String str) {
        return new JavascriptEventParameter(-1, "adCommand", t.m(du8.a("action", adCommActions.getAction()), du8.a("div", str)));
    }
}
