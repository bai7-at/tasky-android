package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes4.dex */
public final class p93 implements f99 {
    private final FragmentContainerView a;
    public final FragmentContainerView b;

    private p93(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.a = fragmentContainerView;
        this.b = fragmentContainerView2;
    }

    public static p93 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new p93(fragmentContainerView, fragmentContainerView);
    }

    public static p93 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(gi6.home_fragment_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FragmentContainerView getRoot() {
        return this.a;
    }
}
