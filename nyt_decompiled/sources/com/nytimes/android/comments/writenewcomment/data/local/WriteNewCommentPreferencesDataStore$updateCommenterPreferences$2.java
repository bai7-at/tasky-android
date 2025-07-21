package com.nytimes.android.comments.writenewcomment.data.local;

import androidx.datastore.preferences.core.MutablePreferences;
import com.nytimes.android.comments.writenewcomment.data.repository.CommenterPreferences;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.comments.writenewcomment.data.local.WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2", f = "WriteNewCommentPreferencesDataStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ CommenterPreferences $commenterPreferences;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2(CommenterPreferences commenterPreferences, by0<? super WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2> by0Var) {
        super(2, by0Var);
        this.$commenterPreferences = commenterPreferences;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0<ww8> create(Object obj, by0<?> by0Var) {
        WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2 writeNewCommentPreferencesDataStore$updateCommenterPreferences$2 = new WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2(this.$commenterPreferences, by0Var);
        writeNewCommentPreferencesDataStore$updateCommenterPreferences$2.L$0 = obj;
        return writeNewCommentPreferencesDataStore$updateCommenterPreferences$2;
    }

    @Override // defpackage.gt2
    public final Object invoke(MutablePreferences mutablePreferences, by0<? super ww8> by0Var) {
        return ((WriteNewCommentPreferencesDataStore$updateCommenterPreferences$2) create(mutablePreferences, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        PreferencesKeys preferencesKeys = PreferencesKeys.INSTANCE;
        mutablePreferences.j(preferencesKeys.getCOMMENTER_NAME(), this.$commenterPreferences.getCommenterName());
        mutablePreferences.j(preferencesKeys.getCOMMENTER_LOCATION(), this.$commenterPreferences.getCommenterLocation());
        return ww8.a;
    }
}
