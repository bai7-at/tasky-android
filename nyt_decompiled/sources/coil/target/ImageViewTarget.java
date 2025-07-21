package coil.target;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import defpackage.zq3;

/* loaded from: classes.dex */
public class ImageViewTarget extends GenericViewTarget<ImageView> {
    private final ImageView b;

    @Override // coil.target.GenericViewTarget, defpackage.sr8
    public Drawable d() {
        return getView().getDrawable();
    }

    @Override // coil.target.GenericViewTarget
    public void e(Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageViewTarget) && zq3.c(getView(), ((ImageViewTarget) obj).getView());
    }

    public int hashCode() {
        return getView().hashCode();
    }

    @Override // defpackage.lb9
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public ImageView getView() {
        return this.b;
    }
}
