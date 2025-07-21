package com.datadog.android.core.internal.data.upload;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.datadog.android.Datadog;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.internal.SdkFeature;
import com.datadog.android.core.internal.data.upload.UploadStatus;
import defpackage.d75;
import defpackage.f28;
import defpackage.ib2;
import defpackage.jw6;
import defpackage.k47;
import defpackage.na1;
import defpackage.qs2;
import defpackage.rq3;
import defpackage.s60;
import defpackage.ua1;
import defpackage.vc7;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public final class UploadWorker extends Worker {
    public static final a e = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Runnable {
        private final Queue a;
        private final rq3 b;
        private final SdkFeature c;

        public b(Queue queue, rq3 rq3Var, SdkFeature sdkFeature) {
            zq3.h(queue, "taskQueue");
            zq3.h(rq3Var, "sdkCore");
            zq3.h(sdkFeature, "feature");
            this.a = queue;
            this.b = rq3Var;
            this.c = sdkFeature;
        }

        private final UploadStatus a(com.datadog.android.core.internal.persistence.a aVar, ua1 ua1Var, List list, byte[] bArr, na1 na1Var) {
            return na1Var.a(ua1Var, list, bArr, aVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            ua1 l = this.b.l();
            if (l == null) {
                return;
            }
            f28 h = this.c.h();
            na1 i = this.c.i();
            s60 c = h.c();
            if (c != null) {
                UploadStatus a = a(c.b(), l, c.a(), c.c(), i);
                h.a(c.b(), new jw6.a(a.c()), !a.d());
                if (a instanceof UploadStatus.i) {
                    Queue queue = this.a;
                    queue.offer(new b(queue, this.b, this.c));
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "appContext");
        zq3.h(workerParameters, "workerParams");
    }

    @Override // androidx.work.Worker
    public b.a doWork() {
        vc7 a2 = Datadog.a(getInputData().f("_dd.sdk.instanceName"));
        rq3 rq3Var = a2 instanceof rq3 ? (rq3) a2 : null;
        if (rq3Var == null || (rq3Var instanceof d75)) {
            InternalLogger.b.a(k47.a(), InternalLogger.Level.ERROR, InternalLogger.Target.USER, new qs2() { // from class: com.datadog.android.core.internal.data.upload.UploadWorker$doWork$1
                @Override // defpackage.qs2
                /* renamed from: invoke */
                public final String mo865invoke() {
                    return "Datadog has not been initialized.";
                }
            }, null, false, null, 56, null);
            b.a c = b.a.c();
            zq3.g(c, "success()");
            return c;
        }
        List<ib2> b2 = rq3Var.b();
        ArrayList arrayList = new ArrayList();
        for (ib2 ib2Var : b2) {
            SdkFeature sdkFeature = ib2Var instanceof SdkFeature ? (SdkFeature) ib2Var : null;
            if (sdkFeature != null) {
                arrayList.add(sdkFeature);
            }
        }
        List f = i.f(arrayList);
        LinkedList linkedList = new LinkedList();
        Iterator it2 = f.iterator();
        while (it2.hasNext()) {
            linkedList.offer(new b(linkedList, rq3Var, (SdkFeature) it2.next()));
        }
        while (!linkedList.isEmpty()) {
            b bVar = (b) linkedList.poll();
            if (bVar != null) {
                bVar.run();
            }
        }
        b.a c2 = b.a.c();
        zq3.g(c2, "success()");
        return c2;
    }
}
