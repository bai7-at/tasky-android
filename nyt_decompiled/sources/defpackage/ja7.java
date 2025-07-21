package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class ja7 implements f99 {
    private final ConstraintLayout a;
    public final AppCompatButton b;
    public final AppCompatTextView c;
    public final AppCompatImageView d;

    private ja7(ConstraintLayout constraintLayout, AppCompatButton appCompatButton, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView) {
        this.a = constraintLayout;
        this.b = appCompatButton;
        this.c = appCompatTextView;
        this.d = appCompatImageView;
    }

    public static ja7 a(View view) {
        int i = bh6.back_btn;
        AppCompatButton appCompatButton = (AppCompatButton) g99.a(view, i);
        if (appCompatButton != null) {
            i = bh6.error_text_notice;
            AppCompatTextView appCompatTextView = (AppCompatTextView) g99.a(view, i);
            if (appCompatTextView != null) {
                i = bh6.sad_bee_icon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) g99.a(view, i);
                if (appCompatImageView != null) {
                    return new ja7((ConstraintLayout) view, appCompatButton, appCompatTextView, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static ja7 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(pi6.sb_hybrid_error_view, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // defpackage.f99
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.a;
    }
}
