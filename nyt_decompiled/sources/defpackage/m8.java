package defpackage;

import com.nytimes.android.sectionfront.adapter.model.SectionAdapterItemType;
import io.reactivex.functions.Function;
import java.util.List;

/* loaded from: classes4.dex */
public class m8 implements Function {
    private final boolean a;

    public m8(boolean z) {
        this.a = z;
    }

    @Override // io.reactivex.functions.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List apply(List list) {
        if (this.a) {
            list.add(0, new l70(SectionAdapterItemType.BEST_SELLERS));
        }
        return list;
    }
}
