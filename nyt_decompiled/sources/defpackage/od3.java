package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.view.View;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.hybrid.HybridWebView;
import com.nytimes.android.hybrid.bridge.JavascriptEventParameter;
import com.nytimes.xwords.hybrid.GamesHybridManager;
import com.nytimes.xwords.hybrid.HybridSavedState;
import com.nytimes.xwords.hybrid.WebViewInitializer;
import java.util.Arrays;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class od3 extends HybridWebView {
    private WebViewInitializer d;
    private int e;
    private float f;
    private final CoroutineScope g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public od3(Context context) {
        super(context, null, 2, 0 == true ? 1 : 0);
        zq3.h(context, "context");
        this.g = CoroutineScopeKt.CoroutineScope(Dispatchers.getIO());
    }

    private final float d() {
        if (getContentHeight() == 0) {
            return 0.0f;
        }
        return (this.e - getTop()) / getContentHeight();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        WebViewInitializer webViewInitializer = this.d;
        if (webViewInitializer != null) {
            if (webViewInitializer == null) {
                zq3.z("webViewInitializer");
                webViewInitializer = null;
            }
            webViewInitializer.j();
        }
        super.destroy();
    }

    public final Object e(JavascriptEventParameter javascriptEventParameter, Class cls, by0 by0Var) {
        WebViewInitializer webViewInitializer = this.d;
        if (webViewInitializer == null) {
            zq3.z("webViewInitializer");
            webViewInitializer = null;
        }
        return webViewInitializer.k(javascriptEventParameter, cls, by0Var);
    }

    public final void f(WebViewInitializer webViewInitializer, String str, mc0... mc0VarArr) {
        zq3.h(webViewInitializer, "webViewInitializer");
        zq3.h(str, "userAgent");
        zq3.h(mc0VarArr, "extraCommands");
        this.d = webViewInitializer;
        webViewInitializer.g(this, str, (mc0[]) Arrays.copyOf(mc0VarArr, mc0VarArr.length));
        GamesHybridManager gamesHybridManager = GamesHybridManager.a;
        gamesHybridManager.c();
        gamesHybridManager.c();
    }

    public final void g(String str) {
        zq3.h(str, "htmlString");
        WebViewInitializer webViewInitializer = this.d;
        if (webViewInitializer == null) {
            zq3.z("webViewInitializer");
            webViewInitializer = null;
        }
        webViewInitializer.h(str);
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        zq3.h(str2, "data");
        super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        WebViewInitializer webViewInitializer = this.d;
        if (webViewInitializer != null) {
            if (webViewInitializer == null) {
                zq3.z("webViewInitializer");
                webViewInitializer = null;
            }
            webViewInitializer.i();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CoroutineScopeKt.cancel$default(this.g, null, 1, null);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        zq3.h(parcelable, TransferTable.COLUMN_STATE);
        HybridSavedState hybridSavedState = parcelable instanceof HybridSavedState ? (HybridSavedState) parcelable : null;
        this.f = hybridSavedState != null ? hybridSavedState.a() : 0.0f;
        super.onRestoreInstanceState(((View.BaseSavedState) parcelable).getSuperState());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        HybridSavedState hybridSavedState = new HybridSavedState(super.onSaveInstanceState());
        hybridSavedState.b(d());
        return hybridSavedState;
    }

    @Override // android.webkit.WebView, android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.e = i2;
    }
}
