package defpackage;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.measurement.WebSourceRegistrationRequest;
import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.InputEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes.dex */
public abstract class hh4 {
    public static final b a = new b(null);

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hh4 a(Context context) {
            zq3.h(context, "context");
            StringBuilder sb = new StringBuilder();
            sb.append("AdServicesInfo.version=");
            r7 r7Var = r7.a;
            sb.append(r7Var.a());
            Log.d("MeasurementManager", sb.toString());
            if (r7Var.a() >= 5) {
                return new a(context);
            }
            return null;
        }

        private b() {
        }
    }

    public abstract Object a(dm1 dm1Var, by0 by0Var);

    public abstract Object b(by0 by0Var);

    public abstract Object c(Uri uri, InputEvent inputEvent, by0 by0Var);

    public abstract Object d(Uri uri, by0 by0Var);

    public abstract Object e(je9 je9Var, by0 by0Var);

    public abstract Object f(ke9 ke9Var, by0 by0Var);

    private static final class a extends hh4 {
        private final MeasurementManager b;

        public a(MeasurementManager measurementManager) {
            zq3.h(measurementManager, "mMeasurementManager");
            this.b = measurementManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DeletionRequest k(dm1 dm1Var) {
            eh4.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebSourceRegistrationRequest l(je9 je9Var) {
            fh4.a();
            throw null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final WebTriggerRegistrationRequest m(ke9 ke9Var) {
            wg4.a();
            throw null;
        }

        @Override // defpackage.hh4
        public Object a(dm1 dm1Var, by0<? super ww8> by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.b.deleteRegistrations(k(dm1Var), new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
        }

        @Override // defpackage.hh4
        public Object b(by0<? super Integer> by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.b.getMeasurementApiStatus(new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result;
        }

        @Override // defpackage.hh4
        public Object c(Uri uri, InputEvent inputEvent, by0<? super ww8> by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.b.registerSource(uri, inputEvent, new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
        }

        @Override // defpackage.hh4
        public Object d(Uri uri, by0<? super ww8> by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.b.registerTrigger(uri, new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
        }

        @Override // defpackage.hh4
        public Object e(je9 je9Var, by0<? super ww8> by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.b.registerWebSource(l(je9Var), new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
        }

        @Override // defpackage.hh4
        public Object f(ke9 ke9Var, by0<? super ww8> by0Var) {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.a.d(by0Var), 1);
            cancellableContinuationImpl.initCancellability();
            this.b.registerWebTrigger(m(ke9Var), new gh4(), androidx.core.os.a.a(cancellableContinuationImpl));
            Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.a.h()) {
                hc1.c(by0Var);
            }
            return result == kotlin.coroutines.intrinsics.a.h() ? result : ww8.a;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(android.content.Context r2) {
            /*
                r1 = this;
                java.lang.String r0 = "context"
                defpackage.zq3.h(r2, r0)
                java.lang.Class r0 = defpackage.zg4.a()
                java.lang.Object r2 = r2.getSystemService(r0)
                java.lang.String r0 = "context.getSystemService…:class.java\n            )"
                defpackage.zq3.g(r2, r0)
                android.adservices.measurement.MeasurementManager r2 = defpackage.ah4.a(r2)
                r1.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hh4.a.<init>(android.content.Context):void");
        }
    }
}
