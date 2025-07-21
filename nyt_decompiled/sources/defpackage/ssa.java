package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ssa extends RelativeLayout {
    private static final float[] b = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};
    private AnimationDrawable a;

    public ssa(Context context, rsa rsaVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(rsaVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(b, null, null));
        shapeDrawable.getPaint().setColor(rsaVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(rsaVar.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(rsaVar.zzg());
            textView.setTextColor(rsaVar.zze());
            textView.setTextSize(rsaVar.x6());
            kia.b();
            int z = tfb.z(context, 4);
            kia.b();
            textView.setPadding(z, 0, tfb.z(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List y6 = rsaVar.y6();
        if (y6 != null && y6.size() > 1) {
            this.a = new AnimationDrawable();
            Iterator it2 = y6.iterator();
            while (it2.hasNext()) {
                try {
                    this.a.addFrame((Drawable) fc5.Q1(((usa) it2.next()).zzf()), rsaVar.zzb());
                } catch (Exception e) {
                    fgb.e("Error while getting drawable.", e);
                }
            }
            imageView.setBackground(this.a);
        } else if (y6.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) fc5.Q1(((usa) y6.get(0)).zzf()));
            } catch (Exception e2) {
                fgb.e("Error while getting drawable.", e2);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.a;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
