package androidx.compose.ui.semantics;

import defpackage.gt2;

/* loaded from: classes.dex */
public final class SemanticsPropertiesAndroid {
    public static final SemanticsPropertiesAndroid a = new SemanticsPropertiesAndroid();
    private static final SemanticsPropertyKey b = new SemanticsPropertyKey("TestTagsAsResourceId", false, new gt2() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesAndroid$TestTagsAsResourceId$1
        public final Boolean b(Boolean bool, boolean z) {
            return bool;
        }

        @Override // defpackage.gt2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return b((Boolean) obj, ((Boolean) obj2).booleanValue());
        }
    });
    public static final int c = 8;

    private SemanticsPropertiesAndroid() {
    }

    public final SemanticsPropertyKey a() {
        return b;
    }
}
