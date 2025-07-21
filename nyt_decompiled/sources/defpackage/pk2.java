package defpackage;

import android.content.Context;
import com.nytimes.android.api.cms.SectionFront;
import com.nytimes.android.media.util.AudioFileVerifier;
import com.nytimes.android.sectionfront.adapter.model.SFSummaryController;
import com.nytimes.android.utils.TimeStampUtil;
import com.nytimes.android.utils.cropping.ImageCropper;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class pk2 extends nj1 {
    protected final List k;
    protected final boolean l;
    protected boolean m;
    private final boolean n;

    public pk2(Context context, SectionFront sectionFront, ue7 ue7Var, AudioFileVerifier audioFileVerifier, boolean z, TimeStampUtil timeStampUtil, SFSummaryController sFSummaryController, ImageCropper imageCropper) {
        super(context, sectionFront, ue7Var, audioFileVerifier, timeStampUtil, sFSummaryController, imageCropper);
        this.k = new ArrayList();
        this.l = z;
        this.m = z;
        this.n = sectionFront.getName().equals(context.getString(jk6.sectionName_books));
    }

    @Override // defpackage.nj1, defpackage.wh7
    public Observable a(List list) {
        return super.a(list).map(new o8(this.k, this.m)).map(new m8(this.n));
    }

    @Override // defpackage.nj1, defpackage.wh7
    public Observable b() {
        return y05.b(Boolean.valueOf(!mk2.a(this.a, this.b.getName())));
    }

    @Override // defpackage.nj1
    protected Function f() {
        return new ok2(this.c, this.b, this.a, this.e);
    }

    protected void n(int i, int i2, int i3, int i4, int i5, int i6) {
        if (i < i2) {
            this.k.add(Integer.valueOf(i));
            return;
        }
        this.k.add(Integer.valueOf(i4));
        while (true) {
            i4 += i5;
            if (i4 >= i) {
                break;
            } else {
                this.k.add(Integer.valueOf(i4));
            }
        }
        int intValue = i - ((Integer) this.k.get(r3.size() - 1)).intValue();
        if (intValue >= i3) {
            this.k.add(Integer.valueOf(i));
        }
        if (intValue > i6 || i <= i6) {
            return;
        }
        this.k.set(r1.size() - 1, Integer.valueOf(i - i6));
    }
}
