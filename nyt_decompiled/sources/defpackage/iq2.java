package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes4.dex */
public final class iq2 implements f99 {
    private final LinearLayout a;
    public final AppBarLayout b;
    public final FragmentContainerView c;
    public final Toolbar d;

    private iq2(LinearLayout linearLayout, AppBarLayout appBarLayout, FragmentContainerView fragmentContainerView, Toolbar toolbar) {
        this.a = linearLayout;
        this.b = appBarLayout;
        this.c = fragmentContainerView;
        this.d = toolbar;
    }

    public static iq2 a(View view) {
        int i = qg6.app_bar_layout;
        AppBarLayout appBarLayout = (AppBarLayout) g99.a(view, i);
        if (appBarLayout != null) {
            i = qg6.fragment_container_view;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) g99.a(view, i);
            if (fragmentContainerView != null) {
                i = qg6.toolbar;
                Toolbar toolbar = (Toolbar) g99.a(view, i);
                if (toolbar != null) {
                    return new iq2((LinearLayout) view, appBarLayout, fragmentContainerView, toolbar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static iq2 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ii6.fragment_settings_bottom_sheet, viewGroup, false);
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
