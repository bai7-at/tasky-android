package defpackage;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.common.util.PlatformVersion;
import io.embrace.android.embracesdk.ViewSwazzledHooks;

/* loaded from: classes2.dex */
public final class nwf extends FrameLayout implements View.OnClickListener {
    private final ImageButton a;
    private final mx9 b;

    public nwf(Context context, uuf uufVar, mx9 mx9Var) {
        super(context);
        this.b = mx9Var;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.a = imageButton;
        c();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        kia.b();
        int z = tfb.z(context, uufVar.a);
        kia.b();
        int z2 = tfb.z(context, 0);
        kia.b();
        int z3 = tfb.z(context, uufVar.b);
        kia.b();
        imageButton.setPadding(z, z2, z3, tfb.z(context, uufVar.c));
        imageButton.setContentDescription("Interstitial close button");
        kia.b();
        int z4 = tfb.z(context, uufVar.d + uufVar.a + uufVar.b);
        kia.b();
        addView(imageButton, new FrameLayout.LayoutParams(z4, tfb.z(context, uufVar.d + uufVar.c), 17));
        long longValue = ((Long) pla.c().a(mpa.c1)).longValue();
        if (longValue <= 0) {
            return;
        }
        dsf dsfVar = ((Boolean) pla.c().a(mpa.d1)).booleanValue() ? new dsf(this) : null;
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(dsfVar);
    }

    private final void c() {
        String str = (String) pla.c().a(mpa.b1);
        if (!PlatformVersion.isAtLeastLollipop() || TextUtils.isEmpty(str) || "default".equals(str)) {
            this.a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Resources e = dyf.q().e();
        if (e == null) {
            this.a.setImageResource(R.drawable.btn_dialog);
            return;
        }
        Drawable drawable = null;
        try {
            if ("white".equals(str)) {
                drawable = e.getDrawable(ff6.admob_close_button_white_circle_black_cross);
            } else if ("black".equals(str)) {
                drawable = e.getDrawable(ff6.admob_close_button_black_circle_white_cross);
            }
        } catch (Resources.NotFoundException unused) {
            fgb.b("Close button resource not found, falling back to default.");
        }
        if (drawable == null) {
            this.a.setImageResource(R.drawable.btn_dialog);
        } else {
            this.a.setImageDrawable(drawable);
            this.a.setScaleType(ImageView.ScaleType.CENTER);
        }
    }

    public final void b(boolean z) {
        if (!z) {
            this.a.setVisibility(0);
            return;
        }
        this.a.setVisibility(8);
        if (((Long) pla.c().a(mpa.c1)).longValue() > 0) {
            this.a.animate().cancel();
            this.a.clearAnimation();
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ViewSwazzledHooks.OnClickListener._preOnClick(this, view);
        mx9 mx9Var = this.b;
        if (mx9Var != null) {
            mx9Var.zzj();
        }
    }
}
