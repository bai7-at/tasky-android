package com.nytimes.android.menu.item;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.b0;
import androidx.lifecycle.Lifecycle;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.eventtracker.context.PageContext;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2PageScope;
import com.nytimes.android.eventtracker.pagetracker.scope.ET2Scope;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer;
import com.nytimes.android.menu.view.RealTooltipView;
import com.nytimes.android.utils.ShareOrigin;
import defpackage.c04;
import defpackage.cb2;
import defpackage.d44;
import defpackage.e52;
import defpackage.e54;
import defpackage.ei1;
import defpackage.ei6;
import defpackage.gz8;
import defpackage.h90;
import defpackage.hz8;
import defpackage.iz8;
import defpackage.ng6;
import defpackage.nk6;
import defpackage.nq4;
import defpackage.qs2;
import defpackage.rp7;
import defpackage.s42;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.tx1;
import defpackage.u32;
import defpackage.uq7;
import defpackage.vn8;
import defpackage.ww8;
import defpackage.zq3;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.rxkotlin.DisposableKt;
import io.reactivex.schedulers.Schedulers;
import kotlin.c;
import kotlin.text.h;

/* loaded from: classes4.dex */
public final class SubscriberLinkSharingMenuPreparer implements ei1 {
    private final Activity a;
    private final e54 b;
    private final vn8 c;
    private final ET2Scope d;
    private final uq7 e;
    private final MenuTooltipManager f;
    private final cb2 g;
    private final CompositeDisposable h;
    private final c04 i;
    private final sy4 j;

