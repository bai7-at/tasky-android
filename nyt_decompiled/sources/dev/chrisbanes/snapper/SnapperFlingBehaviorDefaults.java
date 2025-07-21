package dev.chrisbanes.snapper;

import defpackage.ci;
import defpackage.di;
import defpackage.it2;
import defpackage.ss2;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SnapperFlingBehaviorDefaults {
    public static final SnapperFlingBehaviorDefaults a = new SnapperFlingBehaviorDefaults();
    private static final ci b = di.i(0.0f, 400.0f, null, 5, null);
    private static final ss2 c = new ss2() { // from class: dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults$MaximumFlingDistance$1
        @Override // defpackage.ss2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Float invoke(b bVar) {
            zq3.h(bVar, "it");
            return Float.valueOf(Float.MAX_VALUE);
        }
    };
    private static final it2 d = new it2() { // from class: dev.chrisbanes.snapper.SnapperFlingBehaviorDefaults$SnapIndex$1
        public final Integer b(b bVar, int i, int i2) {
            zq3.h(bVar, "$noName_0");
            return Integer.valueOf(i2);
        }

        @Override // defpackage.it2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((b) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
        }
    };
    public static final int e = 8;

    private SnapperFlingBehaviorDefaults() {
    }

    public final ss2 a() {
        return c;
    }

    public final ci b() {
        return b;
    }
}
