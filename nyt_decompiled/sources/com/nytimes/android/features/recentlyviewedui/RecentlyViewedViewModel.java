package com.nytimes.android.features.recentlyviewedui;

import android.app.Application;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.k;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.entitlements.b;
import com.nytimes.android.recentlyviewed.RecentlyViewedLoginManager;
import com.nytimes.android.recentlyviewed.RecentlyViewedParams;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;
import com.nytimes.android.unfear.nytdesignsystem.model.Viewport;
import com.nytimes.android.utils.DeviceUtils;
import com.nytimes.android.utils.ScreenWidth;
import defpackage.c44;
import defpackage.ca7;
import defpackage.d44;
import defpackage.k19;
import defpackage.us6;
import defpackage.zq3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes4.dex */
public final class RecentlyViewedViewModel extends q implements c44, k19 {
    private final Application a;
    private final b b;
    private final AssetDatabase c;
    private final RecentlyViewedParams d;
    public ca7 e;
    private RecentlyViewedLoginManager f;
    private final MutableStateFlow g;
    private final MutableStateFlow h;
    private final StateFlow i;
    private final StateFlow j;

    /* JADX INFO: Access modifiers changed from: private */
    public final Viewport g() {
        return (DeviceUtils.G(this.a) && DeviceUtils.y(this.a, ScreenWidth.ScreenWidthType.SEVEN_TWENTY)) ? Viewport.TABLET : Viewport.PHONE;
    }

    @Override // defpackage.k19
    public void a() {
        this.g.setValue(Boolean.TRUE);
    }

    @Override // defpackage.k19
    public void c() {
        this.g.setValue(Boolean.FALSE);
    }

    public final AssetDatabase i() {
        return this.c;
    }

    public final StateFlow j() {
        return this.j;
    }

    public final RecentlyViewedParams k() {
        return this.d;
    }

    public final us6 l() {
        return null;
    }

    public final ca7 m() {
        ca7 ca7Var = this.e;
        if (ca7Var != null) {
            return ca7Var;
        }
        zq3.z("savedStatusHandler");
        return null;
    }

    public final b n() {
        return this.b;
    }

    public final StateFlow o() {
        return this.i;
    }

    @k(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        RecentlyViewedLoginManager recentlyViewedLoginManager = this.f;
        if (recentlyViewedLoginManager == null) {
            zq3.z("loginManager");
            recentlyViewedLoginManager = null;
        }
        recentlyViewedLoginManager.d();
        r();
    }

    public final void p(d44 d44Var) {
        zq3.h(d44Var, "lifecycleOwner");
        this.f = RecentlyViewedLoginManager.Companion.a(d44Var, this.b, this);
        d44Var.getLifecycle().a(this);
    }

    public final void q(Context context) {
        zq3.h(context, "context");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new RecentlyViewedViewModel$openLIRELoginFlow$1(this, context, null), 3, null);
    }

    public final void r() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new RecentlyViewedViewModel$reloadPage$1(this, null), 3, null);
    }

    public final void s(ca7 ca7Var) {
        zq3.h(ca7Var, "<set-?>");
        this.e = ca7Var;
    }
}
