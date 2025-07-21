package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.ads.internal.client.zzq;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class omc {
    private final urc a;
    private final cqc b;
    private ViewTreeObserver.OnScrollChangedListener c = null;

    public omc(urc urcVar, cqc cqcVar) {
        this.a = urcVar;
        this.b = cqcVar;
    }

    private static final int f(Context context, String str, int i) {
        try {
            i = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        kia.b();
        return tfb.z(context, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View a(final View view, final WindowManager windowManager) {
        wlb a = this.a.a(zzq.H0(), null, null);
        View view2 = (View) a;
        view2.setVisibility(4);
        view2.setContentDescription("policy_validator");
        a.e0("/sendMessageToSdk", new uxa() { // from class: imc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                omc.this.b((wlb) obj, map);
            }
        });
        a.e0("/hideValidatorOverlay", new uxa() { // from class: jmc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                omc.this.c(windowManager, view, (wlb) obj, map);
            }
        });
        a.e0("/open", new fya(null, null, null, null, null, null));
        this.b.j(new WeakReference(a), "/loadNativeAdPolicyViolations", new uxa() { // from class: kmc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                omc.this.e(view, windowManager, (wlb) obj, map);
            }
        });
        this.b.j(new WeakReference(a), "/showValidatorOverlay", new uxa() { // from class: lmc
            @Override // defpackage.uxa
            public final void a(Object obj, Map map) {
                fgb.b("Show native ad policy validator overlay.");
                ((wlb) obj).h().setVisibility(0);
            }
        });
        return (View) a;
    }

    final /* synthetic */ void b(wlb wlbVar, Map map) {
        this.b.g("sendMessageToNativeJs", map);
    }

    final /* synthetic */ void c(WindowManager windowManager, View view, wlb wlbVar, Map map) {
        fgb.b("Hide native ad policy validator overlay.");
        wlbVar.h().setVisibility(8);
        if (wlbVar.h().getWindowToken() != null) {
            windowManager.removeView(wlbVar.h());
        }
        wlbVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.c == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.c);
    }

    final /* synthetic */ void d(Map map, boolean z, int i, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "validatorHtmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.b.g("sendMessageToNativeJs", hashMap);
    }

    final /* synthetic */ void e(final View view, final WindowManager windowManager, final wlb wlbVar, final Map map) {
        wlbVar.zzN().N(new mnb() { // from class: nmc
            @Override // defpackage.mnb
            public final void a(boolean z, int i, String str, String str2) {
                omc.this.d(map, z, i, str, str2);
            }
        });
        if (map == null) {
            return;
        }
        Context context = view.getContext();
        int f = f(context, (String) map.get("validator_width"), ((Integer) pla.c().a(mpa.V7)).intValue());
        int f2 = f(context, (String) map.get("validator_height"), ((Integer) pla.c().a(mpa.W7)).intValue());
        int f3 = f(context, (String) map.get("validator_x"), 0);
        int f4 = f(context, (String) map.get("validator_y"), 0);
        wlbVar.t0(unb.b(f, f2));
        try {
            wlbVar.A().getSettings().setUseWideViewPort(((Boolean) pla.c().a(mpa.X7)).booleanValue());
            wlbVar.A().getSettings().setLoadWithOverviewMode(((Boolean) pla.c().a(mpa.Y7)).booleanValue());
        } catch (NullPointerException unused) {
        }
        final WindowManager.LayoutParams b = l9b.b();
        b.x = f3;
        b.y = f4;
        windowManager.updateViewLayout(wlbVar.h(), b);
        final String str = (String) map.get("orientation");
        Rect rect = new Rect();
        if (view.getGlobalVisibleRect(rect)) {
            final int i = ((IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str) || "2".equals(str)) ? rect.bottom : rect.top) - f4;
            this.c = new ViewTreeObserver.OnScrollChangedListener() { // from class: mmc
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public final void onScrollChanged() {
                    Rect rect2 = new Rect();
                    if (view.getGlobalVisibleRect(rect2)) {
                        wlb wlbVar2 = wlbVar;
                        if (wlbVar2.h().getWindowToken() == null) {
                            return;
                        }
                        int i2 = i;
                        WindowManager.LayoutParams layoutParams = b;
                        String str2 = str;
                        if (IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str2) || "2".equals(str2)) {
                            layoutParams.y = rect2.bottom - i2;
                        } else {
                            layoutParams.y = rect2.top - i2;
                        }
                        windowManager.updateViewLayout(wlbVar2.h(), layoutParams);
                    }
                }
            };
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnScrollChangedListener(this.c);
            }
        }
        String str2 = (String) map.get("overlay_url");
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        wlbVar.loadUrl(str2);
    }
}
