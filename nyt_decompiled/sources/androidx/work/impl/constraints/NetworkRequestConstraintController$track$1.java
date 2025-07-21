package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.impl.constraints.a;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.gv0;
import defpackage.h94;
import defpackage.qs2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.SendChannel;

@fc1(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {182}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class NetworkRequestConstraintController$track$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ gv0 $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ NetworkRequestConstraintController this$0;

    public static final class a extends ConnectivityManager.NetworkCallback {
        final /* synthetic */ Job a;
        final /* synthetic */ ProducerScope b;

        a(Job job, ProducerScope producerScope) {
            this.a = job;
            this.b = producerScope;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            String str;
            zq3.h(network, "network");
            zq3.h(networkCapabilities, "networkCapabilities");
            Job.DefaultImpls.cancel$default(this.a, (CancellationException) null, 1, (Object) null);
            h94 e = h94.e();
            str = WorkConstraintsTrackerKt.a;
            e.a(str, "NetworkRequestConstraintController onCapabilitiesChanged callback");
            this.b.mo129trySendJP2dKIU(a.C0124a.a);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            String str;
            zq3.h(network, "network");
            Job.DefaultImpls.cancel$default(this.a, (CancellationException) null, 1, (Object) null);
            h94 e = h94.e();
            str = WorkConstraintsTrackerKt.a;
            e.a(str, "NetworkRequestConstraintController onLost callback");
            this.b.mo129trySendJP2dKIU(new a.b(7));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NetworkRequestConstraintController$track$1(gv0 gv0Var, NetworkRequestConstraintController networkRequestConstraintController, by0 by0Var) {
        super(2, by0Var);
        this.$constraints = gv0Var;
        this.this$0 = networkRequestConstraintController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        NetworkRequestConstraintController$track$1 networkRequestConstraintController$track$1 = new NetworkRequestConstraintController$track$1(this.$constraints, this.this$0, by0Var);
        networkRequestConstraintController$track$1.L$0 = obj;
        return networkRequestConstraintController$track$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        String str;
        ConnectivityManager connectivityManager;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ProducerScope producerScope = (ProducerScope) this.L$0;
            NetworkRequest d = this.$constraints.d();
            if (d == null) {
                SendChannel.DefaultImpls.close$default(producerScope.getChannel(), null, 1, null);
                return ww8.a;
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new NetworkRequestConstraintController$track$1$job$1(this.this$0, producerScope, null), 3, null);
            final a aVar = new a(launch$default, producerScope);
            h94 e = h94.e();
            str = WorkConstraintsTrackerKt.a;
            e.a(str, "NetworkRequestConstraintController register callback");
            connectivityManager = this.this$0.a;
            connectivityManager.registerNetworkCallback(d, aVar);
            final NetworkRequestConstraintController networkRequestConstraintController = this.this$0;
            qs2 qs2Var = new qs2() { // from class: androidx.work.impl.constraints.NetworkRequestConstraintController$track$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ Object mo865invoke() {
                    m130invoke();
                    return ww8.a;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m130invoke() {
                    String str2;
                    ConnectivityManager connectivityManager2;
                    h94 e2 = h94.e();
                    str2 = WorkConstraintsTrackerKt.a;
                    e2.a(str2, "NetworkRequestConstraintController unregister callback");
                    connectivityManager2 = NetworkRequestConstraintController.this.a;
                    connectivityManager2.unregisterNetworkCallback(aVar);
                }
            };
            this.label = 1;
            if (ProduceKt.awaitClose(producerScope, qs2Var, this) == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(ProducerScope producerScope, by0 by0Var) {
        return ((NetworkRequestConstraintController$track$1) create(producerScope, by0Var)).invokeSuspend(ww8.a);
    }
}
