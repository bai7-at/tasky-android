package com.nytimes.android.coroutinesutils;

import android.content.SharedPreferences;
import defpackage.at3;
import defpackage.dt3;
import defpackage.du8;
import defpackage.gt2;
import defpackage.j91;
import defpackage.k75;
import defpackage.lf2;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tt3;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.serialization.KSerializer;

/* loaded from: classes4.dex */
public final class CachedParallelStore {
    private final j91 a;
    private final at3 b;
    private final File c;
    private final ParallelStore d;

    public CachedParallelStore(SharedPreferences sharedPreferences, qs2 qs2Var, File file, String str, KSerializer kSerializer, gt2 gt2Var, b bVar, long j) {
        zq3.h(sharedPreferences, "prefs");
        zq3.h(qs2Var, "clock");
        zq3.h(file, "baseDir");
        zq3.h(str, "fileName");
        zq3.h(kSerializer, "serializer");
        zq3.h(gt2Var, "fetch");
        zq3.h(bVar, "tracer");
        this.a = new j91(sharedPreferences, qs2Var, str, 0L, 8, null);
        this.b = tt3.b(null, new ss2() { // from class: com.nytimes.android.coroutinesutils.CachedParallelStore$format$1
            public final void b(dt3 dt3Var) {
                zq3.h(dt3Var, "$this$Json");
                dt3Var.f(true);
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((dt3) obj);
                return ww8.a;
            }
        }, 1, null);
        this.c = new File(file, str);
        this.d = new ParallelStore(new ss2() { // from class: com.nytimes.android.coroutinesutils.CachedParallelStore$parallelStore$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(Object obj) {
                j91 j91Var;
                zq3.h(obj, "it");
                j91Var = CachedParallelStore.this.a;
                return Boolean.valueOf(j91Var.e());
            }
        }, new CachedParallelStore$parallelStore$2(this, kSerializer, null), new CachedParallelStore$parallelStore$3(gt2Var, this, kSerializer, null), bVar, j);
    }

    public final Flow d(ParallelDownloadStrategy parallelDownloadStrategy, ss2 ss2Var, Object obj) {
        zq3.h(parallelDownloadStrategy, "strategy");
        zq3.h(ss2Var, "paramsProvider");
        return this.d.p(parallelDownloadStrategy, ss2Var, obj != null ? du8.a(obj, this.a.d()) : null);
    }

    public final Pair e(KSerializer kSerializer) {
        zq3.h(kSerializer, "serializer");
        if (this.c.exists()) {
            return du8.a(this.b.c(kSerializer, lf2.g(this.c, null, 1, null)), this.a.d());
        }
        return null;
    }

    public /* synthetic */ CachedParallelStore(SharedPreferences sharedPreferences, qs2 qs2Var, File file, String str, KSerializer kSerializer, gt2 gt2Var, b bVar, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(sharedPreferences, qs2Var, file, str, kSerializer, gt2Var, (i & 64) != 0 ? new k75() : bVar, (i & 128) != 0 ? 2000L : j);
    }
}
