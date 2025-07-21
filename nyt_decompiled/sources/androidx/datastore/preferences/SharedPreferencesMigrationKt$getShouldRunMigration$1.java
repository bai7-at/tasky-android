package androidx.datastore.preferences;

import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Set<String> $keysToMigrate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SharedPreferencesMigrationKt$getShouldRunMigration$1(Set set, by0 by0Var) {
        super(2, by0Var);
        this.$keysToMigrate = set;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s16 s16Var, by0 by0Var) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create(s16Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.$keysToMigrate, by0Var);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.L$0 = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        Set keySet = ((s16) this.L$0).a().keySet();
        ArrayList arrayList = new ArrayList(i.w(keySet, 10));
        Iterator it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(((s16.a) it2.next()).a());
        }
        boolean z = true;
        if (this.$keysToMigrate != SharedPreferencesMigrationKt.c()) {
            Set<String> set = this.$keysToMigrate;
            if (!(set instanceof Collection) || !set.isEmpty()) {
                Iterator<T> it3 = set.iterator();
                while (it3.hasNext()) {
                    if (cc0.a(!arrayList.contains((String) it3.next())).booleanValue()) {
                        break;
                    }
                }
            }
            z = false;
        }
        return cc0.a(z);
    }
}
