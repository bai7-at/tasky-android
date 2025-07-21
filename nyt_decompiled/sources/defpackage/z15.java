package defpackage;

import android.os.Bundle;
import com.facebook.FacebookException;
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareMediaContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareStoryContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class z15 {
    public static final z15 a = new z15();

    private z15() {
    }

    private final Bundle a(ShareCameraEffectContent shareCameraEffectContent, Bundle bundle, boolean z) {
        Bundle h = h(shareCameraEffectContent, z);
        g29 g29Var = g29.a;
        g29.m0(h, "effect_id", shareCameraEffectContent.i());
        if (bundle != null) {
            h.putBundle("effect_textures", bundle);
        }
        try {
            eh0 eh0Var = eh0.a;
            JSONObject a2 = eh0.a(shareCameraEffectContent.h());
            if (a2 != null) {
                g29.m0(h, "effect_arguments", a2.toString());
            }
            return h;
        } catch (JSONException e) {
            throw new FacebookException(zq3.q("Unable to create a JSON Object from the provided CameraEffectArguments: ", e.getMessage()));
        }
    }

    private final Bundle b(ShareLinkContent shareLinkContent, boolean z) {
        Bundle h = h(shareLinkContent, z);
        g29 g29Var = g29.a;
        g29.m0(h, "QUOTE", shareLinkContent.h());
        g29.n0(h, "MESSENGER_LINK", shareLinkContent.a());
        g29.n0(h, "TARGET_DISPLAY", shareLinkContent.a());
        return h;
    }

    private final Bundle c(ShareMediaContent shareMediaContent, List list, boolean z) {
        Bundle h = h(shareMediaContent, z);
        h.putParcelableArrayList("MEDIA", new ArrayList<>(list));
        return h;
    }

    private final Bundle d(SharePhotoContent sharePhotoContent, List list, boolean z) {
        Bundle h = h(sharePhotoContent, z);
        h.putStringArrayList("PHOTOS", new ArrayList<>(list));
        return h;
    }

    private final Bundle e(ShareStoryContent shareStoryContent, Bundle bundle, Bundle bundle2, boolean z) {
        Bundle h = h(shareStoryContent, z);
        if (bundle != null) {
            h.putParcelable("bg_asset", bundle);
        }
        if (bundle2 != null) {
            h.putParcelable("interactive_asset_uri", bundle2);
        }
        List k = shareStoryContent.k();
        if (k != null && !k.isEmpty()) {
            h.putStringArrayList("top_background_color_list", new ArrayList<>(k));
        }
        g29 g29Var = g29.a;
        g29.m0(h, "content_url", shareStoryContent.h());
        return h;
    }

    private final Bundle f(ShareVideoContent shareVideoContent, String str, boolean z) {
        Bundle h = h(shareVideoContent, z);
        g29 g29Var = g29.a;
        g29.m0(h, "TITLE", shareVideoContent.i());
        g29.m0(h, "DESCRIPTION", shareVideoContent.h());
        g29.m0(h, "VIDEO", str);
        return h;
    }

    public static final Bundle g(UUID uuid, ShareContent shareContent, boolean z) {
        zq3.h(uuid, "callId");
        zq3.h(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return a.b((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            List h = bq7.h(sharePhotoContent, uuid);
            if (h == null) {
                h = i.l();
            }
            return a.d(sharePhotoContent, h, z);
        }
        if (shareContent instanceof ShareVideoContent) {
            ShareVideoContent shareVideoContent = (ShareVideoContent) shareContent;
            return a.f(shareVideoContent, bq7.n(shareVideoContent, uuid), z);
        }
        if (shareContent instanceof ShareMediaContent) {
            ShareMediaContent shareMediaContent = (ShareMediaContent) shareContent;
            List f = bq7.f(shareMediaContent, uuid);
            if (f == null) {
                f = i.l();
            }
            return a.c(shareMediaContent, f, z);
        }
        if (shareContent instanceof ShareCameraEffectContent) {
            ShareCameraEffectContent shareCameraEffectContent = (ShareCameraEffectContent) shareContent;
            return a.a(shareCameraEffectContent, bq7.l(shareCameraEffectContent, uuid), z);
        }
        if (!(shareContent instanceof ShareStoryContent)) {
            return null;
        }
        ShareStoryContent shareStoryContent = (ShareStoryContent) shareContent;
        return a.e(shareStoryContent, bq7.e(shareStoryContent, uuid), bq7.k(shareStoryContent, uuid), z);
    }

    private final Bundle h(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        g29 g29Var = g29.a;
        g29.n0(bundle, "LINK", shareContent.a());
        g29.m0(bundle, "PLACE", shareContent.d());
        g29.m0(bundle, "PAGE", shareContent.b());
        g29.m0(bundle, "REF", shareContent.e());
        g29.m0(bundle, "REF", shareContent.e());
        bundle.putBoolean("DATA_FAILURES_FATAL", z);
        List c = shareContent.c();
        if (c != null && !c.isEmpty()) {
            bundle.putStringArrayList("FRIENDS", new ArrayList<>(c));
        }
        ShareHashtag f = shareContent.f();
        g29.m0(bundle, "HASHTAG", f == null ? null : f.a());
        return bundle;
    }
}
