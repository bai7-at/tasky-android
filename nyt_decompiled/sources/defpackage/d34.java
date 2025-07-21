package defpackage;

import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class d34 {
    public static final d34 a = new d34();

    private d34() {
    }

    private final Bundle a(ShareLinkContent shareLinkContent, boolean z) {
        return d(shareLinkContent, z);
    }

    private final Bundle b(SharePhotoContent sharePhotoContent, List list, boolean z) {
        Bundle d = d(sharePhotoContent, z);
        d.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList<>(list));
        return d;
    }

    public static final Bundle c(UUID uuid, ShareContent shareContent, boolean z) {
        zq3.h(uuid, "callId");
        zq3.h(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return a.a((ShareLinkContent) shareContent, z);
        }
        if (!(shareContent instanceof SharePhotoContent)) {
            boolean z2 = shareContent instanceof ShareVideoContent;
            return null;
        }
        SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
        List h = bq7.h(sharePhotoContent, uuid);
        if (h == null) {
            h = i.l();
        }
        return a.b(sharePhotoContent, h, z);
    }

    private final Bundle d(ShareContent shareContent, boolean z) {
        Bundle bundle = new Bundle();
        g29 g29Var = g29.a;
        g29.n0(bundle, "com.facebook.platform.extra.LINK", shareContent.a());
        g29.m0(bundle, "com.facebook.platform.extra.PLACE", shareContent.d());
        g29.m0(bundle, "com.facebook.platform.extra.REF", shareContent.e());
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List c = shareContent.c();
        if (c != null && !c.isEmpty()) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList<>(c));
        }
        return bundle;
    }
}
