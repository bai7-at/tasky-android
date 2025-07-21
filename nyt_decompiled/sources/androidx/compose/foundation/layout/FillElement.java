package androidx.compose.foundation.layout;

import defpackage.ov4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class FillElement extends ov4 {
    public static final a e = new a(null);
    private final Direction b;
    private final float c;
    private final String d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FillElement a(float f) {
            return new FillElement(Direction.Vertical, f, "fillMaxHeight");
        }

        public final FillElement b(float f) {
            return new FillElement(Direction.Both, f, "fillMaxSize");
        }

        public final FillElement c(float f) {
            return new FillElement(Direction.Horizontal, f, "fillMaxWidth");
        }

        private a() {
        }
    }

    public FillElement(Direction direction, float f, String str) {
        this.b = direction;
        this.c = f;
        this.d = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.c == fillElement.c;
    }

    @Override // defpackage.ov4
    public int hashCode() {
        return (this.b.hashCode() * 31) + Float.hashCode(this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public FillNode l() {
        return new FillNode(this.b, this.c);
    }

    @Override // defpackage.ov4
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void r(FillNode fillNode) {
        fillNode.e2(this.b);
        fillNode.f2(this.c);
    }
}
