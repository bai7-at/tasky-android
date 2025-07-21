package com.nytimes.android.features.you.youtab;

import androidx.lifecycle.r;
import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.features.you.youtab.a;
import com.nytimes.android.recentlyviewed.room.AssetDatabase;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.hs;
import defpackage.ww8;
import defpackage.z18;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$loadRecentlyViewed$1", f = "YouScreenViewModel.kt", l = {583}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$loadRecentlyViewed$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ a $data;
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    @fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$loadRecentlyViewed$1$1", f = "YouScreenViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.nytimes.android.features.you.youtab.YouScreenViewModel$loadRecentlyViewed$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ List<z18> $items;
        final /* synthetic */ int $size;
        int label;
        final /* synthetic */ YouScreenViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(List list, YouScreenViewModel youScreenViewModel, int i, by0 by0Var) {
            super(2, by0Var);
            this.$items = list;
            this.this$0 = youScreenViewModel;
            this.$size = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            return new AnonymousClass1(this.$items, this.this$0, this.$size, by0Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableStateFlow mutableStateFlow;
            MutableStateFlow mutableStateFlow2;
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            if (this.$items.isEmpty()) {
                mutableStateFlow2 = this.this$0.N;
                mutableStateFlow2.setValue(new DownloadState.e(a.b.a));
            } else {
                mutableStateFlow = this.this$0.N;
                List<z18> list = this.$items;
                ArrayList arrayList = new ArrayList(i.w(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((z18) it2.next()).f());
                }
                mutableStateFlow.setValue(new DownloadState.e(new a.C0295a(arrayList, this.$size)));
            }
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$loadRecentlyViewed$1(a aVar, YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(2, by0Var);
        this.$data = aVar;
        this.this$0 = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$loadRecentlyViewed$1(this.$data, this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        MutableStateFlow mutableStateFlow;
        AssetDatabase assetDatabase;
        MutableStateFlow mutableStateFlow2;
        AssetDatabase assetDatabase2;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            if (this.$data != null) {
                mutableStateFlow2 = this.this$0.N;
                mutableStateFlow2.setValue(new DownloadState.d(this.$data));
            } else {
                mutableStateFlow = this.this$0.N;
                mutableStateFlow.setValue(DownloadState.c.b);
            }
            assetDatabase = this.this$0.k;
            hs d = assetDatabase.d();
            this.label = 1;
            obj = d.g(5, this);
            if (obj == h) {
                return h;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        }
        assetDatabase2 = this.this$0.k;
        BuildersKt__Builders_commonKt.launch$default(r.a(this.this$0), Dispatchers.getMain(), null, new AnonymousClass1((List) obj, this.this$0, assetDatabase2.d().h(), null), 2, null);
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((YouScreenViewModel$loadRecentlyViewed$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
