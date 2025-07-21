package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class up7 {
    public static final up7 a = new up7();
    private static final c b = new d();
    private static final c c = new c();
    private static final c d = new a();
    private static final c e = new b();

    private static final class a extends c {
        @Override // up7.c
        public void b(ShareLinkContent shareLinkContent) {
            zq3.h(shareLinkContent, "linkContent");
            g29 g29Var = g29.a;
            if (!g29.Y(shareLinkContent.h())) {
                throw new FacebookException("Cannot share link content with quote using the share api");
            }
        }

        @Override // up7.c
        public void d(ShareMediaContent shareMediaContent) {
            zq3.h(shareMediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent using the share api");
        }

        @Override // up7.c
        public void e(SharePhoto sharePhoto) {
            zq3.h(sharePhoto, "photo");
            up7.a.u(sharePhoto, this);
        }

        @Override // up7.c
        public void i(ShareVideoContent shareVideoContent) {
            zq3.h(shareVideoContent, "videoContent");
            g29 g29Var = g29.a;
            if (!g29.Y(shareVideoContent.d())) {
                throw new FacebookException("Cannot share video content with place IDs using the share api");
            }
            if (!g29.Z(shareVideoContent.c())) {
                throw new FacebookException("Cannot share video content with people IDs using the share api");
            }
            if (!g29.Y(shareVideoContent.e())) {
                throw new FacebookException("Cannot share video content with referrer URL using the share api");
            }
        }
    }

    private static final class b extends c {
        @Override // up7.c
        public void g(ShareStoryContent shareStoryContent) {
            up7.a.x(shareStoryContent, this);
        }
    }

    public static class c {
        public void a(ShareCameraEffectContent shareCameraEffectContent) {
            zq3.h(shareCameraEffectContent, "cameraEffectContent");
            up7.a.l(shareCameraEffectContent);
        }

        public void b(ShareLinkContent shareLinkContent) {
            zq3.h(shareLinkContent, "linkContent");
            up7.a.p(shareLinkContent, this);
        }

        public void c(ShareMedia shareMedia) {
            zq3.h(shareMedia, "medium");
            up7.r(shareMedia, this);
        }

        public void d(ShareMediaContent shareMediaContent) {
            zq3.h(shareMediaContent, "mediaContent");
            up7.a.q(shareMediaContent, this);
        }

        public void e(SharePhoto sharePhoto) {
            zq3.h(sharePhoto, "photo");
            up7.a.v(sharePhoto, this);
        }

        public void f(SharePhotoContent sharePhotoContent) {
            zq3.h(sharePhotoContent, "photoContent");
            up7.a.t(sharePhotoContent, this);
        }

        public void g(ShareStoryContent shareStoryContent) {
            up7.a.x(shareStoryContent, this);
        }

        public void h(ShareVideo shareVideo) {
            up7.a.y(shareVideo, this);
        }

        public void i(ShareVideoContent shareVideoContent) {
            zq3.h(shareVideoContent, "videoContent");
            up7.a.z(shareVideoContent, this);
        }
    }

    private static final class d extends c {
        @Override // up7.c
        public void d(ShareMediaContent shareMediaContent) {
            zq3.h(shareMediaContent, "mediaContent");
            throw new FacebookException("Cannot share ShareMediaContent via web sharing dialogs");
        }

        @Override // up7.c
        public void e(SharePhoto sharePhoto) {
            zq3.h(sharePhoto, "photo");
            up7.a.w(sharePhoto, this);
        }

        @Override // up7.c
        public void i(ShareVideoContent shareVideoContent) {
            zq3.h(shareVideoContent, "videoContent");
            throw new FacebookException("Cannot share ShareVideoContent via web sharing dialogs");
        }
    }

    private up7() {
    }

    private final void k(ShareContent shareContent, c cVar) {
        if (shareContent == null) {
            throw new FacebookException("Must provide non-null content to share");
        }
        if (shareContent instanceof ShareLinkContent) {
            cVar.b((ShareLinkContent) shareContent);
            return;
        }
        if (shareContent instanceof SharePhotoContent) {
            cVar.f((SharePhotoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareVideoContent) {
            cVar.i((ShareVideoContent) shareContent);
            return;
        }
        if (shareContent instanceof ShareMediaContent) {
            cVar.d((ShareMediaContent) shareContent);
        } else if (shareContent instanceof ShareCameraEffectContent) {
            cVar.a((ShareCameraEffectContent) shareContent);
        } else if (shareContent instanceof ShareStoryContent) {
            cVar.g((ShareStoryContent) shareContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l(ShareCameraEffectContent shareCameraEffectContent) {
        if (g29.Y(shareCameraEffectContent.i())) {
            throw new FacebookException("Must specify a non-empty effectId");
        }
    }

    public static final void m(ShareContent shareContent) {
        a.k(shareContent, c);
    }

    public static final void n(ShareContent shareContent) {
        a.k(shareContent, e);
    }

    public static final void o(ShareContent shareContent) {
        a.k(shareContent, b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(ShareLinkContent shareLinkContent, c cVar) {
        Uri a2 = shareLinkContent.a();
        if (a2 != null && !g29.a0(a2)) {
            throw new FacebookException("Content Url must be an http:// or https:// url");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(ShareMediaContent shareMediaContent, c cVar) {
        List h = shareMediaContent.h();
        if (h == null || h.isEmpty()) {
            throw new FacebookException("Must specify at least one medium in ShareMediaContent.");
        }
        if (h.size() <= 6) {
            Iterator it2 = h.iterator();
            while (it2.hasNext()) {
                cVar.c((ShareMedia) it2.next());
            }
        } else {
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d media.", Arrays.copyOf(new Object[]{6}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    public static final void r(ShareMedia shareMedia, c cVar) {
        zq3.h(shareMedia, "medium");
        zq3.h(cVar, "validator");
        if (shareMedia instanceof SharePhoto) {
            cVar.e((SharePhoto) shareMedia);
        } else {
            if (shareMedia instanceof ShareVideo) {
                cVar.h((ShareVideo) shareMedia);
                return;
            }
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "Invalid media type: %s", Arrays.copyOf(new Object[]{shareMedia.getClass().getSimpleName()}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    private final void s(SharePhoto sharePhoto) {
        if (sharePhoto == null) {
            throw new FacebookException("Cannot share a null SharePhoto");
        }
        Bitmap c2 = sharePhoto.c();
        Uri e2 = sharePhoto.e();
        if (c2 == null && e2 == null) {
            throw new FacebookException("SharePhoto does not have a Bitmap or ImageUrl specified");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(SharePhotoContent sharePhotoContent, c cVar) {
        List h = sharePhotoContent.h();
        if (h == null || h.isEmpty()) {
            throw new FacebookException("Must specify at least one Photo in SharePhotoContent.");
        }
        if (h.size() <= 6) {
            Iterator it2 = h.iterator();
            while (it2.hasNext()) {
                cVar.e((SharePhoto) it2.next());
            }
        } else {
            z38 z38Var = z38.a;
            String format = String.format(Locale.ROOT, "Cannot add more than %d photos.", Arrays.copyOf(new Object[]{6}, 1));
            zq3.g(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u(SharePhoto sharePhoto, c cVar) {
        s(sharePhoto);
        Bitmap c2 = sharePhoto.c();
        Uri e2 = sharePhoto.e();
        if (c2 == null && g29.a0(e2)) {
            throw new FacebookException("Cannot set the ImageUrl of a SharePhoto to the Uri of an image on the web when sharing SharePhotoContent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v(SharePhoto sharePhoto, c cVar) {
        u(sharePhoto, cVar);
        if (sharePhoto.c() == null) {
            g29 g29Var = g29.a;
            if (g29.a0(sharePhoto.e())) {
                return;
            }
        }
        v29 v29Var = v29.a;
        v29.d(w92.l());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(SharePhoto sharePhoto, c cVar) {
        s(sharePhoto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x(ShareStoryContent shareStoryContent, c cVar) {
        if (shareStoryContent == null || (shareStoryContent.i() == null && shareStoryContent.l() == null)) {
            throw new FacebookException("Must pass the Facebook app a background asset, a sticker asset, or both");
        }
        if (shareStoryContent.i() != null) {
            cVar.c(shareStoryContent.i());
        }
        if (shareStoryContent.l() != null) {
            cVar.e(shareStoryContent.l());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ShareVideo shareVideo, c cVar) {
        if (shareVideo == null) {
            throw new FacebookException("Cannot share a null ShareVideo");
        }
        Uri c2 = shareVideo.c();
        if (c2 == null) {
            throw new FacebookException("ShareVideo does not have a LocalUrl specified");
        }
        if (!g29.T(c2) && !g29.W(c2)) {
            throw new FacebookException("ShareVideo must reference a video that is on the device");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z(ShareVideoContent shareVideoContent, c cVar) {
        cVar.h(shareVideoContent.l());
        SharePhoto k = shareVideoContent.k();
        if (k != null) {
            cVar.e(k);
        }
    }
}
