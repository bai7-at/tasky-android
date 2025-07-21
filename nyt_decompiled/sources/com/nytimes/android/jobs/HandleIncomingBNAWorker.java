package com.nytimes.android.jobs;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.nytimes.android.push.MessagingHelper;
import defpackage.zq3;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HandleIncomingBNAWorker extends Worker {
    private final Context e;
    private final WorkerParameters f;
    private final MessagingHelper g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandleIncomingBNAWorker(Context context, WorkerParameters workerParameters, MessagingHelper messagingHelper) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "workerParams");
        zq3.h(messagingHelper, "messagingHelper");
        this.e = context;
        this.f = workerParameters;
        this.g = messagingHelper;
    }

    @Override // androidx.work.Worker
    public b.a doWork() {
        Intent intent = new Intent();
        for (Map.Entry entry : this.f.d().e().entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            intent.putExtra(str, value != null ? value.toString() : null);
        }
        this.g.onMessage(this.e, intent);
        b.a c = b.a.c();
        zq3.g(c, "success(...)");
        return c;
    }
}
