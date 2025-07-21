package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.Image;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.ImageDimension;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.utils.ImageCropConfig;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/* loaded from: classes4.dex */
public class a24 extends r1 {
    final gt5 Y;
    private boolean Z;
    private final CompositeDisposable e0;
    private final ImageCropper f0;

    public a24(View view, ImageCropper imageCropper) {
        super(view);
        this.Z = false;
        this.e0 = new CompositeDisposable();
        this.f0 = imageCropper;
        this.S = (ImageView) view.findViewById(pg6.overlay);
        if (view.getContext().getResources().getInteger(nh6.section_photo_video_grid_columns) == 3) {
            this.Z = true;
        }
        this.Y = new gt5(view);
    }

    private Single k0(Image image) {
        return this.f0.c(ImageCropConfig.SF_LEDE_PHOTO_VIDEO, image);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l0(jg3 jg3Var) {
        int height;
        ImageDimension a = jg3Var.a();
        if (a == null || a.getUrl() == null) {
            return;
        }
        int i = this.L;
        if (this.Z) {
            height = (int) (i * 0.5d);
        } else {
            height = (int) (this.L * (a.getHeight() / a.getWidth()));
            this.Q.c(i, height);
        }
        fy6 n = og3.c().o(a.getUrl()).n(i, height);
        if (this.Z) {
            this.Q.setScaleType(ImageView.ScaleType.CENTER_CROP);
            n.f();
        } else {
            n.h();
        }
        n.i(sg3.a(this.Q.getContext(), dd6.image_placeholder)).p(this.Q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m0(Throwable th) {
        NYTLogger.i(th, "Error in LedePhotoVideoViewHolder", new Object[0]);
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    protected void W(re7 re7Var) {
        Asset asset = ((yq) re7Var).h;
        ImageAsset mediaImage = asset.getMediaImage();
        if (mediaImage == null || mediaImage.getImage() == null) {
            return;
        }
        h0(asset);
        this.Y.a(asset, null);
        this.e0.add(k0(mediaImage.getImage()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer() { // from class: y14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                a24.this.l0((jg3) obj);
            }
        }, new Consumer() { // from class: z14
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                a24.m0((Throwable) obj);
            }
        }));
    }

    @Override // com.nytimes.android.sectionfront.adapter.viewholder.a
    public void d0() {
        this.Q.setImageDrawable(null);
        this.Q.setTag(null);
        this.e0.clear();
    }
}
