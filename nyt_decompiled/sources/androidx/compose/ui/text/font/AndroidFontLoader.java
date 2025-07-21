package androidx.compose.ui.text.font;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.j;
import defpackage.df;
import defpackage.hu5;
import kotlin.Result;

/* loaded from: classes.dex */
public final class AndroidFontLoader implements hu5 {
    private final Context a;
    private final Object b;

    public AndroidFontLoader(Context context) {
        this.a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.hu5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(androidx.compose.ui.text.font.d r5, defpackage.by0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = (androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1 r0 = new androidx.compose.ui.text.font.AndroidFontLoader$awaitLoad$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.h()
            int r2 = r0.label
            r3 = 2
            if (r2 == 0) goto L41
            r4 = 1
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r4 = r0.L$1
            r5 = r4
            androidx.compose.ui.text.font.d r5 = (androidx.compose.ui.text.font.d) r5
            java.lang.Object r4 = r0.L$0
            androidx.compose.ui.text.font.AndroidFontLoader r4 = (androidx.compose.ui.text.font.AndroidFontLoader) r4
            kotlin.f.b(r6)
            goto L5a
        L35:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3d:
            kotlin.f.b(r6)
            return r6
        L41:
            kotlin.f.b(r6)
            boolean r6 = r5 instanceof androidx.compose.ui.text.font.u
            if (r6 == 0) goto L69
            r6 = r5
            androidx.compose.ui.text.font.u r6 = (androidx.compose.ui.text.font.u) r6
            android.content.Context r2 = r4.a
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = defpackage.df.b(r6, r2, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            androidx.compose.ui.text.font.u r5 = (androidx.compose.ui.text.font.u) r5
            dn2 r5 = r5.e()
            android.content.Context r4 = r4.a
            android.graphics.Typeface r4 = androidx.compose.ui.text.font.t.b(r6, r5, r4)
            return r4
        L69:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "Unknown font type: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.font.AndroidFontLoader.b(androidx.compose.ui.text.font.d, by0):java.lang.Object");
    }

    @Override // defpackage.hu5
    public Object c() {
        return this.b;
    }

    @Override // defpackage.hu5
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Typeface a(d dVar) {
        Object b;
        Typeface typeface;
        Typeface c;
        if (!(dVar instanceof u)) {
            return null;
        }
        int b2 = dVar.b();
        j.a aVar = j.a;
        if (j.e(b2, aVar.b())) {
            typeface = df.c((u) dVar, this.a);
        } else {
            if (!j.e(b2, aVar.c())) {
                if (j.e(b2, aVar.a())) {
                    throw new UnsupportedOperationException("Unsupported Async font load path");
                }
                throw new IllegalArgumentException("Unknown loading type " + ((Object) j.g(dVar.b())));
            }
            try {
                Result.a aVar2 = Result.a;
                c = df.c((u) dVar, this.a);
                b = Result.b(c);
            } catch (Throwable th) {
                Result.a aVar3 = Result.a;
                b = Result.b(kotlin.f.a(th));
            }
            typeface = (Typeface) (Result.g(b) ? null : b);
        }
        return t.b(typeface, ((u) dVar).e(), this.a);
    }
}
