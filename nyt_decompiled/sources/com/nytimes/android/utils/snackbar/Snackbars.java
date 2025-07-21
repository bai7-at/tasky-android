package com.nytimes.android.utils.snackbar;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.ViewGroupKt;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.snackbar.Snackbar;
import defpackage.ak7;
import defpackage.bg6;
import defpackage.ss2;
import defpackage.xg6;
import defpackage.zq3;
import kotlin.sequences.d;

/* loaded from: classes4.dex */
public final class Snackbars {
    public static final Snackbars a = new Snackbars();

    private Snackbars() {
    }

    private final View a(View view, ss2 ss2Var) {
        ak7 b;
        ak7 s;
        View view2 = (View) ss2Var.invoke(view);
        if (view2 != null) {
            return view2;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (b = ViewGroupKt.b(viewGroup)) == null || (s = d.s(b, ss2Var)) == null) {
            return null;
        }
        return (View) d.m(s);
    }

    private final View b(Activity activity) {
        View findViewById = activity.findViewById(xg6.content_frame);
        if (findViewById != null) {
            return findViewById;
        }
        View findViewById2 = activity.findViewById(R.id.content);
        zq3.g(findViewById2, "findViewById(...)");
        return findViewById2;
    }

    public final Snackbar c(Activity activity, CharSequence charSequence, int i) {
        zq3.h(activity, "activity");
        zq3.h(charSequence, "message");
        return d(b(activity), charSequence, i);
    }

    public final Snackbar d(View view, CharSequence charSequence, int i) {
        if (view == null || charSequence == null) {
            return null;
        }
        Snackbar o0 = Snackbar.o0(view, charSequence, i);
        TextView textView = (TextView) o0.I().findViewById(bg6.snackbar_text);
        if (textView != null) {
            textView.setMaxLines(3);
        }
        o0.U(a(view, new ss2() { // from class: com.nytimes.android.utils.snackbar.Snackbars$makeSnackbar$1
            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final BottomAppBar invoke(View view2) {
                zq3.h(view2, "it");
                if (view2 instanceof BottomAppBar) {
                    return (BottomAppBar) view2;
                }
                return null;
            }
        }));
        return o0;
    }

    public final Snackbar e(Activity activity, String str, int i, String str2, View.OnClickListener onClickListener) {
        zq3.h(activity, "activity");
        zq3.h(str, "message");
        zq3.h(str2, "actionText");
        zq3.h(onClickListener, "actionListener");
        Snackbar c = c(activity, str, i);
        if (c != null) {
            return c.q0(str2, onClickListener);
        }
        return null;
    }
}
