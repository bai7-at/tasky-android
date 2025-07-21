package androidx.privacysandbox.ads.adservices.java.topics;

import android.content.Context;
import androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt;
import defpackage.ao8;
import defpackage.j64;
import defpackage.zq3;
import defpackage.zy2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* loaded from: classes.dex */
public abstract class TopicsManagerFutures {
    public static final a a = new a(null);

    /* JADX INFO: Access modifiers changed from: private */
    static final class Api33Ext4JavaImpl extends TopicsManagerFutures {
        private final ao8 b;

        public Api33Ext4JavaImpl(ao8 ao8Var) {
            zq3.h(ao8Var, "mTopicsManager");
            this.b = ao8Var;
        }

        @Override // androidx.privacysandbox.ads.adservices.java.topics.TopicsManagerFutures
        public j64 b(zy2 zy2Var) {
            Deferred async$default;
            zq3.h(zy2Var, "request");
            async$default = BuildersKt__Builders_commonKt.async$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new TopicsManagerFutures$Api33Ext4JavaImpl$getTopicsAsync$1(this, zy2Var, null), 3, null);
            return CoroutineAdapterKt.c(async$default, null, 1, null);
        }
    }

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TopicsManagerFutures a(Context context) {
            zq3.h(context, "context");
            ao8 a = ao8.a.a(context);
            if (a != null) {
                return new Api33Ext4JavaImpl(a);
            }
            return null;
        }

        private a() {
        }
    }

    public static final TopicsManagerFutures a(Context context) {
        return a.a(context);
    }

    public abstract j64 b(zy2 zy2Var);
}
