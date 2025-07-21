package com.nytimes.android.home.ui.hybrid;

import android.webkit.WebView;
import com.nytimes.android.abra.AbraManager;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.nytimes.android.logging.NYTLogger;
import defpackage.by0;
import defpackage.du8;
import defpackage.e52;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.qs2;
import defpackage.tx1;
import defpackage.ue4;
import defpackage.zq3;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ET2ScopeCommand extends mc0 {
    public static final a Companion = new a(null);
    public static final int e = 8;
    private final ET2Scope b;
    private final AbraManager c;
    private final DestinationTabState d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ET2ScopeCommand(ET2Scope eT2Scope, AbraManager abraManager, DestinationTabState destinationTabState) {
        super("sendAnalytic");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(abraManager, "abraManager");
        zq3.h(destinationTabState, "homeTabState");
        this.b = eT2Scope;
        this.c = abraManager;
        this.d = destinationTabState;
    }

    private final e52.c c(nc0 nc0Var) {
        return new e52.c(nc0Var.j("eventName"));
    }

    private final ue4 d(Map map) {
        Pair[] pairArr = (Pair[]) t.z(map).toArray(new Pair[0]);
        return new ue4((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }

    private final void e(String str) {
        tx1 c = this.b.c();
        PageContext i = c != null ? c.i() : null;
        if (i != null) {
            this.c.exposeTest(str, t.f(du8.a("pageContext", i)));
        } else {
            NYTLogger.g("error sending expose event for hybrid data", du8.a("testName", str));
        }
    }

    private final Map f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(t.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = f((Map) value);
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
        Map h = nc0Var.h("options");
        if (h == null || (i2 = f(h)) == null) {
            i2 = t.i();
        }
        e52.c c = c(nc0Var);
        final ue4 d = d(i2);
        if (!this.d.e()) {
            this.d.a(c, d);
            return BridgeCommandResult.Companion.c(i, t.i());
        }
        this.d.g();
        String j = nc0Var.j("eventName");
        String str = (String) i2.get("test");
        if (zq3.c(j, "ab_expose") && zq3.c(str, "STYLN_synth_voice_app_android")) {
            e(str);
        } else {
            ET2PageScope.DefaultImpls.a(this.b, c, null, null, new qs2() { // from class: com.nytimes.android.home.ui.hybrid.ET2ScopeCommand$run$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final ue4 mo865invoke() {
                    return ue4.this;
                }
            }, 6, null);
        }
        return BridgeCommandResult.Companion.c(i, t.i());
    }
}
