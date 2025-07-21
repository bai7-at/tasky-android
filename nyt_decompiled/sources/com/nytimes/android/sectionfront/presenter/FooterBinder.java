package com.nytimes.android.sectionfront.presenter;

import android.app.Activity;
import android.content.res.Resources;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.comments.R;
import com.nytimes.android.comments.menu.item.CommentHandler;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.saved.SavedManager;
import com.nytimes.android.sectionfront.presenter.FooterBinder;
import com.nytimes.android.sectionfront.ui.FooterView;
import com.nytimes.android.utils.SaveOrigin;
import com.nytimes.android.utils.ShareOrigin;
import com.nytimes.android.utils.snackbar.SnackbarUtil;
import defpackage.ee6;
import defpackage.k57;
import defpackage.oz4;
import defpackage.ss2;
import defpackage.uq7;
import defpackage.ww8;
import defpackage.yq;
import defpackage.zq3;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.Action;
import java.text.NumberFormat;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class FooterBinder {
    private final Activity a;
    private final SaveHandler b;
    private final SnackbarUtil c;
    private final SavedManager d;
    private final uq7 e;
    private final CommentHandler f;
    private final int g;

    public FooterBinder(Activity activity, SaveHandler saveHandler, SnackbarUtil snackbarUtil, SavedManager savedManager, uq7 uq7Var, CommentHandler commentHandler) {
        zq3.h(activity, "activity");
        zq3.h(saveHandler, "saveHandler");
        zq3.h(snackbarUtil, "snackbarUtil");
        zq3.h(savedManager, "savedManager");
        zq3.h(uq7Var, "sharingManager");
        zq3.h(commentHandler, "commentHandler");
        this.a = activity;
        this.b = saveHandler;
        this.c = snackbarUtil;
        this.d = savedManager;
        this.e = uq7Var;
        this.f = commentHandler;
        this.g = activity.getResources().getDimensionPixelSize(ee6.section_front_footer_save_icon_without_text_padding);
    }

    private final void h(FooterView footerView, final String str, final int i) {
        if (str != null) {
            footerView.setCommentClickListener(new oz4() { // from class: ln2
                @Override // defpackage.oz4
                public final void call() {
                    FooterBinder.i(i, this, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(int i, FooterBinder footerBinder, String str) {
        zq3.h(footerBinder, "this$0");
        zq3.h(str, "$it");
        String format = NumberFormat.getNumberInstance(Locale.US).format(i);
        CommentHandler commentHandler = footerBinder.f;
        zq3.e(format);
        commentHandler.openCommentsScreen(str, format);
    }

    private final void j(final FooterView footerView, final Asset asset, CompositeDisposable compositeDisposable) {
        footerView.t(new oz4() { // from class: hn2
            @Override // defpackage.oz4
            public final void call() {
                FooterBinder.k(FooterBinder.this, footerView, asset);
            }
        }, new oz4() { // from class: in2
            @Override // defpackage.oz4
            public final void call() {
                FooterBinder.l(FooterBinder.this, footerView, asset);
            }
        });
        footerView.setShareListener(new oz4() { // from class: jn2
            @Override // defpackage.oz4
            public final void call() {
                FooterBinder.m(FooterBinder.this, asset);
            }
        });
        compositeDisposable.add(Disposables.fromAction(new Action() { // from class: kn2
            @Override // io.reactivex.functions.Action
            public final void run() {
                FooterBinder.n(FooterView.this);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(FooterBinder footerBinder, FooterView footerView, Asset asset) {
        zq3.h(footerBinder, "this$0");
        zq3.h(footerView, "$footerView");
        zq3.h(asset, "$asset");
        footerBinder.t(footerView, asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(FooterBinder footerBinder, FooterView footerView, Asset asset) {
        zq3.h(footerBinder, "this$0");
        zq3.h(footerView, "$footerView");
        zq3.h(asset, "$asset");
        footerBinder.u(footerView, asset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(FooterBinder footerBinder, Asset asset) {
        zq3.h(footerBinder, "this$0");
        zq3.h(asset, "$asset");
        footerBinder.e.j(footerBinder.a, asset, ShareOrigin.SECTION_FRONT, (r18 & 8) != 0 ? null : null, (r18 & 16) != 0 ? null : null, (r18 & 32) != 0 ? null : null, (r18 & 64) != 0 ? null : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(FooterView footerView) {
        zq3.h(footerView, "$footerView");
        footerView.setShareListener(null);
    }

    private final void o(FooterView footerView) {
        footerView.g(this.g);
    }

    private final void p(FooterView footerView, k57 k57Var) {
        if (k57Var.a().getCanBeSaved()) {
            v(footerView, k57Var);
        } else {
            footerView.l();
        }
    }

    private final void q(FooterView footerView, k57 k57Var) {
        if (uq7.Companion.a(k57Var.a())) {
            return;
        }
        footerView.m();
    }

    private final void r(FooterView footerView, k57 k57Var) {
        if (k57Var.c()) {
            footerView.setTimestampText((String) k57Var.f().f(""));
        } else {
            footerView.n();
        }
    }

    private final String s(Resources resources, int i) {
        String quantityString = resources.getQuantityString(R.plurals.comments_plurals, i, NumberFormat.getNumberInstance(Locale.US).format(i));
        zq3.g(quantityString, "getQuantityString(...)");
        return quantityString;
    }

    private final void t(final FooterView footerView, Asset asset) {
        this.b.o(asset, SaveOrigin.SECTION_FRONT, new ss2() { // from class: com.nytimes.android.sectionfront.presenter.FooterBinder$handleSave$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                FooterView.this.u(z);
            }
        });
    }

    private final void u(final FooterView footerView, Asset asset) {
        this.b.v(asset, SaveOrigin.SECTION_FRONT, new ss2() { // from class: com.nytimes.android.sectionfront.presenter.FooterBinder$handleUnsave$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke(((Boolean) obj).booleanValue());
                return ww8.a;
            }

            public final void invoke(boolean z) {
                FooterView.this.u(z);
            }
        });
    }

    private final void v(FooterView footerView, k57 k57Var) {
        if (this.d.isSaved(k57Var.a().getUrl())) {
            footerView.u(true);
        } else {
            footerView.u(false);
        }
    }

    public final Disposable f(FooterView footerView, yq yqVar, boolean z) {
        zq3.h(footerView, "footerView");
        zq3.h(yqVar, "articleItem");
        if (!z) {
            footerView.k();
            Disposable empty = Disposables.empty();
            zq3.g(empty, "empty(...)");
            return empty;
        }
        CompositeDisposable compositeDisposable = new CompositeDisposable();
        footerView.r();
        if (yqVar.g) {
            footerView.i();
        }
        k57 k57Var = yqVar.j;
        zq3.g(k57Var, "sfBlock");
        r(footerView, k57Var);
        Asset a = yqVar.j.a();
        zq3.g(a, "asset(...)");
        j(footerView, a, compositeDisposable);
        k57 k57Var2 = yqVar.j;
        zq3.g(k57Var2, "sfBlock");
        p(footerView, k57Var2);
        k57 k57Var3 = yqVar.j;
        zq3.g(k57Var3, "sfBlock");
        q(footerView, k57Var3);
        o(footerView);
        String b = yqVar.b();
        zq3.g(b, "getArticleUrl(...)");
        g(footerView, b, yqVar.c());
        return compositeDisposable;
    }

    public final void g(FooterView footerView, String str, int i) {
        zq3.h(footerView, "footerView");
        zq3.h(str, "articleUrl");
        if (i <= 0) {
            footerView.setCommentTextVisibility(8);
            return;
        }
        Resources resources = footerView.getResources();
        zq3.g(resources, "getResources(...)");
        footerView.setCommentText(s(resources, i));
        footerView.setCommentTextVisibility(0);
        h(footerView, str, i);
    }
}
