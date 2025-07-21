package com.nytimes.android.interests;

import com.nytimes.android.interests.db.Interest;
import defpackage.b05;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fp3;
import defpackage.gp3;
import defpackage.gt2;
import defpackage.st;
import defpackage.ww8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;

@fc1(c = "com.nytimes.android.interests.InterestsCacheManager$updateSingleInterest$2", f = "InterestsCacheManager.kt", l = {150}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class InterestsCacheManager$updateSingleInterest$2 extends SuspendLambda implements gt2 {
    final /* synthetic */ fp3 $content;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InterestsCacheManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterestsCacheManager$updateSingleInterest$2(InterestsCacheManager interestsCacheManager, fp3 fp3Var, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = interestsCacheManager;
        this.$content = fp3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        return new InterestsCacheManager$updateSingleInterest$2(this.this$0, this.$content, by0Var);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b05 b05Var;
        long c;
        gp3 gp3Var;
        Iterator it2;
        InterestsCacheManager interestsCacheManager;
        List e;
        ArrayList arrayList;
        st h;
        Object m;
        Object h2 = a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            b05Var = this.this$0.g;
            c = b05Var.c();
            List<com.nytimes.android.interests.db.a> a = this.$content.a();
            ArrayList arrayList2 = new ArrayList(i.w(a, 10));
            for (com.nytimes.android.interests.db.a aVar : a) {
                Interest b = aVar.b();
                if (b instanceof Interest.ColumnInterest) {
                    e = ((Interest.ColumnInterest) aVar.b()).d();
                } else if (b instanceof Interest.NewsletterInterest) {
                    e = ((Interest.NewsletterInterest) aVar.b()).d();
                } else {
                    if (b instanceof Interest.ShuffleInterest) {
                        List d = ((Interest.ShuffleInterest) aVar.b()).d();
                        arrayList = new ArrayList(i.w(d, 10));
                        Iterator it3 = d.iterator();
                        while (it3.hasNext()) {
                            arrayList.add(((Interest.PersonalizedItem) it3.next()).b());
                        }
                    } else if (b instanceof Interest.FlashbackQuizInterest) {
                        e = i.e(((Interest.FlashbackQuizInterest) aVar.b()).e());
                    } else if (b instanceof Interest.FilterInterest) {
                        Set d2 = ((Interest.FilterInterest) aVar.b()).d();
                        arrayList = new ArrayList();
                        Iterator it4 = d2.iterator();
                        while (it4.hasNext()) {
                            i.B(arrayList, ((Interest.Filter) it4.next()).b());
                        }
                    } else if (b instanceof Interest.BooksInterest) {
                        e = ((Interest.BooksInterest) aVar.b()).f();
                    } else {
                        if (!(b instanceof Interest.NewsQuizInterest)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        e = i.e(((Interest.NewsQuizInterest) aVar.b()).e().g());
                    }
                    e = arrayList;
                }
                arrayList2.add(e);
            }
            gp3Var = this.this$0.c;
            com.nytimes.android.interests.db.a[] aVarArr = (com.nytimes.android.interests.db.a[]) this.$content.a().toArray(new com.nytimes.android.interests.db.a[0]);
            gp3Var.d((com.nytimes.android.interests.db.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
            InterestsCacheManager interestsCacheManager2 = this.this$0;
            it2 = arrayList2.iterator();
            interestsCacheManager = interestsCacheManager2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c = this.J$0;
            it2 = (Iterator) this.L$1;
            interestsCacheManager = (InterestsCacheManager) this.L$0;
            f.b(obj);
        }
        while (it2.hasNext()) {
            List list = (List) it2.next();
            h = interestsCacheManager.h(c);
            this.L$0 = interestsCacheManager;
            this.L$1 = it2;
            this.J$0 = c;
            this.label = 1;
            m = interestsCacheManager.m(h, list, this);
            if (m == h2) {
                return h2;
            }
        }
        return ww8.a;
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((InterestsCacheManager$updateSingleInterest$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
