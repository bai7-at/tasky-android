package com.nytimes.android.abra.io;

import android.content.Context;
import com.nytimes.android.abra.allocator.ResourceProvider;
import com.nytimes.android.abra.utilities.AbraLogger;
import com.nytimes.android.abra.utilities.JsonExtensionsKt;
import defpackage.gm0;
import defpackage.kt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.io.FileOutputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class AbraFileSystem {
    private final String abraAllocater;
    private final String abraRules;
    private final Context context;
    private final FileHelper fileHelper;

    public AbraFileSystem(Context context, FileHelper fileHelper) {
        zq3.h(context, "context");
        zq3.h(fileHelper, "fileHelper");
        this.context = context;
        this.fileHelper = fileHelper;
        this.abraRules = "abra_rules.json";
        this.abraAllocater = "abra_allocator.js";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesFileExist(String str) {
        return this.fileHelper.doesFileExist(getAbsoluteFilePath(str));
    }

    private final String getAbsoluteFilePath(String str) {
        return this.context.getFilesDir() + "/" + str;
    }

    public final void copyResourcesToFS(ResourceProvider resourceProvider) {
        String str;
        zq3.h(resourceProvider, "resourceProvider");
        final int abraVersion = JsonExtensionsKt.getAbraVersion(resourceProvider.getAbraRules());
        try {
            str = readAbraRules();
        } catch (Exception unused) {
            str = "";
        }
        final int abraVersion2 = JsonExtensionsKt.getAbraVersion(str);
        kt2 kt2Var = new kt2() { // from class: com.nytimes.android.abra.io.AbraFileSystem$copyResourcesToFS$fileUpdater$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // defpackage.kt2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                invoke((ss2) obj, (String) obj2, (String) obj3, (String) obj4);
                return ww8.a;
            }

            public final void invoke(ss2 ss2Var, String str2, String str3, String str4) {
                boolean doesFileExist;
                zq3.h(ss2Var, "updater");
                zq3.h(str2, "fileName");
                zq3.h(str3, "newResource");
                zq3.h(str4, "tag");
                doesFileExist = AbraFileSystem.this.doesFileExist(str2);
                if (doesFileExist && abraVersion <= abraVersion2) {
                    AbraLogger.d$default(AbraLogger.INSTANCE, "Abra " + str4 + " already exists", null, 2, null);
                    return;
                }
                byte[] bytes = str3.getBytes(yj0.b);
                zq3.g(bytes, "getBytes(...)");
                ss2Var.invoke(bytes);
                AbraLogger.d$default(AbraLogger.INSTANCE, "Finished loading " + str4, null, 2, null);
            }
        };
        kt2Var.invoke(new AbraFileSystem$copyResourcesToFS$1(this), this.abraRules, resourceProvider.getAbraRules(), "rules");
        kt2Var.invoke(new AbraFileSystem$copyResourcesToFS$2(this), this.abraAllocater, resourceProvider.getAbraJs(), "allocator");
    }

    public final long lastModifiedDate() {
        return this.fileHelper.lastModified(getAbsoluteFilePath(this.abraRules));
    }

    public final String readAbraBundle() {
        return this.fileHelper.readText(getAbsoluteFilePath(this.abraAllocater));
    }

    public final String readAbraRules() {
        return this.fileHelper.readText(getAbsoluteFilePath(this.abraRules));
    }

    public final void updateBundle(byte[] bArr) {
        zq3.h(bArr, "source");
        FileOutputStream openFileOutput = this.context.openFileOutput(this.abraAllocater, 0);
        try {
            openFileOutput.write(bArr);
            ww8 ww8Var = ww8.a;
            gm0.a(openFileOutput, null);
        } finally {
        }
    }

    public final void updateRules(byte[] bArr) {
        zq3.h(bArr, "source");
        FileOutputStream openFileOutput = this.context.openFileOutput(this.abraRules, 0);
        try {
            openFileOutput.write(bArr);
            ww8 ww8Var = ww8.a;
            gm0.a(openFileOutput, null);
        } finally {
        }
    }

    public /* synthetic */ AbraFileSystem(Context context, FileHelper fileHelper, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new FileHelper() : fileHelper);
    }
}
