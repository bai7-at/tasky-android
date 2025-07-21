package com.nytimes.android.devsettings.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import defpackage.ul8;
import defpackage.zq3;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class ProcessPhoenix extends Activity {
    public static final a Companion = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void a(Context context) {
            File file = new File(context.getCacheDir().getParent());
            if (file.exists()) {
                b(file);
            }
        }

        private final void b(File file) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                zq3.g(listFiles, "listFiles(...)");
                for (File file2 : listFiles) {
                    a aVar = ProcessPhoenix.Companion;
                    zq3.e(file2);
                    aVar.b(file2);
                }
            }
            if (file.delete()) {
                ul8.a.u("DELETED -> %s ", file.getAbsolutePath());
            } else {
                ul8.a.d("Could not delete %s", file.getAbsolutePath());
            }
        }

        public final Intent c(Context context) {
            zq3.h(context, "context");
            Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
            intent.addFlags(268468224);
            intent.addCategory("android.intent.category.DEFAULT");
            String packageName = context.getPackageName();
            PackageManager packageManager = context.getPackageManager();
            zq3.g(packageManager, "getPackageManager(...)");
            List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 0);
            zq3.g(queryIntentActivities, "queryIntentActivities(...)");
            Iterator<T> it2 = queryIntentActivities.iterator();
            while (it2.hasNext()) {
                ActivityInfo activityInfo = ((ResolveInfo) it2.next()).activityInfo;
                zq3.g(activityInfo, "activityInfo");
                if (zq3.c(activityInfo.packageName, packageName)) {
                    intent.setComponent(new ComponentName(packageName, activityInfo.name));
                    return intent;
                }
            }
            throw new IllegalStateException("Unable to determine default activity for " + packageName + ". Does an activity specify the DEFAULT category?");
        }

        public final void d(Context context, Intent intent, boolean z) {
            zq3.h(context, "context");
            Intent intent2 = new Intent(context, (Class<?>) ProcessPhoenix.class);
            intent2.addFlags(268435456);
            intent2.putExtra("phoenix_restart_intent", intent);
            context.startActivity(intent2);
            if (z) {
                a(context);
            }
            Runtime.getRuntime().exit(0);
        }

        public final void e(Context context) {
            zq3.h(context, "context");
            d(context, c(context), false);
        }

        private a() {
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity((Intent) getIntent().getParcelableExtra("phoenix_restart_intent"));
        Runtime.getRuntime().exit(0);
    }
}
