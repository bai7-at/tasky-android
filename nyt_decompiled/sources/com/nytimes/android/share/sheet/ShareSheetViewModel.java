package com.nytimes.android.share.sheet;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Base64;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import com.nytimes.android.logging.NYTLogger;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.i;
import defpackage.b04;
import defpackage.gm0;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yp7;
import defpackage.zq3;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.text.h;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class ShareSheetViewModel extends q {
    private final b04 a;
    private final Application b;
    private final CoroutineDispatcher c;
    private final CoroutineDispatcher d;
    private MutableStateFlow e;
    private final StateFlow f;
    private final JsonAdapter g;
    private yp7 h;

    public ShareSheetViewModel(i iVar, b04 b04Var, Application application, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2) {
        zq3.h(iVar, "moshi");
        zq3.h(b04Var, "client");
        zq3.h(application, "application");
        zq3.h(coroutineDispatcher, "ioDispatcher");
        zq3.h(coroutineDispatcher2, "mainDispatcher");
        this.a = b04Var;
        this.b = application;
        this.c = coroutineDispatcher;
        this.d = coroutineDispatcher2;
        MutableStateFlow MutableStateFlow = StateFlowKt.MutableStateFlow(Boolean.FALSE);
        this.e = MutableStateFlow;
        this.f = FlowKt.asStateFlow(MutableStateFlow);
        this.g = iVar.c(ShareInstagramStoriesAssets.class);
    }

    private final void l(File file) {
        try {
            if (!file.exists()) {
                NYTLogger.d("File does not exist.", new Object[0]);
            } else if (file.delete()) {
                NYTLogger.d("File deleted successfully.", new Object[0]);
            } else {
                NYTLogger.d("Failed to delete the file.", new Object[0]);
            }
        } catch (Exception e) {
            NYTLogger.h(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yp7 p(String str, ShareInstagramStoriesAssets shareInstagramStoriesAssets) {
        File file;
        File file2 = null;
        String U0 = h.U0(str, "/", null, 2, null);
        String a = shareInstagramStoriesAssets.a().a();
        if (a != null) {
            file = q((String) h.F0(a, new String[]{","}, false, 0, 6, null).get(1), U0 + "-background.jpg");
        } else {
            file = null;
        }
        String b = shareInstagramStoriesAssets.a().b();
        if (b != null) {
            file2 = q((String) h.F0(b, new String[]{","}, false, 0, 6, null).get(1), U0 + "-sticker.jpg");
        }
        return new yp7(file, file2, shareInstagramStoriesAssets.b().b(), shareInstagramStoriesAssets.b().a());
    }

    private final File q(String str, String str2) {
        try {
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), Bitmap.Config.ARGB_8888);
            zq3.g(createBitmap, "createBitmap(...)");
            new Canvas(createBitmap).drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
            File file = new File(this.b.getCacheDir(), "images");
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            try {
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
                fileOutputStream.flush();
                ww8 ww8Var = ww8.a;
                gm0.a(fileOutputStream, null);
                return file2;
            } finally {
            }
        } catch (Exception e) {
            NYTLogger.h(e);
            return null;
        }
    }

    public final void m() {
        yp7 yp7Var = this.h;
        File b = yp7Var != null ? yp7Var.b() : null;
        if (b != null) {
            l(b);
        }
        yp7 yp7Var2 = this.h;
        File d = yp7Var2 != null ? yp7Var2.d() : null;
        if (d != null) {
            l(d);
        }
        this.h = null;
    }

    public final void n(String str, ss2 ss2Var) {
        zq3.h(str, "uri");
        zq3.h(ss2Var, "onResult");
        BuildersKt__Builders_commonKt.launch$default(r.a(this), this.c, null, new ShareSheetViewModel$fetchInstagramStoryAssets$1(this, str, ss2Var, null), 2, null);
    }

    public final StateFlow o() {
        return this.f;
    }

    public final void r(boolean z) {
        this.e.setValue(Boolean.valueOf(z));
    }
}
