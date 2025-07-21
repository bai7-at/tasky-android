package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.atv_ads_framework.zza;
import com.google.android.tv.ads.IconClickFallbackImage;
import com.google.android.tv.ads.IconClickFallbackImages;
import com.google.android.tv.ads.controls.FallbackImageActivity;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class g9 {
    private final Context a;
    private final b5c b;

    public g9(Context context) {
        context.getClass();
        this.a = context;
        this.b = new b5c();
    }

    public static boolean b(IconClickFallbackImage iconClickFallbackImage) {
        String queryParameter = Uri.parse(iconClickFallbackImage.e()).getQueryParameter("atvatc");
        return queryParameter != null && queryParameter.equals(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
    }

    private final void c() {
        this.a.startActivity(new Intent().setClassName(this.a.getPackageName(), FallbackImageActivity.class.getName()).putExtra("render_error_message", true));
    }

    public void a(IconClickFallbackImages iconClickFallbackImages) {
        String str;
        iconClickFallbackImages.getClass();
        Iterator it2 = iconClickFallbackImages.b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                str = null;
                break;
            }
            IconClickFallbackImage iconClickFallbackImage = (IconClickFallbackImage) it2.next();
            if (b(iconClickFallbackImage)) {
                str = iconClickFallbackImage.e();
                break;
            }
        }
        if (str == null) {
            if (iconClickFallbackImages.b().isEmpty()) {
                c();
                return;
            } else {
                this.a.startActivity(new Intent().setClassName(this.a.getPackageName(), FallbackImageActivity.class.getName()).putExtra("icon_click_fallback_images", iconClickFallbackImages));
                return;
            }
        }
        try {
            Intent putExtra = new Intent().setAction("com.google.android.tv.ads.intent.action.LAUNCH_ATC_MENU").putExtra("extra_atc_uri", str).putExtra("extra_publisher_package", this.a.getPackageName());
            zza zzaVar = zza.TV_LAUNCHER;
            int ordinal = b5c.a(this.a).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    this.a.startActivity(putExtra.setPackage("com.google.android.apps.tv.launcherx"));
                    return;
                } else if (ordinal != 2) {
                    if (ordinal == 3) {
                        throw new IllegalStateException("AdsControlsManager should only be used on the Android TV platform.");
                    }
                    return;
                }
            }
            this.a.startActivity(putExtra.setPackage("com.google.android.tvrecommendations"));
        } catch (ActivityNotFoundException unused) {
            c();
        }
    }
}
