package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes4.dex */
public final class qc2 implements f99 {
    private final LinearLayout a;
    public final TextInputEditText b;
    public final TextInputLayout c;
    public final LinearLayout d;
    public final TextView e;
    public final AppCompatEditText f;
    public final AppCompatTextView g;
    public final AppCompatTextView h;
    public final LinearLayout i;
    public final ImageView j;
    public final Toolbar k;

    private qc2(LinearLayout linearLayout, TextInputEditText textInputEditText, TextInputLayout textInputLayout, LinearLayout linearLayout2, TextView textView, AppCompatEditText appCompatEditText, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, LinearLayout linearLayout3, ImageView imageView, Toolbar toolbar) {
        this.a = linearLayout;
        this.b = textInputEditText;
        this.c = textInputLayout;
        this.d = linearLayout2;
        this.e = textView;
        this.f = appCompatEditText;
        this.g = appCompatTextView;
        this.h = appCompatTextView2;
        this.i = linearLayout3;
        this.j = imageView;
        this.k = toolbar;
    }

    public static qc2 a(View view) {
        int i = rg6.feedback_body;
        TextInputEditText textInputEditText = (TextInputEditText) g99.a(view, i);
        if (textInputEditText != null) {
            i = rg6.feedback_body_layout;
            TextInputLayout textInputLayout = (TextInputLayout) g99.a(view, i);
            if (textInputLayout != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                i = rg6.feedback_disclaimer;
                TextView textView = (TextView) g99.a(view, i);
                if (textView != null) {
                    i = rg6.feedback_email;
                    AppCompatEditText appCompatEditText = (AppCompatEditText) g99.a(view, i);
                    if (appCompatEditText != null) {
                        i = rg6.feedback_email_error;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) g99.a(view, i);
                        if (appCompatTextView != null) {
                            i = rg6.feedback_email_label;
                            AppCompatTextView appCompatTextView2 = (AppCompatTextView) g99.a(view, i);
                            if (appCompatTextView2 != null) {
                                i = rg6.feedback_info;
                                LinearLayout linearLayout2 = (LinearLayout) g99.a(view, i);
                                if (linearLayout2 != null) {
                                    i = rg6.feedback_screenshot;
                                    ImageView imageView = (ImageView) g99.a(view, i);
                                    if (imageView != null) {
                                        i = rg6.feedback_toolbar;
                                        Toolbar toolbar = (Toolbar) g99.a(view, i);
                                        if (toolbar != null) {
                                            return new qc2(linearLayout, textInputEditText, textInputLayout, linearLayout, textView, appCompatEditText, appCompatTextView, appCompatTextView2, linearLayout2, imageView, toolbar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static qc2 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static qc2 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(ji6.feedback_activity, viewGroup, false);
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
