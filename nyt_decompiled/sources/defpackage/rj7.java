package defpackage;

import android.webkit.WebView;
import com.nytimes.android.fragment.article.hybrid.SentryEvent;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class rj7 extends mc0 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    private final zj7 b;
    private final JsonAdapter c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj7(zj7 zj7Var) {
        super("sendSentryEvent");
        zq3.h(zj7Var, "sentryEventPerformanceTracker");
        this.b = zj7Var;
        i d2 = new i.b().d();
        zq3.g(d2, "build(...)");
        JsonAdapter c = d2.c(SentryEvent.class);
        zq3.g(c, "adapter(...)");
        this.c = c;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        SentryEvent sentryEvent = (SentryEvent) this.c.fromJson(nc0Var.j("sentryEvent"));
        if (sentryEvent != null) {
            this.b.l(sentryEvent.a(), sentryEvent.c(), sentryEvent.b(), sentryEvent.d(), sentryEvent.e(), sentryEvent.f());
        }
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
