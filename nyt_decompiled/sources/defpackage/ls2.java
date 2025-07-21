package defpackage;

import android.app.Activity;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ls2 extends WebChromeClient {
    public static final a Companion = new a(null);
    public static final int f = 8;
    private final Activity a;
    private View b;
    private WebChromeClient.CustomViewCallback c;
    private int d;
    private int e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public ls2(Activity activity) {
        zq3.h(activity, "activity");
        this.a = activity;
    }

    private final int a() {
        return this.a.getRequestedOrientation();
    }

    private final FrameLayout b() {
        View decorView = this.a.getWindow().getDecorView();
        zq3.f(decorView, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) decorView;
    }

    private final int c() {
        return this.a.getWindow().getDecorView().getSystemUiVisibility();
    }

    private final void d(int i) {
        this.a.setRequestedOrientation(i);
    }

    private final void e(int i) {
        this.a.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    private final void f(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.b = view;
        this.e = c();
        this.d = a();
        this.c = customViewCallback;
        b().addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        e(3078);
    }

    @Override // android.webkit.WebChromeClient
    public void onHideCustomView() {
        b().removeView(this.b);
        e(this.e);
        d(this.d);
        WebChromeClient.CustomViewCallback customViewCallback = this.c;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
        }
        this.b = null;
        this.c = null;
    }

    @Override // android.webkit.WebChromeClient
    public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        if (this.b != null) {
            onHideCustomView();
        } else {
            f(view, customViewCallback);
        }
    }
}
