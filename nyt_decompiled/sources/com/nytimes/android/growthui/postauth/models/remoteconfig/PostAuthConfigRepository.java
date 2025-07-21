package com.nytimes.android.growthui.postauth.models.remoteconfig;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.fc1;
import defpackage.p53;
import defpackage.r53;
import defpackage.ul8;
import defpackage.ww8;
import defpackage.zq3;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* loaded from: classes4.dex */
public final class PostAuthConfigRepository {
    private final DataConfigId a;
    private final String b;
    private final r53 c;
    private final p53 d;
    private final i e;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[DataConfigId.values().length];
            try {
                iArr[DataConfigId.AllAccessPostLogin.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DataConfigId.AllAccessPostRegistration.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public PostAuthConfigRepository(DataConfigId dataConfigId, String str, r53 r53Var, p53 p53Var, i iVar) {
        zq3.h(dataConfigId, "dataConfigId");
        zq3.h(str, "fallbackJson");
        zq3.h(r53Var, "subscriptionAdapter");
        zq3.h(p53Var, "remoteConfigAdapter");
        zq3.h(iVar, "moshi");
        this.a = dataConfigId;
        this.b = str;
        this.c = r53Var;
        this.d = p53Var;
        this.e = iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PostAuthData f() {
        try {
            PostAuthData postAuthData = (PostAuthData) this.e.c(PostAuthData.class).fromJson(this.b);
            return postAuthData == null ? new PostAuthData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null) : postAuthData;
        } catch (Exception e) {
            ul8.b bVar = ul8.a;
            bVar.z("GROWTHUI").d("Fallback Failed", new Object[0]);
            bVar.z("GROWTHUI").e(e);
            return new PostAuthData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
        }
    }

    public final Flow e(final String str) {
        final Flow flowOf = FlowKt.flowOf(this.d.a(this.a));
        return new Flow() { // from class: com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository$getConfig$$inlined$map$1

            /* renamed from: com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository$getConfig$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ PostAuthConfigRepository b;
                final /* synthetic */ String c;

                @fc1(c = "com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository$getConfig$$inlined$map$1$2", f = "PostAuthConfigRepository.kt", l = {247, 223}, m = "emit")
                /* renamed from: com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository$getConfig$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(by0 by0Var) {
                        super(by0Var);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= RecyclerView.UNDEFINED_DURATION;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, PostAuthConfigRepository postAuthConfigRepository, String str) {
                    this.a = flowCollector;
                    this.b = postAuthConfigRepository;
                    this.c = str;
                }

                /* JADX WARN: Removed duplicated region for block: B:19:0x011f  */
                /* JADX WARN: Removed duplicated region for block: B:22:0x0132 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0084  */
                /* JADX WARN: Removed duplicated region for block: B:50:0x0111 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r11, defpackage.by0 r12) {
                    /*
                        Method dump skipped, instructions count: 310
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.postauth.models.remoteconfig.PostAuthConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, by0 by0Var) {
                Object collect = Flow.this.collect(new AnonymousClass2(flowCollector, this, str), by0Var);
                return collect == a.h() ? collect : ww8.a;
            }
        };
    }
}
