package defpackage;

import android.app.Application;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.designsystem.text.NytFontSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class jl9 {
    private final hl9 a;
    private final l57 b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final String h;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[NytFontSize.values().length];
            a = iArr;
            try {
                iArr[NytFontSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[NytFontSize.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[NytFontSize.EXTRA_LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[NytFontSize.JUMBO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public jl9(Application application, l57 l57Var, hl9 hl9Var) {
        this.b = l57Var;
        this.a = hl9Var;
        this.h = application.getResources().getString(jk6.sectionName_mostEmailed);
        View inflate = LayoutInflater.from(application).inflate(hi6.sf_wrapped_summary_font_sizes, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(pg6.sf_summary_medium);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(pg6.sf_summary_small);
        this.d = textView2;
        TextView textView3 = (TextView) inflate.findViewById(pg6.sf_summary_large);
        this.e = textView3;
        TextView textView4 = (TextView) inflate.findViewById(pg6.sf_summary_extra_large);
        this.f = textView4;
        TextView textView5 = (TextView) inflate.findViewById(pg6.sf_summary_jumbo);
        this.g = textView5;
        textView.measure(0, 0);
        textView2.measure(0, 0);
        textView3.measure(0, 0);
        textView4.measure(0, 0);
        textView5.measure(0, 0);
    }

    private void a(List list, SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (i2 >= i) {
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append(" ");
        } else {
            if (((StringBuilder) list.get(i2)).length() > 0 || i2 > 0) {
                ((StringBuilder) list.get(i2)).append(" ");
            }
            ((StringBuilder) list.get(i2)).append(str);
        }
    }

    private y57 b(SpannableStringBuilder spannableStringBuilder, List list, SpannableStringBuilder spannableStringBuilder2) {
        SpannableStringBuilder m = m(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(m);
        arrayList.add(spannableStringBuilder2);
        ny7.b(spannableStringBuilder, arrayList);
        return uh3.c().c(m).a(spannableStringBuilder2).b();
    }

    private z57 c(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, boolean z) {
        y57 k = k(spannableStringBuilder, charSequence, NytFontSize.SMALL, z);
        y57 k2 = k(spannableStringBuilder, charSequence, NytFontSize.MEDIUM, z);
        y57 k3 = k(spannableStringBuilder, charSequence, NytFontSize.LARGE, z);
        y57 k4 = k(spannableStringBuilder, charSequence, NytFontSize.EXTRA_LARGE, z);
        return xh3.f().g(k).f(k2).e(k3).b(k4).d(k(spannableStringBuilder, charSequence, NytFontSize.JUMBO, z)).a();
    }

    private List d(int i) {
        if (i < 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(new StringBuilder());
        }
        return arrayList;
    }

    private int f(NytFontSize nytFontSize) {
        return g(nytFontSize).getMeasuredHeight();
    }

    private TextView g(NytFontSize nytFontSize) {
        int i = a.a[nytFontSize.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.c : this.g : this.f : this.e : this.d;
    }

    private y57 i(SpannableStringBuilder spannableStringBuilder, NytFontSize nytFontSize, int i, boolean z) {
        String[] split = spannableStringBuilder.toString().split(" ");
        List d = d(i);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        int i2 = 0;
        for (String str : split) {
            if (n(d, str, nytFontSize, i2, i, z)) {
                i2++;
            }
            a(d, spannableStringBuilder2, str, i, i2);
        }
        return b(spannableStringBuilder, d, spannableStringBuilder2);
    }

    private int j(CharSequence charSequence, NytFontSize nytFontSize, boolean z) {
        return (int) Math.ceil((this.b.a() - this.a.b(charSequence, nytFontSize, z)) / f(nytFontSize));
    }

    private y57 k(SpannableStringBuilder spannableStringBuilder, CharSequence charSequence, NytFontSize nytFontSize, boolean z) {
        return i(spannableStringBuilder, nytFontSize, j(charSequence, nytFontSize, z), z);
    }

    private boolean l(CharSequence charSequence, String str, NytFontSize nytFontSize, boolean z) {
        String str2 = charSequence.toString() + " " + str;
        return ((float) this.b.b(z)) >= g(nytFontSize).getPaint().measureText(str2, 0, str2.length());
    }

    private SpannableStringBuilder m(List list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            spannableStringBuilder.append((CharSequence) ((StringBuilder) it2.next()).toString());
        }
        return spannableStringBuilder;
    }

    private boolean n(List list, String str, NytFontSize nytFontSize, int i, int i2, boolean z) {
        return i < i2 && !l((CharSequence) list.get(i), str, nytFontSize, z);
    }

    public z57 e(SpannableStringBuilder spannableStringBuilder) {
        uh3 b = uh3.c().c(spannableStringBuilder).b();
        return xh3.f().g(b).f(b).e(b).b(b).d(b).a();
    }

    public z57 h(SectionFront sectionFront, SpannableStringBuilder spannableStringBuilder, CharSequence charSequence) {
        return c(spannableStringBuilder, charSequence, this.h.equals(sectionFront.getName()));
    }
}
