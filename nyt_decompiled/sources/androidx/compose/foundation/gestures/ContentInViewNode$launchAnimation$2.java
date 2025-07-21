package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.kt6;
import defpackage.qc7;
import defpackage.qs2;
import defpackage.ss2;
import defpackage.tc7;
import defpackage.vy4;
import defpackage.ww8;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;

@fc1(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2", f = "ContentInViewNode.kt", l = {190}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class ContentInViewNode$launchAnimation$2 extends SuspendLambda implements gt2 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ContentInViewNode this$0;

    @fc1(c = "androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1", f = "ContentInViewNode.kt", l = {195}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ Job $animationJob;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ContentInViewNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ContentInViewNode contentInViewNode, Job job, by0 by0Var) {
            super(2, by0Var);
            this.this$0 = contentInViewNode;
            this.$animationJob = job;
        }

        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(qc7 qc7Var, by0 by0Var) {
            return ((AnonymousClass1) create(qc7Var, by0Var)).invokeSuspend(ww8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$animationJob, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            UpdatableAnimationState updatableAnimationState;
            float p2;
            UpdatableAnimationState updatableAnimationState2;
            Object h = kotlin.coroutines.intrinsics.a.h();
            int i = this.label;
            if (i == 0) {
                f.b(obj);
                final qc7 qc7Var = (qc7) this.L$0;
                updatableAnimationState = this.this$0.M;
                p2 = this.this$0.p2();
                updatableAnimationState.j(p2);
                updatableAnimationState2 = this.this$0.M;
                final ContentInViewNode contentInViewNode = this.this$0;
                final Job job = this.$animationJob;
                ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void b(float f) {
                        boolean z;
                        z = ContentInViewNode.this.s;
                        float f2 = z ? 1.0f : -1.0f;
                        float a = f2 * qc7Var.a(f2 * f);
                        if (Math.abs(a) < Math.abs(f)) {
                            JobKt__JobKt.cancel$default(job, "Scroll animation cancelled because scroll was not consumed (" + a + " < " + f + ')', null, 2, null);
                        }
                    }

                    @Override // defpackage.ss2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                        b(((Number) obj2).floatValue());
                        return ww8.a;
                    }
                };
                final ContentInViewNode contentInViewNode2 = this.this$0;
                qs2 qs2Var = new qs2() { // from class: androidx.compose.foundation.gestures.ContentInViewNode.launchAnimation.2.1.2
                    {
                        super(0);
                    }

                    @Override // defpackage.qs2
                    /* renamed from: invoke */
                    public /* bridge */ /* synthetic */ Object mo865invoke() {
                        m21invoke();
                        return ww8.a;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m21invoke() {
                        vy4 vy4Var;
                        boolean z;
                        UpdatableAnimationState updatableAnimationState3;
                        float p22;
                        kt6 u2;
                        vy4 vy4Var2;
                        vy4 vy4Var3;
                        vy4 vy4Var4;
                        BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = ContentInViewNode.this.u;
                        ContentInViewNode contentInViewNode3 = ContentInViewNode.this;
                        while (true) {
                            vy4Var = bringIntoViewRequestPriorityQueue.a;
                            if (!vy4Var.t()) {
                                break;
                            }
                            vy4Var2 = bringIntoViewRequestPriorityQueue.a;
                            kt6 kt6Var = (kt6) ((ContentInViewNode.a) vy4Var2.u()).b().mo865invoke();
                            if (!(kt6Var == null ? true : ContentInViewNode.x2(contentInViewNode3, kt6Var, 0L, 1, null))) {
                                break;
                            }
                            vy4Var3 = bringIntoViewRequestPriorityQueue.a;
                            vy4Var4 = bringIntoViewRequestPriorityQueue.a;
                            ((ContentInViewNode.a) vy4Var3.y(vy4Var4.q() - 1)).a().resumeWith(Result.b(ww8.a));
                        }
                        z = ContentInViewNode.this.B;
                        if (z) {
                            u2 = ContentInViewNode.this.u2();
                            if (u2 != null && ContentInViewNode.x2(ContentInViewNode.this, u2, 0L, 1, null)) {
                                ContentInViewNode.this.B = false;
                            }
                        }
                        updatableAnimationState3 = ContentInViewNode.this.M;
                        p22 = ContentInViewNode.this.p2();
                        updatableAnimationState3.j(p22);
                    }
                };
                this.label = 1;
                if (updatableAnimationState2.h(ss2Var, qs2Var, this) == h) {
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ContentInViewNode$launchAnimation$2(ContentInViewNode contentInViewNode, by0 by0Var) {
        super(2, by0Var);
        this.this$0 = contentInViewNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        ContentInViewNode$launchAnimation$2 contentInViewNode$launchAnimation$2 = new ContentInViewNode$launchAnimation$2(this.this$0, by0Var);
        contentInViewNode$launchAnimation$2.L$0 = obj;
        return contentInViewNode$launchAnimation$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tc7 tc7Var;
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        try {
            try {
                if (i == 0) {
                    f.b(obj);
                    Job job = JobKt.getJob(((CoroutineScope) this.L$0).getCoroutineContext());
                    this.this$0.L = true;
                    tc7Var = this.this$0.r;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, job, null);
                    this.label = 1;
                    if (tc7.e(tc7Var, null, anonymousClass1, this, 1, null) == h) {
                        return h;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f.b(obj);
                }
                this.this$0.u.d();
                this.this$0.L = false;
                this.this$0.u.b(null);
                this.this$0.B = false;
                return ww8.a;
            } catch (CancellationException e) {
                throw e;
            }
        } catch (Throwable th) {
            this.this$0.L = false;
            this.this$0.u.b(null);
            this.this$0.B = false;
            throw th;
        }
    }

    @Override // defpackage.gt2
    public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
        return ((ContentInViewNode$launchAnimation$2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
    }
}
