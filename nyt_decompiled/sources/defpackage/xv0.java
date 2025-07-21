package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;

/* loaded from: classes4.dex */
public final class xv0 implements f99 {
    private final View a;
    public final Barrier b;
    public final View c;
    public final View d;
    public final ImageView e;
    public final View f;
    public final TextView g;

    private xv0(View view, Barrier barrier, View view2, View view3, ImageView imageView, View view4, TextView textView) {
        this.a = view;
        this.b = barrier;
        this.c = view2;
        this.d = view3;
        this.e = imageView;
        this.f = view4;
        this.g = textView;
    }

    public static xv0 a(View view) {
        View a;
        View a2;
        View a3;
        int i = tg6.barrier;
        Barrier barrier = (Barrier) g99.a(view, i);
        if (barrier != null && (a = g99.a(view, (i = tg6.messaging_dock_body))) != null && (a2 = g99.a(view, (i = tg6.messaging_dock_divider))) != null) {
            i = tg6.messaging_dock_indicator;
            ImageView imageView = (ImageView) g99.a(view, i);
            if (imageView != null && (a3 = g99.a(view, (i = tg6.messaging_dock_outline))) != null) {
                i = tg6.messaging_dock_title;
                TextView textView = (TextView) g99.a(view, i);
                if (textView != null) {
                    return new xv0(view, barrier, a, a2, imageView, a3, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static xv0 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(li6.content_dock, viewGroup);
        return a(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
