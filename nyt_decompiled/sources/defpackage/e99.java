package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public final class e99 implements f99 {
    private final View a;
    public final FrameLayout b;

    private e99(View view, FrameLayout frameLayout) {
        this.a = view;
        this.b = frameLayout;
    }

    public static e99 a(View view) {
        int i = ng6.layout_frame_tooltip;
        FrameLayout frameLayout = (FrameLayout) g99.a(view, i);
        if (frameLayout != null) {
            return new e99(view, frameLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static e99 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(ei6.view_action_sub_tooltip, viewGroup);
        return a(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
