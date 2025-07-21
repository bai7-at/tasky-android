package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class zyc {
    zyc() {
    }

    public static final void a(Context context, ViewGroup viewGroup, a8 a8Var) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout");
        f(linearLayout, -1, -1);
        linearLayout.setGravity(17);
        linearLayout.addView(a8Var);
        a8Var.setTag("ad_view");
        viewGroup.addView(linearLayout);
    }

    public static final void b(Context context, ViewGroup viewGroup, p15 p15Var) {
        u15 u15Var = new u15(context);
        u15Var.setTag("ad_view_tag");
        f(u15Var, -1, -1);
        viewGroup.addView(u15Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setTag("layout_tag");
        linearLayout.setOrientation(1);
        f(linearLayout, -1, -1);
        linearLayout.setBackgroundColor(-1);
        u15Var.addView(linearLayout);
        Resources e = dyf.q().e();
        linearLayout.addView(c(context, e == null ? "Headline" : e.getString(tj6.native_headline), "headline_header_tag"));
        View d = d(context, ehe.c(p15Var.b()), "headline_tag");
        u15Var.setHeadlineView(d);
        linearLayout.addView(d);
        linearLayout.addView(c(context, e == null ? "Body" : e.getString(tj6.native_body), "body_header_tag"));
        View d2 = d(context, ehe.c(p15Var.a()), "body_tag");
        u15Var.setBodyView(d2);
        linearLayout.addView(d2);
        linearLayout.addView(c(context, e == null ? "Media View" : e.getString(tj6.native_media_view), "media_view_header_tag"));
        zo4 zo4Var = new zo4(context);
        zo4Var.setTag("media_view_tag");
        u15Var.setMediaView(zo4Var);
        linearLayout.addView(zo4Var);
        u15Var.setNativeAd(p15Var);
    }

    private static TextView c(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Small, -9210245, 0.0f, str2);
    }

    private static TextView d(Context context, String str, String str2) {
        return e(context, str, R.style.TextAppearance.Medium, -16777216, 12.0f, str2);
    }

    private static TextView e(Context context, String str, int i, int i2, float f, String str2) {
        TextView textView = new TextView(context);
        textView.setTag(str2);
        f(textView, -2, -2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        textView.setTextAppearance(context, i);
        textView.setTextColor(i2);
        textView.setText(str);
        return textView;
    }

    private static void f(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        }
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(layoutParams);
        layoutParams2.height = i;
        layoutParams2.width = i2;
        view.setLayoutParams(layoutParams2);
    }
}
