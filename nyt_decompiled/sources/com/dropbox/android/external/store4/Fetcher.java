package com.dropbox.android.external.store4;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gt2;
import defpackage.ss2;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes2.dex */
public interface Fetcher {
    public static final Companion a = Companion.a;

    public static final class Companion {
        static final /* synthetic */ Companion a = new Companion();

        private static final class a implements Fetcher {
            private final ss2 b;

            public a(ss2 ss2Var) {
                zq3.h(ss2Var, "factory");
                this.b = ss2Var;
            }

            @Override // com.dropbox.android.external.store4.Fetcher
            public Flow invoke(Object obj) {
                zq3.h(obj, TransferTable.COLUMN_KEY);
                return (Flow) this.b.invoke(obj);
            }
        }

        private Companion() {
        }

        private final ss2 a(final gt2 gt2Var) {
            return new ss2() { // from class: com.dropbox.android.external.store4.Fetcher$Companion$asFlow$1

                @fc1(c = "com.dropbox.android.external.store4.Fetcher$Companion$asFlow$1$1", f = "Fetcher.kt", l = {105, 105}, m = "invokeSuspend")
                /* renamed from: com.dropbox.android.external.store4.Fetcher$Companion$asFlow$1$1, reason: invalid class name */
                static final class AnonymousClass1 extends SuspendLambda implements gt2 {
                    final /* synthetic */ Object $key;
                    final /* synthetic */ gt2 $this_asFlow;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    AnonymousClass1(gt2 gt2Var, Object obj, by0 by0Var) {
                        super(2, by0Var);
                        this.$this_asFlow = gt2Var;
                        this.$key = obj;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final by0 create(Object obj, by0 by0Var) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asFlow, this.$key, by0Var);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        FlowCollector flowCollector;
                        Object h = a.h();
                        int i = this.label;
                        if (i == 0) {
                            f.b(obj);
                            flowCollector = (FlowCollector) this.L$0;
                            gt2 gt2Var = this.$this_asFlow;
                            Object obj2 = this.$key;
                            this.L$0 = flowCollector;
                            this.label = 1;
                            obj = gt2Var.invoke(obj2, this);
                            if (obj == h) {
                                return h;
                            }
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                f.b(obj);
                                return ww8.a;
                            }
                            flowCollector = (FlowCollector) this.L$0;
                            f.b(obj);
                        }
                        this.L$0 = null;
                        this.label = 2;
                        if (flowCollector.emit(obj, this) == h) {
                            return h;
                        }
                        return ww8.a;
                    }

                    @Override // defpackage.gt2
                    public final Object invoke(FlowCollector flowCollector, by0 by0Var) {
                        return ((AnonymousClass1) create(flowCollector, by0Var)).invokeSuspend(ww8.a);
                    }
                }

                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Flow invoke(Object obj) {
                    return FlowKt.flow(new AnonymousClass1(gt2.this, obj, null));
                }
            };
        }

        public final Fetcher b(gt2 gt2Var) {
            zq3.h(gt2Var, "doFetch");
            return c(a(gt2Var));
        }

        public final Fetcher c(ss2 ss2Var) {
            zq3.h(ss2Var, "flowFactory");
            return new a(ss2Var);
        }
    }

    Flow invoke(Object obj);
}
