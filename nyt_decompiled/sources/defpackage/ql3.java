package defpackage;

import android.app.Application;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import androidx.core.content.FileProvider;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import com.nytimes.android.logging.NYTLogger;
import java.io.File;

/* loaded from: classes.dex */
public abstract class ql3 {
    public static final Intent a(Application application, String str, yp7 yp7Var) {
        zq3.h(application, "app");
        zq3.h(str, "assetUrl");
        zq3.h(yp7Var, "shareInstagramStories");
        File b = yp7Var.b();
        File d = yp7Var.d();
        if (b != null && d != null) {
            Uri b2 = b(application, b);
            Uri b3 = b(application, d);
            int identifier = application.getResources().getIdentifier("facebook_app_id", "string", application.getPackageName());
            String string = identifier != 0 ? application.getResources().getString(identifier) : null;
            Intent intent = new Intent("com.instagram.share.ADD_TO_STORY");
            intent.setDataAndType(b2, "image/*");
            intent.putExtra("interactive_asset_uri", b3);
            intent.addFlags(1);
            intent.putExtra("source_application", string);
            intent.putExtra("content_url", str);
            intent.putExtra("top_background_color", yp7Var.c());
            intent.putExtra("bottom_background_color", yp7Var.a());
            application.grantUriPermission("com.instagram.android", b3, 1);
            if (application.getPackageManager().resolveActivity(intent, 0) != null) {
                return intent;
            }
            NYTLogger.g("Instagram can't handle intent!", new Object[0]);
        }
        return null;
    }

    public static final Uri b(Application application, File file) {
        zq3.h(application, "application");
        zq3.h(file, TransferTable.COLUMN_FILE);
        Uri h = FileProvider.h(application, application.getPackageName(), file);
        zq3.g(h, "getUriForFile(...)");
        return h;
    }

    public static final boolean c(Application application) {
        PackageManager.PackageInfoFlags of;
        zq3.h(application, "app");
        PackageManager packageManager = application.getPackageManager();
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.PackageInfoFlags.of(0L);
                packageManager.getPackageInfo("com.instagram.android", of);
            } else {
                packageManager.getPackageInfo("com.instagram.android", 0);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            NYTLogger.m(e);
            return false;
        }
    }
}
