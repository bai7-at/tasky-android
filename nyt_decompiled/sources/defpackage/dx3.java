package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetConstants;
import com.nytimes.android.api.cms.InteractiveAsset;
import com.nytimes.android.api.cms.VideoAsset;

/* loaded from: classes4.dex */
public final class dx3 {
    public static final dx3 a = new dx3();

    private dx3() {
    }

    public static final Drawable a(View view, z18 z18Var, boolean z) {
        zq3.h(view, "itemView");
        zq3.h(z18Var, "storableAsset");
        String c = z18Var.c();
        return b(view, zq3.c(c, AssetConstants.VIDEO_TYPE) ? VideoAsset.class : zq3.c(c, AssetConstants.INTERACTIVE_GRAPHICS_TYPE) ? InteractiveAsset.class : Asset.class, z);
    }

    public static final Drawable b(View view, Class cls, boolean z) {
        zq3.h(view, "itemView");
        zq3.h(cls, "assetClass");
        Drawable drawable = null;
        if (zq3.c(cls, InteractiveAsset.class)) {
            Drawable mutate = view.getContext().getResources().getDrawable(oe6.ic_interactive_kicker).mutate();
            if (z) {
                if (mutate != null) {
                    Context context = view.getContext();
                    zq3.g(context, "getContext(...)");
                    mutate.setColorFilter(c(context, z), PorterDuff.Mode.SRC_IN);
                }
            } else if (mutate != null) {
                mutate.setColorFilter(null);
            }
            drawable = mutate;
        }
        return zq3.c(cls, VideoAsset.class) ? view.getContext().getResources().getDrawable(oe6.ic_video_kicker) : drawable;
    }

    public static final int c(Context context, boolean z) {
        zq3.h(context, "context");
        return mx0.c(context, z ? bd6.kicker_text_read : bd6.kicker_text);
    }
}
