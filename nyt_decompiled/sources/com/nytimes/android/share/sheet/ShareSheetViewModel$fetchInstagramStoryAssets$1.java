package com.nytimes.android.share.sheet;

import android.app.Application;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.squareup.moshi.JsonAdapter;
import defpackage.b04;
import defpackage.by0;
import defpackage.dm6;
import defpackage.fc1;
import defpackage.gm0;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.yp7;
import defpackage.zq3;
import java.io.IOException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

@fc1(c = "com.nytimes.android.share.sheet.ShareSheetViewModel$fetchInstagramStoryAssets$1", f = "ShareSheetViewModel.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class ShareSheetViewModel$fetchInstagramStoryAssets$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ ss2 $onResult;
    final /* synthetic */ String $uri;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ShareSheetViewModel this$0;

    @fc1(c = "com.nytimes.android.share.sheet.ShareSheetViewModel$fetchInstagramStoryAssets$1$1", f = "ShareSheetViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.share.sheet.ShareSheetViewModel$fetchInstagramStoryAssets$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ ss2 $onResult;
        final /* synthetic */ Object $result;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ss2 ss2Var, Object obj, by0 by0Var) {
            super(2, by0Var);
            this.$onResult = ss2Var;
            this.$result = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$onResult, this.$result, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            this.$onResult.invoke(Result.a(this.$result));
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShareSheetViewModel$fetchInstagramStoryAssets$1(ShareSheetViewModel shareSheetViewModel, String str, ss2 ss2Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = shareSheetViewModel;
        this.$uri = str;
        this.$onResult = ss2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ShareSheetViewModel$fetchInstagramStoryAssets$1 shareSheetViewModel$fetchInstagramStoryAssets$1 = new ShareSheetViewModel$fetchInstagramStoryAssets$1(this.this$0, this.$uri, this.$onResult, by0Var);
        shareSheetViewModel$fetchInstagramStoryAssets$1.L$0 = obj;
        return shareSheetViewModel$fetchInstagramStoryAssets$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineDispatcher coroutineDispatcher;
        Application application;
        b04 b04Var;
        Response execute;
        String string;
        JsonAdapter jsonAdapter;
        yp7 p;
        Object h = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            ShareSheetViewModel shareSheetViewModel = this.this$0;
            String str = this.$uri;
            try {
                Result.a aVar = Result.a;
                application = shareSheetViewModel.b;
                String string2 = application.getString(dm6.generate_instagram_story_url);
                zq3.g(string2, "getString(...)");
                Request build = new Request.Builder().url(string2 + str).build();
                b04Var = shareSheetViewModel.a;
                execute = ((OkHttpClient) b04Var.get()).newCall(build).execute();
                try {
                } finally {
                }
            } catch (Throwable th) {
                Result.a aVar2 = Result.a;
                b = Result.b(f.a(th));
            }
            if (!execute.isSuccessful()) {
                throw new IOException("Request failed with code: " + execute.code());
            }
            ResponseBody body = execute.body();
            if (body == null || (string = body.string()) == null) {
                throw new IOException("body is null");
            }
            jsonAdapter = shareSheetViewModel.g;
            ShareInstagramStoriesAssets shareInstagramStoriesAssets = (ShareInstagramStoriesAssets) jsonAdapter.fromJson(string);
            if (shareInstagramStoriesAssets == null) {
                throw new IOException("body can not be parsed");
            }
            p = shareSheetViewModel.p(str, shareInstagramStoriesAssets);
            shareSheetViewModel.h = p;
            gm0.a(execute, null);
            b = Result.b(p);
            coroutineDispatcher = this.this$0.d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$onResult, b, null);
            this.label = 1;
            if (BuildersKt.withContext(coroutineDispatcher, anonymousClass1, this) == h) {
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
        return ((ShareSheetViewModel$fetchInstagramStoryAssets$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
