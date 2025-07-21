package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import defpackage.yo9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
final class c implements Runnable {
    private final Uri a;
    private final Bitmap b;
    private final CountDownLatch c;
    final /* synthetic */ ImageManager d;

    public c(ImageManager imageManager, Uri uri, Bitmap bitmap, boolean z, CountDownLatch countDownLatch) {
        this.d = imageManager;
        this.a = uri;
        this.b = bitmap;
        this.c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        Object obj;
        HashSet hashSet;
        ArrayList arrayList;
        Map map2;
        yo9 yo9Var;
        Map map3;
        Asserts.checkMainThread("OnBitmapLoadedRunnable must be executed in the main thread");
        Bitmap bitmap = this.b;
        map = this.d.zai;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.remove(this.a);
        if (imageReceiver != null) {
            arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zag zagVar = (zag) arrayList.get(i);
                Bitmap bitmap2 = this.b;
                if (bitmap2 == null || bitmap == null) {
                    map2 = this.d.zaj;
                    map2.put(this.a, Long.valueOf(SystemClock.elapsedRealtime()));
                    ImageManager imageManager = this.d;
                    Context context = imageManager.zad;
                    yo9Var = imageManager.zag;
                    zagVar.zab(context, yo9Var, false);
                } else {
                    zagVar.zac(this.d.zad, bitmap2, false);
                }
                if (!(zagVar instanceof zaf)) {
                    map3 = this.d.zah;
                    map3.remove(zagVar);
                }
            }
        }
        this.c.countDown();
        obj = ImageManager.zaa;
        synchronized (obj) {
            hashSet = ImageManager.zab;
            hashSet.remove(this.a);
        }
    }
}