    /* JADX WARN: Multi-variable type inference failed */
    public SubscriberLinkSharingMenuPreparer(Activity activity, e54 e54Var, vn8 vn8Var, ET2Scope eT2Scope, uq7 uq7Var, MenuTooltipManager menuTooltipManager, cb2 cb2Var) {
        Lifecycle lifecycle;
        zq3.h(activity, "activity");
        zq3.h(e54Var, "linkShareDAO");
        zq3.h(vn8Var, "tooltipManager");
        zq3.h(eT2Scope, "et2Scope");
        zq3.h(uq7Var, "sharingManager");
        zq3.h(menuTooltipManager, "menuTooltipManager");
        zq3.h(cb2Var, "featureFlagUtil");
        this.a = activity;
        this.b = e54Var;
        this.c = vn8Var;
        this.d = eT2Scope;
        this.e = uq7Var;
        this.f = menuTooltipManager;
        this.g = cb2Var;
        this.h = new CompositeDisposable();
        this.i = c.a(new qs2() { // from class: com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer$menuToolTipView$2
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final RealTooltipView mo865invoke() {
                Activity activity2;
                activity2 = SubscriberLinkSharingMenuPreparer.this.a;
                View inflate = LayoutInflater.from(activity2).inflate(ei6.menu_sublink_tooltip, (ViewGroup) null, false);
                zq3.f(inflate, "null cannot be cast to non-null type com.nytimes.android.menu.view.RealTooltipView");
                return (RealTooltipView) inflate;
            }
        });
        this.j = b0.e(0, null, 2, null);
        d44 d44Var = activity instanceof d44 ? (d44) activity : null;
        if (d44Var == null || (lifecycle = d44Var.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer, String str, Asset asset, MenuItem menuItem) {
        zq3.h(subscriberLinkSharingMenuPreparer, "this$0");
        zq3.h(str, "$url");
        zq3.h(menuItem, "it");
        y(subscriberLinkSharingMenuPreparer, str, asset.getDisplayTitle(), null, 4, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer, String str, Asset asset, View view) {
        zq3.h(subscriberLinkSharingMenuPreparer, "this$0");
        zq3.h(str, "$url");
        y(subscriberLinkSharingMenuPreparer, str, asset.getDisplayTitle(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer, View view, View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        zq3.h(subscriberLinkSharingMenuPreparer, "this$0");
        zq3.h(view, "$view");
        subscriberLinkSharingMenuPreparer.H(view);
    }

    private final String D(String str) {
        if (!h.v(str, "/", false, 2, null)) {
            return str;
        }
        String substring = str.substring(0, str.length() - 1);
        zq3.g(substring, "substring(...)");
        return substring;
    }

    private final void F(int i, int i2) {
        new AlertDialog.Builder(this.a).setTitle(i).setMessage(i2).setNegativeButton(nk6.dialog_btn_ok, new DialogInterface.OnClickListener() { // from class: eb8
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                SubscriberLinkSharingMenuPreparer.G(dialogInterface, i3);
            }
        }).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    private final void H(View view) {
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        E(iArr[0] + (view.getWidth() / 2));
    }

    private final void k(String str, final String str2, final Uri uri) {
        PageContext i;
        rp7 rp7Var = new rp7(str);
        tx1 c = this.d.c();
        String g = (c == null || (i = c.i()) == null) ? null : i.g();
        CompositeDisposable compositeDisposable = this.h;
        Single subscribeOn = this.b.a(rp7Var, g).observeOn(AndroidSchedulers.mainThread()).subscribeOn(Schedulers.io());
        final ss2 ss2Var = new ss2() { // from class: com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer$createSubscriberShareLink$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(iz8 iz8Var) {
                if (!(iz8Var instanceof hz8)) {
                    if (iz8Var instanceof gz8) {
                        SubscriberLinkSharingMenuPreparer.r(SubscriberLinkSharingMenuPreparer.this, null, (gz8) iz8Var, 1, null);
                    }
                } else {
                    hz8 hz8Var = (hz8) iz8Var;
                    String a = hz8Var.a();
                    if (a == null || a.length() == 0) {
                        return;
                    }
                    SubscriberLinkSharingMenuPreparer.this.s(hz8Var.a(), str2, uri);
                }
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((iz8) obj);
                return ww8.a;
            }
        };
        Consumer consumer = new Consumer() { // from class: za8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubscriberLinkSharingMenuPreparer.l(ss2.this, obj);
            }
        };
        final ss2 ss2Var2 = new ss2() { // from class: com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer$createSubscriberShareLink$2
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return ww8.a;
            }

            public final void invoke(Throwable th) {
                SubscriberLinkSharingMenuPreparer.r(SubscriberLinkSharingMenuPreparer.this, th, null, 2, null);
            }
        };
        Disposable subscribe = subscribeOn.subscribe(consumer, new Consumer() { // from class: ab8
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                SubscriberLinkSharingMenuPreparer.m(ss2.this, obj);
            }
        });
        zq3.g(subscribe, "subscribe(...)");
        DisposableKt.plusAssign(compositeDisposable, subscribe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(ss2 ss2Var, Object obj) {
        zq3.h(ss2Var, "$tmp0");
        ss2Var.invoke(obj);
    }

    private final void n(boolean z, View view) {
        if (z) {
            this.f.e(view, new qs2() { // from class: com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer$displayBalloonIfNecessary$1
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m593invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m593invoke() {
                    vn8 vn8Var;
                    vn8Var = SubscriberLinkSharingMenuPreparer.this.c;
                    vn8Var.d();
                }
            }, new qs2() { // from class: com.nytimes.android.menu.item.SubscriberLinkSharingMenuPreparer$displayBalloonIfNecessary$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m594invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m594invoke() {
                    SubscriberLinkSharingMenuPreparer.this.u();
                }
            });
            t();
        }
    }

    private final nq4 p() {
        return (nq4) this.i.getValue();
    }

    private final void q(Throwable th, gz8 gz8Var) {
        NYTLogger.g("Link Sharing Failed: throwable=" + th + ", error=" + gz8Var, new Object[0]);
        if (gz8Var != null) {
            if (gz8Var.a()) {
                F(nk6.sub_link_share_err_dialog_title, nk6.sub_link_share_err_dialog_message);
            } else {
                F(nk6.sub_link_share_err_dialog_generic_title, nk6.sub_link_share_err_dialog_generic_message);
            }
        }
    }

    static /* synthetic */ void r(SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer, Throwable th, gz8 gz8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        if ((i & 2) != 0) {
            gz8Var = null;
        }
        subscriberLinkSharingMenuPreparer.q(th, gz8Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(String str, String str2, Uri uri) {
        String L = this.g.L();
        uq7 uq7Var = this.e;
        Context applicationContext = this.a.getApplicationContext();
        zq3.g(applicationContext, "getApplicationContext(...)");
        uq7.n(uq7Var, applicationContext, str, str2, null, ShareOrigin.ARTICLE_FRONT, new h90(null, null, null, null, "unlocked-article-menu", 15, null), null, uri, uri != null ? "screenshot-menu" : null, false, L, null, 2624, null);
    }

    private final void v(boolean z) {
        ET2PageScope.DefaultImpls.a(this.d, new e52.e(), new s42("share-tools", null, z ? "screenshot-menu" : null, null, null, null, null, null, "unlocked-article-menu", 250, null), new u32(null, null, "open", 3, null), null, 8, null);
    }

    private final void x(String str, String str2, Uri uri) {
        k(D(str), str2, uri);
        v(uri != null);
    }

    static /* synthetic */ void y(SubscriberLinkSharingMenuPreparer subscriberLinkSharingMenuPreparer, String str, String str2, Uri uri, int i, Object obj) {
        if ((i & 4) != 0) {
            uri = null;
        }
        subscriberLinkSharingMenuPreparer.x(str, str2, uri);
    }

    public final void E(int i) {
        this.j.setValue(Integer.valueOf(i));
    }

    public final int o() {
        return ((Number) this.j.getValue()).intValue();
    }

    @Override // defpackage.ei1
    public void onDestroy(d44 d44Var) {
        zq3.h(d44Var, "owner");
        this.h.clear();
    }

    public final void t() {
        ET2PageScope.DefaultImpls.a(this.d, new e52.d(), new s42("gift banner", "Introducing a new way to share articles", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    public final void u() {
        ET2PageScope.DefaultImpls.a(this.d, new e52.e(), new s42("gift banner", "close", null, null, null, null, null, null, null, 508, null), null, null, 12, null);
    }

    public final void w(String str, String str2, Uri uri) {
        zq3.h(str, "assetUrl");
        zq3.h(str2, "displayTitle");
        x(str, str2, uri);
    }

    public final void z(MenuItem menuItem, boolean z, boolean z2, final Asset asset) {
        final String url;
        final String url2;
        zq3.h(menuItem, "menuItem");
        if (asset != null && (url2 = asset.getUrl()) != null) {
            menuItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: bb8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem2) {
                    boolean A;
                    A = SubscriberLinkSharingMenuPreparer.A(SubscriberLinkSharingMenuPreparer.this, url2, asset, menuItem2);
                    return A;
                }
            });
        }
        menuItem.setVisible(z);
        if (!menuItem.isVisible()) {
            this.f.d();
            return;
        }
        if (asset == null || (url = asset.getUrl()) == null) {
            return;
        }
        NYTLogger.d("URL IS :" + url, new Object[0]);
        final View getView = p().getGetView();
        n(z2, getView);
        getView.setOnClickListener(new View.OnClickListener() { // from class: cb8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubscriberLinkSharingMenuPreparer.B(SubscriberLinkSharingMenuPreparer.this, url, asset, view);
            }
        });
        menuItem.setVisible(true);
        menuItem.setActionView(getView);
        H(getView);
        getView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: db8
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                SubscriberLinkSharingMenuPreparer.C(SubscriberLinkSharingMenuPreparer.this, getView, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
        View findViewById = getView.findViewById(ng6.layout_frame_tooltip);
        zq3.g(findViewById, "findViewById(...)");
        ((FrameLayout) findViewById).setBackground(menuItem.getIcon());
    }
}
