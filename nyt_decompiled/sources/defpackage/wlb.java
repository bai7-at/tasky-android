package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;

/* loaded from: classes3.dex */
public interface wlb extends jq9, bgc, nlb, d0b, zmb, dnb, q0b, via, gnb, hdf, jnb, knb, wib, lnb {
    WebView A();

    j64 A0();

    k8e B();

    void B0(int i);

    void C(boolean z);

    Context D();

    void D0();

    void F0(v0e v0eVar, y0e y0eVar);

    void G(h hVar);

    h H();

    void I0(k8e k8eVar);

    boolean J();

    void J0(String str, String str2, String str3);

    void K0();

    void L(bta btaVar);

    void L0(boolean z);

    void M(boolean z);

    void P(boolean z);

    boolean S();

    void T();

    void U();

    void V();

    void W(boolean z);

    void Y(h hVar);

    void Z(int i);

    bta a0();

    v0e b();

    boolean b0(boolean z, int i);

    boolean canGoBack();

    tla d();

    void destroy();

    boolean e();

    void e0(String str, uxa uxaVar);

    String f();

    void f0();

    w1e g();

    void g0(Context context);

    @Override // defpackage.dnb, defpackage.wib
    Context getContext();

    int getHeight();

    ViewGroup.LayoutParams getLayoutParams();

    void getLocationOnScreen(int[] iArr);

    int getMeasuredHeight();

    int getMeasuredWidth();

    ViewParent getParent();

    int getWidth();

    void goBack();

    View h();

    void i();

    boolean isAttachedToWindow();

    y0e j();

    void loadData(String str, String str2, String str3);

    void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5);

    void loadUrl(String str);

    WebViewClient m();

    void m0(tla tlaVar);

    void measure(int i, int i2);

    void n0(String str, uxa uxaVar);

    boolean o();

    void o0(boolean z);

    void onPause();

    void onResume();

    boolean p();

    void p0(tsa tsaVar);

    void q();

    gfa r();

    void r0(boolean z);

    @Override // defpackage.wib
    void setBackgroundColor(int i);

    void setOnClickListener(View.OnClickListener onClickListener);

    void setOnTouchListener(View.OnTouchListener onTouchListener);

    void setWebChromeClient(WebChromeClient webChromeClient);

    void setWebViewClient(WebViewClient webViewClient);

    void t0(unb unbVar);

    h u();

    void v0(String str, Predicate predicate);

    void w(String str, mkb mkbVar);

    boolean y();

    void z(ymb ymbVar);

    onb zzN();

    unb zzO();

    Activity zzi();

    iq9 zzj();

    cqa zzm();

    zzcei zzn();

    ymb zzq();
}
