package com.nytimes.android.saved;

import androidx.fragment.app.Fragment;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.subauth.core.auth.models.RegiInterface;
import com.nytimes.android.utils.SaveOrigin;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.jk;
import defpackage.oa4;
import defpackage.s87;
import defpackage.ww8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.saved.SaveHandler$saveAfterLogin$2", f = "SaveHandler.kt", l = {165, 171}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SaveHandler$saveAfterLogin$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ SaveOrigin $saveOrigin;
    final /* synthetic */ s87 $saveable;
    int label;
    final /* synthetic */ SaveHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SaveHandler$saveAfterLogin$2(SaveHandler saveHandler, Fragment fragment, s87 s87Var, SaveOrigin saveOrigin, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = saveHandler;
        this.$fragment = fragment;
        this.$saveable = s87Var;
        this.$saveOrigin = saveOrigin;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new SaveHandler$saveAfterLogin$2(this.this$0, this.$fragment, this.$saveable, this.$saveOrigin, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        com.nytimes.android.entitlements.a aVar;
        jk jkVar;
        com.nytimes.android.entitlements.a aVar2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            aVar = this.this$0.b;
            jkVar = this.this$0.j;
            RegiInterface regiInterface = RegiInterface.RegiSavePrompt;
            this.label = 1;
            obj = aVar.s(jkVar, regiInterface, "Save Log In Prompt", this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
                return (SaveHandler.SaveResult) obj;
            }
            f.b(obj);
        }
        aVar2 = this.this$0.b;
        if (!aVar2.v((oa4) obj)) {
            return SaveHandler.SaveResult.NotLogged;
        }
        SaveHandler saveHandler = this.this$0;
        Fragment fragment = this.$fragment;
        s87 s87Var = this.$saveable;
        SaveOrigin saveOrigin = this.$saveOrigin;
        this.label = 2;
        obj = saveHandler.l(fragment, s87Var, saveOrigin, this);
        if (obj == h) {
            return h;
        }
        return (SaveHandler.SaveResult) obj;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((SaveHandler$saveAfterLogin$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
