package defpackage;

import android.view.ViewGroup;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: classes2.dex */
public interface c8 {
    ViewGroup a();

    default List b() {
        return ImmutableList.x();
    }
}
