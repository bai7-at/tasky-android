package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import com.nytimes.android.sectionfront.c;
import com.nytimes.android.utils.NetworkStatus;
import com.nytimes.android.utils.cropping.ImageCropper;

/* loaded from: classes4.dex */
public class et5 extends gf7 implements c.b {
    private final ImageCropper o;
    private int p;

    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[SectionAdapterItemType.values().length];
            a = iArr;
            try {
                iArr[SectionAdapterItemType.ARTICLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[SectionAdapterItemType.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[SectionAdapterItemType.PHOTOVIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SectionAdapterItemType.VIDEO_LEDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SectionAdapterItemType.ARTICLE_LEDE_HORIZONTAL_IMAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SectionAdapterItemType.ARTICLE_LEDE_VERTICAL_OR_NO_IMAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public et5(Activity activity, cb2 cb2Var, ImageCropper imageCropper, NetworkStatus networkStatus) {
        super(activity, networkStatus, null, cb2Var, LayoutInflater.from(activity));
        this.o = imageCropper;
    }

    private int e0(re7 re7Var) {
        switch (a.a[re7Var.a.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            default:
                return 3;
        }
    }

    @Override // com.nytimes.android.sectionfront.c.b
    public int f(int i) {
        int o = o(i);
        if (o == 1 || o == 3) {
            return this.p;
        }
        return 1;
    }

    public void f0(int i, s57 s57Var) {
        this.f = s57Var;
        this.p = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public com.nytimes.android.sectionfront.adapter.viewholder.a B(ViewGroup viewGroup, int i) {
        com.nytimes.android.sectionfront.adapter.viewholder.a a24Var;
        if (i == 1) {
            a24Var = new a24(LayoutInflater.from(viewGroup.getContext()).inflate(hi6.sf_photo_video_lede, viewGroup, false), this.o);
        } else {
            if (i != 2) {
                return new p73(LayoutInflater.from(viewGroup.getContext()).inflate(hi6.row_section_blank_header, viewGroup, false));
            }
            a24Var = new kt5(LayoutInflater.from(viewGroup.getContext()).inflate(hi6.sf_photo_video_item, viewGroup, false), this.o);
        }
        return a24Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int o(int i) {
        return e0(P(i));
    }
}
