package com.nytimes.android.growthui.landingpage.data;

import androidx.recyclerview.widget.RecyclerView;
import com.nytimes.android.growthui.common.models.DataConfigId;
import com.nytimes.android.growthui.landingpage.models.remoteconfig.GamesLandingPageData;
import com.squareup.moshi.i;
import defpackage.by0;
import defpackage.fc1;
import defpackage.gy3;
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
public final class GamesLandingPageConfigRepository implements gy3 {
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
                iArr[DataConfigId.PlayTab.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            a = iArr;
        }
    }

    public GamesLandingPageConfigRepository(DataConfigId dataConfigId, String str, r53 r53Var, p53 p53Var, i iVar) {
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
    public final GamesLandingPageData f() {
        try {
            GamesLandingPageData gamesLandingPageData = (GamesLandingPageData) this.e.c(GamesLandingPageData.class).fromJson(this.b);
            return gamesLandingPageData == null ? new GamesLandingPageData(null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217727, null) : gamesLandingPageData;
        } catch (Exception e) {
            ul8.b bVar = ul8.a;
            bVar.z("GROWTHUI").d("Fallback Failed", new Object[0]);
            bVar.z("GROWTHUI").e(e);
            return new GamesLandingPageData(null, null, null, null, null, null, null, null, null, kotlin.collections.i.e("Games"), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 134217215, null);
        }
    }

    @Override // defpackage.gy3
    public Flow a(final String str) {
        final Flow flowOf = FlowKt.flowOf(this.d.a(this.a));
        return new Flow() { // from class: com.nytimes.android.growthui.landingpage.data.GamesLandingPageConfigRepository$getConfig$$inlined$map$1

            /* renamed from: com.nytimes.android.growthui.landingpage.data.GamesLandingPageConfigRepository$getConfig$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2 implements FlowCollector {
                final /* synthetic */ FlowCollector a;
                final /* synthetic */ GamesLandingPageConfigRepository b;
                final /* synthetic */ String c;

                @fc1(c = "com.nytimes.android.growthui.landingpage.data.GamesLandingPageConfigRepository$getConfig$$inlined$map$1$2", f = "GamesLandingPageConfigRepository.kt", l = {242, 223}, m = "emit")
                /* renamed from: com.nytimes.android.growthui.landingpage.data.GamesLandingPageConfigRepository$getConfig$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends ContinuationImpl {
                    Object L$0;
                    Object L$1;
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

                public AnonymousClass2(FlowCollector flowCollector, GamesLandingPageConfigRepository gamesLandingPageConfigRepository, String str) {
                    this.a = flowCollector;
                    this.b = gamesLandingPageConfigRepository;
                    this.c = str;
                }

                /* JADX WARN: Code restructure failed: missing block: B:50:0x0098, code lost:
                
                    r2 = r2.a();
                 */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0110 A[LOOP:0: B:18:0x010a->B:20:0x0110, LOOP_END] */
                /* JADX WARN: Removed duplicated region for block: B:24:0x012f A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:25:0x0043  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r10, defpackage.by0 r11) {
                    /*
                        Method dump skipped, instructions count: 307
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.nytimes.android.growthui.landingpage.data.GamesLandingPageConfigRepository$getConfig$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, by0):java.lang.Object");
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
