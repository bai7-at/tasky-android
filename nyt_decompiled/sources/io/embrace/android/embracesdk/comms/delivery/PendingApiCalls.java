package io.embrace.android.embracesdk.comms.delivery;

import defpackage.bt3;
import defpackage.et3;
import defpackage.ww8;
import defpackage.zq3;
import io.embrace.android.embracesdk.comms.api.Endpoint;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.i;
import kotlin.jvm.internal.DefaultConstructorMarker;

@et3(generateAdapter = true)
/* loaded from: classes5.dex */
public final class PendingApiCalls {
    private final Map<Endpoint, List<PendingApiCall>> pendingApiCallsMap;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Endpoint.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Endpoint.EVENTS.ordinal()] = 1;
            iArr[Endpoint.BLOBS.ordinal()] = 2;
            iArr[Endpoint.LOGGING.ordinal()] = 3;
            iArr[Endpoint.LOGS.ordinal()] = 4;
            iArr[Endpoint.NETWORK.ordinal()] = 5;
            iArr[Endpoint.SESSIONS.ordinal()] = 6;
            iArr[Endpoint.SESSIONS_V2.ordinal()] = 7;
            iArr[Endpoint.UNKNOWN.ordinal()] = 8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PendingApiCalls() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final int getMaxPendingApiCalls(Endpoint endpoint) {
        switch (WhenMappings.$EnumSwitchMapping$0[endpoint.ordinal()]) {
            case 1:
            case 3:
            case 6:
            case 7:
                return 100;
            case 2:
            case 5:
            case 8:
                return 50;
            case 4:
                return 10;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private final boolean hasReachedLimit(List<PendingApiCall> list, Endpoint endpoint) {
        return list.size() >= getMaxPendingApiCalls(endpoint);
    }

    public final void add(PendingApiCall pendingApiCall) {
        zq3.h(pendingApiCall, "pendingApiCall");
        Endpoint endpoint = pendingApiCall.getApiRequest().getUrl().endpoint();
        Map<Endpoint, List<PendingApiCall>> map = this.pendingApiCallsMap;
        List<PendingApiCall> list = map.get(endpoint);
        if (list == null) {
            list = new ArrayList<>();
            map.put(endpoint, list);
        }
        List<PendingApiCall> list2 = list;
        synchronized (list2) {
            try {
                if (hasReachedLimit(list2, endpoint)) {
                    i.K(list2);
                }
                list2.add(pendingApiCall);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Map<Endpoint, List<PendingApiCall>> getPendingApiCallsMap$embrace_android_sdk_release() {
        return this.pendingApiCallsMap;
    }

    public final boolean hasPendingApiCallsToSend() {
        Set<Map.Entry<Endpoint, List<PendingApiCall>>> entrySet = this.pendingApiCallsMap.entrySet();
        if ((entrySet instanceof Collection) && entrySet.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (hasPendingApiCallsToSend((List) entry.getValue(), (Endpoint) entry.getKey())) {
                return true;
            }
        }
        return false;
    }

    public final PendingApiCall pollNextPendingApiCall() {
        Object next;
        Long queueTime;
        Long queueTime2;
        Map<Endpoint, List<PendingApiCall>> map = this.pendingApiCallsMap;
        Endpoint endpoint = Endpoint.SESSIONS;
        List<PendingApiCall> list = map.get(endpoint);
        if (list != null) {
            synchronized (list) {
                if (hasPendingApiCallsToSend(list, endpoint)) {
                    return (PendingApiCall) i.K(list);
                }
                ww8 ww8Var = ww8.a;
            }
        }
        Set<Map.Entry<Endpoint, List<PendingApiCall>>> entrySet = this.pendingApiCallsMap.entrySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            if (hasPendingApiCallsToSend((List) entry.getValue(), (Endpoint) entry.getKey())) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        PendingApiCall pendingApiCall = null;
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                PendingApiCall pendingApiCall2 = (PendingApiCall) i.m0((List) ((Map.Entry) next).getValue());
                long longValue = (pendingApiCall2 == null || (queueTime2 = pendingApiCall2.getQueueTime()) == null) ? Long.MAX_VALUE : queueTime2.longValue();
                do {
                    Object next2 = it2.next();
                    PendingApiCall pendingApiCall3 = (PendingApiCall) i.m0((List) ((Map.Entry) next2).getValue());
                    long longValue2 = (pendingApiCall3 == null || (queueTime = pendingApiCall3.getQueueTime()) == null) ? Long.MAX_VALUE : queueTime.longValue();
                    if (longValue > longValue2) {
                        next = next2;
                        longValue = longValue2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        List list2 = entry2 != null ? (List) entry2.getValue() : null;
        if (list2 != null) {
            synchronized (list2) {
                pendingApiCall = (PendingApiCall) i.K(list2);
            }
        }
        return pendingApiCall;
    }

    public PendingApiCalls(@bt3(name = "pendingApiCallsMap") Map<Endpoint, List<PendingApiCall>> map) {
        zq3.h(map, "pendingApiCallsMap");
        this.pendingApiCallsMap = map;
    }

    public /* synthetic */ PendingApiCalls(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }

    private final boolean hasPendingApiCallsToSend(List<PendingApiCall> list, Endpoint endpoint) {
        return (list.isEmpty() || endpoint.isRateLimited()) ? false : true;
    }
}
