package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class mr3 implements f99 {
    private final LinearLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;

    private mr3(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
    }

    public static mr3 a(View view) {
        int i = ig6.gameDescription;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = ig6.gameIcon;
            ImageView imageView = (ImageView) g99.a(view, i);
            if (imageView != null) {
                i = ig6.gameTitle;
                TextView textView2 = (TextView) g99.a(view, i);
                if (textView2 != null) {
                    return new mr3((LinearLayout) view, textView, imageView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static mr3 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ai6.item_games_content, viewGroup, false);
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
