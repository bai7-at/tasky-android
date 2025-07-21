package com.nytimes.android.eventtracker.worker;

import android.content.Context;
import android.content.Intent;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.nytimes.android.eventtracker.EventTracker;
import defpackage.ul8;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class FlushEventBufferWorker extends Worker {
    public static final a Companion = new a(null);
    private final Context e;
    private final boolean f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlushEventBufferWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        zq3.h(context, "context");
        zq3.h(workerParameters, "workerParams");
        this.e = context;
        this.f = workerParameters.d().c("com.nytimes.android.eventtracker.worker.ET-RESCHEDULE", false);
    }

    @Override // androidx.work.Worker
    public b.a doWork() {
        ul8.b bVar = ul8.a;
        bVar.z("ET2").t("Upload Job, Sending Broadcast", new Object[0]);
        Context context = this.e;
        Intent intent = new Intent();
        intent.setClass(this.e, EventReporterReceiver.class);
        context.sendBroadcast(intent);
        bVar.z("ET2").t("Upload Job, Broadcast Sent", new Object[0]);
        if (this.f) {
            bVar.z("ET2").t("Upload Job, Rescheduling Job", new Object[0]);
            EventTracker.a.b();
        }
        b.a c = b.a.c();
        zq3.g(c, "success(...)");
        return c;
    }
}
