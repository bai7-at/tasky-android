package defpackage;

import com.google.common.collect.ImmutableList;
import io.reactivex.functions.Function;
import java.util.List;

/* loaded from: classes4.dex */
public class ar implements Function {
    @Override // io.reactivex.functions.Function
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public List apply(List list) {
        return new ImmutableList.a().j(list).k();
    }
}
