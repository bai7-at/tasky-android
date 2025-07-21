package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.MenuItem;
import com.amazonaws.event.ProgressEvent;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.nytimes.android.api.cms.Asset;
import com.nytimes.android.api.cms.AssetUtils;
import com.nytimes.android.logging.NYTLogger;
import com.nytimes.android.share.IntentChooserTitle;
import com.nytimes.android.share.ShareBroadcastReceiver;
import com.nytimes.android.utils.ShareOrigin;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class uq7 {
    public static final a Companion = new a(null);
    public static final int b = 8;
    private ShareOrigin a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Asset asset) {
            return asset != null && asset.getUrlOrEmpty().length() > 0 && AssetUtils.isShareableCollection(asset);
        }

        private a() {
        }
    }

    private final Intent a(Context context, Intent intent, IntentChooserTitle intentChooserTitle, String str, String str2, String str3, String str4, h90 h90Var) {
        Intent createChooser = Intent.createChooser(intent, e(intentChooserTitle, context), PendingIntent.getBroadcast(context, 0, d(context, str, str2, str3, str4, h90Var), 167772160).getIntentSender());
        zq3.e(createChooser);
        b(context, createChooser);
        return createChooser;
    }

    private final void b(Context context, Intent intent) {
        if (context instanceof Activity) {
            return;
        }
        intent.addFlags(268435456);
    }

    private final void c(Intent intent) {
        String action = intent.getAction();
        if (zq3.c("android.intent.action.SEND", action) || zq3.c("android.intent.action.SEND_MULTIPLE", action)) {
            intent.addFlags(134742016);
        }
    }

    private final Intent d(Context context, String str, String str2, String str3, String str4, h90 h90Var) {
        Intent intent = new Intent(context, (Class<?>) ShareBroadcastReceiver.class);
        if (str != null && str.length() != 0) {
            intent.putExtra("com.nytimes.android.extra.SHARE_ASSET_URL", str);
        }
        if (str2 != null && str2.length() != 0) {
            intent.putExtra("com.nytimes.android.extra.SHARE_ASSET_URI", str2);
        }
        if (str3 != null && str3.length() != 0) {
            intent.putExtra("com.nytimes.android.extra.SHARE_ASSET_REGION", str3);
        }
        if (str4 != null && str4.length() != 0) {
            intent.putExtra("com.nytimes.android.extra.SHARE_ASSET_TYPE", str4);
        }
        if (h90Var != null) {
            intent.putExtra("com.nytimes.android.extra.DATA_SOURCE", h90Var.d());
            intent.putExtra("com.nytimes.android.extra.BLOCK_LABEL", h90Var.c());
            intent.putExtra("com.nytimes.android.extra.BLOCK_TEMPLATE", h90Var.b());
            intent.putExtra("com.nytimes.android.extra.BLOCK_CONTEXT", h90Var.a());
        }
        ShareOrigin shareOrigin = this.a;
        zq3.e(shareOrigin);
        intent.putExtra("com.nytimes.android.extra.SHARE_ORIGIN", shareOrigin.name());
        return intent;
    }

    private final String e(IntentChooserTitle intentChooserTitle, Context context) {
        String string = context.getResources().getString(intentChooserTitle.getTextResource());
        zq3.g(string, "getString(...)");
        return string;
    }

    private final void h(Context context, Intent intent, IntentChooserTitle intentChooserTitle, String str, String str2, h90 h90Var, String str3, String str4) {
        if (intent != null) {
            c(intent);
            try {
                context.startActivity(a(context, intent, intentChooserTitle, str, str3, str4, str2, h90Var));
            } catch (ActivityNotFoundException e) {
                NYTLogger.i(e, "Could not start activity for intent", new Object[0]);
            }
        }
    }

    static /* synthetic */ void i(uq7 uq7Var, Context context, Intent intent, IntentChooserTitle intentChooserTitle, String str, String str2, h90 h90Var, String str3, String str4, int i, Object obj) {
        uq7Var.h(context, intent, intentChooserTitle, str, str2, (i & 32) != 0 ? null : h90Var, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? null : str4);
    }

    public static /* synthetic */ void n(uq7 uq7Var, Context context, String str, String str2, String str3, ShareOrigin shareOrigin, h90 h90Var, String str4, Uri uri, String str5, boolean z, String str6, String str7, int i, Object obj) {
        uq7Var.m(context, str, str2, str3, shareOrigin, (i & 32) != 0 ? null : h90Var, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : uri, (i & JceEncryptionConstants.SYMMETRIC_KEY_LENGTH) != 0 ? null : str5, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? null : str6, (i & ProgressEvent.PART_COMPLETED_EVENT_CODE) != 0 ? null : str7);
    }

    private final void o(Menu menu, int i, boolean z) {
        MenuItem findItem = menu.findItem(i);
        if (findItem != null) {
            findItem.setVisible(z);
        }
    }

    public final void f(Menu menu, int i) {
        zq3.h(menu, "menu");
        o(menu, i, false);
    }

    public final void g(Activity activity, String str, String str2, String str3, IntentChooserTitle intentChooserTitle, ShareOrigin shareOrigin) {
        zq3.h(activity, "activity");
        zq3.h(intentChooserTitle, "intentChooserTitle");
        this.a = shareOrigin;
        i(this, activity, yt.g(str, str2), intentChooserTitle, str, str3, null, null, null, 224, null);
    }

    public final void j(Context context, Asset asset, ShareOrigin shareOrigin, Uri uri, String str, String str2, String str3) {
        zq3.h(context, "context");
        if (asset == null) {
            return;
        }
        this.a = shareOrigin;
        Intent h = yt.h(asset, uri, str2, str3);
        IntentChooserTitle fromAsset = IntentChooserTitle.fromAsset(asset);
        zq3.e(fromAsset);
        i(this, context, h, fromAsset, asset.getUrlOrEmpty(), asset.getAssetType(), new h90(null, null, null, null, str, 15, null), null, uri != null ? "screenshot-menu" : null, 64, null);
    }

    public final void l(Context context, String str, String str2, String str3, ShareOrigin shareOrigin) {
        zq3.h(context, "context");
        n(this, context, str, str2, str3, shareOrigin, null, null, null, null, false, null, null, 4064, null);
    }

    public final void m(Context context, String str, String str2, String str3, ShareOrigin shareOrigin, h90 h90Var, String str4, Uri uri, String str5, boolean z, String str6, String str7) {
        zq3.h(context, "context");
        this.a = shareOrigin;
        h(context, yt.i(str, str2, str3, uri, z, str6, str7), IntentChooserTitle.DEFAULT, str, null, h90Var, str4, str5);
    }

    public final void p(Activity activity, String str, String str2, String str3, ShareOrigin shareOrigin) {
        zq3.h(activity, "activity");
        this.a = shareOrigin;
        z38 z38Var = z38.a;
        String format = String.format("https://twitter.com/intent/tweet?text= %s &url=%s", Arrays.copyOf(new Object[]{str, str2}, 2));
        zq3.g(format, "format(...)");
        i(this, activity, new Intent("android.intent.action.VIEW", Uri.parse(format)), IntentChooserTitle.TWITTER, str2, str3, null, null, null, 224, null);
    }
}
