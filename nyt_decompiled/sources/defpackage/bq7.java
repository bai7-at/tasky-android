package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.CallbackManagerImpl;
import com.facebook.share.model.CameraEffectTextures;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareMedia;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideo;
import com.facebook.share.model.ShareVideoContent;
import defpackage.w15;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;
import kotlin.text.h;

/* loaded from: classes2.dex */
public final class bq7 {
    public static final bq7 a = new bq7();

    public static final class a extends y07 {
        a(e92 e92Var) {
            super(e92Var);
        }

        @Override // defpackage.y07
        public void a(ik ikVar) {
            zq3.h(ikVar, "appCall");
            bq7.p(null);
        }

        @Override // defpackage.y07
        public void b(ik ikVar, FacebookException facebookException) {
            zq3.h(ikVar, "appCall");
            zq3.h(facebookException, "error");
            bq7.q(null, facebookException);
        }

        @Override // defpackage.y07
        public void c(ik ikVar, Bundle bundle) {
            zq3.h(ikVar, "appCall");
            if (bundle != null) {
                String g = bq7.g(bundle);
                if (g == null || h.w("post", g, true)) {
                    bq7.r(null, bq7.i(bundle));
                } else if (h.w("cancel", g, true)) {
                    bq7.p(null);
                } else {
                    bq7.q(null, new FacebookException("UnknownError"));
                }
            }
        }
    }

    private bq7() {
    }

    private final ik b(int i, int i2, Intent intent) {
        UUID r = c25.r(intent);
        if (r == null) {
            return null;
        }
        return ik.d.b(r, i);
    }

    private final w15.a c(UUID uuid, Uri uri, Bitmap bitmap) {
        if (bitmap != null) {
            return w15.d(uuid, bitmap);
        }
        if (uri != null) {
            return w15.e(uuid, uri);
        }
        return null;
    }

    private final w15.a d(UUID uuid, ShareMedia shareMedia) {
        Uri uri;
        Bitmap bitmap;
        if (shareMedia instanceof SharePhoto) {
            SharePhoto sharePhoto = (SharePhoto) shareMedia;
            bitmap = sharePhoto.c();
            uri = sharePhoto.e();
        } else if (shareMedia instanceof ShareVideo) {
            uri = ((ShareVideo) shareMedia).c();
            bitmap = null;
        } else {
            uri = null;
            bitmap = null;
        }
        return c(uuid, uri, bitmap);
    }

    public static final Bundle e(ShareStoryContent shareStoryContent, UUID uuid) {
        zq3.h(uuid, "appCallId");
        Bundle bundle = null;
        if (shareStoryContent != null && shareStoryContent.i() != null) {
            ShareMedia i = shareStoryContent.i();
            w15.a d = a.d(uuid, i);
            if (d == null) {
                return null;
            }
            bundle = new Bundle();
            bundle.putString(TransferTable.COLUMN_TYPE, i.b().name());
            bundle.putString("uri", d.b());
            String m = m(d.e());
            if (m != null) {
                g29.m0(bundle, "extension", m);
            }
            w15 w15Var = w15.a;
            w15.a(i.e(d));
        }
        return bundle;
    }

