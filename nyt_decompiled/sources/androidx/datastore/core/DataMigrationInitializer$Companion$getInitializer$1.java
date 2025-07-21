package androidx.datastore.core;

import androidx.datastore.core.DataMigrationInitializer;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.n91;
import defpackage.vj3;
import defpackage.ww8;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.datastore.core.DataMigrationInitializer$Companion$getInitializer$1", f = "DataMigrationInitializer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class DataMigrationInitializer$Companion$getInitializer$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ List<n91> $migrations;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DataMigrationInitializer$Companion$getInitializer$1(List list, by0 by0Var) {
        super(2, by0Var);
        this.$migrations = list;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(vj3 vj3Var, by0 by0Var) {
        return ((DataMigrationInitializer$Companion$getInitializer$1) create(vj3Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        DataMigrationInitializer$Companion$getInitializer$1 dataMigrationInitializer$Companion$getInitializer$1 = new DataMigrationInitializer$Companion$getInitializer$1(this.$migrations, by0Var);
        dataMigrationInitializer$Companion$getInitializer$1.L$0 = obj;
        return dataMigrationInitializer$Companion$getInitializer$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object c;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            vj3 vj3Var = (vj3) this.L$0;
            DataMigrationInitializer.Companion companion = DataMigrationInitializer.a;
            List<n91> list = this.$migrations;
            this.label = 1;
            c = companion.c(list, vj3Var, this);
            if (c == h) {
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
}
