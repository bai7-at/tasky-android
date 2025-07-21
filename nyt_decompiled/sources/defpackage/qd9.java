package defpackage;

import android.os.Bundle;
import com.facebook.AuthenticationTokenClaims;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import com.nytimes.android.api.cms.Tag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;

/* loaded from: classes2.dex */
public final class qd9 {
    public static final qd9 a = new qd9();

    private qd9() {
    }

    public static final Bundle a(ShareLinkContent shareLinkContent) {
        zq3.h(shareLinkContent, "shareLinkContent");
        Bundle c = c(shareLinkContent);
        g29 g29Var = g29.a;
        g29.n0(c, Tag.HREF, shareLinkContent.a());
        g29.m0(c, "quote", shareLinkContent.h());
        return c;
    }

    public static final Bundle b(SharePhotoContent sharePhotoContent) {
        zq3.h(sharePhotoContent, "sharePhotoContent");
        Bundle c = c(sharePhotoContent);
        List h = sharePhotoContent.h();
        if (h == null) {
            h = i.l();
        }
        List list = h;
        ArrayList arrayList = new ArrayList(i.w(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(((SharePhoto) it2.next()).e()));
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        c.putStringArray("media", (String[]) array);
        return c;
    }

    public static final Bundle c(ShareContent shareContent) {
        zq3.h(shareContent, "shareContent");
        Bundle bundle = new Bundle();
        g29 g29Var = g29.a;
        ShareHashtag f = shareContent.f();
        g29.m0(bundle, "hashtag", f == null ? null : f.a());
        return bundle;
    }

    public static final Bundle d(ShareFeedContent shareFeedContent) {
        zq3.h(shareFeedContent, "shareFeedContent");
        Bundle bundle = new Bundle();
        g29 g29Var = g29.a;
        g29.m0(bundle, "to", shareFeedContent.o());
        g29.m0(bundle, "link", shareFeedContent.h());
        g29.m0(bundle, AuthenticationTokenClaims.JSON_KEY_PICTURE, shareFeedContent.n());
        g29.m0(bundle, "source", shareFeedContent.m());
        g29.m0(bundle, AuthenticationTokenClaims.JSON_KEY_NAME, shareFeedContent.l());
        g29.m0(bundle, "caption", shareFeedContent.i());
        g29.m0(bundle, "description", shareFeedContent.k());
        return bundle;
    }

    public static final Bundle e(ShareLinkContent shareLinkContent) {
        zq3.h(shareLinkContent, "shareLinkContent");
        Bundle bundle = new Bundle();
        g29 g29Var = g29.a;
        g29.m0(bundle, "link", g29.L(shareLinkContent.a()));
        g29.m0(bundle, "quote", shareLinkContent.h());
        ShareHashtag f = shareLinkContent.f();
        g29.m0(bundle, "hashtag", f == null ? null : f.a());
        return bundle;
    }
}