    public static final List f(ShareMediaContent shareMediaContent, UUID uuid) {
        Bundle bundle;
        zq3.h(uuid, "appCallId");
        List<ShareMedia> h = shareMediaContent == null ? null : shareMediaContent.h();
        if (h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (ShareMedia shareMedia : h) {
            w15.a d = a.d(uuid, shareMedia);
            if (d == null) {
                bundle = null;
            } else {
                arrayList.add(d);
                bundle = new Bundle();
                bundle.putString(TransferTable.COLUMN_TYPE, shareMedia.b().name());
                bundle.putString("uri", d.b());
            }
            if (bundle != null) {
                arrayList2.add(bundle);
            }
        }
        w15.a(arrayList);
        return arrayList2;
    }

    public static final String g(Bundle bundle) {
        zq3.h(bundle, "result");
        return bundle.containsKey("completionGesture") ? bundle.getString("completionGesture") : bundle.getString("com.facebook.platform.extra.COMPLETION_GESTURE");
    }

    public static final List h(SharePhotoContent sharePhotoContent, UUID uuid) {
        zq3.h(uuid, "appCallId");
        List h = sharePhotoContent == null ? null : sharePhotoContent.h();
        if (h == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = h.iterator();
        while (it2.hasNext()) {
            w15.a d = a.d(uuid, (SharePhoto) it2.next());
            if (d != null) {
                arrayList.add(d);
            }
        }
        ArrayList arrayList2 = new ArrayList(i.w(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((w15.a) it3.next()).b());
        }
        w15.a(arrayList);
        return arrayList2;
    }

    public static final String i(Bundle bundle) {
        zq3.h(bundle, "result");
        return bundle.containsKey("postId") ? bundle.getString("postId") : bundle.containsKey("com.facebook.platform.extra.POST_ID") ? bundle.getString("com.facebook.platform.extra.POST_ID") : bundle.getString("post_id");
    }

    public static final y07 j(e92 e92Var) {
        return new a(e92Var);
    }

    public static final Bundle k(ShareStoryContent shareStoryContent, UUID uuid) {
        zq3.h(uuid, "appCallId");
        if (shareStoryContent == null || shareStoryContent.l() == null) {
            return null;
        }
        new ArrayList().add(shareStoryContent.l());
        w15.a d = a.d(uuid, shareStoryContent.l());
        if (d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("uri", d.b());
        String m = m(d.e());
        if (m != null) {
            g29.m0(bundle, "extension", m);
        }
        w15 w15Var = w15.a;
        w15.a(i.e(d));
        return bundle;
    }

    public static final Bundle l(ShareCameraEffectContent shareCameraEffectContent, UUID uuid) {
        zq3.h(uuid, "appCallId");
        CameraEffectTextures k = shareCameraEffectContent == null ? null : shareCameraEffectContent.k();
        if (k == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        for (String str : k.d()) {
            w15.a c = a.c(uuid, k.c(str), k.b(str));
            if (c != null) {
                arrayList.add(c);
                bundle.putString(str, c.b());
            }
        }
        w15.a(arrayList);
        return bundle;
    }

    public static final String m(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        zq3.g(uri2, "uri.toString()");
        int g0 = h.g0(uri2, '.', 0, false, 6, null);
        if (g0 == -1) {
            return null;
        }
        String substring = uri2.substring(g0);
        zq3.g(substring, "(this as java.lang.String).substring(startIndex)");
        return substring;
    }

    public static final String n(ShareVideoContent shareVideoContent, UUID uuid) {
        ShareVideo l;
        zq3.h(uuid, "appCallId");
        Uri c = (shareVideoContent == null || (l = shareVideoContent.l()) == null) ? null : l.c();
        if (c == null) {
            return null;
        }
        w15.a e = w15.e(uuid, c);
        w15.a(i.e(e));
        return e.b();
    }

    public static final boolean o(int i, int i2, Intent intent, y07 y07Var) {
        ik b = a.b(i, i2, intent);
        if (b == null) {
            return false;
        }
        w15 w15Var = w15.a;
        w15.c(b.c());
        if (y07Var == null) {
            return true;
        }
        FacebookException t = intent != null ? c25.t(c25.s(intent)) : null;
        if (t == null) {
            y07Var.c(b, intent != null ? c25.A(intent) : null);
        } else if (t instanceof FacebookOperationCanceledException) {
            y07Var.a(b);
        } else {
            y07Var.b(b, t);
        }
        return true;
    }

    public static final void p(e92 e92Var) {
        a.s("cancelled", null);
        if (e92Var == null) {
            return;
        }
        e92Var.b();
    }

    public static final void q(e92 e92Var, FacebookException facebookException) {
        zq3.h(facebookException, "ex");
        a.s("error", facebookException.getMessage());
        if (e92Var == null) {
            return;
        }
        e92Var.a(facebookException);
    }

    public static final void r(e92 e92Var, String str) {
        a.s("succeeded", null);
        if (e92Var == null) {
            return;
        }
        e92Var.onSuccess(new tq7(str));
    }

    private final void s(String str, String str2) {
        kq3 kq3Var = new kq3(w92.l());
        Bundle bundle = new Bundle();
        bundle.putString("fb_share_dialog_outcome", str);
        if (str2 != null) {
            bundle.putString("error_message", str2);
        }
        kq3Var.g("fb_share_dialog_result", bundle);
    }

    public static final GraphRequest t(AccessToken accessToken, Uri uri, GraphRequest.b bVar) {
        zq3.h(uri, "imageUri");
        String path = uri.getPath();
        if (g29.W(uri) && path != null) {
            return u(accessToken, new File(path), bVar);
        }
        if (!g29.T(uri)) {
            throw new FacebookException("The image Uri must be either a file:// or content:// Uri");
        }
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(uri, "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(TransferTable.COLUMN_FILE, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, bVar, null, 32, null);
    }

    public static final GraphRequest u(AccessToken accessToken, File file, GraphRequest.b bVar) {
        GraphRequest.ParcelableResourceWithMimeType parcelableResourceWithMimeType = new GraphRequest.ParcelableResourceWithMimeType(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable(TransferTable.COLUMN_FILE, parcelableResourceWithMimeType);
        return new GraphRequest(accessToken, "me/staging_resources", bundle, HttpMethod.POST, bVar, null, 32, null);
    }

    public static final void v(final int i) {
        CallbackManagerImpl.b.c(i, new CallbackManagerImpl.a() { // from class: aq7
            @Override // com.facebook.internal.CallbackManagerImpl.a
            public final boolean a(int i2, Intent intent) {
                boolean w;
                w = bq7.w(i, i2, intent);
                return w;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(int i, int i2, Intent intent) {
        return o(i, i2, intent, j(null));
    }
}
