package androidx.compose.foundation.layout;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.gt2;
import defpackage.hn3;
import defpackage.ov4;
import defpackage.vm3;
import defpackage.wm3;
import defpackage.zq3;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class WrapContentElement extends ov4 {
    public static final Companion g = new Companion(null);
    private final Direction b;
    private final boolean c;
    private final gt2 d;
    private final Object e;
    private final String f;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final WrapContentElement a(final Alignment.c cVar, boolean z) {
            return new WrapContentElement(Direction.Vertical, z, new gt2() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$height$1
                {
                    super(2);
                }

                public final long b(long j, LayoutDirection layoutDirection) {
                    return wm3.a(0, Alignment.c.this.a(0, hn3.f(j)));
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return vm3.b(b(((hn3) obj).j(), (LayoutDirection) obj2));
                }
            }, cVar, "wrapContentHeight");
        }

        public final WrapContentElement b(final Alignment alignment, boolean z) {
            return new WrapContentElement(Direction.Both, z, new gt2() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$size$1
                {
                    super(2);
                }

                public final long b(long j, LayoutDirection layoutDirection) {
                    return Alignment.this.a(hn3.b.a(), j, layoutDirection);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return vm3.b(b(((hn3) obj).j(), (LayoutDirection) obj2));
                }
            }, alignment, "wrapContentSize");
        }

        public final WrapContentElement c(final Alignment.b bVar, boolean z) {
            return new WrapContentElement(Direction.Horizontal, z, new gt2() { // from class: androidx.compose.foundation.layout.WrapContentElement$Companion$width$1
                {
                    super(2);
                }

                public final long b(long j, LayoutDirection layoutDirection) {
                    return wm3.a(Alignment.b.this.a(0, hn3.g(j), layoutDirection), 0);
                }

                @Override // defpackage.gt2
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return vm3.b(b(((hn3) obj).j(), (LayoutDirection) obj2));
                }
            }, bVar, "wrapContentWidth");
        }

        private Companion() {
        }
    }

    public WrapContentElement(Direction direction, boolean z, gt2 gt2Var, Object obj, String str) {
        this.b = direction;
        this.c = z;
        this.d = gt2Var;
        this.e = obj;
        this.f = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        return this.b == wrapContentElement.b && this.c == wrapContentElement.c && zq3.c(this.e, wrapContentElement.e);
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (((this.b.hashCode() * 31) + Boolean.hashCode(this.c)) * 31) + this.e.hashCode();
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public WrapContentNode l() {
        return new WrapContentNode(this.b, this.c, this.d);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(WrapContentNode wrapContentNode) {
        wrapContentNode.g2(this.b);
        wrapContentNode.h2(this.c);
        wrapContentNode.f2(this.d);
    }
}
