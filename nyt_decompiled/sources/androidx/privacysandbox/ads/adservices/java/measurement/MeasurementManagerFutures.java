package androidx.privacysandbox.ads.adservices.java.measurement;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import defpackage.dm1;
import defpackage.hh4;
import defpackage.j64;
import defpackage.je9;
import defpackage.ke9;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public abstract class MeasurementManagerFutures {
    public static final a a = new a(null);

    /* JADX INFO: Access modifiers changed from: private */
    static final class Api33Ext5JavaImpl extends MeasurementManagerFutures {
        private final hh4 b;

        public Api33Ext5JavaImpl(hh4 hh4Var) {
            zq3.h(hh4Var, "mMeasurementManager");
            this.b = hh4Var;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public j64 b() {
            Deferred async$default;
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1(this, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }

        @Override // androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures
        public j64 c(Uri uri, InputEvent inputEvent) {
            Deferred async$default;
            zq3.h(uri, "attributionSource");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1(this, uri, inputEvent, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }

        public j64 e(dm1 dm1Var) {
            Deferred async$default;
            zq3.h(dm1Var, "deletionRequest");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$deleteRegistrationsAsync$1(this, dm1Var, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }

        public j64 f(Uri uri) {
            Deferred async$default;
            zq3.h(uri, "trigger");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1(this, uri, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }

        public j64 g(je9 je9Var) {
            Deferred async$default;
            zq3.h(je9Var, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebSourceAsync$1(this, je9Var, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }

        public j64 h(ke9 ke9Var) {
            Deferred async$default;
            zq3.h(ke9Var, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault()), null, null, new MeasurementManagerFutures$Api33Ext5JavaImpl$registerWebTriggerAsync$1(this, ke9Var, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MeasurementManagerFutures a(Context context) {
            zq3.h(context, "context");
            hh4 a = hh4.a.a(context);
            if (a != null) {
                return new Api33Ext5JavaImpl(a);
            }
            return null;
        }

        private a() {
        }
    }

    public static final MeasurementManagerFutures a(Context context) {
        return a.a(context);
    }

    public abstract j64 b();

    public abstract j64 c(Uri uri, InputEvent inputEvent);
}
