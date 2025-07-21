package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.heartbeatinfo.a;
import defpackage.px3;
import defpackage.u34;
import defpackage.yk1;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.minSdkVersion) : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.type.television") ? "tv" : context.getPackageManager().hasSystemFeature("android.hardware.type.watch") ? "watch" : context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? DebugKt.DEBUG_PROPERTY_VALUE_AUTO : context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") ? "embedded" : "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? i(installerPackageName) : "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(yk1.c());
        arrayList.add(a.h());
        arrayList.add(u34.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(u34.b("fire-core", "20.1.2"));
        arrayList.add(u34.b("device-name", i(Build.PRODUCT)));
        arrayList.add(u34.b("device-model", i(Build.DEVICE)));
        arrayList.add(u34.b("device-brand", i(Build.BRAND)));
        arrayList.add(u34.c("android-target-sdk", new u34.a() { // from class: vh2
            @Override // u34.a
            public final String extract(Object obj) {
                String e;
                e = FirebaseCommonRegistrar.e((Context) obj);
                return e;
            }
        }));
        arrayList.add(u34.c("android-min-sdk", new u34.a() { // from class: wh2
            @Override // u34.a
            public final String extract(Object obj) {
                String f;
                f = FirebaseCommonRegistrar.f((Context) obj);
                return f;
            }
        }));
        arrayList.add(u34.c("android-platform", new u34.a() { // from class: xh2
            @Override // u34.a
            public final String extract(Object obj) {
                String g;
                g = FirebaseCommonRegistrar.g((Context) obj);
                return g;
            }
        }));
        arrayList.add(u34.c("android-installer", new u34.a() { // from class: yh2
            @Override // u34.a
            public final String extract(Object obj) {
                String h;
                h = FirebaseCommonRegistrar.h((Context) obj);
                return h;
            }
        }));
        String a = px3.a();
        if (a != null) {
            arrayList.add(u34.b("kotlin", a));
        }
        return arrayList;
    }
}
