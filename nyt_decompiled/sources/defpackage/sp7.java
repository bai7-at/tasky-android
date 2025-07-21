package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class sp7 extends mc0 {
    public static final a c = new a(null);
    public static final int d = 8;
    private final Activity b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp7(Activity activity) {
        super("share");
        zq3.h(activity, "activity");
        this.b = activity;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        String j = nc0Var.j("url");
        String l = nc0Var.l("text");
        String l2 = nc0Var.l("title");
        this.b.startActivity(Intent.createChooser(gq7.b(j, l2, l), l2));
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
