package com.nytimes.android.logging.remote.utils;

import android.content.Context;
import defpackage.by0;
import defpackage.ie2;
import defpackage.ww8;
import defpackage.yj0;
import defpackage.zq3;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.List;
import kotlin.coroutines.intrinsics.a;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes4.dex */
public final class FileIoWrapperImpl implements ie2 {
    private final Context a;

    public FileIoWrapperImpl(Context context) {
        zq3.h(context, "context");
        this.a = context;
    }

    private final File d() {
        File file = new File(this.a.getFilesDir().getAbsolutePath(), "nyt");
        file.mkdirs();
        return file;
    }

    @Override // defpackage.ie2
    public File a(String str) {
        zq3.h(str, "fileName");
        return new File(d(), str);
    }

    @Override // defpackage.ie2
    public Object b(File file, List list, by0 by0Var) {
        Object withContext = BuildersKt.withContext(Dispatchers.getIO(), new FileIoWrapperImpl$zipLogs$2(file, list, null), by0Var);
        return withContext == a.h() ? withContext : ww8.a;
    }

    @Override // defpackage.ie2
    public BufferedWriter c(String str) {
        zq3.h(str, "fileName");
        return new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(d(), str), true), yj0.b), 8192);
    }
}
