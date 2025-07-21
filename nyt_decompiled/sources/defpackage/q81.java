package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;

/* loaded from: classes4.dex */
public final class q81 implements f99 {
    private final FragmentContainerView a;
    public final FragmentContainerView b;

    private q81(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.a = fragmentContainerView;
        this.b = fragmentContainerView2;
    }

    public static q81 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new q81(fragmentContainerView, fragmentContainerView);
    }

    public static q81 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ai6.dailyfive_fragment_container, viewGroup, false);
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
