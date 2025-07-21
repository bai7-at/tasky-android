package com.google.android.gms.common.images;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.ImageManager.ImageReceiver;
import com.google.android.gms.common.internal.Asserts;
import com.nytimes.android.abra.models.AbraPackageKt;
import defpackage.yo9;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes2.dex */
final class b implements Runnable {
    private final zag a;
    final /* synthetic */ ImageManager b;

    public b(ImageManager imageManager, zag zagVar) {
        this.b = imageManager;
        this.a = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Map map;
        yo9 yo9Var;
        Map map2;
        Map map3;
        Object obj;
        HashSet hashSet;
        HashSet hashSet2;
        Map map4;
        Map map5;
        Map map6;
        yo9 yo9Var2;
        Map map7;
        Asserts.checkMainThread("LoadImageRunnable must be executed on the main thread");
        map = this.b.zah;
        ImageManager.ImageReceiver imageReceiver = (ImageManager.ImageReceiver) map.get(this.a);
        if (imageReceiver != null) {
            map7 = this.b.zah;
            map7.remove(this.a);
            imageReceiver.c(this.a);
        }
        zag zagVar = this.a;
        d dVar = zagVar.zaa;
        Uri uri = dVar.a;
        if (uri == null) {
            ImageManager imageManager = this.b;
            Context context = imageManager.zad;
            yo9Var = imageManager.zag;
            zagVar.zab(context, yo9Var, true);
            return;
        }
        map2 = this.b.zaj;
        Long l = (Long) map2.get(uri);
        if (l != null) {
            if (SystemClock.elapsedRealtime() - l.longValue() < AbraPackageKt.MS_IN_HOUR) {
                zag zagVar2 = this.a;
                ImageManager imageManager2 = this.b;
                Context context2 = imageManager2.zad;
                yo9Var2 = imageManager2.zag;
                zagVar2.zab(context2, yo9Var2, true);
                return;
            }
            map6 = this.b.zaj;
            map6.remove(dVar.a);
        }
        this.a.zaa(null, false, true, false);
        map3 = this.b.zai;
        ImageManager.ImageReceiver imageReceiver2 = (ImageManager.ImageReceiver) map3.get(dVar.a);
        if (imageReceiver2 == null) {
            imageReceiver2 = this.b.new ImageReceiver(dVar.a);
            map5 = this.b.zai;
            map5.put(dVar.a, imageReceiver2);
        }
        imageReceiver2.b(this.a);
        zag zagVar3 = this.a;
        if (!(zagVar3 instanceof zaf)) {
            map4 = this.b.zah;
            map4.put(zagVar3, imageReceiver2);
        }
        obj = ImageManager.zaa;
        synchronized (obj) {
            try {
                hashSet = ImageManager.zab;
                if (!hashSet.contains(dVar.a)) {
                    hashSet2 = ImageManager.zab;
                    hashSet2.add(dVar.a);
                    imageReceiver2.d();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
