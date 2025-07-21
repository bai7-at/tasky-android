package com.nytimes.android.features.you.youtab;

import com.nytimes.android.coroutinesutils.DownloadState;
import com.nytimes.android.features.you.youtab.b;
import com.nytimes.android.interests.InterestPreview;
import com.nytimes.android.interests.InterestsManager;
import defpackage.by0;
import defpackage.cc0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ww8;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.i;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;

@fc1(c = "com.nytimes.android.features.you.youtab.YouScreenViewModel$loadInterestPreviews$1", f = "YouScreenViewModel.kt", l = {325}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class YouScreenViewModel$loadInterestPreviews$1 extends SuspendLambda implements gt2 {
    int label;
    final /* synthetic */ YouScreenViewModel this$0;

    static final class a implements FlowCollector {
        final /* synthetic */ YouScreenViewModel a;
        final /* synthetic */ Set b;

        a(YouScreenViewModel youScreenViewModel, Set set) {
            this.a = youScreenViewModel;
            this.b = set;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(DownloadState downloadState, by0 by0Var) {
            MutableStateFlow mutableStateFlow;
            mutableStateFlow = this.a.y;
            DownloadState downloadState2 = DownloadState.c.b;
            if (!zq3.c(downloadState, downloadState2)) {
                if (!(downloadState instanceof DownloadState.a)) {
                    if (downloadState instanceof DownloadState.b) {
                        DownloadState.b bVar = (DownloadState.b) downloadState;
                        Iterable iterable = (Iterable) ((Pair) bVar.a()).c();
                        Set set = this.b;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : iterable) {
                            if (!set.contains(cc0.c(((InterestPreview) obj).b()))) {
                                arrayList.add(obj);
                            }
                        }
                        downloadState2 = new DownloadState.b(arrayList, bVar.d(), bVar.c());
                    } else if (downloadState instanceof DownloadState.d) {
                        Iterable iterable2 = (Iterable) ((Pair) ((DownloadState.d) downloadState).a()).c();
                        Set set2 = this.b;
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : iterable2) {
                            if (!set2.contains(cc0.c(((InterestPreview) obj2).b()))) {
                                arrayList2.add(obj2);
                            }
                        }
                        downloadState = new DownloadState.d(arrayList2);
                    } else {
                        if (!(downloadState instanceof DownloadState.e)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Iterable iterable3 = (Iterable) ((Pair) ((DownloadState.e) downloadState).a()).c();
                        Set set3 = this.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : iterable3) {
                            if (!set3.contains(cc0.c(((InterestPreview) obj3).b()))) {
                                arrayList3.add(obj3);
                            }
                        }
                        downloadState = new DownloadState.e(arrayList3);
                    }
                }
                mutableStateFlow.setValue(downloadState);
                return ww8.a;
            }
            downloadState = downloadState2;
            mutableStateFlow.setValue(downloadState);
            return ww8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    YouScreenViewModel$loadInterestPreviews$1(YouScreenViewModel youScreenViewModel, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = youScreenViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new YouScreenViewModel$loadInterestPreviews$1(this.this$0, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterestsManager interestsManager;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            Object a2 = ((DownloadState) this.this$0.H().getValue()).a();
            zq3.f(a2, "null cannot be cast to non-null type com.nytimes.android.features.you.youtab.InterestsUIState.Content");
            List d = ((b.a) a2).d();
            ArrayList arrayList = new ArrayList(i.w(d, 10));
            Iterator it2 = d.iterator();
            while (it2.hasNext()) {
                arrayList.add(cc0.c(((com.nytimes.android.interests.db.a) it2.next()).d()));
            }
            Set c1 = i.c1(arrayList);
            interestsManager = this.this$0.r;
            Flow m = interestsManager.m(c1);
            a aVar = new a(this.this$0, c1);
            this.label = 1;
            if (m.collect(aVar, this) == h) {
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
        return ((YouScreenViewModel$loadInterestPreviews$1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
