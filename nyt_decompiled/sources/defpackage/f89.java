package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes4.dex */
public final class f89 implements f99 {
    private final View a;
    public final AppCompatImageView b;
    public final AppCompatImageView c;

    private f89(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2) {
        this.a = view;
        this.b = appCompatImageView;
        this.c = appCompatImageView2;
    }

    public static f89 a(View view) {
        int i = zg6.backgroundShape;
        AppCompatImageView appCompatImageView = (AppCompatImageView) g99.a(view, i);
        if (appCompatImageView != null) {
            i = zg6.icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) g99.a(view, i);
            if (appCompatImageView2 != null) {
                return new f89(view, appCompatImageView, appCompatImageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static f89 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(oi6.video_mute_control, viewGroup);
        return a(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
