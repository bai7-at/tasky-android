package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e0c extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener, ViewTreeObserver.OnGlobalLayoutListener {
    private final Context a;
    private View b;

    private e0c(Context context) {
        super(context);
        this.a = context;
    }

    public static e0c a(Context context, View view, v0e v0eVar) {
        Resources resources;
        DisplayMetrics displayMetrics;
        e0c e0cVar = new e0c(context);
        if (!v0eVar.v.isEmpty() && (resources = e0cVar.a.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null) {
            float f = ((w0e) v0eVar.v.get(0)).a;
            float f2 = displayMetrics.density;
            e0cVar.setLayoutParams(new FrameLayout.LayoutParams((int) (f * f2), (int) (r1.b * f2)));
        }
        e0cVar.b = view;
        e0cVar.addView(view);
        dyf.z();
        ihb.b(e0cVar, e0cVar);
        dyf.z();
        ihb.a(e0cVar, e0cVar);
        JSONObject jSONObject = v0eVar.i0;
        RelativeLayout relativeLayout = new RelativeLayout(e0cVar.a);
        JSONObject optJSONObject = jSONObject.optJSONObject("header");
        if (optJSONObject != null) {
            e0cVar.c(optJSONObject, relativeLayout, 10);
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("footer");
        if (optJSONObject2 != null) {
            e0cVar.c(optJSONObject2, relativeLayout, 12);
        }
        e0cVar.addView(relativeLayout);
        return e0cVar;
    }

    private final int b(double d) {
        kia.b();
        return tfb.z(this.a, (int) d);
    }

    private final void c(JSONObject jSONObject, RelativeLayout relativeLayout, int i) {
        TextView textView = new TextView(this.a);
        textView.setTextColor(-1);
        textView.setBackgroundColor(-16777216);
        textView.setGravity(17);
        textView.setText(jSONObject.optString("text", ""));
        textView.setTextSize((float) jSONObject.optDouble("text_size", 11.0d));
        int b = b(jSONObject.optDouble("padding", 0.0d));
        textView.setPadding(0, b, 0, b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, b(jSONObject.optDouble("height", 15.0d)));
        layoutParams.addRule(i);
        relativeLayout.addView(textView, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        getLocationInWindow(new int[2]);
        this.b.setY(-r0[1]);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        getLocationInWindow(new int[2]);
        this.b.setY(-r0[1]);
    }
}
