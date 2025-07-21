package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class lt1 implements f99 {
    private final View a;
    public final TextView b;
    public final kt1 c;

    private lt1(View view, TextView textView, kt1 kt1Var) {
        this.a = view;
        this.b = textView;
        this.c = kt1Var;
    }

    public static lt1 a(View view) {
        View a;
        int i = lg6.button_text;
        TextView textView = (TextView) g99.a(view, i);
        if (textView == null || (a = g99.a(view, (i = lg6.dots_loading_indicator))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new lt1(view, textView, kt1.a(a));
    }

    public static lt1 b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(ci6.dots_progress_button, viewGroup);
        return a(viewGroup);
    }

    @Override // defpackage.f99
    public View getRoot() {
        return this.a;
    }
}
