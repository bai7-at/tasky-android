package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes3.dex */
public final class f76 implements f99 {
    private final ConstraintLayout a;
    public final ImageButton b;
    public final Button c;
    public final TextView d;

    private f76(ConstraintLayout constraintLayout, ImageButton imageButton, Button button, TextView textView) {
        this.a = constraintLayout;
        this.b = imageButton;
        this.c = button;
        this.d = textView;
    }

    public static f76 a(View view) {
        int i = dg6.btn_close;
        ImageButton imageButton = (ImageButton) g99.a(view, i);
        if (imageButton != null) {
            i = dg6.btn_prompt;
            Button button = (Button) g99.a(view, i);
            if (button != null) {
                i = dg6.txt_prompt;
                TextView textView = (TextView) g99.a(view, i);
                if (textView != null) {
                    return new f76((ConstraintLayout) view, imageButton, button, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static f76 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static f76 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(vh6.prompt_view, viewGroup, false);
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
