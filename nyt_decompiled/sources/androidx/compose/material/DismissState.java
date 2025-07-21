package androidx.compose.material;

import androidx.compose.runtime.saveable.SaverKt;
import defpackage.ea7;
import defpackage.fa7;
import defpackage.gt2;
import defpackage.ss2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class DismissState extends SwipeableState {
    public static final Companion r = new Companion(null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea7 a(final ss2 ss2Var) {
            return SaverKt.a(new gt2() { // from class: androidx.compose.material.DismissState$Companion$Saver$1
                @Override // defpackage.gt2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DismissValue invoke(fa7 fa7Var, DismissState dismissState) {
                    return (DismissValue) dismissState.o();
                }
            }, new ss2() { // from class: androidx.compose.material.DismissState$Companion$Saver$2
                {
                    super(1);
                }

                @Override // defpackage.ss2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final DismissState invoke(DismissValue dismissValue) {
                    return new DismissState(dismissValue, ss2.this);
                }
            });
        }

        private Companion() {
        }
    }

    public DismissState(DismissValue dismissValue, ss2 ss2Var) {
        super(dismissValue, null, ss2Var, 2, null);
    }
}
