package com.datadog.android.rum;

import android.app.ActivityManager;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.util.Log;
import defpackage.zq3;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class DdRumContentProvider extends ContentProvider {
    public static final a a = new a(null);
    private static int b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        zq3.h(uri, "uri");
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        zq3.h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        zq3.h(uri, "uri");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.ContentProvider
    public boolean onCreate() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        if (b != 0) {
            return true;
        }
        Context context = getContext();
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = null;
        Object systemService = context != null ? context.getSystemService("activity") : null;
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        int myPid = Process.myPid();
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Iterator<T> it2 = runningAppProcesses.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (((ActivityManager.RunningAppProcessInfo) next).pid == myPid) {
                    runningAppProcessInfo = next;
                    break;
                }
            }
            runningAppProcessInfo = runningAppProcessInfo;
        }
        int i = runningAppProcessInfo != null ? runningAppProcessInfo.importance : 100;
        b = i;
        Log.w("DdRumContentProvider", "processImportance:" + i);
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        zq3.h(uri, "uri");
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        zq3.h(uri, "uri");
        return 0;
    }
}
