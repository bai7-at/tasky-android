package com.nytimes.android.eventtracker.devsettings.logviewer;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.by0;
import defpackage.di6;
import defpackage.e44;
import defpackage.fc1;
import defpackage.mg6;
import defpackage.nx1;
import defpackage.qx1;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;

/* loaded from: classes4.dex */
public final class ET2EventViewerActivity extends a {
    private qx1 e;
    public nx1 et2Callback;

    public final nx1 M() {
        nx1 nx1Var = this.et2Callback;
        if (nx1Var != null) {
            return nx1Var;
        }
        zq3.z("et2Callback");
        return null;
    }

    @Override // com.nytimes.android.eventtracker.devsettings.logviewer.a, androidx.fragment.app.f, androidx.activity.ComponentActivity, defpackage.sq0, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(di6.activity_et2_log);
        Context baseContext = getBaseContext();
        zq3.g(baseContext, "getBaseContext(...)");
        this.e = new qx1(baseContext);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getBaseContext());
        RecyclerView recyclerView = (RecyclerView) findViewById(mg6.eventView);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.e);
        final SharedFlow b = M().b();
        FlowKt.launchIn(FlowKt.onEach(new Flow() { // from class: com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1

            /* renamed from: com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;

                @fc1(c = "com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1$2", f = "ET2EventViewerActivity.kt", l = {223}, m = "emit")
                /* renamed from: com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.a = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, defpackage.by0 r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1$2$1 r0 = (com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1$2$1 r0 = new com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.f.b(r6)
                        goto L42
                    L29:
                        java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                        java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                        r4.<init>(r5)
                        throw r4
                    L31:
                        kotlin.f.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r4 = r4.a
                        r6 = r5
                        r42$b r6 = (r42.b) r6
                        r0.label = r3
                        java.lang.Object r4 = r4.emit(r5, r0)
                        if (r4 != r1) goto L42
                        return r1
                    L42:
                        ww8 r4 = defpackage.ww8.a
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.devsettings.logviewer.ET2EventViewerActivity$onCreate$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector), by0Var);
                return collect == kotlin.coroutines.intrinsics.a.h() ? collect : ww8.a;
            }
        }, new ET2EventViewerActivity$onCreate$2(this, null)), e44.a(this));
    }
}
