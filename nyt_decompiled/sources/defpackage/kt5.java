package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/* loaded from: classes4.dex */
public class kt5 extends r1 {
    private final int Y;
    private final Drawable Z;
    private final CompositeDisposable e0;
    private final ImageCropper f0;

    public kt5(View view, ImageCropper imageCropper) {
        super(view);
        this.e0 = new CompositeDisposable();
        this.f0 = imageCropper;
        this.S = (ImageView) view.findViewById(pg6.overlay);
        Resources resources = view.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(ee6.sf_photo_video_padding);
        int integer = resources.getInteger(nh6.section_photo_video_grid_columns);
        this.Y = (this.L - ((integer + 1) * dimensionPixelSize)) / integer;
        this.Z = new ColorDrawable(mx0.c(view.getContext(), dd6.image_placeholder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k0(jg3 jg3Var) {
        if (jg3Var.a() == null || jg3Var.a().getUrl() == null) {
            return;
        }
        this.Q.setMaxWidth(this.Y);
        this.Q.setLayoutParams(new RelativeLayout.LayoutParams(this.Y, -2));
        this.Q.c(jg3Var.a().getWidth(), jg3Var.a().getHeight());
        mg3.a(jg3Var.a(), this.Q, this.Y);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void l0(Throwable th) {
        NYTLogger.i(th, "Error in PhotoVideoViewHolder", new Object[0]);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        Asset asset = ((yq) re7Var).h;
        ImageAsset mediaImage = asset.getMediaImage();
        this.Q.setImageDrawable(this.Z);
        if (mediaImage != null) {
            h0(asset);
            this.M.setText(asset.getDisplayTitle());
            this.e0.add(this.f0.c(ImageCropConfig.SF_PHOTO_VIDEO, mediaImage.getImage()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: it5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    kt5.this.k0((jg3) obj);
                }
            }, new Consumer() { // from class: jt5
                @Override // io.reactivex.functions.Consumer
                public final void accept(Object obj) {
                    kt5.l0((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        og3.b(this.Q);
        this.Q.setImageDrawable(null);
        this.Q.setTag(null);
        this.e0.clear();
    }
}
