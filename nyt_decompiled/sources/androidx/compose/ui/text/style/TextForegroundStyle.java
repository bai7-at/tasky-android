package androidx.compose.ui.text.style;

import defpackage.ho7;
import defpackage.nn0;
import defpackage.ox7;
import defpackage.qs2;
import defpackage.yc0;
import defpackage.zq3;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public interface TextForegroundStyle {
    public static final a a = a.a;

    public static final class a {
        static final /* synthetic */ a a = new a();

        private a() {
        }

        public final TextForegroundStyle a(yc0 yc0Var, float f) {
            if (yc0Var == null) {
                return b.b;
            }
            if (yc0Var instanceof ox7) {
                return b(c.c(((ox7) yc0Var).b(), f));
            }
            if (yc0Var instanceof ho7) {
                return new androidx.compose.ui.text.style.a((ho7) yc0Var, f);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final TextForegroundStyle b(long j) {
            return j != nn0.b.g() ? new androidx.compose.ui.text.style.b(j, null) : b.b;
        }
    }

    public static final class b implements TextForegroundStyle {
        public static final b b = new b();

        private b() {
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public float a() {
            return Float.NaN;
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public long b() {
            return nn0.b.g();
        }

        @Override // androidx.compose.ui.text.style.TextForegroundStyle
        public yc0 e() {
            return null;
        }
    }

    float a();

    long b();

    default TextForegroundStyle c(qs2 qs2Var) {
        return !zq3.c(this, b.b) ? this : (TextForegroundStyle) qs2Var.mo865invoke();
    }

    default TextForegroundStyle d(TextForegroundStyle textForegroundStyle) {
        float d;
        boolean z = textForegroundStyle instanceof androidx.compose.ui.text.style.a;
        if (!z || !(this instanceof androidx.compose.ui.text.style.a)) {
            return (!z || (this instanceof androidx.compose.ui.text.style.a)) ? (z || !(this instanceof androidx.compose.ui.text.style.a)) ? textForegroundStyle.c(new qs2() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$2
                {
                    super(0);
                }

                @Override // defpackage.qs2
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final TextForegroundStyle mo865invoke() {
                    return TextForegroundStyle.this;
                }
            }) : this : textForegroundStyle;
        }
        ho7 f = ((androidx.compose.ui.text.style.a) textForegroundStyle).f();
        d = c.d(textForegroundStyle.a(), new qs2() { // from class: androidx.compose.ui.text.style.TextForegroundStyle$merge$1
            {
                super(0);
            }

            @Override // defpackage.qs2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Float mo865invoke() {
                return Float.valueOf(TextForegroundStyle.this.a());
            }
        });
        return new androidx.compose.ui.text.style.a(f, d);
    }

    yc0 e();
}
