package com.nytimes.android.eventtracker.buffer;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.util.Mimetypes;
import com.nytimes.android.eventtracker.api.EventTrackerApi;
import defpackage.by0;
import defpackage.fc1;
import defpackage.g32;
import defpackage.gt2;
import defpackage.n01;
import defpackage.u42;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import retrofit2.Response;

/* loaded from: classes4.dex */
public final class DefaultEventReporter implements u42 {
    public static final a Companion = new a(null);
    private final int a;
    private final g32 b;
    private final EventTrackerApi c;
    private final n01 d;
    private final CoroutineScope e;
    private final MutableSharedFlow f;

    @fc1(c = "com.nytimes.android.eventtracker.buffer.DefaultEventReporter$1", f = "DefaultEventReporter.kt", l = {43, 45, 55}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.eventtracker.buffer.DefaultEventReporter$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        int I$0;
        int label;

        AnonymousClass1(by0 by0Var) {
            super(2, by0Var);
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(b bVar, by0 by0Var) {
            return ((AnonymousClass1) create(bVar, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return DefaultEventReporter.this.new AnonymousClass1(by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            int i;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i2 = this.label;
            if (i2 == 0) {
                f.b(obj);
                g32 g32Var = DefaultEventReporter.this.b;
                this.label = 1;
                obj = g32Var.d(this);
                if (obj == h) {
                    return h;
                }
            } else {
                if (i2 != 1) {
                    if (i2 == 2) {
                        i = this.I$0;
                        f.b(obj);
                        ul8.a.z("ET2").q(8, new PendingUploadException(DefaultEventReporter.this.a, i, ((Number) obj).intValue()));
                        return ww8.a;
                    }
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                    int intValue = ((Number) obj).intValue();
                    ul8.a.z("ET2").l(intValue + " events uploaded to ET2 API", new Object[0]);
                    return ww8.a;
                }
                f.b(obj);
            }
            int intValue2 = ((Number) obj).intValue();
            if (intValue2 > DefaultEventReporter.this.a) {
                g32 g32Var2 = DefaultEventReporter.this.b;
                this.I$0 = intValue2;
                this.label = 2;
                Object a = g32Var2.a(this);
                if (a == h) {
                    return h;
                }
                i = intValue2;
                obj = a;
                ul8.a.z("ET2").q(8, new PendingUploadException(DefaultEventReporter.this.a, i, ((Number) obj).intValue()));
                return ww8.a;
            }
            DefaultEventReporter defaultEventReporter = DefaultEventReporter.this;
            this.label = 3;
            obj = defaultEventReporter.f(this);
            if (obj == h) {
                return h;
            }
            int intValue3 = ((Number) obj).intValue();
            ul8.a.z("ET2").l(intValue3 + " events uploaded to ET2 API", new Object[0]);
            return ww8.a;
        }
    }

    public static final class PendingUploadException extends RuntimeException {
        public PendingUploadException(int i, int i2, int i3) {
            super("Upload threshold (" + i + ") has been exceeded by " + (i2 - i) + " and " + i3 + " events have been deleted in total.");
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {
    }

    public DefaultEventReporter(long j, int i, g32 g32Var, EventTrackerApi eventTrackerApi, n01 n01Var) {
        zq3.h(g32Var, "eventBuffer");
        zq3.h(eventTrackerApi, "eventTrackerApi");
        zq3.h(n01Var, "coroutineDispatchers");
        this.a = i;
        this.b = g32Var;
        this.c = eventTrackerApi;
        this.d = n01Var;
        CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(n01Var.a());
        this.e = CoroutineScope;
        MutableSharedFlow MutableSharedFlow$default = SharedFlowKt.MutableSharedFlow$default(0, 64, null, 4, null);
        this.f = MutableSharedFlow$default;
        FlowKt.launchIn(FlowKt.onEach(FlowKt.debounce(MutableSharedFlow$default, j), new AnonymousClass1(null)), CoroutineScope);
    }

    private final Response e() {
        Response error = Response.error(Constants.NO_SUCH_BUCKET_STATUS_CODE, ResponseBody.Companion.create("UPLOAD ERROR", MediaType.Companion.get(Mimetypes.MIMETYPE_HTML)));
        zq3.g(error, "error(...)");
        return error;
    }

    @Override // defpackage.u42
    public void a() {
        BuildersKt__Builders_commonKt.launch$default(this.e, null, null, new DefaultEventReporter$reportEvents$1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0143 -> B:20:0x0146). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.by0 r12) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.eventtracker.buffer.DefaultEventReporter.f(by0):java.lang.Object");
    }
}
