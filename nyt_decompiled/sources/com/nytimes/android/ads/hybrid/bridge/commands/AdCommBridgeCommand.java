package com.nytimes.android.ads.hybrid.bridge.commands;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import defpackage.b22;
import defpackage.by0;
import defpackage.ch9;
import defpackage.du8;
import defpackage.gt2;
import defpackage.hs1;
import defpackage.mc0;
import defpackage.nc0;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.collections.t;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AdCommBridgeCommand extends mc0 {
    public static final a Companion = new a(null);
    private final gt2 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AdCommActions {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ AdCommActions[] $VALUES;
        private final String action;
        public static final AdCommActions Expand = new AdCommActions("Expand", 0, "expand");
        public static final AdCommActions Collapse = new AdCommActions("Collapse", 1, "collapse");
        public static final AdCommActions Init = new AdCommActions("Init", 2, "features");
        public static final AdCommActions Undefined = new AdCommActions("Undefined", 3, "Undefined Action");

        private static final /* synthetic */ AdCommActions[] $values() {
            return new AdCommActions[]{Expand, Collapse, Init, Undefined};
        }

        static {
            AdCommActions[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AdCommActions(String str, int i, String str2) {
            this.action = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static AdCommActions valueOf(String str) {
            return (AdCommActions) Enum.valueOf(AdCommActions.class, str);
        }

        public static AdCommActions[] values() {
            return (AdCommActions[]) $VALUES.clone();
        }

        public final String getAction() {
            return this.action;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class AdCommFeatures {
        private static final /* synthetic */ b22 $ENTRIES;
        private static final /* synthetic */ AdCommFeatures[] $VALUES;
        public static final AdCommFeatures CLICK_IN = new AdCommFeatures("CLICK_IN", 0, "adClickIn");
        public static final AdCommFeatures EXPANSION = new AdCommFeatures("EXPANSION", 1, "adExpansion");
        private final String feature;

        private static final /* synthetic */ AdCommFeatures[] $values() {
            return new AdCommFeatures[]{CLICK_IN, EXPANSION};
        }

        static {
            AdCommFeatures[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
        }

        private AdCommFeatures(String str, int i, String str2) {
            this.feature = str2;
        }

        public static b22 getEntries() {
            return $ENTRIES;
        }

        public static AdCommFeatures valueOf(String str) {
            return (AdCommFeatures) Enum.valueOf(AdCommFeatures.class, str);
        }

        public static AdCommFeatures[] values() {
            return (AdCommFeatures[]) $VALUES.clone();
        }

        public final String getFeature() {
            return this.feature;
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AdCommActions.values().length];
            try {
                iArr[AdCommActions.Expand.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdCommActions.Collapse.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdCommActions.Init.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ AdCommBridgeCommand(gt2 gt2Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : gt2Var);
    }

    private final Pair c(WindowManager windowManager) {
        WindowMetrics currentWindowMetrics;
        Rect bounds;
        WindowMetrics currentWindowMetrics2;
        Rect bounds2;
        if (Build.VERSION.SDK_INT < 30) {
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            return new Pair(Integer.valueOf(point.x), Integer.valueOf(point.y));
        }
        currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        bounds = currentWindowMetrics.getBounds();
        Integer valueOf = Integer.valueOf(bounds.width());
        currentWindowMetrics2 = windowManager.getCurrentWindowMetrics();
        bounds2 = currentWindowMetrics2.getBounds();
        return new Pair(valueOf, Integer.valueOf(bounds2.height()));
    }

    private final Pair d(View view) {
        Pair a2;
        ch9 w = ch9.w(view.getRootWindowInsets(), view);
        zq3.g(w, "toWindowInsetsCompat(...)");
        Object systemService = view.getContext().getApplicationContext().getSystemService("window");
        zq3.f(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Pair c = c((WindowManager) systemService);
        int intValue = ((Number) c.a()).intValue();
        int intValue2 = ((Number) c.b()).intValue();
        hs1 e = w.e();
        if (e == null || (a2 = du8.a(Integer.valueOf(e.b() + e.c()), Integer.valueOf(e.d() + e.a()))) == null) {
            a2 = du8.a(0, 0);
        }
        return du8.a(Integer.valueOf(intValue - ((Number) a2.a()).intValue()), Integer.valueOf(intValue2 - ((Number) a2.b()).intValue()));
    }

    private final BridgeCommandResult e(int i, String str) {
        gt2 gt2Var = this.b;
        if (gt2Var != null) {
            gt2Var.invoke(Boolean.FALSE, null);
            BridgeCommandResult c = BridgeCommandResult.Companion.c(i, t.f(du8.a(AdCommActions.Collapse.getAction(), t.f(du8.a("div", str)))));
            if (c != null) {
                return c;
            }
        }
        return BridgeCommandResult.a.b(BridgeCommandResult.Companion, i, "Ad Collapse not supported.", null, 4, null);
    }

    private final BridgeCommandResult f(int i, WebView webView, String str) {
        float f = webView.getContext().getResources().getDisplayMetrics().density;
        Pair d = d(webView);
        int intValue = ((Number) d.a()).intValue();
        int intValue2 = ((Number) d.b()).intValue();
        gt2 gt2Var = this.b;
        if (gt2Var != null) {
            gt2Var.invoke(Boolean.TRUE, str);
            BridgeCommandResult c = BridgeCommandResult.Companion.c(i, t.f(du8.a(AdCommActions.Expand.getAction(), t.m(du8.a("div", str), du8.a("dimensions", t.m(du8.a("deviceWidth", Float.valueOf(intValue / f)), du8.a("deviceHeight", Float.valueOf(intValue2 / f))))))));
            if (c != null) {
                return c;
            }
        }
        return BridgeCommandResult.a.b(BridgeCommandResult.Companion, i, "Ad Expansion not supported.", null, 4, null);
    }

    private final BridgeCommandResult g(int i, String str) {
        List r = i.r(AdCommFeatures.CLICK_IN.getFeature());
        if (this.b != null) {
            r.add(AdCommFeatures.EXPANSION.getFeature());
        }
        return BridgeCommandResult.Companion.c(i, t.m(du8.a(AdCommActions.Init.getAction(), r), du8.a("div", str)));
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        Object obj;
        Map g = nc0Var.g("data");
        try {
            Iterator<E> it2 = AdCommActions.getEntries().iterator();
            while (true) {
                obj = null;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                String name = ((AdCommActions) next).name();
                Locale locale = Locale.ROOT;
                String lowerCase = name.toLowerCase(locale);
                zq3.g(lowerCase, "toLowerCase(...)");
                Object obj2 = g.get("action");
                String str = obj2 instanceof String ? (String) obj2 : null;
                if (str != null) {
                    obj = str.toLowerCase(locale);
                    zq3.g(obj, "toLowerCase(...)");
                }
                if (zq3.c(lowerCase, obj)) {
                    obj = next;
                    break;
                }
            }
            AdCommActions adCommActions = (AdCommActions) obj;
            if (adCommActions == null) {
                adCommActions = AdCommActions.Undefined;
            }
            Object obj3 = g.get("div");
            zq3.f(obj3, "null cannot be cast to non-null type kotlin.String");
            String str2 = (String) obj3;
            int i2 = b.a[adCommActions.ordinal()];
            return i2 != 1 ? i2 != 2 ? i2 != 3 ? BridgeCommandResult.a.b(BridgeCommandResult.Companion, i, AdCommActions.Undefined.getAction(), null, 4, null) : g(i, str2) : e(i, str2) : f(i, webView, str2);
        } catch (Exception e) {
            return BridgeCommandResult.a.b(BridgeCommandResult.Companion, i, e.getMessage(), null, 4, null);
        }
    }

    public AdCommBridgeCommand(gt2 gt2Var) {
        super("adComm");
        this.b = gt2Var;
    }
}
