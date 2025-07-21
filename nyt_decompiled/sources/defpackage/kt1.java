package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public final class kt1 implements f99 {
    private final ImageView a;
    public final ImageView b;

    private kt1(ImageView imageView, ImageView imageView2) {
        this.a = imageView;
        this.b = imageView2;
    }

    public static kt1 a(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new kt1(imageView, imageView);
    }

    public static kt1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ci6.dots_loading_indicator, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ImageView getRoot() {
        return this.a;
    }
}
