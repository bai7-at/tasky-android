package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.e;
import defpackage.hu5;
import defpackage.nm2;
import defpackage.ss2;
import defpackage.uu8;
import defpackage.x08;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class FontFamilyResolverImpl implements e.b {
    private final hu5 a;
    private final r b;
    private final TypefaceRequestCache c;
    private final FontListFontFamilyTypefaceAdapter d;
    private final q e;
    private final ss2 f;

    public FontFamilyResolverImpl(hu5 hu5Var, r rVar, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, q qVar) {
        this.a = hu5Var;
        this.b = rVar;
        this.c = typefaceRequestCache;
        this.d = fontListFontFamilyTypefaceAdapter;
        this.e = qVar;
        this.f = new ss2() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$createDefaultTypeface$1
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object invoke(uu8 uu8Var) {
                x08 h;
                h = FontFamilyResolverImpl.this.h(uu8.b(uu8Var, null, null, 0, 0, null, 30, null));
                return h.getValue();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x08 h(final uu8 uu8Var) {
        return this.c.c(uu8Var, new ss2() { // from class: androidx.compose.ui.text.font.FontFamilyResolverImpl$resolve$result$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.ss2
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final w invoke(ss2 ss2Var) {
                FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
                ss2 ss2Var2;
                q qVar;
                ss2 ss2Var3;
                fontListFontFamilyTypefaceAdapter = FontFamilyResolverImpl.this.d;
                uu8 uu8Var2 = uu8Var;
                hu5 g = FontFamilyResolverImpl.this.g();
                ss2Var2 = FontFamilyResolverImpl.this.f;
                w a = fontListFontFamilyTypefaceAdapter.a(uu8Var2, g, ss2Var, ss2Var2);
                if (a == null) {
                    qVar = FontFamilyResolverImpl.this.e;
                    uu8 uu8Var3 = uu8Var;
                    hu5 g2 = FontFamilyResolverImpl.this.g();
                    ss2Var3 = FontFamilyResolverImpl.this.f;
                    a = qVar.a(uu8Var3, g2, ss2Var, ss2Var3);
                    if (a == null) {
                        throw new IllegalStateException("Could not load font");
                    }
                }
                return a;
            }
        });
    }

    @Override // androidx.compose.ui.text.font.e.b
    public x08 a(e eVar, o oVar, int i, int i2) {
        return h(new uu8(this.b.d(eVar), this.b.a(oVar), this.b.b(i), this.b.c(i2), this.a.c(), null));
    }

    public final hu5 g() {
        return this.a;
    }

    public /* synthetic */ FontFamilyResolverImpl(hu5 hu5Var, r rVar, TypefaceRequestCache typefaceRequestCache, FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, q qVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(hu5Var, (i & 2) != 0 ? r.a.a() : rVar, (i & 4) != 0 ? nm2.b() : typefaceRequestCache, (i & 8) != 0 ? new FontListFontFamilyTypefaceAdapter(nm2.a(), null, 2, null) : fontListFontFamilyTypefaceAdapter, (i & 16) != 0 ? new q() : qVar);
    }
}
