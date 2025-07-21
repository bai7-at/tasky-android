package androidx.datastore.preferences.core;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.s16;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class PreferenceDataStore$updateData$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ gt2 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PreferenceDataStore$updateData$2(gt2 gt2Var, by0 by0Var) {
        super(2, by0Var);
        this.$transform = gt2Var;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(s16 s16Var, by0 by0Var) {
        return ((PreferenceDataStore$updateData$2) create(s16Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, by0Var);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            s16 s16Var = (s16) this.L$0;
            gt2 gt2Var = this.$transform;
            this.label = 1;
            obj = gt2Var.invoke(s16Var, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        s16 s16Var2 = (s16) obj;
        ((MutablePreferences) s16Var2).g();
        return s16Var2;
    }
}
