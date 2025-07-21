package com.nytimes.android.feedback.screenshot;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import defpackage.fy4;
import defpackage.u14;
import defpackage.zq3;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* loaded from: classes4.dex */
public final class FeedbackScreenshotViewModel extends q {
    public static final a Companion = new a(null);
    private final Application a;
    private final fy4 b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public FeedbackScreenshotViewModel(Application application) {
        zq3.h(application, "application");
        this.a = application;
        this.b = new fy4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int i(BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = 1;
        if (i > 720) {
            while ((i / 2) / i2 >= 720) {
                i2 *= 2;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k() {
        Pair pair;
        File file;
        u14 u14Var = (u14) this.b.f();
        if (u14Var == null || (pair = (Pair) u14Var.a()) == null || (file = (File) pair.d()) == null) {
            return;
        }
        file.delete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File o(Bitmap bitmap) {
        File dir = this.a.getDir("zendesk", 0);
        zq3.g(dir, "getDir(...)");
        String format = String.format("zendesk_%d_screenshot.jpg", Arrays.copyOf(new Object[]{Long.valueOf(System.currentTimeMillis())}, 1));
        zq3.g(format, "format(...)");
        File file = new File(dir, format);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
        fileOutputStream.close();
        return file;
    }

    public final void j(Uri uri) {
        zq3.h(uri, "screenshot");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new FeedbackScreenshotViewModel$copy$1(this, uri, null), 3, null);
    }

    public final void l() {
        BuildersKt__Builders_commonKt.launch$default(r.a(this), null, null, new FeedbackScreenshotViewModel$deleteScreenshot$1(this, null), 3, null);
    }

    public final Application m() {
        return this.a;
    }

    public final fy4 n() {
        return this.b;
    }
}
