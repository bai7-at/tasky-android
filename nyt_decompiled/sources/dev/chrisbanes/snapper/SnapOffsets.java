package dev.chrisbanes.snapper;

import defpackage.gt2;
import defpackage.iw7;
import defpackage.zq3;

/* loaded from: classes4.dex */
public final class SnapOffsets {
    public static final SnapOffsets a = new SnapOffsets();
    private static final gt2 b = new gt2() { // from class: dev.chrisbanes.snapper.SnapOffsets$Start$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(b bVar, iw7 iw7Var) {
            zq3.h(bVar, "layout");
            zq3.h(iw7Var, "$noName_1");
            return Integer.valueOf(bVar.g());
        }
    };
    private static final gt2 c = new gt2() { // from class: dev.chrisbanes.snapper.SnapOffsets$Center$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(b bVar, iw7 iw7Var) {
            zq3.h(bVar, "layout");
            zq3.h(iw7Var, "item");
            return Integer.valueOf(bVar.g() + (((bVar.f() - bVar.g()) - iw7Var.c()) / 2));
        }
    };
    private static final gt2 d = new gt2() { // from class: dev.chrisbanes.snapper.SnapOffsets$End$1
        @Override // defpackage.gt2
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke(b bVar, iw7 iw7Var) {
            zq3.h(bVar, "layout");
            zq3.h(iw7Var, "item");
            return Integer.valueOf(bVar.f() - iw7Var.c());
        }
    };

    private SnapOffsets() {
    }

    public final gt2 a() {
        return c;
    }

    public final gt2 b() {
        return b;
    }
}
