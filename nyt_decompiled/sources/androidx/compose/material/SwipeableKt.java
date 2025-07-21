package androidx.compose.material;

import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableKt$draggable$1;
import androidx.compose.foundation.gestures.DraggableKt$draggable$2;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import defpackage.by0;
import defpackage.dy4;
import defpackage.fc1;
import defpackage.fm1;
import defpackage.gt2;
import defpackage.il8;
import defpackage.it2;
import defpackage.lh4;
import defpackage.ml3;
import defpackage.py1;
import defpackage.ss2;
import defpackage.vu1;
import defpackage.ww8;
import defpackage.yy6;
import defpackage.zq3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.t;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public abstract class SwipeableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r3 < ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r0), java.lang.Float.valueOf(r5))).floatValue()) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r3 > ((java.lang.Number) r6.invoke(java.lang.Float.valueOf(r5), java.lang.Float.valueOf(r0))).floatValue()) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float d(float r3, float r4, java.util.Set r5, defpackage.gt2 r6, float r7, float r8) {
        /*
            java.util.List r5 = e(r3, r5)
            int r0 = r5.size()
            if (r0 == 0) goto L6c
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L62
            java.lang.Object r0 = r5.get(r1)
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            java.lang.Object r5 = r5.get(r2)
            java.lang.Number r5 = (java.lang.Number) r5
            float r5 = r5.floatValue()
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 > 0) goto L42
            int r4 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r4 < 0) goto L2b
            return r5
        L2b:
            java.lang.Float r4 = java.lang.Float.valueOf(r0)
            java.lang.Float r7 = java.lang.Float.valueOf(r5)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5e
            goto L60
        L42:
            float r4 = -r8
            int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r4 > 0) goto L48
            return r0
        L48:
            java.lang.Float r4 = java.lang.Float.valueOf(r5)
            java.lang.Float r7 = java.lang.Float.valueOf(r0)
            java.lang.Object r4 = r6.invoke(r4, r7)
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L60
        L5e:
            r4 = r5
            goto L6c
        L60:
            r4 = r0
            goto L6c
        L62:
            java.lang.Object r3 = r5.get(r1)
            java.lang.Number r3 = (java.lang.Number) r3
            float r4 = r3.floatValue()
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SwipeableKt.d(float, float, java.util.Set, gt2, float, float):float");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v15 */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v9 */
    public static final List e(float f, Set set) {
        Object obj;
        Set set2 = set;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set2) {
            if (((Number) obj2).floatValue() <= f + 0.001d) {
                arrayList.add(obj2);
            }
        }
        Float f2 = null;
        int i = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            float floatValue = ((Number) obj).floatValue();
            int n = kotlin.collections.i.n(arrayList);
            if (1 <= n) {
                int i2 = 1;
                while (true) {
                    Object obj3 = arrayList.get(i2);
                    float floatValue2 = ((Number) obj3).floatValue();
                    if (Float.compare(floatValue, floatValue2) < 0) {
                        obj = obj3;
                        floatValue = floatValue2;
                    }
                    if (i2 == n) {
                        break;
                    }
                    i2++;
                }
            }
        }
        Float f3 = (Float) obj;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : set2) {
            if (((Number) obj4).floatValue() >= f - 0.001d) {
                arrayList2.add(obj4);
            }
        }
        if (!arrayList2.isEmpty()) {
            ?? r13 = arrayList2.get(0);
            float floatValue3 = ((Number) r13).floatValue();
            int n2 = kotlin.collections.i.n(arrayList2);
            boolean z = r13;
            if (1 <= n2) {
                while (true) {
                    Object obj5 = arrayList2.get(i);
                    float floatValue4 = ((Number) obj5).floatValue();
                    r13 = z;
                    if (Float.compare(floatValue3, floatValue4) > 0) {
                        r13 = obj5;
                        floatValue3 = floatValue4;
                    }
                    if (i == n2) {
                        break;
                    }
                    i++;
                    z = r13;
                }
            }
            f2 = r13;
        }
        Float f4 = f2;
        if (f3 == null) {
            return kotlin.collections.i.p(f4);
        }
        if (f4 != null && !zq3.b(f3, f4)) {
            return kotlin.collections.i.o(f3, f4);
        }
        return kotlin.collections.i.e(f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Float f(Map map, Object obj) {
        Object obj2;
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (zq3.c(((Map.Entry) obj2).getValue(), obj)) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj2;
        if (entry != null) {
            return (Float) entry.getKey();
        }
        return null;
    }

    public static final Modifier g(Modifier modifier, final SwipeableState swipeableState, final Map map, final Orientation orientation, final boolean z, final boolean z2, final dy4 dy4Var, final gt2 gt2Var, final yy6 yy6Var, final float f) {
        return ComposedModifierKt.a(modifier, InspectableValueKt.c() ? new ss2() { // from class: androidx.compose.material.SwipeableKt$swipeable-pPrIpRY$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(ml3 ml3Var) {
                throw null;
            }

            @Override // defpackage.ss2
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                lh4.a(obj);
                b(null);
                return ww8.a;
            }
        } : InspectableValueKt.a(), new it2() { // from class: androidx.compose.material.SwipeableKt$swipeable$3

            @fc1(c = "androidx.compose.material.SwipeableKt$swipeable$3$3", f = "Swipeable.kt", l = {616}, m = "invokeSuspend")
            /* renamed from: androidx.compose.material.SwipeableKt$swipeable$3$3, reason: invalid class name */
            static final class AnonymousClass3 extends SuspendLambda implements gt2 {
                final /* synthetic */ Map<Float, Object> $anchors;
                final /* synthetic */ fm1 $density;
                final /* synthetic */ yy6 $resistance;
                final /* synthetic */ SwipeableState $state;
                final /* synthetic */ gt2 $thresholds;
                final /* synthetic */ float $velocityThreshold;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass3(SwipeableState swipeableState, Map map, yy6 yy6Var, fm1 fm1Var, gt2 gt2Var, float f, by0 by0Var) {
                    super(2, by0Var);
                    this.$state = swipeableState;
                    this.$anchors = map;
                    this.$resistance = yy6Var;
                    this.$density = fm1Var;
                    this.$thresholds = gt2Var;
                    this.$velocityThreshold = f;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final by0 create(Object obj, by0 by0Var) {
                    return new AnonymousClass3(this.$state, this.$anchors, this.$resistance, this.$density, this.$thresholds, this.$velocityThreshold, by0Var);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object h = kotlin.coroutines.intrinsics.a.h();
                    int i = this.label;
                    if (i == 0) {
                        kotlin.f.b(obj);
                        Map l = this.$state.l();
                        this.$state.B(this.$anchors);
                        this.$state.E(this.$resistance);
                        SwipeableState swipeableState = this.$state;
                        final Map<Float, Object> map = this.$anchors;
                        final gt2 gt2Var = this.$thresholds;
                        final fm1 fm1Var = this.$density;
                        swipeableState.F(new gt2() { // from class: androidx.compose.material.SwipeableKt.swipeable.3.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            public final Float b(float f, float f2) {
                                return Float.valueOf(((il8) gt2Var.invoke(t.j(map, Float.valueOf(f)), t.j(map, Float.valueOf(f2)))).a(fm1Var, f, f2));
                            }

                            @Override // defpackage.gt2
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
                                return b(((Number) obj2).floatValue(), ((Number) obj3).floatValue());
                            }
                        });
                        this.$state.G(this.$density.f1(this.$velocityThreshold));
                        SwipeableState swipeableState2 = this.$state;
                        Map<Float, Object> map2 = this.$anchors;
                        this.label = 1;
                        if (swipeableState2.A(l, map2, this) == h) {
                            return h;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.f.b(obj);
                    }
                    return ww8.a;
                }

                @Override // defpackage.gt2
                public final Object invoke(CoroutineScope coroutineScope, by0 by0Var) {
                    return ((AnonymousClass3) create(coroutineScope, by0Var)).invokeSuspend(ww8.a);
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
                Modifier j;
                composer.z(43594985);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.S(43594985, i, -1, "androidx.compose.material.swipeable.<anonymous> (Swipeable.kt:595)");
                }
                if (map.isEmpty()) {
                    throw new IllegalArgumentException("You must have at least one anchor.");
                }
                if (kotlin.collections.i.d0(map.values()).size() != map.size()) {
                    throw new IllegalArgumentException("You cannot have two anchors mapped to the same state.");
                }
                fm1 fm1Var = (fm1) composer.m(CompositionLocalsKt.e());
                swipeableState.k(map);
                Map<Float, Object> map2 = map;
                SwipeableState swipeableState2 = swipeableState;
                py1.e(map2, swipeableState2, new AnonymousClass3(swipeableState2, map2, yy6Var, fm1Var, gt2Var, f, null), composer, 520);
                Modifier.a aVar = Modifier.a;
                boolean y = swipeableState.y();
                vu1 q = swipeableState.q();
                Orientation orientation2 = orientation;
                boolean z3 = z;
                dy4 dy4Var2 = dy4Var;
                composer.z(-699667755);
                boolean S = composer.S(swipeableState);
                SwipeableState swipeableState3 = swipeableState;
                Object A = composer.A();
                if (S || A == Composer.a.a()) {
                    A = new SwipeableKt$swipeable$3$4$1(swipeableState3, null);
                    composer.q(A);
                }
                composer.R();
                j = DraggableKt.j(aVar, q, orientation2, (r20 & 4) != 0 ? true : z3, (r20 & 8) != 0 ? null : dy4Var2, (r20 & 16) != 0 ? false : y, (r20 & 32) != 0 ? new DraggableKt$draggable$1(null) : null, (r20 & 64) != 0 ? new DraggableKt$draggable$2(null) : (it2) A, (r20 & 128) != 0 ? false : z2);
                if (androidx.compose.runtime.b.G()) {
                    androidx.compose.runtime.b.R();
                }
                composer.R();
                return j;
            }
        });
    }
}
