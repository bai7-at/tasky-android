package defpackage;

import android.webkit.WebView;
import com.nytimes.android.eventtracker.EventTracker;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import defpackage.e52;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class nj7 extends mc0 {
    public static final a Companion = new a(null);
    private final PageContext b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj7(PageContext pageContext) {
        super("sendAnalytic");
        zq3.h(pageContext, "pageContext");
        this.b = pageContext;
    }

    private final Map c(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = c((Map) value);
            } else if (zq3.c(str, "config_ver") && (value instanceof Long)) {
                value = String.valueOf(((Number) value).longValue());
            }
            linkedHashMap.put(key, value);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (entry2.getValue() != null) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        return linkedHashMap2;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        Map i2;
        String j = nc0Var.j("eventName");
        Map h = nc0Var.h("options");
        if (h == null || (i2 = c(h)) == null) {
            i2 = t.i();
        }
        EventTracker.a.h(this.b, new e52.c(j), i2);
        return BridgeCommandResult.Companion.c(i, t.i());
    }
}
