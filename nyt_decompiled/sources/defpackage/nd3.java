package defpackage;

import android.app.Activity;
import android.webkit.WebView;
import com.nytimes.android.hybrid.bridge.BridgeCommandResult;
import com.nytimes.android.utils.ShareOrigin;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class nd3 extends mc0 {
    public static final a Companion = new a(null);
    public static final int d = 8;
    private final Activity b;
    private final uq7 c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd3(Activity activity, uq7 uq7Var) {
        super("share");
        zq3.h(activity, "activity");
        zq3.h(uq7Var, "sharingManager");
        this.b = activity;
        this.c = uq7Var;
    }

    @Override // defpackage.mc0
    public Object b(WebView webView, int i, nc0 nc0Var, by0 by0Var) {
        uq7.n(this.c, this.b, nc0Var.j("url"), nc0Var.l("text"), nc0Var.l("title"), ShareOrigin.PROGRAM_VIEW, null, null, null, null, false, null, null, 4064, null);
        return BridgeCommandResult.a.d(BridgeCommandResult.Companion, i, null, 2, null);
    }
}
