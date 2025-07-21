package zendesk.support;

import defpackage.mn0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class RequestDataList {
    final List<RequestData> requestDataList;

    RequestDataList(List<RequestData> list) {
        ArrayList arrayList = new ArrayList(0);
        this.requestDataList = arrayList;
        if (mn0.h(list)) {
            arrayList.addAll(list);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RequestDataList.class != obj.getClass()) {
            return false;
        }
        return this.requestDataList.equals(((RequestDataList) obj).requestDataList);
    }

    public int hashCode() {
        return this.requestDataList.hashCode();
    }
}
