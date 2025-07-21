package defpackage;

import android.app.Application;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.nytimes.android.designsystem.text.NytFontSize;

/* loaded from: classes4.dex */
public class hl9 {
    private final l57 a;
    private final int b;
    private final TextView c;
    private final TextView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;

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

    public hl9(Application application, l57 l57Var) {
        this.a = l57Var;
        this.b = application.getResources().getDimensionPixelOffset(ee6.row_search_headline_bottom_margin);
        View inflate = LayoutInflater.from(application).inflate(hi6.sf_headline, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(pg6.row_sf_headline);
        this.c = textView;
        TextView textView2 = (TextView) inflate.findViewById(pg6.row_sf_headline_smalll);
        this.d = textView2;
        TextView textView3 = (TextView) inflate.findViewById(pg6.row_sf_headline_large);
        this.e = textView3;
        TextView textView4 = (TextView) inflate.findViewById(pg6.row_sf_headline_extra_xl);
        this.f = textView4;
        TextView textView5 = (TextView) inflate.findViewById(pg6.row_sf_headline_jumbo);
        this.g = textView5;
        textView.measure(0, 0);
        textView2.measure(0, 0);
        textView3.measure(0, 0);
        textView4.measure(0, 0);
        textView5.measure(0, 0);
    }

    private boolean a(StringBuilder sb, String str, NytFontSize nytFontSize, boolean z) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sb.toString());
        sb2.append(" ");
        sb2.append(str);
        return ((float) this.a.b(z)) >= c(nytFontSize).getPaint().measureText(sb2.toString());
    }

    private TextView c(NytFontSize nytFontSize) {
        int i = a.a[nytFontSize.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? this.c : this.g : this.f : this.e : this.d;
    }

    private int d(String str, NytFontSize nytFontSize, boolean z) {
        String[] split = str.split(" ");
        StringBuilder sb = new StringBuilder(str.length() + 1);
        int i = 1;
        for (String str2 : split) {
            if (a(sb, str2, nytFontSize, z)) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(str2);
            } else {
                i++;
                sb = new StringBuilder(str.length() + 1);
                sb.append(" ");
                sb.append(str2);
            }
        }
        return i;
    }

    private int e(NytFontSize nytFontSize) {
        return c(nytFontSize).getMeasuredHeight();
    }

    public int b(CharSequence charSequence, NytFontSize nytFontSize, boolean z) {
        return (d(charSequence.toString(), nytFontSize, z) * e(nytFontSize)) + this.b;
    }
}
