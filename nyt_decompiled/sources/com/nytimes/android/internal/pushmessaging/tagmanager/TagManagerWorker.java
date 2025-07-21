package com.nytimes.android.internal.pushmessaging.tagmanager;

import android.content.Context;
import androidx.work.BackoffPolicy;
import androidx.work.CoroutineWorker;
import androidx.work.NetworkType;
import androidx.work.WorkerParameters;
import androidx.work.c;
import defpackage.gv0;
import defpackage.vf8;
import defpackage.zq3;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class TagManagerWorker extends CoroutineWorker {
    public static final a g = new a(null);
    public vf8 tagManager;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return (c) ((c.a) ((c.a) ((c.a) new c.a(TagManagerWorker.class).j(new gv0.a().b(NetworkType.CONNECTED).a())).a("PushMessaging.TagManagerWorker")).i(BackoffPolicy.EXPONENTIAL, 1L, TimeUnit.MINUTES)).b();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagManagerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "workerParams");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0056 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x004c, B:13:0x0056, B:14:0x005f, B:18:0x005b, B:22:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x004c, B:13:0x0056, B:14:0x005f, B:18:0x005b, B:22:0x0036), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(defpackage.by0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker$doWork$1
            if (r0 == 0) goto L13
            r0 = r5
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker$doWork$1 r0 = (com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker$doWork$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker$doWork$1 r0 = new com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker$doWork$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.f.b(r5)     // Catch: java.lang.Exception -> L29
            goto L4c
        L29:
            r4 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            kotlin.f.b(r5)
            f61 r5 = defpackage.f61.a     // Catch: java.lang.Exception -> L29
            ca6 r5 = r5.a()     // Catch: java.lang.Exception -> L29
            r5.b(r4)     // Catch: java.lang.Exception -> L29
            vf8 r4 = r4.f()     // Catch: java.lang.Exception -> L29
            r0.label = r3     // Catch: java.lang.Exception -> L29
            java.lang.Object r5 = r4.b(r0)     // Catch: java.lang.Exception -> L29
            if (r5 != r1) goto L4c
            return r1
        L4c:
            com.nytimes.android.internal.pushmessaging.tagmanager.a r5 = (com.nytimes.android.internal.pushmessaging.tagmanager.a) r5     // Catch: java.lang.Exception -> L29
            com.nytimes.android.internal.pushmessaging.tagmanager.a$a r4 = com.nytimes.android.internal.pushmessaging.tagmanager.a.C0334a.a     // Catch: java.lang.Exception -> L29
            boolean r4 = defpackage.zq3.c(r5, r4)     // Catch: java.lang.Exception -> L29
            if (r4 == 0) goto L5b
            androidx.work.b$a r4 = androidx.work.b.a.b()     // Catch: java.lang.Exception -> L29
            goto L5f
        L5b:
            androidx.work.b$a r4 = androidx.work.b.a.c()     // Catch: java.lang.Exception -> L29
        L5f:
            defpackage.zq3.e(r4)     // Catch: java.lang.Exception -> L29
            goto L7a
        L63:
            ul8$b r5 = defpackage.ul8.a
            java.lang.String r0 = "PushMessaging"
            ul8$c r5 = r5.z(r0)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "TagManagerWorker failed (will retry)"
            r5.f(r4, r1, r0)
            androidx.work.b$a r4 = androidx.work.b.a.b()
            defpackage.zq3.e(r4)
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.internal.pushmessaging.tagmanager.TagManagerWorker.b(by0):java.lang.Object");
    }

    public final vf8 f() {
        vf8 vf8Var = this.tagManager;
        if (vf8Var != null) {
            return vf8Var;
        }
        zq3.z("tagManager");
        return null;
    }
}
