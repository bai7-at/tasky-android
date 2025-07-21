package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.android.gms.ads.internal.overlay.h;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzcei;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class qmb extends FrameLayout implements wlb {
    private final wlb a;
    private final lib b;
    private final AtomicBoolean c;

    /* JADX WARN: Multi-variable type inference failed */
    public qmb(wlb wlbVar) {
        super(wlbVar.getContext());
        this.c = new AtomicBoolean();
        this.a = wlbVar;
        this.b = new lib(wlbVar.D(), this, this);
        addView((View) wlbVar);
    }

    @Override // defpackage.wlb
    public final WebView A() {
        return (WebView) this.a;
    }

    @Override // defpackage.wlb
    public final j64 A0() {
        return this.a.A0();
    }

    @Override // defpackage.wlb
    public final k8e B() {
        return this.a.B();
    }

    @Override // defpackage.wlb
    public final void B0(int i) {
        this.a.B0(i);
    }

    @Override // defpackage.wlb
    public final void C(boolean z) {
        this.a.C(z);
    }

    @Override // defpackage.gnb
    public final void C0(boolean z, int i, boolean z2) {
        this.a.C0(z, i, z2);
    }

    @Override // defpackage.wlb
    public final Context D() {
        return this.a.D();
    }

    @Override // defpackage.wlb
    public final void D0() {
        this.a.D0();
    }

    @Override // defpackage.wib
    public final mkb E(String str) {
        return this.a.E(str);
    }

    @Override // defpackage.wib
    public final void F(int i) {
        this.b.g(i);
    }

    @Override // defpackage.wlb
    public final void F0(v0e v0eVar, y0e y0eVar) {
        this.a.F0(v0eVar, y0eVar);
    }

    @Override // defpackage.wlb
    public final void G(h hVar) {
        this.a.G(hVar);
    }

    @Override // defpackage.gnb
    public final void G0(boolean z, int i, String str, String str2, boolean z2) {
        this.a.G0(z, i, str, str2, z2);
    }

    @Override // defpackage.wlb
    public final h H() {
        return this.a.H();
    }

    @Override // defpackage.wib
    public final void I(int i) {
        this.a.I(i);
    }

    @Override // defpackage.wlb
    public final void I0(k8e k8eVar) {
        this.a.I0(k8eVar);
    }

    @Override // defpackage.wlb
    public final boolean J() {
        return this.a.J();
    }

    @Override // defpackage.wlb
    public final void J0(String str, String str2, String str3) {
        this.a.J0(str, str2, null);
    }

    @Override // defpackage.wlb
    public final void K0() {
        this.a.K0();
    }

    @Override // defpackage.wlb
    public final void L(bta btaVar) {
        this.a.L(btaVar);
    }

    @Override // defpackage.wlb
    public final void L0(boolean z) {
        this.a.L0(z);
    }

    @Override // defpackage.wlb
    public final void M(boolean z) {
        this.a.M(z);
    }

    @Override // defpackage.q0b
    public final void M0(String str, JSONObject jSONObject) {
        ((vmb) this.a).zzb(str, jSONObject.toString());
    }

    @Override // defpackage.hdf
    public final void O() {
        this.a.O();
    }

    @Override // defpackage.wlb
    public final void P(boolean z) {
        this.a.P(z);
    }

    @Override // defpackage.via
    public final void R(uia uiaVar) {
        this.a.R(uiaVar);
    }

    @Override // defpackage.wlb
    public final boolean S() {
        return this.c.get();
    }

    @Override // defpackage.wlb
    public final void T() {
        this.a.T();
    }

    @Override // defpackage.wlb
    public final void U() {
        TextView textView = new TextView(getContext());
        dyf.r();
        textView.setText(wxf.Z());
        textView.setTextSize(15.0f);
        textView.setTextColor(-1);
        textView.setPadding(5, 0, 5, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(-12303292);
        gradientDrawable.setCornerRadius(8.0f);
        textView.setBackground(gradientDrawable);
        addView(textView, new FrameLayout.LayoutParams(-2, -2, 49));
        bringChildToFront(textView);
    }

    @Override // defpackage.wlb
    public final void V() {
        HashMap hashMap = new HashMap(3);
        hashMap.put("app_muted", String.valueOf(dyf.t().e()));
        hashMap.put("app_volume", String.valueOf(dyf.t().a()));
        vmb vmbVar = (vmb) this.a;
        hashMap.put("device_volume", String.valueOf(iu9.b(vmbVar.getContext())));
        vmbVar.t("volume", hashMap);
    }

    @Override // defpackage.wlb
    public final void W(boolean z) {
        this.a.W(true);
    }

    @Override // defpackage.bgc
    public final void X() {
        wlb wlbVar = this.a;
        if (wlbVar != null) {
            wlbVar.X();
        }
    }

    @Override // defpackage.wlb
    public final void Y(h hVar) {
        this.a.Y(hVar);
    }

    @Override // defpackage.wlb
    public final void Z(int i) {
        this.a.Z(i);
    }

    @Override // defpackage.q0b
    public final void a(String str) {
        ((vmb) this.a).T0(str);
    }

    @Override // defpackage.wlb
    public final bta a0() {
        return this.a.a0();
    }

    @Override // defpackage.wlb, defpackage.nlb
    public final v0e b() {
        return this.a.b();
    }

    @Override // defpackage.wlb
    public final boolean b0(boolean z, int i) {
        if (!this.c.compareAndSet(false, true)) {
            return true;
        }
        if (((Boolean) pla.c().a(mpa.L0)).booleanValue()) {
            return false;
        }
        if (this.a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.a.getParent()).removeView((View) this.a);
        }
        this.a.b0(z, i);
        return true;
    }

    @Override // defpackage.wib
    public final void c() {
        this.a.c();
    }

    @Override // defpackage.wlb
    public final boolean canGoBack() {
        return this.a.canGoBack();
    }

    @Override // defpackage.wlb
    public final tla d() {
        return this.a.d();
    }

    @Override // defpackage.wib
    public final void d0(int i) {
    }

    @Override // defpackage.wlb
    public final void destroy() {
        final k8e B = B();
        if (B == null) {
            this.a.destroy();
            return;
        }
        cde cdeVar = wxf.l;
        cdeVar.post(new Runnable() { // from class: jmb
            @Override // java.lang.Runnable
            public final void run() {
                dyf.a().e(k8e.this);
            }
        });
        final wlb wlbVar = this.a;
        Objects.requireNonNull(wlbVar);
        cdeVar.postDelayed(new Runnable() { // from class: kmb
            @Override // java.lang.Runnable
            public final void run() {
                wlb.this.destroy();
            }
        }, ((Integer) pla.c().a(mpa.V4)).intValue());
    }

    @Override // defpackage.wlb
    public final boolean e() {
        return this.a.e();
    }

    @Override // defpackage.wlb
    public final void e0(String str, uxa uxaVar) {
        this.a.e0(str, uxaVar);
    }

    @Override // defpackage.wlb
    public final String f() {
        return this.a.f();
    }

    @Override // defpackage.wlb
    public final void f0() {
        setBackgroundColor(0);
        this.a.setBackgroundColor(0);
    }

    @Override // defpackage.wlb
    public final w1e g() {
        return this.a.g();
    }

    @Override // defpackage.wlb
    public final void g0(Context context) {
        this.a.g0(context);
    }

    @Override // defpackage.wlb
    public final void goBack() {
        this.a.goBack();
    }

    @Override // defpackage.wlb, defpackage.lnb
    public final View h() {
        return this;
    }

    @Override // defpackage.wlb
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.wib
    public final void i0(int i) {
    }

    @Override // defpackage.wlb, defpackage.zmb
    public final y0e j() {
        return this.a.j();
    }

    @Override // defpackage.wib
    public final void j0(boolean z, long j) {
        this.a.j0(z, j);
    }

    @Override // defpackage.d0b
    public final void k(String str, JSONObject jSONObject) {
        this.a.k(str, jSONObject);
    }

    @Override // defpackage.wib
    public final void l() {
        this.a.l();
    }

    @Override // defpackage.wlb
    public final void loadData(String str, String str2, String str3) {
        this.a.loadData(str, Mimetypes.MIMETYPE_HTML, str3);
    }

    @Override // defpackage.wlb
    public final void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        this.a.loadDataWithBaseURL(str, str2, Mimetypes.MIMETYPE_HTML, Constants.DEFAULT_ENCODING, null);
    }

    @Override // defpackage.wlb
    public final void loadUrl(String str) {
        this.a.loadUrl(str);
    }

    @Override // defpackage.wlb
    public final WebViewClient m() {
        return this.a.m();
    }

    @Override // defpackage.wlb
    public final void m0(tla tlaVar) {
        this.a.m0(tlaVar);
    }

    @Override // defpackage.wlb
    public final void n0(String str, uxa uxaVar) {
        this.a.n0(str, uxaVar);
    }

    @Override // defpackage.wlb
    public final boolean o() {
        return this.a.o();
    }

    @Override // defpackage.wlb
    public final void o0(boolean z) {
        this.a.o0(z);
    }

    @Override // defpackage.wlb
    public final void onPause() {
        this.b.f();
        this.a.onPause();
    }

    @Override // defpackage.wlb
    public final void onResume() {
        this.a.onResume();
    }

    @Override // defpackage.wlb
    public final boolean p() {
        return this.a.p();
    }

    @Override // defpackage.wlb
    public final void p0(tsa tsaVar) {
        this.a.p0(tsaVar);
    }

    @Override // defpackage.wlb
    public final void q() {
        this.b.e();
        this.a.q();
    }

    @Override // defpackage.wlb, defpackage.jnb
    public final gfa r() {
        return this.a.r();
    }

    @Override // defpackage.wlb
    public final void r0(boolean z) {
        this.a.r0(z);
    }

    @Override // defpackage.gnb
    public final void s(String str, String str2, int i) {
        this.a.s(str, str2, 14);
    }

    @Override // defpackage.hdf
    public final void s0() {
        this.a.s0();
    }

    @Override // android.view.View, defpackage.wlb
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }

    @Override // android.view.View, defpackage.wlb
    public final void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.a.setOnTouchListener(onTouchListener);
    }

    @Override // defpackage.wlb
    public final void setWebChromeClient(WebChromeClient webChromeClient) {
        this.a.setWebChromeClient(webChromeClient);
    }

    @Override // defpackage.wlb
    public final void setWebViewClient(WebViewClient webViewClient) {
        this.a.setWebViewClient(webViewClient);
    }

    @Override // defpackage.d0b
    public final void t(String str, Map map) {
        this.a.t(str, map);
    }

    @Override // defpackage.wlb
    public final void t0(unb unbVar) {
        this.a.t0(unbVar);
    }

    @Override // defpackage.wlb
    public final h u() {
        return this.a.u();
    }

    @Override // defpackage.wib
    public final String u0() {
        return this.a.u0();
    }

    @Override // defpackage.jq9
    public final void v() {
        wlb wlbVar = this.a;
        if (wlbVar != null) {
            wlbVar.v();
        }
    }

    @Override // defpackage.wlb
    public final void v0(String str, Predicate predicate) {
        this.a.v0(str, predicate);
    }

    @Override // defpackage.wlb, defpackage.wib
    public final void w(String str, mkb mkbVar) {
        this.a.w(str, mkbVar);
    }

    @Override // defpackage.gnb
    public final void w0(boolean z, int i, String str, boolean z2, boolean z3) {
        this.a.w0(z, i, str, z2, z3);
    }

    @Override // defpackage.wib
    public final void x(boolean z) {
        this.a.x(false);
    }

    @Override // defpackage.wlb
    public final boolean y() {
        return this.a.y();
    }

    @Override // defpackage.gnb
    public final void y0(zzc zzcVar, boolean z) {
        this.a.y0(zzcVar, z);
    }

    @Override // defpackage.wlb, defpackage.wib
    public final void z(ymb ymbVar) {
        this.a.z(ymbVar);
    }

    @Override // defpackage.wlb
    public final onb zzN() {
        return ((vmb) this.a).O0();
    }

    @Override // defpackage.wlb, defpackage.inb
    public final unb zzO() {
        return this.a.zzO();
    }

    @Override // defpackage.q0b
    public final void zzb(String str, String str2) {
        this.a.zzb("window.inspectorInfo", str2);
    }

    @Override // defpackage.wib
    public final int zzf() {
        return this.a.zzf();
    }

    @Override // defpackage.wib
    public final int zzg() {
        return ((Boolean) pla.c().a(mpa.K3)).booleanValue() ? this.a.getMeasuredHeight() : getMeasuredHeight();
    }

    @Override // defpackage.wib
    public final int zzh() {
        return ((Boolean) pla.c().a(mpa.K3)).booleanValue() ? this.a.getMeasuredWidth() : getMeasuredWidth();
    }

    @Override // defpackage.wlb, defpackage.dnb, defpackage.wib
    public final Activity zzi() {
        return this.a.zzi();
    }

    @Override // defpackage.wlb, defpackage.wib
    public final iq9 zzj() {
        return this.a.zzj();
    }

    @Override // defpackage.wib
    public final bqa zzk() {
        return this.a.zzk();
    }

    @Override // defpackage.wlb, defpackage.wib
    public final cqa zzm() {
        return this.a.zzm();
    }

    @Override // defpackage.wlb, defpackage.knb, defpackage.wib
    public final zzcei zzn() {
        return this.a.zzn();
    }

    @Override // defpackage.wib
    public final lib zzo() {
        return this.b;
    }

    @Override // defpackage.wlb, defpackage.wib
    public final ymb zzq() {
        return this.a.zzq();
    }

    @Override // defpackage.wib
    public final String zzr() {
        return this.a.zzr();
    }

    @Override // defpackage.bgc
    public final void zzs() {
        wlb wlbVar = this.a;
        if (wlbVar != null) {
            wlbVar.zzs();
        }
    }
}
