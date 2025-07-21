package com.nytimes.android.utils;

import android.app.Application;
import android.content.SharedPreferences;
import android.os.Environment;
import com.nytimes.android.utils.LegacyFileUtils;
import defpackage.by0;
import defpackage.ww8;
import defpackage.z38;
import defpackage.zq3;
import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class LegacyFileUtils {
    private static final String LEGACY_CACHE_DIR = "Android/data/%s/cache";
    private static final String RM_LEGACY_FILES = "rmLegFil";
    private final Application context;
    private final SharedPreferences prefs;
    private final File rootDir;
    public static final a Companion = new a(null);
    public static final int $stable = 8;
    private static final String[] LEGACY_DBS = {"nytr_gamma.db", "nytr.db", "nytr_omega.db", "nytr_ultra_omega.db", "program-database"};

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public LegacyFileUtils(SharedPreferences sharedPreferences, Application application, File file) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(application, "context");
        zq3.h(file, "rootDir");
        this.prefs = sharedPreferences;
        this.context = application;
        this.rootDir = file;
    }

    private final void deleteRecursive(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            zq3.g(listFiles, "listFiles(...)");
            for (File file2 : listFiles) {
                zq3.e(file2);
                deleteRecursive(file2);
            }
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeHomeCaches() {
        File[] listFiles = this.rootDir.listFiles(new FileFilter() { // from class: a34
            @Override // java.io.FileFilter
            public final boolean accept(File file) {
                boolean removeHomeCaches$lambda$0;
                removeHomeCaches$lambda$0 = LegacyFileUtils.removeHomeCaches$lambda$0(file);
                return removeHomeCaches$lambda$0;
            }
        });
        if (listFiles == null) {
            listFiles = new File[0];
        }
        for (File file : listFiles) {
            zq3.e(file);
            deleteRecursive(file);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean removeHomeCaches$lambda$0(File file) {
        String name = file.getName();
        zq3.g(name, "getName(...)");
        return h.K(name, "program_", false, 2, null) && file.isDirectory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLegacyDatabases() {
        String[] databaseList = this.context.databaseList();
        zq3.g(databaseList, "databaseList(...)");
        List C0 = kotlin.collections.d.C0(databaseList);
        for (String str : LEGACY_DBS) {
            if (C0.contains(str)) {
                this.context.deleteDatabase(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeLegacyImageCacheDir() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        boolean z = externalStorageDirectory != null && externalStorageDirectory.exists() && externalStorageDirectory.isDirectory() && externalStorageDirectory.canWrite();
        File externalStorageDirectory2 = Environment.getExternalStorageDirectory();
        z38 z38Var = z38.a;
        String format = String.format(LEGACY_CACHE_DIR, Arrays.copyOf(new Object[]{this.context.getPackageName()}, 1));
        zq3.g(format, "format(...)");
        File file = new File(externalStorageDirectory2, format);
        if (z && file.exists()) {
            deleteRecursive(file);
        }
    }

    public final Object removeLegacyFiles(by0<? super ww8> by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new LegacyFileUtils$removeLegacyFiles$2(this, null), by0Var);
        return withContext == kotlin.coroutines.intrinsics.a.h() ? withContext : ww8.a;
    }
}
