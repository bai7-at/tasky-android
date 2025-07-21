package com.nytimes.android.eventtracker.di;

import com.nytimes.android.eventtracker.validator.fetcher.EventTrackerScriptFetcher;
import defpackage.by0;
import defpackage.fc1;
import defpackage.it2;
import defpackage.ww8;
import java.io.File;
import java.io.FileWriter;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;

@fc1(c = "com.nytimes.android.eventtracker.di.ValidatorApiModule$fileSystemSourceOfTruth$2", f = "Dagger.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ValidatorApiModule$fileSystemSourceOfTruth$2 extends SuspendLambda implements it2 {
    final /* synthetic */ File $storeFileDir;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ValidatorApiModule$fileSystemSourceOfTruth$2(File file, by0 by0Var) {
        super(3, by0Var);
        this.$storeFileDir = file;
    }

    @Override // defpackage.it2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(EventTrackerScriptFetcher.Script script, String str, by0 by0Var) {
        ValidatorApiModule$fileSystemSourceOfTruth$2 validatorApiModule$fileSystemSourceOfTruth$2 = new ValidatorApiModule$fileSystemSourceOfTruth$2(this.$storeFileDir, by0Var);
        validatorApiModule$fileSystemSourceOfTruth$2.L$0 = script;
        validatorApiModule$fileSystemSourceOfTruth$2.L$1 = str;
        return validatorApiModule$fileSystemSourceOfTruth$2.invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        a.h();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        f.b(obj);
        EventTrackerScriptFetcher.Script script = (EventTrackerScriptFetcher.Script) this.L$0;
        String str = (String) this.L$1;
        FileWriter fileWriter = new FileWriter(new File(this.$storeFileDir, script.toString()));
        fileWriter.write(str);
        fileWriter.flush();
        fileWriter.close();
        return ww8.a;
    }
}
