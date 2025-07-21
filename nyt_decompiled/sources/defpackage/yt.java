package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.ImageAsset;
import com.nytimes.android.api.cms.PromoAsset;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.logging.NYTLogger;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class yt {
    public static final yt a = new yt();

    private yt() {
    }

    private final void a(Intent intent, Uri uri) {
        intent.setType("image/*");
        intent.putExtra("android.intent.extra.STREAM", uri);
        intent.addFlags(1);
    }

    private final void b(Intent intent, String str, String str2, String str3) {
        if (str3 == null) {
            str3 = "";
        }
        if (!TextUtils.isEmpty(str)) {
            z38 z38Var = z38.a;
            str3 = String.format("NYTimes: %s", Arrays.copyOf(new Object[]{str}, 1));
            zq3.g(str3, "format(...)");
            str2 = String.format("%s %s", Arrays.copyOf(new Object[]{str, str2}, 2));
            zq3.g(str2, "format(...)");
        }
        if (!TextUtils.isEmpty(str3)) {
            intent.putExtra("android.intent.extra.SUBJECT", str3);
        }
        intent.putExtra("android.intent.extra.TEXT", str2);
    }

    private final String c(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("pvid", str2);
        String uri = buildUpon.build().toString();
        zq3.g(uri, "toString(...)");
        return uri;
    }

    private final String d(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("referringSource", "commentShare");
        String uri = buildUpon.build().toString();
        zq3.g(uri, "toString(...)");
        return uri;
    }

    private final String e(String str) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("smid", "nytcore-android-share");
        String uri = buildUpon.build().toString();
        zq3.g(uri, "toString(...)");
        return uri;
    }

    private final String f(String str, String str2) {
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        buildUpon.appendQueryParameter("ugrp", str2);
        String uri = buildUpon.build().toString();
        zq3.g(uri, "toString(...)");
        return uri;
    }

    public static final Intent g(String str, String str2) {
        if (str == null || str.length() == 0) {
            NYTLogger.d("createSharingIntentFromUrl(): url is null/empty", new Object[0]);
            return null;
        }
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setType("text/plain");
        intent.setData(Uri.parse("mailto:"));
        a.b(intent, str2, str, null);
        return intent;
    }

    public static final Intent h(Asset asset, Uri uri, String str, String str2) {
        if (asset == null) {
            NYTLogger.d("createSharingIntent(): asset is null", new Object[0]);
            return null;
        }
        String urlOrEmpty = asset.getUrlOrEmpty();
        if (TextUtils.isEmpty(urlOrEmpty)) {
            NYTLogger.d("createSharingIntent(): url is null", new Object[0]);
            return null;
        }
        String o = o(urlOrEmpty, str, str2);
        Intent intent = new Intent("android.intent.action.SEND");
        if (uri != null) {
            a.a(intent, uri);
        } else {
            intent.setType("text/plain");
        }
        a.b(intent, n(asset), o, null);
        return intent;
    }

    public static final Intent i(String str, String str2, String str3, Uri uri, boolean z, String str4, String str5) {
        String c;
        String f;
        if (str == null || str.length() == 0) {
            NYTLogger.d("createSharingIntentFromUrl(): url is null/empty", new Object[0]);
            return null;
        }
        Intent intent = new Intent("android.intent.action.SEND");
        if (z) {
            str = a.d(str);
        }
        if (str4 != null && (f = a.f(str, str4)) != null) {
            str = f;
        }
        if (str5 != null && (c = a.c(str, str5)) != null) {
            str = c;
        }
        yt ytVar = a;
        ytVar.e(str);
        if (uri != null) {
            ytVar.a(intent, uri);
        } else {
            intent.setType("text/plain");
        }
        ytVar.b(intent, str2, str, str3);
        return intent;
    }

    private static final ImageAsset j(Asset asset) {
        ImageAsset mediaImage = asset.getMediaImage();
        return mediaImage == null ? k(asset) : mediaImage;
    }

    private static final ImageAsset k(Asset asset) {
        Asset promotionalMedia = asset.getPromotionalMedia();
        if (promotionalMedia != null) {
            Asset promotionalMedia2 = promotionalMedia.getPromotionalMedia();
            if (promotionalMedia2 instanceof ImageAsset) {
                return (ImageAsset) promotionalMedia2;
            }
        }
        return null;
    }

    public static final Asset l(Asset asset, SectionFront sectionFront) {
        if (asset == null) {
            return null;
        }
        Asset promotionalMediaOverride = sectionFront != null ? sectionFront.getPromotionalMediaOverride(asset.getAssetId()) : null;
        return promotionalMediaOverride == null ? asset.getPromotionalMedia() : promotionalMediaOverride;
    }

    public static final ImageAsset m(Asset asset, SectionFront sectionFront) {
        if (asset == null) {
            return null;
        }
        if (sectionFront != null) {
            Asset promotionalMediaOverride = sectionFront.getPromotionalMediaOverride(asset.getAssetId());
            if ((promotionalMediaOverride != null ? promotionalMediaOverride.getMediaImage() : null) != null) {
                return promotionalMediaOverride.getMediaImage();
            }
        }
        return j(asset);
    }

    public static final String n(Asset asset) {
        zq3.h(asset, "asset");
        return ((asset instanceof PromoAsset) && ((PromoAsset) asset).isEmbedded()) ? "" : asset.getDisplayTitle();
    }

    public static final String o(String str, String str2, String str3) {
        String c;
        String f;
        zq3.h(str, "url");
        yt ytVar = a;
        String e = ytVar.e(str);
        if (str2 != null && (f = ytVar.f(e, str2)) != null) {
            e = f;
        }
        return (str3 == null || (c = ytVar.c(e, str3)) == null) ? e : c;
    }
}
