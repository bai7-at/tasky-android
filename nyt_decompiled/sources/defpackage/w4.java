package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;

/* loaded from: classes4.dex */
public final class w4 implements f99 {
    private final LinearLayout a;
    public final CoordinatorLayout b;
    public final AppBarLayout c;
    public final CollapsingToolbarLayout d;
    public final FrameLayout e;
    public final ImageView f;
    public final yz3 g;
    public final TextView h;
    public final Toolbar i;

    private w4(LinearLayout linearLayout, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, CollapsingToolbarLayout collapsingToolbarLayout, FrameLayout frameLayout, ImageView imageView, yz3 yz3Var, TextView textView, Toolbar toolbar) {
        this.a = linearLayout;
        this.b = coordinatorLayout;
        this.c = appBarLayout;
        this.d = collapsingToolbarLayout;
        this.e = frameLayout;
        this.f = imageView;
        this.g = yz3Var;
        this.h = textView;
        this.i = toolbar;
    }

    public static w4 a(View view) {
        View a;
        int i = sg6.content_frame;
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) g99.a(view, i);
        if (coordinatorLayout != null) {
            i = sg6.header_container;
            AppBarLayout appBarLayout = (AppBarLayout) g99.a(view, i);
            if (appBarLayout != null) {
                i = sg6.main_collapsing;
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) g99.a(view, i);
                if (collapsingToolbarLayout != null) {
                    i = sg6.main_content;
                    FrameLayout frameLayout = (FrameLayout) g99.a(view, i);
                    if (frameLayout != null) {
                        i = sg6.nameplate;
                        ImageView imageView = (ImageView) g99.a(view, i);
                        if (imageView != null && (a = g99.a(view, (i = sg6.notifications_banner_container))) != null) {
                            yz3 a2 = yz3.a(a);
                            i = sg6.title;
                            TextView textView = (TextView) g99.a(view, i);
                            if (textView != null) {
                                i = sg6.toolbar;
                                Toolbar toolbar = (Toolbar) g99.a(view, i);
                                if (toolbar != null) {
                                    return new w4((LinearLayout) view, coordinatorLayout, appBarLayout, collapsingToolbarLayout, frameLayout, imageView, a2, textView, toolbar);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static w4 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static w4 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ki6.activity_main_bottom_nav_ui_content, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LinearLayout getRoot() {
        return this.a;
    }
}
