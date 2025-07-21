package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import defpackage.by0;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.xh8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;

@fc1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1", f = "CoreTextField.kt", l = {1134}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class CoreTextFieldKt$TextFieldCursorHandle$1 extends SuspendLambda implements gt2 {
    final /* synthetic */ TextFieldSelectionManager $manager;
    final /* synthetic */ xh8 $observer;
    private /* synthetic */ Object L$0;
    int label;

    @fc1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1", f = "CoreTextField.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements gt2 {
        final /* synthetic */ fy5 $$this$pointerInput;
        final /* synthetic */ TextFieldSelectionManager $manager;
        final /* synthetic */ xh8 $observer;
        private /* synthetic */ Object L$0;
        int label;

        @fc1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1", f = "CoreTextField.kt", l = {1138}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$1, reason: invalid class name and collision with other inner class name */
        static final class C00341 extends SuspendLambda implements gt2 {
            final /* synthetic */ fy5 $$this$pointerInput;
            final /* synthetic */ xh8 $observer;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C00341(fy5 fy5Var, xh8 xh8Var, by0 by0Var) {
                super(2, by0Var);
                this.$$this$pointerInput = fy5Var;
                this.$observer = xh8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new C00341(this.$$this$pointerInput, this.$observer, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    fy5 fy5Var = this.$$this$pointerInput;
                    xh8 xh8Var = this.$observer;
                    this.label = 1;
                    if (LongPressTextDragObserverKt.c(fy5Var, xh8Var, this) == h) {
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
                return ((C00341) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        @fc1(c = "androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2", f = "CoreTextField.kt", l = {1141}, m = "invokeSuspend")
        /* renamed from: androidx.compose.foundation.text.CoreTextFieldKt$TextFieldCursorHandle$1$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends SuspendLambda implements gt2 {
            final /* synthetic */ fy5 $$this$pointerInput;
            final /* synthetic */ TextFieldSelectionManager $manager;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(fy5 fy5Var, TextFieldSelectionManager textFieldSelectionManager, by0 by0Var) {
                super(2, by0Var);
                this.$$this$pointerInput = fy5Var;
                this.$manager = textFieldSelectionManager;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final by0 create(Object obj, by0 by0Var) {
                return new AnonymousClass2(this.$$this$pointerInput, this.$manager, by0Var);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object h = kotlin.coroutines.intrinsics.a.h();
                int i = this.label;
                if (i == 0) {
                    f.b(obj);
                    fy5 fy5Var = this.$$this$pointerInput;
                    final TextFieldSelectionManager textFieldSelectionManager = this.$manager;
                    ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.text.CoreTextFieldKt.TextFieldCursorHandle.1.1.2.1
                        {
                            super(1);
                        }

                        public final void b(long j) {
                            TextFieldSelectionManager.this.e0();
                        }

                        @Override // defpackage.ss2
                        public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                            b(((fd5) obj2).x());
                            return ww8.a;
                        }
                    };
                    this.label = 1;
                    if (TapGestureDetectorKt.j(fy5Var, null, null, null, ss2Var, this, 7, null) == h) {
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
                return ((AnonymousClass2) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(fy5 fy5Var, xh8 xh8Var, TextFieldSelectionManager textFieldSelectionManager, by0 by0Var) {
            super(2, by0Var);
            this.$$this$pointerInput = fy5Var;
            this.$observer = xh8Var;
            this.$manager = textFieldSelectionManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final by0 create(Object obj, by0 by0Var) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$pointerInput, this.$observer, this.$manager, by0Var);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.a.h();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new C00341(this.$$this$pointerInput, this.$observer, null), 1, null);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, coroutineStart, new AnonymousClass2(this.$$this$pointerInput, this.$manager, null), 1, null);
            return ww8.a;
        }

        @Override // defpackage.gt2
        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
            return ((AnonymousClass1) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoreTextFieldKt$TextFieldCursorHandle$1(xh8 xh8Var, TextFieldSelectionManager textFieldSelectionManager, by0 by0Var) {
        super(2, by0Var);
        this.$observer = xh8Var;
        this.$manager = textFieldSelectionManager;
    }

    @Override // defpackage.gt2
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object invoke(fy5 fy5Var, by0 by0Var) {
        return ((CoreTextFieldKt$TextFieldCursorHandle$1) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final by0 create(Object obj, by0 by0Var) {
        CoreTextFieldKt$TextFieldCursorHandle$1 coreTextFieldKt$TextFieldCursorHandle$1 = new CoreTextFieldKt$TextFieldCursorHandle$1(this.$observer, this.$manager, by0Var);
        coreTextFieldKt$TextFieldCursorHandle$1.L$0 = obj;
        return coreTextFieldKt$TextFieldCursorHandle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object h = kotlin.coroutines.intrinsics.a.h();
        int i = this.label;
        if (i == 0) {
            f.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((fy5) this.L$0, this.$observer, this.$manager, null);
            this.label = 1;
            if (CoroutineScopeKt.coroutineScope(anonymousClass1, this) == h) {
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
