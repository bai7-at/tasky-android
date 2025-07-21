package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;

/* loaded from: classes4.dex */
public final class pr3 implements f99 {
    private final LinearLayout a;
    public final TextView b;
    public final TextView c;
    public final AspectRatioImageView d;
    public final TextView e;

    private pr3(LinearLayout linearLayout, TextView textView, TextView textView2, AspectRatioImageView aspectRatioImageView, TextView textView3) {
        this.a = linearLayout;
        this.b = textView;
        this.c = textView2;
        this.d = aspectRatioImageView;
        this.e = textView3;
    }

    public static pr3 a(View view) {
        int i = ig6.credit;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = ig6.headline;
            TextView textView2 = (TextView) g99.a(view, i);
            if (textView2 != null) {
                i = ig6.image;
                AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) g99.a(view, i);
                if (aspectRatioImageView != null) {
                    i = ig6.label;
                    TextView textView3 = (TextView) g99.a(view, i);
                    if (textView3 != null) {
                        return new pr3((LinearLayout) view, textView, textView2, aspectRatioImageView, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static pr3 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ai6.item_pack_content, viewGroup, false);
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
