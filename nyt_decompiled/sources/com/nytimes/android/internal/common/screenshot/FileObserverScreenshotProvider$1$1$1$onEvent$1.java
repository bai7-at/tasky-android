package com.nytimes.android.internal.common.screenshot;

import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

@fc1(c = "com.nytimes.android.internal.common.screenshot.FileObserverScreenshotProvider$1$1$1$onEvent$1", f = "FileObserverScreenshotProvider.kt", l = {70}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class FileObserverScreenshotProvider$1$1$1$onEvent$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ Set<File> $directories;
    final /* synthetic */ String $path;
    int label;
    final /* synthetic */ FileObserverScreenshotProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FileObserverScreenshotProvider$1$1$1$onEvent$1(FileObserverScreenshotProvider fileObserverScreenshotProvider, Set set, String str, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = fileObserverScreenshotProvider;
        this.$directories = set;
        this.$path = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new FileObserverScreenshotProvider$1$1$1$onEvent$1(this.this$0, this.$directories, this.$path, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        MutableSharedFlow mutableSharedFlow;
        Object obj2;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Set<File> set = this.$directories;
            String str = this.$path;
            try {
                Result.a aVar = Result.a;
                Iterator<T> it2 = set.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    zq3.e(str);
                    if (new File((File) obj2, str).exists()) {
                        break;
                    }
                }
                zq3.e(str);
                b = Result.b(new File((File) obj2, str));
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                b = Result.b(f.a(th));
            }
            Object obj3 = Result.g(b) ? null : b;
            mutableSharedFlow = this.this$0.c;
            this.label = 1;
            if (mutableSharedFlow.emit((File) obj3, this) == h) {
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
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((FileObserverScreenshotProvider$1$1$1$onEvent$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
