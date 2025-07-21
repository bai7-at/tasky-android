package defpackage;

import androidx.fragment.app.Fragment;
import com.nytimes.android.saved.SaveHandler;
import com.nytimes.android.utils.SaveOrigin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.flow.StateFlowKt;

/* loaded from: classes4.dex */
public final class wp6 implements ca7 {
    private final Fragment a;
    private final SaveHandler b;
    private final SaveOrigin c;
    private final Map d;

    public wp6(Fragment fragment, SaveHandler saveHandler, SaveOrigin saveOrigin) {
        zq3.h(fragment, "fragment");
        zq3.h(saveHandler, "saveHandler");
        zq3.h(saveOrigin, "saveOrigin");
        this.a = fragment;
        this.b = saveHandler;
        this.c = saveOrigin;
        this.d = new LinkedHashMap();
    }

    @Override // defpackage.ca7
    public void a(List list) {
        zq3.h(list, "urls");
        this.d.clear();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            this.d.put(str, StateFlowKt.MutableStateFlow(Boolean.valueOf(this.b.q(str))));
        }
    }
}
