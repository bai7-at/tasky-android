package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.b0;
import androidx.compose.runtime.e;
import androidx.compose.runtime.y;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import com.google.android.exoplayer2.metadata.mp4.MdtaMetadataEntry;
import defpackage.bd8;
import defpackage.bo3;
import defpackage.by0;
import defpackage.c26;
import defpackage.d26;
import defpackage.dy4;
import defpackage.e26;
import defpackage.f26;
import defpackage.fc1;
import defpackage.fd5;
import defpackage.fy5;
import defpackage.gt2;
import defpackage.it2;
import defpackage.ms1;
import defpackage.ns1;
import defpackage.py1;
import defpackage.ss2;
import defpackage.sy4;
import defpackage.ww8;
import defpackage.x08;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes.dex */
public abstract class TextFieldPressGestureFilterKt {
    public static final Modifier a(Modifier modifier, final dy4 dy4Var, boolean z, final ss2 ss2Var) {
        return z ? ComposedModifierKt.b(modifier, null, new it2() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1

            @fc1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2", f = "TextFieldPressGestureFilter.kt", l = {54}, m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2, reason: invalid class name */
            static final class AnonymousClass2 extends SuspendLambda implements gt2 {
                final /* synthetic */ dy4 $interactionSource;
                final /* synthetic */ x08 $onTapState;
                final /* synthetic */ sy4 $pressedInteraction;
                final /* synthetic */ CoroutineScope $scope;
                private /* synthetic */ Object L$0;
                int label;

                @fc1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1", f = "TextFieldPressGestureFilter.kt", l = {MdtaMetadataEntry.TYPE_INDICATOR_INT32}, m = "invokeSuspend")
                /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements it2 {
                    final /* synthetic */ dy4 $interactionSource;
                    final /* synthetic */ sy4 $pressedInteraction;
                    final /* synthetic */ CoroutineScope $scope;
                    /* synthetic */ long J$0;
                    private /* synthetic */ Object L$0;
                    int label;

                    @fc1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1", f = "TextFieldPressGestureFilter.kt", l = {LockFreeTaskQueueCore.FROZEN_SHIFT, 64}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1, reason: invalid class name and collision with other inner class name */
                    static final class C00371 extends SuspendLambda implements gt2 {
                        final /* synthetic */ dy4 $interactionSource;
                        final /* synthetic */ long $it;
                        final /* synthetic */ sy4 $pressedInteraction;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00371(sy4 sy4Var, long j, dy4 dy4Var, by0 by0Var) {
                            super(2, by0Var);
                            this.$pressedInteraction = sy4Var;
                            this.$it = j;
                            this.$interactionSource = dy4Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new C00371(this.$pressedInteraction, this.$it, this.$interactionSource, by0Var);
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x005a  */
                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                            /*
                                r7 = this;
                                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.h()
                                int r1 = r7.label
                                r2 = 0
                                r3 = 2
                                r4 = 1
                                if (r1 == 0) goto L27
                                if (r1 == r4) goto L1f
                                if (r1 != r3) goto L17
                                java.lang.Object r0 = r7.L$0
                                e26 r0 = (defpackage.e26) r0
                                kotlin.f.b(r8)
                                goto L66
                            L17:
                                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                                r7.<init>(r8)
                                throw r7
                            L1f:
                                java.lang.Object r1 = r7.L$0
                                sy4 r1 = (defpackage.sy4) r1
                                kotlin.f.b(r8)
                                goto L4b
                            L27:
                                kotlin.f.b(r8)
                                sy4 r8 = r7.$pressedInteraction
                                java.lang.Object r8 = r8.getValue()
                                e26 r8 = (defpackage.e26) r8
                                if (r8 == 0) goto L4f
                                dy4 r1 = r7.$interactionSource
                                sy4 r5 = r7.$pressedInteraction
                                d26 r6 = new d26
                                r6.<init>(r8)
                                if (r1 == 0) goto L4c
                                r7.L$0 = r5
                                r7.label = r4
                                java.lang.Object r8 = r1.a(r6, r7)
                                if (r8 != r0) goto L4a
                                return r0
                            L4a:
                                r1 = r5
                            L4b:
                                r5 = r1
                            L4c:
                                r5.setValue(r2)
                            L4f:
                                e26 r8 = new e26
                                long r4 = r7.$it
                                r8.<init>(r4, r2)
                                dy4 r1 = r7.$interactionSource
                                if (r1 == 0) goto L67
                                r7.L$0 = r8
                                r7.label = r3
                                java.lang.Object r1 = r1.a(r8, r7)
                                if (r1 != r0) goto L65
                                return r0
                            L65:
                                r0 = r8
                            L66:
                                r8 = r0
                            L67:
                                sy4 r7 = r7.$pressedInteraction
                                r7.setValue(r8)
                                ww8 r7 = defpackage.ww8.a
                                return r7
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1.AnonymousClass2.AnonymousClass1.C00371.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((C00371) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    @fc1(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
                    /* renamed from: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$2, reason: invalid class name and collision with other inner class name */
                    static final class C00382 extends SuspendLambda implements gt2 {
                        final /* synthetic */ dy4 $interactionSource;
                        final /* synthetic */ sy4 $pressedInteraction;
                        final /* synthetic */ boolean $success;
                        Object L$0;
                        int label;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C00382(sy4 sy4Var, boolean z, dy4 dy4Var, by0 by0Var) {
                            super(2, by0Var);
                            this.$pressedInteraction = sy4Var;
                            this.$success = z;
                            this.$interactionSource = dy4Var;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final by0 create(Object obj, by0 by0Var) {
                            return new C00382(this.$pressedInteraction, this.$success, this.$interactionSource, by0Var);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            sy4 sy4Var;
                            sy4 sy4Var2;
                            Object h = kotlin.coroutines.intrinsics.a.h();
                            int i = this.label;
                            if (i == 0) {
                                f.b(obj);
                                e26 e26Var = (e26) this.$pressedInteraction.getValue();
                                if (e26Var != null) {
                                    boolean z = this.$success;
                                    dy4 dy4Var = this.$interactionSource;
                                    sy4Var = this.$pressedInteraction;
                                    bo3 f26Var = z ? new f26(e26Var) : new d26(e26Var);
                                    if (dy4Var != null) {
                                        this.L$0 = sy4Var;
                                        this.label = 1;
                                        if (dy4Var.a(f26Var, this) == h) {
                                            return h;
                                        }
                                        sy4Var2 = sy4Var;
                                    }
                                    sy4Var.setValue(null);
                                }
                                return ww8.a;
                            }
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy4Var2 = (sy4) this.L$0;
                            f.b(obj);
                            sy4Var = sy4Var2;
                            sy4Var.setValue(null);
                            return ww8.a;
                        }

                        @Override // defpackage.gt2
                        public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                            return ((C00382) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(CoroutineScope coroutineScope, sy4 sy4Var, dy4 dy4Var, by0 by0Var) {
                        super(3, by0Var);
                        this.$scope = coroutineScope;
                        this.$pressedInteraction = sy4Var;
                        this.$interactionSource = dy4Var;
                    }

                    public final Object b(c26 c26Var, long j, by0 by0Var) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, by0Var);
                        anonymousClass1.L$0 = c26Var;
                        anonymousClass1.J$0 = j;
                        return anonymousClass1.invokeSuspend(ww8.a);
                    }

                    @Override // defpackage.it2
                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                        return b((c26) obj, ((fd5) obj2).x(), (by0) obj3);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        Object h = kotlin.coroutines.intrinsics.a.h();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            c26 c26Var = (c26) this.L$0;
                            BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00371(this.$pressedInteraction, this.J$0, this.$interactionSource, null), 3, null);
                            this.label = 1;
                            obj = c26Var.U(this);
                            if (obj == h) {
                                return h;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            f.b(obj);
                        }
                        BuildersKt__Builders_commonKt.launch$default(this.$scope, null, null, new C00382(this.$pressedInteraction, ((Boolean) obj).booleanValue(), this.$interactionSource, null), 3, null);
                        return ww8.a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(CoroutineScope coroutineScope, sy4 sy4Var, dy4 dy4Var, x08 x08Var, by0 by0Var) {
                    super(2, by0Var);
                    this.$scope = coroutineScope;
                    this.$pressedInteraction = sy4Var;
                    this.$interactionSource = dy4Var;
                    this.$onTapState = x08Var;
                }

                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object invoke(fy5 fy5Var, by0 by0Var) {
                    return ((AnonymousClass2) create(fy5Var, by0Var)).invokeSuspend(ww8.a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$scope, this.$pressedInteraction, this.$interactionSource, this.$onTapState, by0Var);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        f.b(obj);
                        fy5 fy5Var = (fy5) this.L$0;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, this.$pressedInteraction, this.$interactionSource, null);
                        final x08 x08Var = this.$onTapState;
                        ss2 ss2Var = new ss2() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt.tapPressTextFieldModifier.1.2.2
                            {
                                super(1);
                            }

                            public final void b(long j) {
                                ((ss2) x08.this.getValue()).invoke(fd5.d(j));
                            }

                            @Override // defpackage.ss2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                b(((fd5) obj2).x());
                                return ww8.a;
                            }
                        };
                        this.label = 1;
                        if (TapGestureDetectorKt.h(fy5Var, anonymousClass1, ss2Var, this) == h) {
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
            {
                super(3);
            }

            @Override // defpackage.it2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                return invoke((Modifier) obj, (Composer) obj2, ((Number) obj3).intValue());
            }

            public final Modifier invoke(Modifier modifier2, Composer composer, int i) {
                composer.z(-102778667);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(-102778667, i, -1, "androidx.compose.foundation.text.tapPressTextFieldModifier.<anonymous> (TextFieldPressGestureFilter.kt:40)");
                }
                composer.z(773894976);
                composer.z(-492369756);
                Object A = composer.A();
                Composer.a aVar = Composer.a;
                if (A == aVar.a()) {
                    Object eVar = new e(py1.j(EmptyCoroutineContext.a, composer));
                    composer.q(eVar);
                    A = eVar;
                }
                composer.R();
                CoroutineScope a = ((e) A).a();
                composer.R();
                composer.z(-492369756);
                Object A2 = composer.A();
                if (A2 == aVar.a()) {
                    A2 = b0.e(null, null, 2, null);
                    composer.q(A2);
                }
                composer.R();
                final sy4 sy4Var = (sy4) A2;
                x08 o = y.o(ss2.this, composer, 0);
                dy4 dy4Var2 = dy4Var;
                composer.z(922652220);
                boolean S = composer.S(sy4Var) | composer.S(dy4Var);
                final dy4 dy4Var3 = dy4Var;
                Object A3 = composer.A();
                if (S || A3 == aVar.a()) {
                    A3 = new ss2() { // from class: androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$1$1

                        public static final class a implements ms1 {
                            final /* synthetic */ sy4 a;
                            final /* synthetic */ dy4 b;

                            public a(sy4 sy4Var, dy4 dy4Var) {
                                this.a = sy4Var;
                                this.b = dy4Var;
                            }

                            @Override // defpackage.ms1
                            public void dispose() {
                                e26 e26Var = (e26) this.a.getValue();
                                if (e26Var != null) {
                                    d26 d26Var = new d26(e26Var);
                                    dy4 dy4Var = this.b;
                                    if (dy4Var != null) {
                                        dy4Var.c(d26Var);
                                    }
                                    this.a.setValue(null);
                                }
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // defpackage.ss2
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final ms1 invoke(ns1 ns1Var) {
                            return new a(sy4.this, dy4Var3);
                        }
                    };
                    composer.q(A3);
                }
                composer.R();
                py1.a(dy4Var2, (ss2) A3, composer, 0);
                Modifier.a aVar2 = Modifier.a;
                dy4 dy4Var4 = dy4Var;
                Modifier c = bd8.c(aVar2, dy4Var4, new AnonymousClass2(a, sy4Var, dy4Var4, o, null));
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return c;
            }
        }, 1, null) : modifier;
    }
}
