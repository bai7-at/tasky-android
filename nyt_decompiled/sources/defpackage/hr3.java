package defpackage;

import android.view.View;
import android.widget.TextView;
import com.nytimes.android.designsystem.uiview.AspectRatioImageView;

/* loaded from: classes4.dex */
public final class hr3 implements f99 {
    private final View a;
    public final TextView b;
    public final AspectRatioImageView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;

    private hr3(View view, TextView textView, AspectRatioImageView aspectRatioImageView, TextView textView2, TextView textView3, TextView textView4) {
        this.a = view;
        this.b = textView;
        this.c = aspectRatioImageView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
    }

    public static hr3 a(View view) {
        int i = ig6.credit;
        TextView textView = (TextView) g99.a(view, i);
        if (textView != null) {
            i = ig6.image;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) g99.a(view, i);
            if (aspectRatioImageView != null) {
                i = ig6.kicker;
                TextView textView2 = (TextView) g99.a(view, i);
                if (textView2 != null) {
                    i = ig6.label;
                    TextView textView3 = (TextView) g99.a(view, i);
                    if (textView3 != null) {
                        i = ig6.promoText;
                        TextView textView4 = (TextView) g99.a(view, i);
                        if (textView4 != null) {
                            return new hr3(view, textView, aspectRatioImageView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
